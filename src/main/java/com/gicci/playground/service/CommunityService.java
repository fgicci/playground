package com.gicci.playground.service;

import java.util.List;

import com.gicci.playground.exception.RecordNotFound;
import com.gicci.playground.model.Community;
import com.gicci.playground.model.Fellow;

public interface CommunityService extends CrudService<Community> {
	
	public List<Fellow> getFellowListByCommunity(Long communityId) throws RecordNotFound;
}
