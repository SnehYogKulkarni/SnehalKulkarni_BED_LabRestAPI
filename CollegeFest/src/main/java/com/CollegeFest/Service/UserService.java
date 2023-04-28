package com.CollegeFest.Service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.CollegeFest.Entity.User;
import com.CollegeFest.Entity.UserRegistrationDto;

public interface UserService extends UserDetailsService {
	public User save(UserRegistrationDto registrationDto);

}
