package com.playhere.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.playhere.beans.Ground;
import com.playhere.beans.GroundDto;
import com.playhere.beans.TimeSlot;
import com.playhere.dao.GroundRepository;

@Service
public class GroundServiceImpl implements GroundService {

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

	@Override
	public List<GroundDto> searchGround(String location, String sport, String time) {
		return toGroundDto(groundDao.searchGround(location, sport, time));
	}

	private List<GroundDto> toGroundDto(List<Ground> searchGround) {

		List<GroundDto> grounds = new ArrayList<>();
		GroundDto gdto = new GroundDto();
		
		for (Ground g : searchGround) {
			for (TimeSlot t : g.getTimeSlots()) {
				gdto.setId(g.getId());
				gdto.setImage(g.getImage());
				gdto.setLocation(g.getLocation());
				gdto.setGroundName(g.getGroundName());
				gdto.setGroundType(g.getGroundType());
				gdto.setSport(g.getSport());

				gdto.setStartTime(t.getStartTime());
				gdto.setEndTime(t.getEndTime());
				gdto.setPrice(t.getPrice());
				
				grounds.add(gdto);
			}
		}
		return grounds;

	}

}
