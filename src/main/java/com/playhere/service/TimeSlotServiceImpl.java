package com.playhere.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.playhere.beans.Ground;
import com.playhere.beans.TimeSlot;
import com.playhere.dao.GroundRepository;
import com.playhere.dao.TimeSlotRepoitory;

@Service
public class TimeSlotServiceImpl implements TimeSlotService{

	@Autowired 
	TimeSlotRepoitory timeSlotDao;

	@Autowired
	GroundService groundService;
	@Override
	public List<TimeSlot> findAll() {
		return timeSlotDao.findAll();
	}

	@Override
	public void addTimeSlot(TimeSlot timeSlot, Long groundId) {
		timeSlot.setGround(groundService.getById(groundId));
		timeSlotDao.save(timeSlot);
	}


	
}
