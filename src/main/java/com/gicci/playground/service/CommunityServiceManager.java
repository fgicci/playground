package com.gicci.playground.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gicci.playground.exception.RecordConstraint;
import com.gicci.playground.exception.RecordNotFound;
import com.gicci.playground.model.Community;
import com.gicci.playground.model.Fellow;
import com.gicci.playground.repository.CommunityRepository;

@Service
public class CommunityServiceManager implements CommunityService {

	private String RECORD_NOT_FOUND = "Record Not Found!";
	
	@Autowired
	private CommunityRepository communityRepository;
	
	@Override
	public Community create(Community type) throws RecordConstraint {
		return null;
	}

	@Override
	public Community update(Community type) throws RecordNotFound {
		return null;
	}

	@Override
	public Community delete(Long id) throws RecordNotFound {
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public Community findById(Long id) throws RecordNotFound {
		Community community = communityRepository.findOne(id);
		if (community == null) throw new RecordNotFound(RECORD_NOT_FOUND);
		return community;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Community> findAll() {
		return communityRepository.findAll();
	}

	@Override
	public List<Fellow> getFellowListByCommunity(Long communityId) throws RecordNotFound {
		List<Fellow> fellows = new ArrayList<Fellow>();
		findById(communityId).getPartners().forEach(fellowCommunity -> fellows.add(fellowCommunity.getFellow()));
		return fellows;
	}
}
