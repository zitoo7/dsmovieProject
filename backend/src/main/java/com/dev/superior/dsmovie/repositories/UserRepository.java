package com.dev.superior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.superior.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
}
