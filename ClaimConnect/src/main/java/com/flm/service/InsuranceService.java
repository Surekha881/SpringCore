package com.flm.service;

import com.flm.entity.InsuranceCompany;

public interface InsuranceService {

	InsuranceCompany InsuranceRegister(InsuranceCompany insurance);

	InsuranceCompany insuranceDetails(Long insuranceId);

}
