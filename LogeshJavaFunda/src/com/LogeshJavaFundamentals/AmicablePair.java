package com.LogeshJavaFundamentals;

import java.util.Scanner;

public class AmicablePair{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number to check amicable or not");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second number to check amicable or not");
		int num2 = sc.nextInt();
		int sum1=0;
		int sum2=0;
		for (int i = 1; i<num1; i++) {
			if(num1%i==0) {
				sum1+=i;
			}
		}
		for (int j = 1; j<num2; j++) {
			if(num2%j==0) {
				sum2+=j;
			}		
	}
		if(num1==num2) {
			System.out.println("False");
		}
		else if(sum1==num2&&sum2==num1) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
	
}
