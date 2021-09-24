package com.playhere.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.playhere.beans.Ground;
import com.playhere.service.GroundService;

@RestController
@RequestMapping("/ground")
public class GroundController {
	@Autowired
	GroundService groundService;
	
	@GetMapping
	public List<Ground> showGrounds(){
		return groundService.displayAll();
	}
	
	@PostMapping
	public void addGround(@RequestBody Ground ground) {
		groundService.addGround(ground);
	}
	
}
