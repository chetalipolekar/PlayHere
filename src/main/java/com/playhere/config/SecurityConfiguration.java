package com.playhere.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

import com.playhere.service.UserService;

public class SecurityConfiguration extends WebSecurityConfiguration{

	@Autowired
	UserService userService;
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(userService);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests().antMatchers("/login").hasAnyRole("Users","Owner").antMatchers("/").permitAll().and().formLogin();
	}
}
