import java.util.Arrays;
import java.util.Scanner;

public class FindSubArrayCount{
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
		
		System.out.println("Enter the sum to be checked:");
		int sum=s.nextInt();
		
		int count =0;
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]+array[j] == sum) {
					count++;
				}
			}
		}
		System.out.println("Count of pairs is:" +count);
		
	}
}
