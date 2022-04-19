package com.citius.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.citius.model.PatientDetails;
import com.citius.model.getPatient;
import com.citius.service.PatientVisitService;

@RestController
public class PatientVisitController {

	@Autowired
	private PatientVisitService pVisitService;

	@GetMapping("/hello")
	public  void  hello(){
		System.out.println("Hello");
	}

	@PostMapping("/save")
	public void savePatient(@RequestBody PatientDetails patientDetails) {
		System.out.println(patientDetails);
		pVisitService.save(patientDetails);
	}


	@PutMapping("/updateDetails")
	public void updatePatientDetails(@RequestBody PatientDetails patientDetails) {

		pVisitService.updatePatientDetails(patientDetails);

	}

	@PutMapping("/updateEmergencyContactDetails")
	public void updateEmergencyContactDetails(@RequestBody PatientDetails patientDetails) {

		pVisitService.updateEmergencyContactDetails(patientDetails);

	}
	
	@GetMapping("/getAllPatients")
	public List<getPatient> getPatients(){
		
		 return pVisitService.getAllPatients();
	}







}
