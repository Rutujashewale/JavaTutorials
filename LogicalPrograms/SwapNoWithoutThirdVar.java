import java.util.Scanner;
class SwapNoWithoutThirdVar{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter 1st number");
		int no1=s.nextInt();
		System.out.println("Enter 2nd number");
		int no2=s.nextInt();
		
		System.out.println("Original value of no1 is :" + no1+ "and no 2 is:" +no2);
		
		no1=no1+no2;
		no2=no1-no2;
		no1=no1-no2;
		
		System.out.println("Values after Swapping are:" + no1 + "and no 2 is:" + no2);
	}
}