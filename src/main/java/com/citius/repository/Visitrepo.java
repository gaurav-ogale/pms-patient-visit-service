package com.citius.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.citius.model.PatientDetails;
import com.citius.model.User;


@Repository
public interface Visitrepo extends JpaRepository<User, Long>{
	
	@Query(value = "select * from users where emerg_id = ?1", nativeQuery = true)
	public PatientDetails getByEmergId(Integer emergId);
	
	@Modifying()
	@Transactional
	@Query(value = "update users set user_title = ?1 where username = ?2", nativeQuery = true)
	public int updateUser(String title, String username);

}
