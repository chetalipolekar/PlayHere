package com.playhere.beans;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Ground {

	@Id
	@GeneratedValue
	private Long id;
	private String groundName;
	private String location;
	private String groundType;
	private String image;
	private String sport;
	
	@OneToMany(mappedBy = "ground", cascade = CascadeType.ALL)
	private List<TimeSlot> timeSlots;
	
	@ManyToOne(targetEntity=Users.class,cascade=CascadeType.ALL)
	private Users owner;

	
	public Ground() {
		super();
	}
	public Ground(Long gid,String groundName, String location, String groundType, String image, String sport) {
		super();
		this.id = gid;
		this.groundName=groundName;
		this.location = location;
		this.groundType = groundType;
		this.image = image;
		this.sport = sport;
	}
	public String getGroundName() {
		return groundName;
	}
	public void setGroundName(String groundName) {
		this.groundName = groundName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getGroundType() {
		return groundType;
	}
	public void setGroundType(String groundType) {
		this.groundType = groundType;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	public Users getOwner() {
		return owner;
	}
	public void setOwner(Users owner) {
		this.owner = owner;
	}
	

	
	public List<TimeSlot> getTimeSlots() {
		return timeSlots;
	}
	public void setTimeSlots(List<TimeSlot> timeSlots) {
		this.timeSlots = timeSlots;
	}
	@Override
	public String toString() {
		return "Ground [gid=" + id + ", location=" + location + ", groundType=" + groundType + ", image=" + image
				+ ", Sports=" + sport + "]";
	}

	
}
