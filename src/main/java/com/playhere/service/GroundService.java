package com.playhere.service;

import java.util.List;

import com.playhere.beans.Ground;

public interface GroundService {

	List<Ground> displayAll();

	void addGround(Ground ground);

}
