package com.LogeshJavaFundamentals;

import java.util.Scanner;

public class RailwayFare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of passengers");
		int no = sc.nextInt();
		int fare =0 ;
		int n=0;
		while(n<no) {
			System.out.println("Enter passenger Name");
			String name = sc.next();
			System.out.println("Enter passenger age");
			int age = sc.nextInt();
			System.out.println("Enter the boarding point");
			String boardingPoint=sc.next();
			if(boardingPoint.equalsIgnoreCase("pune")&& age>5) {
				fare += 295;	
			}else if (boardingPoint.equalsIgnoreCase("lonavala")&&age>5) {
				fare+=235;
			}else if (age<5) {
				fare +=0;	
			}
			else {
				System.out.println("Enter Valid boarding point");
			}
			n++;
			System.out.println("Passenger Name :" + name + "Passengers age : " + age + " Boarding Point : " + boardingPoint );
		}
			System.out.println("The total fare for " + no + " Passengers : " + fare);
			sc.close();	}

}
