package com.coreJavaDeepDive;
/*
 * Application to VAlidate AGe with exception
 * @author Logesh S
 * @Since 0.1
 */
public class ValidateAge {
	public  void ValidateAge(int age) throws AgeValidationException { // Creating method and providing conditions to check age
		if(age>100) {
			throw new AgeValidationException("Age is to high");
		}else if (age<1) {
			throw new AgeValidationException("Ages is to low");
		}else
		{
			System.out.println("Age is valid");
		}		

	}

}
