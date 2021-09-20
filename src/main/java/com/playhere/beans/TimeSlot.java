package com.playhere.beans;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class TimeSlot {

	@Id
	@GeneratedValue
	private long id;
	private LocalDateTime time;
	private double price;
	@ManyToOne
	private Ground ground;

	public TimeSlot() {
		super();
	}

	public TimeSlot(long id, LocalDateTime time, double price, Ground ground) {
		super();
		this.id = id;
		this.time = time;
		this.price = price;
		this.ground = ground;
	}

	@Override
	public String toString() {
		return "TimeSlot [id=" + id + ", time=" + time + ", price=" + price + ", ground=" + ground + "]";
	}
	
	
	
}
