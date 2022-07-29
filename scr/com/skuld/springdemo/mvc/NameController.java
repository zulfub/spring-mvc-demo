package com.skuld.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/studentNameForm")
public class NameController {

	//Method for show from
	@RequestMapping("/showForm")
	public String showForm() {
			
		return "helloworld-form";		
	}
		
	//Method for process form
	@RequestMapping("/processForm")
	public String processForm() {
		
		return "helloworld";
	}
	
	//New Controller , read form data and add data to Model
	@RequestMapping("/converToAllCaps")
	public String convertToAllCaps(HttpServletRequest request , Model model) {
		
		//Read Data from Form 
		String name = request.getParameter("studentName");
		//Convert Data to UpperCase
		name = name.toUpperCase();
		//Create Message Data
		String result = "Yo! " + name;
		//Add message to Model
		model.addAttribute("message",result);
		return "helloworld2";
	}
	
	@RequestMapping("/getNameLastName")
	public String getNameLastName(@RequestParam("studentNameInfos") String nameInfo , Model model) {
		//Read Data from Form using RequestParam annotation
		
		//Convert Data to UpperCase
		nameInfo = nameInfo.toUpperCase();
		//Create Message Data
		String result = "Yo! " + nameInfo + "uppercased using RequestParam annotation";
		//Add message to Model
		model.addAttribute("message",result);
		return "studentNameInfo";
	}
}
