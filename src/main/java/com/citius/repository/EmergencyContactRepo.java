package com.citius.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.citius.model.EmergencyContact;
import com.citius.model.PatientDetails;

@Repository
public interface EmergencyContactRepo extends JpaRepository<EmergencyContact, Integer>{
	
	

}
