package com.skuld.springdemo.mvc;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
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
	
	@NotNull(message = "is required")
	@Min(value=1,message="Min passes should be greater than 0")
	@Max(value = 100,message = "Max passes should be smaller than 100")
	private Integer freePasses;
	
	@Pattern(regexp = "^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$" , message = "Email is not correct")
	private String emailAddress;
	
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
	//firstName
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	//lastName
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	//department
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	//country
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	//freePasses
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
	}
	//emailAddress
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
