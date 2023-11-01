package com.LogeshJavaFundamentals;

import java.util.*;

public class ArrayElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[100];
		boolean flag = true;
		int max =arr[0];

		while(flag) {
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Enter the value");
				int k =sc.nextInt();			
				if(k<100) {
					arr[i]=k;
				}
				else {
					System.out.println("Enter number below 100");
				}
				if(arr[i]==-1) {
					System.out.println(max);
					flag = false;
					break;
				}
				else {
					for (int j = 0; j < arr.length; j++) {
						if(max < arr[i])
						{
							max = arr[i];
						}
					}
				}
			}
		}
	}
}
