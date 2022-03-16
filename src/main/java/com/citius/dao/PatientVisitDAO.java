package com.citius.dao;

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
	private EmergencyContactRepo eContactRepo;

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
	
		visit.setHeight(patientDetails.getVisitDetails().getHeight());
		visit.setWeight(patientDetails.getVisitDetails().getWeight());
		visit.setBloodPressure(patientDetails.getVisitDetails().getBloodPressure());
		visit.setBloodTemperature(patientDetails.getVisitDetails().getBloodTemperature());
		visit.setRespirationRate(patientDetails.getVisitDetails().getRespirationRate());
		
		p.setVisitDetails(visit);
		p.setProcedureDetails(patientDetails.getProcedureDetails());
		p.setAllergies(patientDetails.getAllergies());
		p.setDrugDetails(patientDetails.getDrugDetails());
		visitrepo.save(p);
		
		
		
	}

	public void updatePatientInfo(String username, String title) {
		// TODO Auto-generated method stub
		System.out.println(title+ username);
		visitrepo.updateUser(title,username);
	}

}
