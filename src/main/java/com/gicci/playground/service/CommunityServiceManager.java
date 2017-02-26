package com.gicci.playground.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.LockModeType;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gicci.playground.exception.RecordConstraint;
import com.gicci.playground.exception.RecordNotFound;
import com.gicci.playground.model.Community;
import com.gicci.playground.model.CommunityAddress;
import com.gicci.playground.model.Fellow;
import com.gicci.playground.model.FellowCommunity;
import com.gicci.playground.model.FellowCommunity_;
import com.gicci.playground.model.FellowStatus;
import com.gicci.playground.repository.CommunityRepository;
import com.gicci.playground.repository.FellowCommunityRepository;

@Service
public class CommunityServiceManager implements CommunityService {

	private static final String USER_ID = "undefined@playground.com";
	
	@Autowired
	private CommunityRepository communityRepository;
	
	@Autowired
	private FellowCommunityRepository fellowCommunityRepository;
	
	@Override
	@Transactional
	public Community create(Community community) {
		community.setUserId(USER_ID);
		community.setInsertDate(new Date());
		community.setUpdateDate(new Date());
		return communityRepository.save(community);
	}

	@Override
	@Transactional(rollbackFor = RecordNotFound.class)
	@Lock(LockModeType.PESSIMISTIC_WRITE)
	public Community update(Community community) throws RecordNotFound {
		community.setUserId(USER_ID);
		community.setUpdateDate(new Date());
		return communityRepository.save(community);
	}

	@Override
	@Transactional(rollbackFor = RecordNotFound.class)
	@Lock(LockModeType.PESSIMISTIC_WRITE)
	public Community delete(Long id) throws RecordNotFound {
		Community community = findById(id);
		communityRepository.delete(community);
		return community;
	}

	@Override
	@Transactional(readOnly = true)
	public Community findById(Long id) throws RecordNotFound {
		Community community = communityRepository.findOne(id);
		if (community == null) throw new RecordNotFound("Param 'id' = " + id);
		return community;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Community> findAll() {
		return communityRepository.findAll();
	}

	@Override
	public List<Fellow> getFellowListByCommunity(Long id) throws RecordNotFound {
		List<Fellow> fellows = new ArrayList<Fellow>();
		findById(id).getPartners().forEach(fellowCommunity -> fellows.add(fellowCommunity.getFellow()));
		return fellows;
	}

	@Override
	public List<CommunityAddress> getCommunityAddress(Long id) throws RecordNotFound {
		List<CommunityAddress> addresses = findById(id).getAddresses();
		return addresses;
	}
	
	@Override
	@Transactional(rollbackFor = RecordNotFound.class)
	@Lock(LockModeType.PESSIMISTIC_WRITE)
	public CommunityAddress addAddress(Long id, CommunityAddress address) throws RecordNotFound {
		Community community = findById(id);
		if (community.getAddresses().contains(address)) throw new RecordConstraint("Param 'id' = " + id + ", 'address id' = " + address.getId() + " exist!"); 
		return community.addAddress(address);
	}
	
	@Override
	@Transactional(rollbackFor = RecordNotFound.class)
	@Lock(LockModeType.PESSIMISTIC_WRITE)
	public CommunityAddress removeAddress(Long id, CommunityAddress address) throws RecordNotFound {
		Community community = findById(id);
		if (!community.getAddresses().contains(address)) throw new RecordConstraint("Param 'id' = " + id + ", 'address id' = " + address.getId() + " does not exist!"); 
		return community.removeAddress(address);
	}
	
	@Override
	@Transactional(rollbackFor = RecordNotFound.class)
	@Lock(LockModeType.PESSIMISTIC_WRITE)
	public Fellow addFellow(Long id, Fellow fellow) throws RecordNotFound {
		Community community = findById(id);
		if (fellowCommunityRepository.findOne(hasFellow(fellow)) != null) throw new RecordConstraint("Param 'id' = " + id + ", 'fellow id' = " + fellow.getId() + " exist!");
		
		FellowCommunity fellowCommunity = new FellowCommunity();
		fellowCommunity.setFellow(fellow);
		fellowCommunity.setIsOwner(false);
		fellowCommunity.setAdmissionDate(new Date());
		fellowCommunity.setStatus(FellowStatus.AUTHORIZED);
		community.addPartners(fellowCommunity);
		
		return fellow;
	}
	
	@Override
	@Transactional(rollbackFor = RecordNotFound.class)
	@Lock(LockModeType.PESSIMISTIC_WRITE)
	public Fellow removeFellow(Long id, Fellow fellow, Boolean blockUser) throws RecordNotFound {
		Community community = findById(id);
		FellowCommunity fellowCommunity = fellowCommunityRepository.findOne(hasFellow(fellow));
		if (fellowCommunity == null) throw new RecordConstraint("Param 'id' = " + id + ", 'address id' = " + fellow.getId() + " does not exist!");
		if (blockUser) fellowCommunity.setStatus(FellowStatus.BLOCKED);
		else community.removePartners(fellowCommunity);
		return fellow;
	}
	
	private Specification<FellowCommunity> hasFellow(final Fellow fellow) {
		return new Specification<FellowCommunity>() {
			@Override
			public Predicate toPredicate(Root<FellowCommunity> root, CriteriaQuery<?> cq, CriteriaBuilder cb) {
				return cb.equal(root.<Fellow>get(FellowCommunity_.fellow), fellow);
			}
		};
	}
}
