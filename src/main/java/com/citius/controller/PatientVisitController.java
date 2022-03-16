package com.citius.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.citius.model.PatientDetails;
import com.citius.model.Procedures;
import com.citius.service.PatientVisitService;

import reactor.core.publisher.Mono;

@RestController
public class PatientVisitController {
	
	@Autowired
	private PatientVisitService pVisitService;
	
//	@Autowired
//	private WebClient webClient;
	
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
	
	
	
//	@GetMapping("/getProcedureByCode/{procedure_code}")
//	public Mono<ResponseEntity<Procedures>> getprocedureBycode(@PathVariable String code){
//	
//	 Mono<ResponseEntity<Procedures>> responseEntityMono = webClient.get()
//			 	.uri("/getByCode/{procedure_code}",code)
//	            .retrieve()
//	            .toEntity(new ParameterizedTypeReference<Procedures>() {
//	            });
//	 System.out.println(responseEntityMono);
//	    return responseEntityMono;
//	
//	}
}
