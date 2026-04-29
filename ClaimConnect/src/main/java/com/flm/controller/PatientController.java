package com.flm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flm.entity.Patient;
import com.flm.service.PatientServiceImpl;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/patient")
@AllArgsConstructor
public class PatientController {
	
	private final PatientServiceImpl service;
	
	@Autowired
	public PatientController(PatientServiceImpl service) {
		this.service=service;
	}
	
	@PostMapping("/signup")
	public ResponseEntity<Patient> signup(@RequestBody Patient patient){
		Patient saved = service.signup(patient);
		return  new ResponseEntity<>(saved,HttpStatus.CREATED);
	}
	

    @GetMapping("/{id}")
    public ResponseEntity<Patient> getPatient(@PathVariable("id") Long patientId) {
        Patient patient= service.findById(patientId);
        return new ResponseEntity<>(patient, HttpStatus.OK);
               
    }
	

}
