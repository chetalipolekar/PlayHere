package com.playhere.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.playhere.beans.Ground;

@Repository
public interface GroundRepository extends JpaRepository<Ground, Long>{

}
