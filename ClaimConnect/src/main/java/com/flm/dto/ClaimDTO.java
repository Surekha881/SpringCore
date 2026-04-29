package com.flm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClaimDTO {
	
	long id;
	String synopsis;
	double price;
	long potientId;
	long hospitalId;
	long insuranceCompId;
	String status;

}
