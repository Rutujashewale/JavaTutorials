package com.rutuja.billing.main;
import java.util.*;

import com.rutuja.billing.entity.Bill;
import com.rutuja.billing.entity.BillItems;
import com.rutuja.billing.entity.Product;
import com.rutuja.billing.init.ProductItems;
class BillSystemDriver{
	static List<Product> products= ProductItems.productItems();
	static List<BillItems> purchasedItems=new ArrayList<>();

	public static void main(String args[]){

		System.out.println("id name price DiscountPercentage");
		for(int i=0;i<products.size();i++) {
			Product p=products.get(i);
			System.out.println(p);
		}


		Bill b=new Bill();
		Scanner s=new Scanner(System.in);
		for(int i=0;i<2;i++){
			System.out.println("Enter product name:");
			String pName=s.next();
			System.out.println("Enter product quantity:");
			int pQuantity=s.nextInt();

			for(int j=0;j<products.size();j++){
				Product p=products.get(j);

				if(p.getProductName().equals(pName)){
					BillItems bi=new BillItems(p,pQuantity);
					purchasedItems.add(bi);
				}

			}
		}
		b.setPurchaseditems(purchasedItems);
		double totalAmount=0;
		for(int k=0;k<purchasedItems.size();k++){
			totalAmount = totalAmount + purchasedItems.get(k).getDiscountedPrice();	

		}



		System.out.format("\n-----------------------------------------------------------------------------\n");
		System.out.println("\n ProductId  ProductName  ProductAmount    Discount%    Quantity   TotalPrice    DiscountedAmount ");
		System.out.format("\n-----------------------------------------------------------------------------\n");
		for(int p=0;p<purchasedItems.size();p++){
			Product product=purchasedItems.get(p).getP();
			System.out.println("\n" + product.getProductId() + "\t\t" +product.getProductName()+ "\t\t" +product.getPrice() +"\t\t" +product.getDiscountPercentage() + "\t\t" + purchasedItems.get(p).getQuantity() +" " +purchasedItems.get(p).getTotalPrice() + " " +purchasedItems.get(p).getDiscountedPrice());
		}
		b.setFinalBill(totalAmount);
		System.out.println("\n \t\t\t\t\t\t\t Total amount:" + totalAmount);
	}
}