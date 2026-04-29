package com.flm.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flm.entity.InsuranceCompany;
import com.flm.service.InsuranceServiceImpl;

@RestController
@RequestMapping("/api/insurance")
public class InsuranceController {
	
	private final InsuranceServiceImpl service;
	
   InsuranceController(InsuranceServiceImpl service){
	   this.service=service;
   }
	
	@PostMapping("/register")
	public ResponseEntity<InsuranceCompany> registerInsurance(@RequestBody InsuranceCompany insurance) {
		InsuranceCompany company = service.InsuranceRegister(insurance);
		return new ResponseEntity<>(company,HttpStatus.CREATED);
		
	}
	@GetMapping("{id}")
	public ResponseEntity<InsuranceCompany> InsuranceDetails(@PathVariable("id") Long insuranceCompId){
		InsuranceCompany comp= service.insuranceDetails(insuranceCompId);
		return new ResponseEntity<>(comp,HttpStatus.OK);
		
	}
}
