import java.util.Arrays;
import java.util.Scanner;

public class reverseOfArray {
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
		
		System.out.println("Reverseof an array:");
		
		for(int i=array.length;i>0;i--) {
			System.out.println(i);
		}
	}
}
