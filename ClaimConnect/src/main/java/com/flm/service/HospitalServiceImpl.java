package com.flm.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.flm.entity.Hospital;
import com.flm.repository.HospitalRepo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class HospitalServiceImpl implements HospitalService{
	
	private final HospitalRepo repo;
	
	
	private final PasswordEncoder passwordEncoder;
	public HospitalServiceImpl(HospitalRepo repo, PasswordEncoder passwordEncoder) {
        this.repo = repo;
        this.passwordEncoder = passwordEncoder;
    }
	
	@Override
	public Hospital registerDetails(Hospital hospital) {
		 hospital.setHospitalPassword(passwordEncoder.encode(hospital.getHospitalPassword()));
		return repo.save(hospital);
		
	}
	@Override
	public Hospital HospitalDetails(Long hospitalId) {
		return repo.findById(hospitalId)
				.orElseThrow(() -> new RuntimeException("hospital details not found "+hospitalId));
	}

}
