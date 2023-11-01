package com.coreJavaDeepDive;
import java.util.Scanner;
/*
 * Application to get Substring and concat
 * @author Logesh S
 * @Since 0.1
 */

public class SubstringAndConcat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner class to read the object
		System.out.print("Enter a string: ");
		String value = sc.nextLine();
		try { // Creating try and catch block to handle exception
			String result = character(value); // calling a Character method
			System.out.println("Result: " + result);
		} catch (Exception e) {
			System.out.println("An error occurred: " + e.getMessage());
		}
	}
	public static String character(String i) { // Character method to check lenght and to add @ 
		try { // Creating try ande catch block to handle exception
			if (i.length() >= 2) {
				return i.substring(0, 2);
			} else if (i.length() == 1) {
				return i + "@";
			} else if(i.isEmpty()) {
				return "@@";
			}else
				return"@@";
		} catch (Exception e) {
			return "@@";
		}
	}
}