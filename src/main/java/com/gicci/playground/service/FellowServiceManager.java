package com.gicci.playground.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gicci.playground.exception.RecordNotFound;
import com.gicci.playground.model.Fellow;

@Service
public class FellowServiceManager implements FellowService {

	@Override
	public Fellow create(Fellow type) {
		return null;
	}

	@Override
	public Fellow update(Fellow type) throws RecordNotFound {
		return null;
	}

	@Override
	public Fellow delete(Long id) throws RecordNotFound {
		return null;
	}

	@Override
	public Fellow findById(Long id) throws RecordNotFound {
		return null;
	}

	@Override
	public List<Fellow> findAll() {
		return null;
	}
}
