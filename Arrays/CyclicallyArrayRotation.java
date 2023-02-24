import java.util.Arrays;
import java.util.Scanner;

public class CyclicallyArrayRotation {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size=s.nextInt();
		
		System.out.println("Enter array elements:");
		int[] array=new int[size];
		
		for(int i=0;i<array.length;i++) {
			array[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(array));
		
		rotate(array);
		System.out.println("Array after rotation :" + Arrays.toString(array));
	}
	
//	static void rotate(int[] array) {
//		int i=0,j=array.length-1;
//		int temp;
//		
//		while(i !=j) {
//			temp=array[i];
//			array[i]=array[j];
//			array[j]=temp;
//			
//			i++;
//		}
//	}
	
	static void rotate(int[] array) {
		int lastElement = array[array.length-1];
		
		for(int i=array.length-1;i>0;i--) {
			array[i]=array[i-1];
		}
		array[0]=lastElement;
	}
}
