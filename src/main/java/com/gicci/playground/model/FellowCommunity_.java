package com.gicci.playground.model;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FellowCommunity.class)
public abstract class FellowCommunity_ {

	public static volatile SingularAttribute<FellowCommunity, Long> id;
	public static volatile SingularAttribute<FellowCommunity, Fellow> fellow;
	public static volatile SingularAttribute<FellowCommunity, Community> community;
	public static volatile SingularAttribute<FellowCommunity, Date> admissionDate;
	public static volatile SingularAttribute<FellowCommunity, Boolean> isOwner;
	public static volatile SingularAttribute<FellowCommunity, FellowStatus> status;
}
