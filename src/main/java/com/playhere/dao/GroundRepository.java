package com.playhere.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.playhere.beans.Ground;

public interface GroundRepository extends JpaRepository<Ground, Long>{
	
}
