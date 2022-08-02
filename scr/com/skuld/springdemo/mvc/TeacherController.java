package com.skuld.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		//Create Teacher object
		Teacher teacher = new Teacher();
		//Add object attribute to model
		model.addAttribute("teacher" , teacher);		
		return "teacher-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("teacher") Teacher teacher,BindingResult bindingResult) {
		//ModelAttribute annotation for access to data
		if(bindingResult.hasErrors()) {
			return "teacher-form";
		}
		else {
			return "teacher-confirmation";
		}
	}
	
}