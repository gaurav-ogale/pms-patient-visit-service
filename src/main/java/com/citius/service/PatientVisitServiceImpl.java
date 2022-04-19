package com.citius.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citius.dao.PatientVisitDAO;
import com.citius.model.PatientDetails;
import com.citius.model.getPatient;

@Service
public class PatientVisitServiceImpl implements PatientVisitService {

	@Autowired
	private PatientVisitDAO patVisitDAO;

	@Override
	public void save(PatientDetails patientDetails) {

		patVisitDAO.save(patientDetails);

	}

	@Override
	public void updatePatientDetails(PatientDetails patient) {
		// TODO Auto-generated method stub
		patVisitDAO.updatePatientDetails(patient);

	}

	@Override
	public void updateEmergencyContactDetails(PatientDetails patientDetails) {
		// TODO Auto-generated method stub

		patVisitDAO.updateEmergencyContactDetails(patientDetails);

	}

	@Override
	public List<getPatient> getAllPatients() {
		// TODO Auto-generated method stub
		return patVisitDAO.getAllPatients();
		//return list;

	}
}
