package com.coreJavaDeepDive;

import java.util.Scanner;
/*
 * Application to VAlidate AGe with exception
 * @author Logesh S
 * @Since 0.1
 */
public class TesterAgeValidation {

	public static void main(String[] args) {
		ValidateAge ag = new ValidateAge(); // Creating a object for validateAge
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int n= sc.nextInt();
		 try { // Creating try and catch block to handle exception
			ag.ValidateAge(n); // Calling validateAdge method
		} catch (AgeValidationException e) {
			System.out.println(e.getMessage());
		}
	
	}

}
