import java.util.Scanner;
class Fibonacci{ // Logic behind the program is summation of previous numbers is known as Fibonacci series like if n=3 then 0,0+1=1,1+1=2 so on

	public static void main(String args[]){
		int n1=0,n2=1,n3;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=s.nextInt();
		
		System.out.println(n1 + "" + n2);
		
		for(int i=2;i<=n;i++){
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	}
}