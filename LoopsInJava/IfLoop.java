import java.util.Scanner;

class IfLoop{
	public static void main(String args[]){
	
	Scanner s=new Scanner(System.in);
	
	System.out.print("Enter number to  Check whether it is Divisible by 2 and 3: ");
	
	int number=s.nextInt();
	
	if((number % 2==0) && (number % 3==0)){
		System.out.print("Number is divisible :");
	
	}else{
		System.out.print("Number isn't divisible :");
		
	}

	}
}