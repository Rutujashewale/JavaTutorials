package stringSample;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int n=0,sum=0,temp,a;
		
		System.out.println("Armstrong numbers from 1-1000");
		for(int i=1;i<1000;i++) {
			n=i;
		while(n>0) {
			a=n%10;
			
			sum=sum+(a*a*a);
			n=n/10;
		}
		
		if(sum == i) {
			System.out.println(i);
		}
		sum=0;	
		}
	}

}
