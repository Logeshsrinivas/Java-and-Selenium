package com.coreJavaDeepDive;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
 * Application to perform string operation based on Streams
 * @author Logesh S
 * @Since 0.1
 */
public class StringsOFObject {
		public class StringOperation {
		    public static void main(String[] args) {      
		    	List<String> string = Arrays.asList("Logesh", "", "praveen", "om Prakash", "", "challa.reddy", "deepak.punk"); // Creating a array of list	       
		        long empty = string.stream()         // converting string into streams
		                .filter(s -> s.isEmpty())
		                .count();
		        System.out.println("List " + string + " has " + empty + " empty strings");	
		        List<String> WithA = string.stream() // collecting a list from stream 
		                .filter(s -> s.contains("a"))
		                .collect(Collectors.toList());
		        System.out.println("List " + string + " has " + WithA.size() + " strings which contain 'a'");
		        System.out.println(WithA);  // printing a name with a 
		        String Uppercase = string.stream()   // collecting a string from stream 
		                .map(String::toUpperCase)
		                .collect(Collectors.joining(", "));
		        System.out.println(Uppercase); // printing a name converted to uppercase
		    }
		}
}
