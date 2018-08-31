package com.molcon.securitydbexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.molcon.securitydbexample.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {

}
