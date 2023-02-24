import java.util.Arrays;
import java.util.Scanner;

public class countzeros {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the size of an array");
		int size=s.nextInt();
		
		System.out.println("Enter array elements:");
		int[] array=new int[size];
		
		for(int i=0;i<array.length;i++) {
			array[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(array));
		
		sortArray(array);
		
		// printing the sorted array
		
		for(int j=0;j<array.length;j++) {
			System.out.println(array[j]);
		}
	}
	
	
	static void sortArray(int[] array) {
		int zero=0,one=0,two=0;
		int i=0;
		
	
		while(i<array.length) {
			if(array[i]==0) {
				zero=zero+1;
			}
			
			if(array[i]==1) {
				one=one+1;
			}
			
			if(array[i]==2) {
				two=two+1;
			}
			i=i+1;
		}
		i=0;
		
		while(i<zero) {
			array[i]=0;
			i=i+1;
		}
		while(i<one+zero) {
			array[i]=1;
			i=i+1;
		}
		while(i<two+one+zero) {
			array[i]=2;
			i=i+1;
		}
		
		
		
	}
}
