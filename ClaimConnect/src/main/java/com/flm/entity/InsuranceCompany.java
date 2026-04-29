package com.flm.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class InsuranceCompany {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long insuranceCompId;
	String insuranceCompName;
	String insuranceCompEmail;
	String insuranceCompPwd;
	public long getInsuranceCompId() {
		return insuranceCompId;
	}
	public void setInsuranceCompId(long insuranceCompId) {
		this.insuranceCompId = insuranceCompId;
	}
	public String getInsuranceCompName() {
		return insuranceCompName;
	}
	public void setInsuranceCompName(String insuranceCompName) {
		this.insuranceCompName = insuranceCompName;
	}
	public String getInsuranceCompEmail() {
		return insuranceCompEmail;
	}
	public void setInsuranceCompEmail(String insuranceCompEmail) {
		this.insuranceCompEmail = insuranceCompEmail;
	}
	public String getInsuranceCompPwd() {
		return insuranceCompPwd;
	}
	public void setInsuranceCompPwd(String insuranceCompPwd) {
		this.insuranceCompPwd = insuranceCompPwd;
	}
	
	

}
