package com.coreJavaDeepDive;
/*
 * Application to create and implement the product object
 * @author Logesh S
 * @Since 0.1
 */

public class Product implements Comparable<Product> { // Creating product class and implementd to comparable interface
	private int productid;
	private String productName;
	private String productCategory;
	private double productPrice;
	private double productDiscount;
	private int productQuantity;
	public Product(int productid, String productName, String productCategory, double productPrice,
			double productDiscount, int productQuantity) { // constructor with six arguments
		this.productid = productid;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
		this.productDiscount = productDiscount;
		this.productQuantity = productQuantity;
	} // Getter and Setter methods
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public double getProductDiscount() {
		return productDiscount;
	}
	public void setProductDiscount(double productDiscount) {
		this.productDiscount = productDiscount;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	@Override
	public String toString() { // To string method to print values
		return "Product [productid=" + productid + ", productName=" + productName + ", productCategory="
				+ productCategory + ", productPrice=" + productPrice + ", productDiscount=" + productDiscount
				+ ", productQuantity=" + productQuantity + "]";
	}
		@Override 
	public int compareTo(Product o) { // Compareto method is to sort based on productID
		
		return this.getProductid()-o.getProductid();
	}

}
