package com.gicci.playground.model;

public class CommunityAddress {

	private Integer id;
	private Community community;
	private String addressLineOne;
	private String addressLineTwo;
	private String town;
	private String county;
	private String postCode;
	private String country;
	
	public CommunityAddress() {}

	public CommunityAddress(Community community, String addressLineOne, String addressLineTwo, String town, String county, String postCode, String country) {
		this.community = community;
		this.addressLineOne = addressLineOne;
		this.addressLineTwo = addressLineTwo;
		this.town = town;
		this.county = county;
		this.postCode = postCode;
		this.country = country;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
