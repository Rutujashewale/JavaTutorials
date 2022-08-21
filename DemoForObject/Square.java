// import java.lang.Math;
import java.util.Scanner;

class Square{
		public void square(int number){
		int square1;
		Scanner s = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = s.nextInt();		
		
		square1 = number * number;
		
		System.out.println("\n The Square of a Given Number  " + number + "  =  " + square1);
	}
}
