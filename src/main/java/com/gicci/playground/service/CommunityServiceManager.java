package com.gicci.playground.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gicci.playground.exception.RecordConstraint;
import com.gicci.playground.exception.RecordNotFound;
import com.gicci.playground.model.Community;
import com.gicci.playground.repository.CommunityRepository;

@Service
public class CommunityServiceManager implements CommunityService {

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
	public Community delete(Integer id) throws RecordNotFound {
		return null;
	}

	@Override
	public Community findById(Integer id) throws RecordNotFound {
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Community> findAll() {
		return communityRepository.findAll();
	}
}
