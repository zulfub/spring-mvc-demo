package com.skuld.springdemo.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DepartmentControlConstraintValidator implements ConstraintValidator<DepartmentControl, String> {

	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {

		boolean result;

		if(arg0 !=null) {
			result = arg1.equals(arg0);
		}
		else {
			result = false;
		}
		return result;
	}

}
