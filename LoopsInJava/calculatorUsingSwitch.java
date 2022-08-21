import java.util.*;
class CalculatorUsingSwitch{
	public static void main(String args[]){
	
	Scanner s=new Scanner(System.in);
	
	System.out.println("enter two numbers: ");
	 
	double a=s.nextDouble();
	double b=s.nextDouble();
	
	System.out.println("Enter the operators: (+,-,*,/)");
	char operators=s.next().charAt(0);
	
	double result=0;
	
	switch(operators){
		case '+':
		result = a + b;
		break;
		
		case '-':
		result = a - b;
		break;
	
		case '/':
		result = a / b;
		break;
	
		case '*':
		result = a * b;
		break;
		
		default: 
		System.out.printf("operator is not correct");
	}
	System.out.printf(a + ""+ operators + ""  + b +  "" + result);
	
											
	}
}