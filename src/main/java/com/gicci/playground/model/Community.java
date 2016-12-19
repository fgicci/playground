package com.gicci.playground.model;

import java.util.List;

public class Community {

	private Integer id;
	private String name;
	private Sport sport;
	private Fellow owner;
	private List<Fellow> partners;
	
	public Community() {}
	
	public Community(String name, Sport sport, Fellow owner) {
		this.name = name;
		this.sport = sport;
		this.owner = owner;
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

	public Fellow getOwner() {
		return owner;
	}

	public void setOwner(Fellow owner) {
		this.owner = owner;
	}

	
	public List<Fellow> getPartners() {
		return partners;
	}

	public void setPartners(List<Fellow> partners) {
		this.partners = partners;
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
		return "Community [id=" + id + ", name=" + name + ", sport=" + sport + ", owner=" + owner + "]";
	}
}
