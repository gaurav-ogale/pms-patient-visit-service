package com.citius.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.citius.model.User;


@Repository
public interface Visitrepo extends JpaRepository<User, Long>{

}
