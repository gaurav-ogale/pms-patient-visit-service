package com.citius.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.citius.model.EmergencyContact;

@Repository
public interface EmergencyContactRepo extends JpaRepository<EmergencyContact, Integer>{
	
	@Query(value= "update emergency_contact set first_name = ?1 where emerg_id = ?2", nativeQuery = true)
	@Modifying()
	@Transactional
	public int updateEmergencyContactFirstName(String firstName, Integer id);
	
	@Query(value= "update emergency_contact set last_name = ?1 where emerg_id = ?2", nativeQuery = true)
	@Modifying()
	@Transactional
	public int updateEmergencyContactLastName(String lastname, Integer id);
	
	@Query(value= "update emergency_contact set email = ?1 where emerg_id = ?2", nativeQuery = true)
	@Modifying()
	@Transactional
	public int updateEmergencyContactEmail(String email, Integer id);
	
	
	@Query(value= "update emergency_contact set contact = ?1 where emerg_id = ?2", nativeQuery = true)
	@Modifying()
	@Transactional
	public int updateEmergencyContacNumber(Long contact, Integer id);
	
	@Query(value= "update emergency_contact set relationship = ?1 where emerg_id = ?2", nativeQuery = true)
	@Modifying()
	@Transactional
	public int updateEmergencyContactRelationship(String relation, Integer id);
	
	@Query(value= "update emergency_contact set address = ?1 where emerg_id = ?2", nativeQuery = true)
	@Modifying()
	@Transactional
	public int updateEmergencyContactAddress(String address, Integer id);
	
	@Query(value= "update emergency_contact set access_to_patient_portal = ?1 where emerg_id = ?2", nativeQuery = true)
	@Modifying()
	@Transactional
	public int updateEmergencyContactAccess(Boolean access, Integer id);
	
	
	@Query(value= "update emergency_contact set first_name = ?1,"
			+ " last_name = ?2, email = ?3,contact = ?4, relationship = ?5, address = ?6, "
			+ " access_to_patient_portal = ?7 where emerg_id = ?8", nativeQuery = true)
	@Modifying()
	@Transactional
	public int updateEmergencyContactDetails(String fname, String lname, String email , 
			Long contact, String relation, String address, Boolean access, Integer id);
	
	
	
	
	

}
