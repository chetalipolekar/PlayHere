package com.playhere.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.playhere.beans.Users;
import com.playhere.dao.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userDao;
	
	


	@Override
	public List<Users> getAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}




	@Override
	public void saveOrUpdate(Users user) {
		 userDao.save(user);
		
	}




	@Override
	public Users getById(Long userId) {
		
		return userDao.getById(userId);
	}



	
	
}
