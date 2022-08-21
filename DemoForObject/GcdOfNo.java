import java.util.Scanner;
class GcdOfNo{
	public static void main(string agrs[]){
	int i, GCD=0;
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter number 1: ");
	int no1=s.nextInt();
	
	System.out.println("Enter number 2: ");
	int no2=s.nextInt();
	
	for(i = 1; i <= no1 && i <= no2; i++){
	 if(no1 % i == 0 && no2 % i == 0)
	        {
	            GCD = i;
	        }
	}	
		System.out.println("\n GCD of " + no1 + " and " + no2 + "  =  " + GCD);
	
	}
}
