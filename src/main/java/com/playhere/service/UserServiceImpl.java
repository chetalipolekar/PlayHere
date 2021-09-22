package com.playhere.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.playhere.beans.UserAuthenticationBean;
import com.playhere.beans.Users;
import com.playhere.dao.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userDao;
	@Override
	public void saveOrUpdate(Users user) {
		userDao.save(user);
	}
	
	@Override
	public List<Users> getAll() {
		return userDao.findAll();
	}

	@Override
	public boolean authenticate(UserAuthenticationBean authentication) {
		Users user = userDao.findByEmail(authentication.getUsername());
		if (authentication.getPassword().equals(user.getPassword())) {
			return true;
		}
		return false;
	}

}
