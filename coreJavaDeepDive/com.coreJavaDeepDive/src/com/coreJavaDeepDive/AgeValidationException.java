package com.coreJavaDeepDive;

import java.util.Scanner;
/*
 * Application to VAlidate AGe with exception
 * @author Logesh S
 * @Since 0.1
 */
public class AgeValidationException extends Exception { // Creating a user custom exception by extends to exception
	
	public AgeValidationException(String s){ // Constructor with one argument
			super(s); 
	}
	
}
