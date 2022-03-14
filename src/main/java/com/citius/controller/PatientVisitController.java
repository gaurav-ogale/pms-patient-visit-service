package com.citius.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	

}
