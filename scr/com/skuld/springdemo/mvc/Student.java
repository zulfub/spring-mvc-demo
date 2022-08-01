package com.skuld.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private String codingLang;

	private LinkedHashMap<String,String>  countryOptions;
	private LinkedHashMap<String,String>  codingLanguages;
	private String[]  operatingSystems;


	public Student() {
		// No-arg constructor
		
		//Country List
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("TR", "Turkey");
		countryOptions.put("IND", "India");
		countryOptions.put("JPN", "Japon");
		countryOptions.put("USA", "United States America");
		countryOptions.put("DE", "Germany");
		
		//Coding Languages List
		codingLanguages = new LinkedHashMap<>();
		codingLanguages.put("JAVA","Java");
		codingLanguages.put("Python","Python");
		codingLanguages.put("HTML","HTML");
		codingLanguages.put("C#","C#");
		codingLanguages.put("PHP","PHP");
		
		//Operating System List
		
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

	public LinkedHashMap<String, String> getCodingLanguages() {
		return codingLanguages;
	}
	
	//operatingSystems
	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
}
