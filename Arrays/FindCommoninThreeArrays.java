import java.util.Arrays;
import java.util.Scanner;

public class FindCommoninThreeArrays {
	public static void main(String[] args) {


		Scanner s=new Scanner(System.in);

		System.out.println("Enter size of an array:");
		int size=s.nextInt();

		System.out.println("Enter array elements:");
		int[] array=new int[size];

		for(int i=0;i<array.length;i++) {
			array[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(array));
		System.out.println("Enter array1 elements:");
		int[] array1=new int[size];

		for(int i=0;i<array.length;i++) {
			array1[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(array1));
		System.out.println("Enter array 2 elements:");
		int[] array2=new int[size];

		for(int i=0;i<array2.length;i++) {
			array2[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(array2));
		
		
		System.out.println("Common elements are:");
		findCommon(array, array1, array2);
	}
	
	static void findCommon(int[] array,int[] array1,int[] array2) {
		int i=0,j=0,k=0;
		while( i<array.length && j<array1.length && k<array2.length) {
			
			if(array[i]== array1[j] && array1[j]==array2[k]) {
				System.out.println(array[i] + " ");
				i++;
				j++;
				k++;
				
			}
			else if(array[i] <array1[j]) {
				i++;
			}
			else if(array1[j]<array2[k]) {
				j++;
			}
			else {
				k++;
			}
		}
	}
}