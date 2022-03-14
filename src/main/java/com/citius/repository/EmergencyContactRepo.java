package com.citius.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.citius.model.EmergencyContact;

@Repository
public interface EmergencyContactRepo extends JpaRepository<EmergencyContact, Integer>{

}
