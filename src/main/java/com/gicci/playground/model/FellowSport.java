package com.gicci.playground.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "fellow_sport")
public class FellowSport {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne(optional = false)
	private Fellow fellow;
	
	@Column(name = "sport")
	@Enumerated(EnumType.STRING)
	private Sport sport;
	
	public FellowSport() {}
	
	public FellowSport(Fellow fellow, Sport sport) {
		this.fellow = fellow;
		this.sport = sport;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Fellow getFellow() {
		return fellow;
	}

	public void setFellow(Fellow fellow) {
		this.fellow = fellow;
	}

	public Sport getSport() {
		return sport;
	}

	public void setSport(Sport sport) {
		this.sport = sport;
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
		FellowSport other = (FellowSport) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FellowSport [id=" + id + ", fellow=" + fellow + ", sport=" + sport + "]";
	}
}
