package com.citius.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.citius.model.PatientDetails;
import com.citius.service.PatientVisitService;

@RestController
public class PatientVisitController {
	
	@Autowired
	private PatientVisitService pVisitService;
	
	@PostMapping("/save")
	public void savePatient(@RequestBody PatientDetails patientDetails) {
		pVisitService.save(patientDetails);
	}
	
	@PatchMapping("/update")
	public void updatePatientTitle(@RequestBody PatientDetails patientDetails) {
		System.out.println(patientDetails.getUsername());
		System.out.println(patientDetails.getUserTitle());
		pVisitService.updatePatientInfo(patientDetails.getUsername(), patientDetails.getUserTitle());
	}
	

}
