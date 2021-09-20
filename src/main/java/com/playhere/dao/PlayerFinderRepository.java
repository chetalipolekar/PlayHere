package com.playhere.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.playhere.beans.PlayerFinder;

@Repository
public interface PlayerFinderRepository extends JpaRepository<PlayerFinder, Long>{

}
