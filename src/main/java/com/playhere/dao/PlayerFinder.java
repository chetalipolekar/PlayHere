package com.playhere.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerFinder extends JpaRepository<PlayerFinder, Long>{

}
