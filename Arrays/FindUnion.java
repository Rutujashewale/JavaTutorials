import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class FindUnion {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter size of an array");
		Integer size=s.nextInt();
		
		System.out.println("Enter element for array 1:");
		Integer[] array1=new Integer[size];
		for(int i=0;i<array1.length;i++) {
			array1[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(array1));
		
		
		System.out.println("Enter element for array 2:");
		Integer[] array2=new Integer[size];
		for(int i=0;i<array1.length;i++) {
			array2[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(array2));
		
		printUnion(array1, array2);
	}
	
	public static void printUnion(Integer[] array1,Integer[] array2) {
		
		HashSet<Integer> set = new HashSet<>();
		
		set.addAll(Arrays.asList(array1));
		set.addAll(Arrays.asList(array2));
		
		
		// convert array from set
		
		Integer[] printUnion = {};
		
		printUnion = set.toArray(printUnion);
		
		System.out.println("Union of two arrays is:" + Arrays.toString(printUnion));	
	}
}
