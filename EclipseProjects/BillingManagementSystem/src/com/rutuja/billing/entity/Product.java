package com.rutuja.billing.entity;

public class Product{
	int productId;
	String productName;
	double price,discountPercentage;
	
	Product(){
	}
	
	public Product(int productId,String productName,double price,double discountPercentage){
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		this.discountPercentage=discountPercentage;
	}
	
	public int getProductId(){
		return this.productId;
	}
	public double getDiscountPercentage(){
		return this.discountPercentage;
	}
	public String getProductName(){
		return this.productName;
	}
	public double getPrice(){
		return this.price;
	}
	
	public void setProductId(int productId){
		this.productId=productId;
	}
	public void setDiscountPercentage(double discountPercentage){
		this.discountPercentage=discountPercentage;
	}
	public void setProductName(String productName){
		this.productName=productName;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public String toString(){
		return this.productId + " " + this.productName + " " + this.price + " " + this.discountPercentage;
	}
}