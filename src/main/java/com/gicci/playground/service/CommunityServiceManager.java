package com.gicci.playground.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gicci.playground.exception.RecordConstraint;
import com.gicci.playground.exception.RecordNotFound;
import com.gicci.playground.model.Community;

@Service
public class CommunityServiceManager implements CommunityService {

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
	public List<Community> findAll() {
		return null;
	}
}
