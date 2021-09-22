package com.playhere.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.playhere.beans.UserAuthenticationBean;
import com.playhere.beans.Users;
import com.playhere.dao.UserRepository;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {

	@Autowired
	UserRepository userRepository;
	@Override
	public void saveOrUpdate(Users user) {
		userRepository.save(user);
	}
	
	@Override
	public List<Users> getAll() {
		return userRepository.findAll();
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<Users> user= userRepository.findByEmail(username);
		
		user.orElseThrow(()->new UsernameNotFoundException("not found " +username));
		
		return user.map(MyUserDetail::new).get();
	}

	@Override
	public boolean authenticate(UserAuthenticationBean authentication) {
		// TODO Auto-generated method stub
		return false;
	}

}
