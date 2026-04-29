package com.flm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.flm.entity.Patient;
import com.flm.repository.PatientRepo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class PatientServiceImpl implements PatientService {
	
	private final PatientRepo repo;
	
	@Autowired
    public PatientServiceImpl(PatientRepo repo) {
        this.repo = repo;
    }
	
	  @Autowired
	    private PasswordEncoder passwordEncoder;
	  @Override
	  public Patient signup(Patient patient) {
		  System.out.println("changes need to be done");
		  
		  patient.setPatientPassword(passwordEncoder.encode(patient.getPatientPassword()));
		  return repo.save(patient);
		  
	  }

	  public Patient findById(Long patientId) {
		 return repo.findById(patientId)
				 .orElseThrow(() -> new RuntimeException("Patient not found with id " + patientId));
		
		
	  }

}
