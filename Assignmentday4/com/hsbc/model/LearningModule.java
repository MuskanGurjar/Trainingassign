package com.hsbc.model;

import com.hsbc.exceptions.InvalidAgeException;
import com.hsbc.exceptions.WrongInputException;

public class LearningModule {
AgeValidator agevalid=new AgeValidator();

public String getLearningCode(String name,int age) throws WrongInputException{
	
	try {
		String agecode=agevalid.getAgeCode(age);
		String learningcode = name+agecode;
		return learningcode;
	} catch (InvalidAgeException e) {
		
		System.out.println(e.getMessage());
		throw new WrongInputException("Invalid input");
	}
	
	
}
}
