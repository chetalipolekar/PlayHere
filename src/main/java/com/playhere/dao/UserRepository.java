package com.playhere.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.playhere.beans.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

	Users getByEmail(String email);

	

}
