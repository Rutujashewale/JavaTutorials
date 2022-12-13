import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CommonElementInArray {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size=s.nextInt();
		
		System.out.println("Enter array elements:");
		int[] array=new int[size];
		for(int i=0;i<array.length;i++) {
			array[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(array));
		
		System.out.println("Enter array1 elements:");
		int[] array1=new int[size];
		for(int j=0;j<array1.length;j++) {
			array1[j]=s.nextInt();
		}
		System.out.println(Arrays.toString(array1));
		System.out.println("Common elements:");
		commonElement(array, array1);
	}
	
	
	public static void commonElement(int[] array,int[] array1) {
		Set<Integer> hashset=new HashSet<>();
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array1.length;j++) {
				if(array[i]==array1[j]) {
					hashset.add(array[i]);
					break;
				}
			}
		}
		System.out.println(hashset);
	}
}
