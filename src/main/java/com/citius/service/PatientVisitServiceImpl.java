package com.citius.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citius.dao.PatientVisitDAO;
import com.citius.model.EmergencyContact;
import com.citius.model.PatientDetails;

@Service
public class PatientVisitServiceImpl implements PatientVisitService {
	
	@Autowired
	private PatientVisitDAO patVisitDAO;

	@Override
	public void save(PatientDetails patientDetails) {
		
		patVisitDAO.save(patientDetails);
		
	}

	@Override
	public void updatePatientInfo(String username, String title) {
		// TODO Auto-generated method stub
		patVisitDAO.updatePatientInfo(username, title);
		
	}

}
