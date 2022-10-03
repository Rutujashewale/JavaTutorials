import java.util.Scanner;
class PrintTableDriver{
	
	public static void main(String args[]){
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int num =s.nextInt();
		
		
		PrinTables printTable = new PrinTables();
		
		printTable.printTableDemo(num);
		
		
	}
}