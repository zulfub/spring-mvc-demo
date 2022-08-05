package com.skuld.springdemo.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

	//default value definition
	public String value() default "Spring";
	
	//default message definition
	public String message() default "Must start with Spring";
	
	//default group definition
	public Class<?>[] groups() default {};
	
	//default pay load
	public Class<? extends Payload>[] payload() default{};
	
}
