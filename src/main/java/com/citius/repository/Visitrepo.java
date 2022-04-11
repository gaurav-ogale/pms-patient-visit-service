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

	@Query(value= "select * from users where username = ?1" , nativeQuery = true)
	public PatientDetails getByUsername(String username);

	@Modifying()
	@Transactional
	@Query(value = "update users set user_title = ?1, user_contact_no = ?2 ,user_email = ?3,"
			+ " user_first_name = ?4, user_last_name = ?5, userdob = ?6, gender = ?7,"
			+ " race = ?8, languages_known = ?9, home_address = ?10 where username = ?11"
			, nativeQuery = true)
	public int updatePatientDetails(String title,String contact,String email ,

			String firstname,String lastname,String dob,String gender
			,String race,String languages ,String address
			, String username);



}
