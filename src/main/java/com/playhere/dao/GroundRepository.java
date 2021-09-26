package com.playhere.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.playhere.beans.Ground;

public interface GroundRepository extends JpaRepository<Ground, Long>{

	
	@Query(value="select * "
			+ "from ground join time_slot on ground.id=time_slot.ground_id "
			+ "where ground.location='pune' and ground.sport='cricket' and time_slot.start_time='10:00:00'", 
			nativeQuery = true)
	List<Ground> searchGround(String location, String sport, String time);
	
}
