import java.util.Scanner;

class MaxNumberDriver{
	public static void main(String args[]){
	
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter number of elements in array : ");
		int elements = s.nextInt();
		
	//	int a[]= new int[elements];
		
		System.out.println("Enter elements of array :");
		
		MaxNumber maxNo= new MaxNumber();
		
		maxNo.maxDemo(elements);
	
	}
}