package com.gicci.playground.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.gicci.playground.model.FellowCommunity;

public interface FellowCommunityRepository extends JpaRepository<FellowCommunity, Long>, JpaSpecificationExecutor<FellowCommunity> {

}
