package com.playhere.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.playhere.beans.GroundBooking;

@Repository
public interface GroundBookingRepository extends JpaRepository<GroundBooking, Long>{

}
