import java.util.Arrays;
import java.util.Scanner;
class SumofTwoArrays{
	public static void main(String args[]){
	
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter the no of elements in first array :");
	int array1size=s.nextInt();
	
	System.out.println("Enter the no of elements in second array :");
	int array2size=s.nextInt();
	
	if(array1size != array2size){
		System.out.println("Array elements should have same size :");
		
	
	return;
	}
	int array1[]=new int[array1size];
	int array2[]=new int[array1size];
	int array3[]=new int[array1size];
	
	System.out.println("Enter the first array elements:");
	for(int i=0;i<array1.length;i++){
		array1[i]=s.nextInt();
	}
	
	System.out.println("Enter the second array elements:");
	for(int i=0;i<array2.length;i++){
		array2[i]=s.nextInt();
	}
	
	for(int i=0;i<array3.length;i++){
		array3[i]=array1[i]+array2[i];
	}
	System.out.println("Result: "+ Arrays.toString(array3));
	}
}