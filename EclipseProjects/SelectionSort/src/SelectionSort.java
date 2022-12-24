// Selection sort: Here in the first iteration the smallest element from the list will be sorted and so on for remaining iterations.


import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=s.nextInt();

		System.out.println("Enter array elements:");
		int array[]=new int[size];
		int i;
		for( i=0;i<size;i++) {
			array[i]=s.nextInt();
			
		}
		
		System.out.println("Array elements before sorting:" +Arrays.toString(array));
		
		// to sort the elements:
		
		int index=0;
		int temp=0;
		
		for(int j=0;j<array.length;j++){
			
			index=j;
			for(int k=j+1;k<array.length;k++) {
				if(array[k]<array[index]) {	
					index=k;
				}		
			}
			//Logic to swap the elements
			temp=array[index];
			array[index]=array[j];
			array[j]=temp;
			
		}
	
		System.out.println(" After Selection sort" + Arrays.toString(array));
		
	}	
}
