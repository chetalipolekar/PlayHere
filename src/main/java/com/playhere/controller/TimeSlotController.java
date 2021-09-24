package com.playhere.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.playhere.beans.TimeSlot;
import com.playhere.service.TimeSlotService;

@RestController
@RequestMapping("/timeslot")
public class TimeSlotController {

	@Autowired
	TimeSlotService timeSlotService;
	
	@PostMapping("/{groundId}")
	public  void addTimeSlot(@RequestBody TimeSlot timeSlot,@PathVariable Long groundId){
		 timeSlotService.addTimeSlot(timeSlot,groundId);
		
		
		 
	}
	
	@GetMapping
	public List<TimeSlot> displayAll(){
		return timeSlotService.findAll();
	}
	
	
	
	
}
