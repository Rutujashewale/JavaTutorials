import java.util.Scanner;

public class FactorialRecursion {
	public static void main(String args[]) {
		int fact,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		fact= factorial(n);
		System.out.println(fact);
	}

	static int factorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}else {
			return (n*factorial(n-1));

		}
	}
}
