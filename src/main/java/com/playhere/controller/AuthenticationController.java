package com.playhere.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.playhere.config.JwtTokenUtil;
import com.playhere.config.JwtUserDetailsService;
import com.playhere.ui.beans.LoginInput;
import com.playhere.ui.beans.LoginOutput;

@RestController
@RequestMapping("/authenticate")
public class AuthenticationController {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private JwtUserDetailsService userDetailsService;

	@PostMapping
	public LoginOutput login(@RequestBody LoginInput loginInput) throws Exception {
		UserDetails userDetails ;
		try {
			userDetails = userDetailsService.loadUserByUsername(loginInput.getUserName());
			if (! userDetails.getPassword().equals(loginInput.getPassword())) {
				throw new BadCredentialsException("Invalid password.");
			}
		}
		catch (BadCredentialsException e) {
			throw new Exception("Incorrect username or password", e);
		}
		LoginOutput loginOutput = new LoginOutput();
		

		final String jwt = jwtTokenUtil.generateToken(userDetails);
		loginOutput.setToken(jwt);
		return loginOutput;
	}
}
