import java.util.Arrays;
import java.util.Scanner;
class ArrayEqualOptimized{
	public static void main(String args[]){
	
	Scanner s = new Scanner(System.in);

	System.out.println("Enter the size of array 1:");
	int size= s.nextInt();
	int[] arr1=enterArrayElements(size);
	int[] arr2=enterArrayElements(size);
	int[] arr3=enterArrayElements(size);
	
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
	
	public static int[] enterArrayElements(int size){
		int[] arr = new int[size];
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter "+size+" elements of the array");
		for(int i=0;i<size;i++){
			arr[i]=s.nextInt();
		}
		return arr;
	}
}






