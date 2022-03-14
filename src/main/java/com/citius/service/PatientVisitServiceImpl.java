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
		// TODO Auto-generated method stub
		
		EmergencyContact e  = new EmergencyContact();
//		e.setFirstName(patientDetails.getEmergencyContact().getFirstName());
//		e.se
		
		patVisitDAO.save(patientDetails);
		
	}

}
