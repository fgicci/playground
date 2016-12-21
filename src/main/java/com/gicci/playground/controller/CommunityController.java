package com.gicci.playground.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gicci.playground.model.Community;
import com.gicci.playground.service.CommunityService;

@RestController
public class CommunityController {

	@Autowired
	private CommunityService communityService;
	
	@RequestMapping(value = "/community/list", method = RequestMethod.GET)
	public List<Community> getCommunityList() {
		return communityService.findAll();
	}
}
