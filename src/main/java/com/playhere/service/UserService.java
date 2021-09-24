package com.playhere.service;

import java.util.List;

import com.playhere.beans.Users;

public interface UserService {

//	void addUsers(Users u);
//
//	Users getById(long id);
//
//	boolean validateUser(String email, String pass);

	List<Users> getAll();

	void saveOrUpdate(Users user);

	Users getById(Long userId);

}
