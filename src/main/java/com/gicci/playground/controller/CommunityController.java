package com.gicci.playground.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gicci.playground.exception.RecordNotFound;
import com.gicci.playground.model.Community;
import com.gicci.playground.model.Fellow;
import com.gicci.playground.service.CommunityService;

@RestController
@RequestMapping("/community")
public class CommunityController {

	@Autowired
	private CommunityService communityService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<Community> getCommunityList() {
		return communityService.findAll();
	}
	
	@RequestMapping(value = "/fellow/list", method = RequestMethod.GET)
	public List<Fellow> getFellowByCommunity(@RequestParam(name = "communityId", required = true) Long communityId) throws RecordNotFound {
		return communityService.getFellowListByCommunity(communityId);
	}
	
	
	@ExceptionHandler(RecordNotFound.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public String generateErro(Exception ex) {
		return ex.getMessage();
	}
}
