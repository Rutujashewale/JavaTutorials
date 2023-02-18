import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=s.nextInt();
		
		System.out.println("Enter array elements:");
		int[] array=new int[size];
		
		int i;
		for( i=0;i<array.length;i++) {
			array[i]=s.nextInt();
		}
		System.out.println("Array elements are:" +Arrays.toString(array));
		
		System.out.println("Array after sorting are:");
		
		for(int k=1;k<array.length;k++) {
		int temp=array[k];
		int j=k-1;
		
		while(j>=0 && array[j]>temp) {
			array[j+1]=array[j];
			j--;
		}
		array[j+1]=temp;
		}
		System.out.println(Arrays.toString(array));
	}
}
