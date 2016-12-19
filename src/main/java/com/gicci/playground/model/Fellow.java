package com.gicci.playground.model;

import java.util.List;

public class Fellow {

	private Integer id;
	private String firstName;
	private String LastName;
	private String nickName;
	private String email;
	private List<Community> ownerCommunities;
	private List<Community> communities;
	private List<Sport> favouriteSports;
	
	public Fellow() {}

	public Fellow(String firstName, String lastName, String nickName, String email) {
		this.firstName = firstName;
		this.LastName = lastName;
		this.nickName = nickName;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Community> getOwnerCommunities() {
		return ownerCommunities;
	}

	public void setOwnerCommunities(List<Community> ownerCommunities) {
		this.ownerCommunities = ownerCommunities;
	}

	public List<Community> getCommunities() {
		return communities;
	}

	public void setCommunities(List<Community> communities) {
		this.communities = communities;
	}

	public List<Sport> getFavouriteSports() {
		return favouriteSports;
	}

	public void setFavouriteSports(List<Sport> favouriteSports) {
		this.favouriteSports = favouriteSports;
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
		Fellow other = (Fellow) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Fellow [id=" + id + ", firstName=" + firstName + ", LastName=" + LastName + ", nickName=" + nickName
				+ ", email=" + email + "]";
	}

}
