package com.citius.service;

import java.util.List;

import com.citius.model.PatientDetails;
import com.citius.model.getPatient;

public interface PatientVisitService {

	void save(PatientDetails patientDetails);
	
	void updatePatientDetails(PatientDetails patient);

	void updateEmergencyContactDetails(PatientDetails patientDetails);

	List<getPatient> getAllPatients();


}
