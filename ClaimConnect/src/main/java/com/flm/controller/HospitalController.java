package com.flm.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flm.entity.Hospital;
import com.flm.service.HospitalServiceImpl;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/hospital")
@AllArgsConstructor
public class HospitalController {
	
	private final HospitalServiceImpl service;
	
	HospitalController(HospitalServiceImpl service){
		this.service=service;
	}
	
	@PostMapping("/register")
	public ResponseEntity<Hospital> registerHospital(@RequestBody Hospital hospital) {
		Hospital hos = service.registerDetails(hospital);
		return new ResponseEntity<>(hos,HttpStatus.CREATED);
		
	}
	@GetMapping("{id}")
	public ResponseEntity<Hospital> hopitalDetails(@PathVariable("id") Long hospitalId){
		Hospital hos = service.HospitalDetails(hospitalId);
		return new ResponseEntity<>(hos,HttpStatus.OK);
	}
}
