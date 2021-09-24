package com.playhere.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.playhere.beans.Users;
import com.playhere.service.UserService;

//@CrossOrigin(origins="http://localhost:3000")

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
	
	@GetMapping("/{userId}")
	public Users getById(@PathVariable Long userId) {
		return userService.getById(userId);
	}
}
//	@PostMapping("/signup")
//	public ResponseEntity<Users> addUsers(@RequestBody Users u) {
//		userService.addUsers(u);
//		Users u1=userService.getById(u.getId());
//		if(u1!=null)
//			return ResponseEntity.ok(u1);
//		else
//			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//		
//	}
//	
//	@GetMapping("/login/{email}/{pass}")
//	public ResponseEntity<String> validateUser(@PathVariable String email,String pass){
//		boolean status= userService.validateUser(email,pass);
//		if(status==true) {
//			return ResponseEntity.ok("Validate User");
//		}else {
//			return ResponseEntity.ok("Not a valid User");
//		}
//		
//		
//	}
	
		

