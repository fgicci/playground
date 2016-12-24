package com.gicci.playground.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class CommunityAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(optional = false)
	private Community community;
	
	@Column(name = "address_line_one")
	private String addressLineOne;
	
	@Column(name = "address_line_one")
	private String addressLineTwo;
	
	@Column(name = "town")
	private String town;
	
	@Column(name = "county")
	private String county;
	
	@Column(name = "post_code")
	private String postCode;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "latitude")
	private Double latitude;
	
	@Column(name = "longitude")
	private Double longitude;
	
	public CommunityAddress() {}

	public CommunityAddress(Community community, String addressLineOne, String addressLineTwo, String town, String county, String postCode, String country, Double latitude, Double longitude) {
		this.community = community;
		this.addressLineOne = addressLineOne;
		this.addressLineTwo = addressLineTwo;
		this.town = town;
		this.county = county;
		this.postCode = postCode;
		this.country = country;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Community getCommunity() {
		return community;
	}

	public void setCommunity(Community community) {
		this.community = community;
	}

	public String getAddressLineOne() {
		return addressLineOne;
	}

	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}

	public String getAddressLineTwo() {
		return addressLineTwo;
	}

	public void setAddressLineTwo(String addressLineTwo) {
		this.addressLineTwo = addressLineTwo;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
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
		CommunityAddress other = (CommunityAddress) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CommunityAddress [id=" + id + ", community=" + community + ", addressLineOne=" + addressLineOne
				+ ", addressLineTwo=" + addressLineTwo + ", town=" + town + ", county=" + county + ", postCode="
				+ postCode + ", country=" + country + "]";
	}
}
