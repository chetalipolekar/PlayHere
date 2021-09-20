package com.playhere.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.playhere.beans.TimeSlot;
@Repository
public interface TimeSlotRepository extends JpaRepository<TimeSlot, Long>{

}
