package com.flm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClaimRequest {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;
	String synopsis;
	double price;
	long potientId;
	long hospitalId;
	long insuranceCompId;
	String status;
	

}
