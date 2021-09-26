package com.playhere.service;

import java.util.List;

import com.playhere.beans.Ground;
import com.playhere.beans.GroundDto;

public interface GroundService {

	List<Ground> displayAll();

	void addGround(Ground ground, Long userId);

	Ground getById(Long groundId);

	List<GroundDto> searchGround(String location, String sport, String time);

}
