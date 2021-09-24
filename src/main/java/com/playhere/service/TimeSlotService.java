package com.playhere.service;

import java.util.List;

import com.playhere.beans.TimeSlot;

public interface TimeSlotService {


	List<TimeSlot> findAll();

	void addTimeSlot(TimeSlot timeSlot, Long groundId);



	

}
