package stringSample;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to check:");
		int number=s.nextInt();
		boolean flag=false;
		
		if(number==0||number==1) {
			System.out.println("No not prime");
		}
		else {
			for(int i=2;i<number;i++) {
				if(number%i==0) {
					System.out.println("Number not prime");
					flag=true;
					break;
				}
			}
			if(flag==false) {
				System.out.println("Prime");
			}
		}
	}
}
