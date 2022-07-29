package com.skuld.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String processForm(@ModelAttribute("student") Student student) {
	//ModelAttribute annotation for access to data
		//log the input data
		System.out.println("Student Name ::: " + student.getFirstName() + " " + student.getLastName());
		return "student-confirmation";
	}
}
