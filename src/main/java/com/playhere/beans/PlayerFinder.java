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
	@OneToOne
	private TimeSlot t;

	public PlayerFinder() {
		super();
	}
	public PlayerFinder(long id, String sport, String location, TimeSlot t) {
		super();
		this.id = id;
		this.sport = sport;
		this.location = location;
		this.t = t;
	
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public TimeSlot getT() {
		return t;
	}
	public void setT(TimeSlot t) {
		this.t = t;
	}
	@Override
	public String toString() {
		return "PlayerFinder [sport=" + sport + ", location=" + location + ", t=" + t + "]";
	}
	
	
}
