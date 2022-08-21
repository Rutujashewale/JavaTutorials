import java.util.Scanner;

class AdditionDemo{
	int Sum;
	public void printAddition(){
		
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the value of a and b");
		
		int a= s.nextInt();
		int b= s.nextInt();
		
		System.out.print("a:" + a);
		System.out.print("b:" + b);
		
		Sum=a+b;
		
		System.out.print("Sum of two no's is:" +Sum);
	}
}