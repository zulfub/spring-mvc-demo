package com.skuld.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	//Method for Display Form 
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		//Create a Student object
		Student student = new Student();
		//add student object to the model
		model.addAttribute("student",student);
		
		return "student-form";
	}
	
	//Method for Process Form
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("student") Student student , BindingResult bindingResult) {
	//ModelAttribute annotation for access to data
		//log the input data
		System.out.println("Student Name ::: " + student.getFirstName() + " " + student.getLastName() + "\nCountry Selected by student ::: " + student.getCountry() 
		+ "\nFavorite Coding Language ::: " + student.getCodingLang() + "\nStudent's Operating System List ::: "+ student.getOperatingSystems().toString());
		
		
		if(bindingResult.hasErrors()) {
			return "student-form";
		}
		else {
			return "student-confirmation";
		}
	}
}
