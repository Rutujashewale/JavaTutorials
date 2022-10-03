import java.util.Scanner;
class OddNumbersDriver{
	
	public static void main(String args[]){
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int num =s.nextInt();
		
		OddNumbers on=new OddNumbers();
		
		on.oddNoDemo(num);
		
		
	}
}