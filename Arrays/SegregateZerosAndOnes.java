import java.util.Arrays;
import java.util.Scanner;

public class SegregateZerosAndOnes {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the size of an array:");
		int size=s.nextInt();
		
		System.out.println("Enter array elements:");
		int[] array=new int[size];
		
		for(int i=0;i<array.length;i++) {
			array[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(array));
		
		int count=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]==0) {
				count++;
				
			}
		}
		for(int i=0;i<count;i++) {
			array[i]=0;
		}
		for(int i=count;i<array.length;i++) {
			array[i]=1;
		}
		
		System.out.println(Arrays.toString(array));
	}
}
