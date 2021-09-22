package com.playhere.service;

import java.util.List;

import com.playhere.beans.Users;

public interface UserService {

	void saveOrUpdate(Users user);

	List<Users> getAll();

}
