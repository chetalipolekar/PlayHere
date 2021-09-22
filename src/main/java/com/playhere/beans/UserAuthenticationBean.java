package com.playhere.beans;

public class UserAuthenticationBean {

	private String username;
	private String password;
	
	public UserAuthenticationBean() {
		super();
	}

	public UserAuthenticationBean(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserAuthenticationBean [username=" + username + ", password=" + password + "]";
	}
	
	
	
}
