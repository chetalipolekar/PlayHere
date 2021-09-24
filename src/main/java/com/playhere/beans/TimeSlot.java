package com.playhere.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TimeSlot {

	@Id
	@GeneratedValue
	private long id;
	
   
	private String startTime;
    private String endTime;
    private double price;
	@ManyToOne(cascade = CascadeType.ALL)
	private Ground ground;

	public TimeSlot() {
		super();
	}

	public TimeSlot(long id, String startTime, String endTime, double price, Ground ground) {
		super();
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
		this.price = price;
		this.ground = ground;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Ground getGround() {
		return ground;
	}

	public void setGround(Ground ground) {
		this.ground = ground;
	}

	@Override
	public String toString() {
		return "TimeSlot [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + ", price=" + price
				+ ", ground=" + ground + "]";
	}

	
	
	
}
