package com.citius.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Visitrepo extends JpaRepository<User, Long>{

}
