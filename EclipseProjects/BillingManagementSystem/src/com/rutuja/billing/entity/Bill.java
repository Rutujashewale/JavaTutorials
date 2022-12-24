package com.rutuja.billing.entity;
import java.util.*;
public class Bill{
		List<BillItems> purchasedItems=new ArrayList<>();
		double finalBill;
		
		public Bill(){
		}
		Bill(List<BillItems> purchasedItems,double finalBill ){
			this.purchasedItems=purchasedItems;
			this.finalBill=finalBill;
		}
		
		public double getFinalBill(){
			return this.finalBill;
		}
		public void setFinalBill(double finalBill){
			this.finalBill=finalBill;
		}
		public List<BillItems> getPurchasedItems(){
			return this.purchasedItems;
		}
		
		public void setPurchaseditems(List<BillItems> purchasedItems){
			this.purchasedItems=purchasedItems;
		}
		
		public String toString(){
			return this.purchasedItems + " " + this.finalBill;
		}
}