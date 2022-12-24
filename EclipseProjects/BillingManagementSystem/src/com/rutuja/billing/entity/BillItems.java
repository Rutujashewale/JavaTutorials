package com.rutuja.billing.entity;
public class BillItems{
	Product p;
	int quantity;
	double totalPrice;
	double discountedPrice;
	
	BillItems(){
	}
	BillItems(Product p,int quantity,double totalPrice,double discountedPrice){
		this.p=p;
		this.quantity=quantity;
		this.totalPrice=totalPrice;
		this.discountedPrice=discountedPrice;
	}
	
	public BillItems(Product p,int quantity){
		this.p=p;
		this.quantity=quantity;
		
	}
	public int getQuantity(){
		return this.quantity;
		
	
	}
	public double getTotalPrice(){
		return this.quantity * this.p.getPrice();
	}
	public double getDiscountedPrice(){
		this.discountedPrice = (this.getTotalPrice() - ( this.getTotalPrice() * (this.p.getDiscountPercentage()/100 )));
		return this.discountedPrice;
	}
	public Product getP(){
		return this.p;
	}
	

	public String toString(){
		return this.p + " " + this.quantity + " " + this.totalPrice + " " + this.discountedPrice;
	}
}