package com.molcon.securitydbexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.molcon.securitydbexample.model.CustomUserDetails;
import com.molcon.securitydbexample.model.Users;
import com.molcon.securitydbexample.repository.UsersRepository;

public class CustomUserDetailsService implements UserDetailsService{
	
	@Autowired
	UsersRepository usersRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Users users = usersRepository.findByName(username);
		return new CustomUserDetails(users);
	}

}
