package com.coreJavaDeepDive;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;
/*
 * Application to read file input and count the duplicates
 * @author Logesh S
 * @Since 0.1
 */
public class DuplicatesCount {

	public static void main(String[] args) {
		
		HashMap<Character,Integer> hm = new HashMap(); // Creating HAshMAp
		try(FileInputStream fr = new FileInputStream("Input.txt");) { // Using try and catch block for exception handling
			int n= fr.read();
			while(n!=-1) {
				char ch1 = (char)n;
				if(hm.containsKey((ch1))){
					hm.put(ch1, hm.get(ch1)+1);
				}else {
					hm.put(ch1, 1);
				}
				n=fr.read();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		Set<HashMap.Entry<Character,Integer>> entry =hm.entrySet(); // Creating hashmap to get the duplicates
		for (HashMap.Entry<Character,Integer> e : entry) {
			if(e.getValue()>1) {
				System.out.println(e.getKey() + " " +e.getValue());
			}
		}
		System.out.println("No duplicate Character");
		}
	}


