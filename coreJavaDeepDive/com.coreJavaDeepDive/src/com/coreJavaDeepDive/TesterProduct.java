package com.coreJavaDeepDive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/*
 * Application to create and implement the product object
 * @author Logesh S
 * @Since 0.1
 */

public class TesterProduct {
	public static ArrayList<Product> getProducts() { // Creating a static arraylist to get product objects
		Product p1 = new Product(101, "iphone10", "Mobile", 20000.0, 0.2, 2);
		Product p2 = new Product(104, "Lenovo", "Laptop", 700000.0, 0.8, 3);
		Product p3 = new Product(105, "iphone12", "Mobile", 50000.0, 0.5, 6);
		Product p4 = new Product(103, "iphone13", "Mobile", 10000.0, 0.5, 1);
		Product p5 = new Product(102, "Dell", "Laptop", 20000.0, 0.3, 4);

		ArrayList<Product> pr = new ArrayList<Product>(); // adding objects to an arraylist
		pr.add(p1);
		pr.add(p2);
		pr.add(p3);
		pr.add(p4);
		pr.add(p5);
		
		return pr;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Creating Scanner Class to read input 
		List<Product> products = getProducts(); // creating list and adding products
		boolean flag =true;
		while(flag){
			System.out.println("Choose an option below: " +"\n"
					+ "1) Sort by ID" + "\n"
					+ "2) List Mobiles with price more than 40000" + "\n"
					+ "3) Exit");
			int n = sc.nextInt();
			if(n==1) {
				Collections.sort(products); // sorting a object based on productID
				for (Product product : products) {
					System.out.println(product);
				}
			}else if(n==2) {
					 	products.stream() // Converting products into streams
						.filter(p->(p.getProductPrice()>40000.0))
//						.map(p->p.getProductPrice())
						.forEach(p->System.out.println(p));

			}else if(n==3) {
				flag=false;
				System.out.println("Thank you.....!!");
				break;
				
			}
			
		}
			
	
		
		
		
	}
}

