
import java.util.Scanner;

class AverageDriver{
	public static void main(String args[]){
	
		Average average=new Average();
	
	/*	average.averageNo();
		System.out.print("Average is :" + average.average);
	*/
	
	//	average.Sum();
		
		int a,b,sum;
		float division;
		
		Scanner sc=new Scanner(System.in);
	   
		System.out.println("Enter no 1: ");
		a = sc.nextInt();
        
		
		 System.out.println("Enter no 2: ");
         b = sc.nextInt();
        
		System.out.print("a:" + a);
		System.out.print("b:" + b);
		
		
		 sum=average.getSum(a,b);
		 
		 System.out.println("Sum is: " + sum);
        
		division=average.getDivision(a,b);
		System.out.println("Division is :" + division);
	
	}
}