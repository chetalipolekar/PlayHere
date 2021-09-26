package com.playhere.config;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.playhere.beans.Users;
import com.playhere.dao.UserRepository;

@Service
public class JwtUserDetailsService implements UserDetailsService  {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		Users users = userRepository.getByEmail(userName);
		if (users == null) {
			throw new UsernameNotFoundException("Invalid username");
		}
		
		//fetch user from database
		return new User(users.getEmail(), users.getPassword(), new ArrayList<>());
	}
}
