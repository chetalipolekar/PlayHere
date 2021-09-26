package com.playhere.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.playhere.beans.Ground;
import com.playhere.beans.GroundDto;
import com.playhere.service.GroundService;

@RestController
@RequestMapping("/ground")
public class GroundController {
	@Autowired
	GroundService groundService;
	
	@GetMapping
	public List<Ground> getAll(){
		return groundService.displayAll();
	}
	
	@PostMapping("/{userId}")
	public void addGround(@RequestBody Ground ground, @PathVariable("userId") Long userId) {
		groundService.addGround(ground, userId);
	}
	
	@GetMapping("/{location}/{sport}/{time}")
	public List<GroundDto> searchGround(@PathVariable String location,@PathVariable String sport,@PathVariable String time ) {
		return groundService.searchGround(location,sport,time);
		
	}
}
