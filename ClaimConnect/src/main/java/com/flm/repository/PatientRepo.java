package com.flm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flm.entity.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient,Long>{

}
