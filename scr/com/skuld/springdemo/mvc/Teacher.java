package com.skuld.springdemo.mvc;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Teacher {

	//Fields for Class
	
	//Validation 
	@NotNull(message = "is required")
	@Size(min=1 , max=6 , message = "Name must be between 1-6")
	private String firstName;
	
	@NotNull(message = "Can not be Null")
	@Size(min=3 , message = "min = 3")
	private String lastName;
	
	@NotNull(message = "is required")
	private String department;
	
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	
	//No-arg Constructor
	public Teacher() {
		
		//Country Options
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("TR", "Turkey");
		countryOptions.put("IND","India");
		countryOptions.put("ENG","England");
		countryOptions.put("USA","United States of America");
	}
	
	//Getter and Setters 
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	
	
	
}
