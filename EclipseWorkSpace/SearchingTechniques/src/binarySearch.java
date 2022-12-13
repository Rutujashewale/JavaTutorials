import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an Array:");
		int size=s.nextInt();
		
		System.out.println("Enter array elements:");
		int[] array=new int[size];
		for(int i=0;i<array.length;i++) {
			array[i]=s.nextInt();
		}
		
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		System.out.println("Enter the key to be searched:");
		int key=s.nextInt();
		
		int last=array.length-1;
		int result=binarySearch(array,0,last,key);
		
		if(result != -1) {
			System.out.println("element found at index" +result);
		}
		else {
			System.out.println("Element not found");
		}
	}
	
	
	public static int binarySearch(int array[],int first,int last,int key) {
		if(last>first) {
			int mid=first+(last-first)/2;
			
			if(array[mid] == key) {
				return mid;
			}
			if(array[mid]>key) {
				return binarySearch(array,first,mid-1,key);
			}
			else {
				return binarySearch(array,mid+1,last,key);
			}
		}
		return -1;
	}
}
