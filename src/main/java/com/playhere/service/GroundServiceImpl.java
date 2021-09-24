package com.playhere.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.playhere.beans.Ground;
import com.playhere.dao.GroundRepository;

@Service
public class GroundServiceImpl implements GroundService{

	@Autowired
	GroundRepository groundDao;
	
	@Autowired
	UserService userService;
	
	@Override
	public List<Ground> displayAll() {
		return groundDao.findAll();
	}

	@Override
	public void addGround(Ground ground, Long userId) {
		ground.setOwner(userService.getById(userId));
		groundDao.save(ground);
		
	}

	@Override
	public Ground getById(Long groundId) {
		return groundDao.getById(groundId);
	}

}
