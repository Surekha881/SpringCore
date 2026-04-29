package com.flm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flm.entity.Hospital;
@Repository
public interface HospitalRepo extends JpaRepository<Hospital, Long> {

}
