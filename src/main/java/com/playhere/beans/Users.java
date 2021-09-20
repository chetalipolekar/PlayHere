package com.playhere.beans;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class Users {

	@Id
	@GeneratedValue
	private long id;
	private String firstname;
	private String lastname;
	private String email;
	private String mobile;
	private String role;
	
	
	public Users() {
		super();
	}


	public Users(long id, String firstname, String lastname, String email, String mobile, String role) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.mobile = mobile;
		this.role = role;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", mobile=" + mobile + ", role=" + role + "]";
	}
	
	
}
