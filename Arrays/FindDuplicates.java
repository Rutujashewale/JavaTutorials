import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicates {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter size of an array:");
		Integer size=s.nextInt();
		
		System.out.println("Enter array elements:");
		Integer[] array=new Integer[size];
		
		for(Integer i=0;i<array.length;i++) {
			array[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(array));
	
		
		Set<Integer> duplicates = new HashSet<>();
		
		for(int i=0;i<array.length;i++) {
			if(duplicates.add(array[i])==false) {
				System.out.println(array[i]);
			}
		}
	}
}
