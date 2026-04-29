package com.flm.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.flm.entity.InsuranceCompany;
import com.flm.exception.InsuranceCompanyNotFoundException;
import com.flm.repository.InsuranceRepo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class InsuranceServiceImpl implements InsuranceService {
	
	private final InsuranceRepo repo;
	private final PasswordEncoder passwordEncoder;
	
	 InsuranceServiceImpl(InsuranceRepo repo, PasswordEncoder passwordEncoder) {
        this.repo = repo;
        this.passwordEncoder = passwordEncoder;
    }
	
	
	@Override
	public InsuranceCompany InsuranceRegister(InsuranceCompany insurance) {
		insurance.setInsuranceCompPwd(passwordEncoder.encode(insurance.getInsuranceCompPwd()));
		return repo.save(insurance);
	}

	@Override
	public InsuranceCompany insuranceDetails(Long insuranceCompId) {
		return repo.findById(insuranceCompId)
				.orElseThrow(() -> new InsuranceCompanyNotFoundException("Insurance company not found with id: " + insuranceCompId));
	}
}
