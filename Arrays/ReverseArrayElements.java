import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayElements {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=s.nextInt();

		System.out.println("Enter array elements:");
		int[] array=new int[size];

		for(int i=0;i<array.length;i++) {
			array[i]=s.nextInt();
		}

		System.out.println(Arrays.toString(array));
		
		reverseArray(array,0,array.length-1);
	}
	
	
	 static void reverseArray(int[] array,int startIndex,int endIndex) {
		int temp;
		
		while(startIndex < endIndex) {
			temp=array[startIndex];
			array[startIndex]=array[endIndex];
			array[endIndex]=temp;
			
			startIndex++;
			endIndex--;
			
			
		}
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
}
