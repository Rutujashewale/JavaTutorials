package com.rutuja.billing.init;
import java.util.ArrayList;
import java.util.List;

import com.rutuja.billing.entity.Product;

public class ProductItems {
	public static List<Product> productItems(){
			List<Product> products=new ArrayList<>();

			Product p1= new Product(1,"Sugar",90,10);
			Product p2= new Product(2,"Tea Powder",100,5);
			Product p3= new Product(3,"Colgate",120,15);
			Product p4= new Product(4,"EdibleOil",130,10);
			Product p5= new Product(5,"Ghee",140,5);
			Product p6= new Product(6,"Soap",150,10);
			Product p7= new Product(7,"Tub",160,15);
			Product p8= new Product(8,"Mug",170,5);
			Product p9= new Product(9,"Coffee",180,10);
			Product p10= new Product(10,"Milk",190,5);

			products.add(p1);
			products.add(p2);
			products.add(p3);
			products.add(p4);
			products.add(p5);
			products.add(p6);
			products.add(p7);
			products.add(p8);
			products.add(p9);
			products.add(p10);

			return products;
		}
}