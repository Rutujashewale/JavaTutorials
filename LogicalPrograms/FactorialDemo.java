import java.util.Scanner;
class FactorialDemo{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int fact=1,no=0;
		
		System.out.println("Enter a number :");
		
	    try{
			no=s.nextInt();
			throw new IllegalArgumentException("Invalid number" + no);
		}
		catch(Exception e){
			System.out.println("Enter valid no:");
			System.exit(0);
		}
		
		for(int i=1;i<=no;i++){
			fact=fact*i;
		}
		System.out.println("Factorial is : " +fact);
	}
}