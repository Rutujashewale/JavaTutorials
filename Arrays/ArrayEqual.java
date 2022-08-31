import java.util.Arrays;
import java.util.Scanner;
class ArrayEqual{
	public static void main(String args[]){
	
	Scanner s = new Scanner(System.in);

	System.out.println("Enter the size of array 1:");
	int size= s.nextInt();
	
	int[] arr1=new int[size];
	System.out.println("Enter the " + size + " elements of array 1:");
	for(int i=0;i<size;i++){
		arr1[i]=s.nextInt();
	}
	
	

	int[] arr2=new int[size];
	System.out.println("Enter the " + size + " elements of array 2:");
	for(int i=0;i<size;i++){
		arr2[i]=s.nextInt();
	}

	

	int[] arr3=new int[size];
	System.out.println("Enter the " + size + "  elements of array 3:");
	for(int i=0;i<size;i++){
		arr3[i]=s.nextInt();
	}
	
	
	
	if(Arrays.equals(arr1,arr2)){
		System.out.println(" arr1 and arr2 are equal:");
	}else{
		System.out.println(" arr1 and arr2 are not equal:");
	}
	if(Arrays.equals(arr1,arr3)){
		System.out.println(" arr1 and arr3 are equal:");
	}else{
		System.out.println(" arr1 and arr3 are not equal:");
	}
	
	
	}
}







