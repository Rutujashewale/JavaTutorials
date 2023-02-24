import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArrayElementsSortingUInsertionSort {
	public static void main(String[] args) {
		
		Set<Integer> array1 = new HashSet<>();
		
		array1.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,7}));
		
		Set<Integer> array2 = new HashSet<>();
		
		array2.addAll(Arrays.asList(new Integer[] {1,3,4,6,7,8,9}));
		
		// To find union:
		
		Set<Integer> union = new HashSet<Integer>(array1);
		union.addAll(array2);
		System.out.println("Union of two set:");
		System.out.println(union);
		
		// to find intersection
		
		Set<Integer> intersection = new HashSet<Integer>(array1);
		intersection.retainAll(array2);
		
		System.out.println("Intersection of two set:");
		System.out.println(intersection);
		
		
		// to find difference
		
//		Set<Integer> difference = new HashSet<Integer>(array1);
//		difference.removeAll(array2);
//		
//		System.out.println("Difference of two set:");
//		System.out.println(difference);
	}
}
