package com.skuld.springdemo.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String courseCodePrefix;
	
	@Override
	public void initialize(CourseCode courseCodeConstraint) {		
		courseCodePrefix = courseCodeConstraint.value();
		
	}

	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		boolean result = false ;
		//Validation		
		if(arg0!=null) {
		result = arg0.startsWith(courseCodePrefix);		
		}
		return result;
	}



}
