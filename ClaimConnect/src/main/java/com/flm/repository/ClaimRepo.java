package com.flm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flm.entity.ClaimRequest;
@Repository
public interface ClaimRepo extends JpaRepository<ClaimRequest, Long>{

}
