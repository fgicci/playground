package com.gicci.playground.service;

import java.util.List;

import com.gicci.playground.exception.RecordNotFound;
import com.gicci.playground.model.Community;
import com.gicci.playground.model.CommunityAddress;
import com.gicci.playground.model.Fellow;

public interface CommunityService extends CrudService<Community> {
	
	public Fellow addFellow(Long id, Fellow fellow) throws RecordNotFound;
	public CommunityAddress addAddress(Long id, CommunityAddress address) throws RecordNotFound;
	public Fellow removeFellow(Long id, Fellow fellow, Boolean blockUser) throws RecordNotFound;
	public CommunityAddress removeAddress(Long id, CommunityAddress address) throws RecordNotFound;
	public List<CommunityAddress> getCommunityAddress(Long communityId) throws RecordNotFound;
	public List<Fellow> getFellowListByCommunity(Long communityId) throws RecordNotFound;
}
