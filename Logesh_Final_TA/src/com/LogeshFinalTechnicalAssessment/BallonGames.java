package com.LogeshFinalTechnicalAssessment;

import java.util.Iterator;
import java.util.Scanner;

public class BallonGames {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of ballon Shooted");
		int score =Fabonicc(sc.nextInt());
		if(score<0) {
			System.out.println("Invalid Ballon Count");
		}else {
		System.out.println("The player Score is : "+ score);
		}
		}
	public static int Fabonicc(int k) {
		int sum=0;
		for (int i = 0; i <k; i++) {
			sum = sum+i;	
		}
		if(sum==1) {
			return sum;
		}else {
			return sum-1;	
		}
		}
	}


