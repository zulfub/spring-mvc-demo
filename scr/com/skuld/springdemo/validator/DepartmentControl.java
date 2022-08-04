package com.skuld.springdemo.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;

@Constraint(validatedBy = DepartmentControlConstraintValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface DepartmentControl {

	//define default DepartmentControl
	public String value() default "Dev";
	
	//define default group values
	public Class<?>[] groups () default{	
	}
	
	//define default Error Message
	public String message() default "Department should be start with DEV ";
	
	public Class<? extend payNpad()> default default{}
}
