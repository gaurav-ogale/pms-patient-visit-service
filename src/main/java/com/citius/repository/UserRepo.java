package com.citius.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.citius.model.User;

public interface UserRepo extends JpaRepository<User, Long>{

}
