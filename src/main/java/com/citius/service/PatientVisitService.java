package com.citius.service;

import com.citius.model.PatientDetails;

public interface PatientVisitService {

	void save(PatientDetails patientDetails);

	void updatePatientInfo(String username, String title);

}
