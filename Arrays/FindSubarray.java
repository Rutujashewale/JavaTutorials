import java.util.Arrays;
import java.util.Scanner;

public class FindSubarray {
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
		
		
		System.out.println("Enter the sum to be checked:");
		int sum=s.nextInt();
		
		int currentSum=0;
		for(int i=0;i<array.length;i++) {
			currentSum=array[i];
			
			if(currentSum==sum) {
				System.out.println("Sum found at index:" +i);
			}
			else {
				for(int j=i+1;j<array.length;j++) {
					currentSum = currentSum + array[j];
					
					if(currentSum==sum) {
						System.out.println("Current sum found between index" + i + " " +j);
						return;
					}
				}
			}
		}
		System.out.println("No subarray found");
		return; 
	}
}
