import java.util.Scanner;

public class FibonacciSeries {
	static int number=0,number1=1,number2=0;
	public static void main(String args[]) {
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the count");
		int count=s.nextInt();
		
		for(int i=0;i<count;i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}
	
	static int fibonacci(int count) {
		
		if(count==0 ) {
			return 0;
		}
		
		else if(count==1||count==2 ) {
			return 1;
		}
		else {
			return fibonacci(count-1)+ fibonacci(count-2);
		}
	}
}
