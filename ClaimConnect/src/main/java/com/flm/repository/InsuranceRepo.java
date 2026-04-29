package com.flm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flm.entity.InsuranceCompany;

@Repository
public interface InsuranceRepo extends JpaRepository<InsuranceCompany, Long>{

}
