package com.gicci.playground.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.LockModeType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gicci.playground.exception.RecordNotFound;
import com.gicci.playground.model.Community;
import com.gicci.playground.model.Fellow;
import com.gicci.playground.repository.CommunityRepository;

@Service
public class CommunityServiceManager implements CommunityService {

	@Autowired
	private CommunityRepository communityRepository;
	
	@Override
	@Transactional
	public Community create(Community community) {
		return null;
	}

	@Override
	@Transactional(rollbackFor = RecordNotFound.class)
	@Lock(LockModeType.PESSIMISTIC_WRITE)
	public Community update(Community community) throws RecordNotFound {
		return null;
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
}
