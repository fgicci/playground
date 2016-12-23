package com.gicci.playground.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "fellow_community")
public class FellowCommunity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne(optional = false)
	private Fellow fellow;
	
	@ManyToOne(optional = false)
	private Community community;
	
	@Column(name = "admission_date")
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date admissionDate;
	
	@Column(name = "owner")
	private Boolean isOwner;
	
	public FellowCommunity() {}

	public FellowCommunity(Fellow fellow, Community community, Date admissionDate, Boolean isOwner) {
		this.fellow = fellow;
		this.community = community;
		this.admissionDate = admissionDate;
		this.isOwner = isOwner;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Fellow getFellow() {
		return fellow;
	}
	
	public void setFellow(Fellow fellow) {
		this.fellow = fellow;
	}
	
	public Community getCommunity() {
		return community;
	}
	
	public void setCommunity(Community community) {
		this.community = community;
	}
	
	public Date getAdmissionDate() {
		return admissionDate;
	}
	
	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}
	
	public Boolean getIsOwner() {
		return isOwner;
	}
	
	public void setIsOwner(Boolean isOwner) {
		this.isOwner = isOwner;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FellowCommunity other = (FellowCommunity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FellowCommunity [id=" + id + ", fellow=" + fellow + ", community=" + community + ", admissionDate="
				+ admissionDate + ", isOwner=" + isOwner + "]";
	}
}
