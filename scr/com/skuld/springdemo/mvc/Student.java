package com.skuld.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private String codingLang;
	private LinkedHashMap<String,String>  countryOptions;
	
	public Student() {
		// No-arg constructor
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("TR", "Turkey");
		countryOptions.put("IND", "India");
		countryOptions.put("JPN", "Japon");
		countryOptions.put("USA", "United States America");
		countryOptions.put("DE", "Germany");
	}
	
	//Auto Generated Getters and Setters
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
	//country
	public String getCountry() {
		return country;
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	//codingLang
	public String getCodingLang() {
		return codingLang;
	}
	public void setCodingLang(String codingLang) {
		this.codingLang = codingLang;
	}
	
}
