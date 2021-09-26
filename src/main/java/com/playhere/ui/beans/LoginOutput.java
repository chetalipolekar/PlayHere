package com.playhere.ui.beans;

public class LoginOutput {

	private String token;
	public void setToken(String jwt) {
		this.token = jwt;
	}
	
	public String getToken() {
		return token;
	}

}
