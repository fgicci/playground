package com.gicci.playground.model;

import java.util.List;

public class Fellow {

	private Integer id;
	private String firstName;
	private String LastName;
	private String nickName;
	private String email;
	private Boolean isEnable;
	private String password;
	private List<FellowCommunity> communities;
	private List<FellowSport> favouriteSports;
	
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

	public Boolean getIsEnable() {
		return isEnable;
	}

	public void setIsEnable(Boolean isEnable) {
		this.isEnable = isEnable;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<FellowCommunity> getCommunities() {
		return communities;
	}

	public void setCommunities(List<FellowCommunity> communities) {
		this.communities = communities;
	}

	public FellowCommunity addPartners(FellowCommunity community) {
		getCommunities().add(community);
		community.setFellow(this);
		return community;
	}
	
	public FellowCommunity removePartners(FellowCommunity community) {
		getCommunities().remove(community);
		community.setFellow(null);
		return community;
	}
	
	public List<FellowSport> getFavouriteSports() {
		return favouriteSports;
	}

	public void setFavouriteSports(List<FellowSport> favouriteSports) {
		this.favouriteSports = favouriteSports;
	}

	public FellowSport addFavouriteSport(FellowSport sport) {
		getFavouriteSports().add(sport);
		sport.setFellow(this);
		return sport;
	}
	
	public FellowSport removeFavouriteSport(FellowSport sport) {
		getFavouriteSports().remove(sport);
		sport.setFellow(null);
		return sport;
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
				+ ", email=" + email + ", isEnable=" + isEnable + ", password=" + password + ", communities="
				+ communities + ", favouriteSports=" + favouriteSports + "]";
	}

}
