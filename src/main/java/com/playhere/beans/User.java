package com.playhere.beans;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private String mobile;
	private String role;
}
