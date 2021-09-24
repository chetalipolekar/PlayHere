package com.playhere.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PlayerFinder {

	@Id
	@GeneratedValue
	private long id;
	private String sport;
	private String location;
	private int noOfPlayerRequired;
	
	@OneToOne
	private TimeSlot t;
	@OneToOne
	private Users user;
	
	public PlayerFinder() {
		super();
	}

		
}
