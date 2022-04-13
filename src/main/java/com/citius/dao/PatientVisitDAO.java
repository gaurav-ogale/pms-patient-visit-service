package com.citius.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.citius.model.EmergencyContact;
import com.citius.model.PatientDetails;
import com.citius.model.PatientVisit;
import com.citius.repository.EmergencyContactRepo;
import com.citius.repository.Visitrepo;

@Component
public class PatientVisitDAO {
	
	@Autowired
	private Visitrepo visitrepo;
	
	@Autowired
	private EmergencyContactRepo emRepo;

	public void save(PatientDetails patientDetails) {
		// TODO Auto-generated method stu
		
		PatientDetails p = new PatientDetails();
		p.setUserTitle(patientDetails.getUserTitle());
		p.setUserFirstName(patientDetails.getUserFirstName());
		p.setUserLastName(patientDetails.getUserLastName());
		p.setUsername(patientDetails.getUsername());
		p.setUserContactNo(patientDetails.getUserContactNo());
		p.setUserDOB(patientDetails.getUserDOB());
		p.setUserEmail(patientDetails.getUserEmail());
		p.setAge();
		p.setGender(patientDetails.getGender());
		p.setEthnicity(patientDetails.getEthnicity());
		p.setLanguagesKnown(patientDetails.getLanguagesKnown());
		p.setPassword(patientDetails.getPassword());
		p.setHasAllergy(patientDetails.getHasAllergy());
		p.setHomeAddress(patientDetails.getHomeAddress());
		p.setIsActive(patientDetails.getIsActive());
		p.setRace(patientDetails.getRace());
		
		EmergencyContact e = new EmergencyContact();
		e.setFirstName(patientDetails.getEmergencyContact().getFirstName());
		e.setLastName(patientDetails.getEmergencyContact().getLastName());
		e.setRelationship(patientDetails.getEmergencyContact().getRelationship());
		e.setEmail(patientDetails.getEmergencyContact().getEmail());
		e.setContact(patientDetails.getEmergencyContact().getContact());
		e.setAccessToPatientPortal(patientDetails.getEmergencyContact().getAccessToPatientPortal());
		e.setAddressSameAsPatient(patientDetails.getEmergencyContact().getAddressSameAsPatient());
		if(patientDetails.getEmergencyContact().getAddressSameAsPatient())
			e.setAddress(patientDetails.getHomeAddress());
		else
			e.setAddress(patientDetails.getEmergencyContact().getAddress());
				
		p.setEmergencyContact(e);
		
		PatientVisit visit = new PatientVisit();
	
//		visit.setHeight(new Integer(16));
//		visit.setWeight(60);
//		visit.setBloodPressure(patientDetails.getVisitDetails().getBloodPressure());
//		visit.setBloodTemperature(patientDetails.getVisitDetails().getBloodTemperature());
//		visit.setRespirationRate(patientDetails.getVisitDetails().getRespirationRate());
//		
		List<PatientVisit> l1 = new ArrayList<>();
		l1.add(visit);
		//p.setVisitDetails(visit);
//		p.setProcedureDetails(patientDetails.getProcedureDetails());
//		p.setAllergies(patientDetails.getAllergies());
//		p.setDrugDetails(patientDetails.getDrugDetails());
		visitrepo.save(p);
		
		
		
	}
	
	public void updatePatientDetails(PatientDetails patient) {
		visitrepo.updatePatientDetails(patient.getUserTitle(), patient.getUserContactNo(), patient.getUserEmail(),
			patient.getUserFirstName(), patient.getUserLastName(),patient.getUserDOB(), patient.getGender(),
				patient.getRace(), patient.getLanguagesKnown(), patient.getHomeAddress(),
			 patient.getUsername());
	}

	public void updateEmergencyContactDetails(PatientDetails patientDetails) {
		// TODO Auto-generated method stub
		PatientDetails p = visitrepo.getByUsername(patientDetails.getUsername());
		EmergencyContact e = patientDetails.getEmergencyContact();
		Integer id = p.getEmergencyContact().getEmergencyId();
		emRepo.updateEmergencyContactDetails(e.getFirstName(),e.getLastName() , e.getEmail(), 
				e.getContact(), e.getRelationship(), e.getAddress(), e.getAccessToPatientPortal(), id);
		
		
	}

}
