package com.playhere.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.playhere.beans.Users;
import com.playhere.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping
	public void saveUser(@RequestBody Users user) {
		userService.saveOrUpdate(user);
	}
	
	@GetMapping
	public List<Users> getAllUsers() {
		return userService.getAll();
	}
}
