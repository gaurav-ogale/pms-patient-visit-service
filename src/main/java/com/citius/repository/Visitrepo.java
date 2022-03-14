package com.citius.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.citius.model.PatientDetails;
import com.citius.model.User;


@Repository
public interface Visitrepo extends JpaRepository<User, Long>{
	
	@Query(value = "select * from users where emerg_id = ?1", nativeQuery = true)
	public PatientDetails getByEmergId(Integer emergId);

}
