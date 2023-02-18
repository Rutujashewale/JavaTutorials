import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=s.nextInt();
		
		System.out.println("Enter array elements:");
		int[] array=new int[size];
		
		for(int i=0;i<array.length;i++) {
			array[i]=s.nextInt();
		}
		System.out.println("Array elements are:" +Arrays.toString(array));
		
		
		int index=0;
		int temp=0;
		for(int j=0;j<array.length;j++) {
			index=j;
			for(int k=j+1;k<array.length;k++) {
				if(array[k]<array[index]) {
					index=k;
			}
				
		
				temp=array[index];
				array[index]=array[j];
				array[j]=temp;
			}
		}
		
		System.out.println("Elements after selection sort are:" +Arrays.toString(array));
	}
	
	
}
