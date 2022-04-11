package com.citius.service;

import com.citius.model.PatientDetails;

public interface PatientVisitService {

	void save(PatientDetails patientDetails);
	
	void updatePatientDetails(PatientDetails patient);

	void updateEmergencyContactDetails(PatientDetails patientDetails);


}
