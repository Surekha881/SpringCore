package com.infy.model;

import java.util.ArrayList;
import java.util.List;

public class User {
	int userId;
	String name;
	
	List<String> skills;	
	public List<String> getSkills() {
		return skills;
	}


	public void setSkills(List<String> skills) {
		this.skills = skills;
	}


	public User() {
		
	}
	

	public User(int userId, String name) {
		super();
		this.userId = userId;
		this.name = name;
	}


	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", skills=" + skills + "]";
	}


	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
