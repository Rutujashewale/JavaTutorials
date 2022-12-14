import java.util.*;
class BillSystemDriver{
	static List<Product> productitems= new ArrayList<>();
	static List<BillItems> purchasedItems=new ArrayList<>();
	
	public static void main(String args[]){
		productItems();
		Bill b=new Bill();
		Scanner s=new Scanner(System.in);
		for(int i=0;i<2;i++){
			System.out.println("Enter product name:");
			String pName=s.next();
			System.out.println("Enter product quantity:");
			int pQuantity=s.nextInt();
			
			for(int j=0;j<productitems.size();j++){
				Product p=productitems.get(j);
				
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
	
	public static void productItems(){
		
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
		
		productitems.add(p1);
		productitems.add(p2);
		productitems.add(p3);
		productitems.add(p4);
		productitems.add(p5);
		productitems.add(p6);
		productitems.add(p7);
		productitems.add(p8);
		productitems.add(p9);
		productitems.add(p10);
		
		
	}
}