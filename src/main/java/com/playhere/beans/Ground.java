package com.playhere.beans;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Ground {

	@Id
	@GeneratedValue
	private Long gid;
	private String location;
	private String groundType;
	private String image;
	private String Sports;
	
	@ManyToOne
	private Users owner;
	public Ground() {
		super();
	}
	public Ground(Long gid, String location, String groundType, String image, String sports) {
		super();
		this.gid = gid;
		this.location = location;
		this.groundType = groundType;
		this.image = image;
		Sports = sports;
	}
	@Override
	public String toString() {
		return "Ground [gid=" + gid + ", location=" + location + ", groundType=" + groundType + ", image=" + image
				+ ", Sports=" + Sports + "]";
	}

	
}
