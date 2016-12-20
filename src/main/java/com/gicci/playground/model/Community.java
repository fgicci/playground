package com.gicci.playground.model;

import java.util.List;

public class Community {

	private Integer id;
	private String name;
	private Sport sport;
	private List<FellowCommunity> partners;
	private List<CommunityAddress> addresses;
	
	public Community() {}
	
	public Community(String name, Sport sport) {
		this.name = name;
		this.sport = sport;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sport getSport() {
		return sport;
	}

	public void setSport(Sport sport) {
		this.sport = sport;
	}

	public List<FellowCommunity> getPartners() {
		return partners;
	}

	public void setPartners(List<FellowCommunity> partners) {
		this.partners = partners;
	}

	public List<CommunityAddress> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<CommunityAddress> addresses) {
		this.addresses = addresses;
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
		Community other = (Community) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Community [id=" + id + ", name=" + name + ", sport=" + sport + "]";
	}
}
