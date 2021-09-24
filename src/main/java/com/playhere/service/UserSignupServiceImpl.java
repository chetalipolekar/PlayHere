package com.playhere.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.playhere.beans.Users;
import com.playhere.dao.UserSignupDao;

@Service
public class UserSignupServiceImpl implements UserSignupService {
	
	@Autowired
	UserSignupDao userSignupDao;
	
	
	@Override
	public void addUsers(Users u) {
		 userSignupDao.save(u);
	}


	@Override
	public Users getById(long id) {
		return userSignupDao.getById(id);
	}


	@Override
	public boolean validateUser(String email, String pass) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
