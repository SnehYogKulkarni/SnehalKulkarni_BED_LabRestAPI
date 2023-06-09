package com.CollegeFest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CollegeFest.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);

}
