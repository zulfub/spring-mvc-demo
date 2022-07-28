package com.skuld.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/studentDepForm")
public class DepartmentController {
	
	//Method for show from
	@RequestMapping("/showForm")
	public String displayDepForm() {
		return "department-form";
	}
	
	//Method for process from
	@RequestMapping("/processForm")
	public String processForm() {
		return "departmentInfo";
	}
	
}
