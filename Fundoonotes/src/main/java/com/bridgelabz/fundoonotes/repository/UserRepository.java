package com.bridgelabz.fundoonotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bridgelabz.fundoonotes.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	@Query(value = "select * from user where email=?", nativeQuery = true)
	User checkByEmail(String email);

	@Query(value = "select * from user where id")
	User findById(int id);
}
