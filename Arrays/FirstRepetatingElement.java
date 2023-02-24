import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class FirstRepetatingElement {
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
		findRepetating(array);
	}
	
	static void findRepetating(int[] array) {
		
		//initialize the first repetating index to -1;
		int min = -1;
		
		// create empty hashmap
		HashSet<Integer> repetating = new HashSet<>();
		
		// traverse the input from right to left
		for(int i=array.length-1;i>=0;i--) {
			if(repetating.contains(array[i])) {
				min=i;	
			}else {
				repetating.add(array[i]);
			}
		}
		
		if(min != -1) {
			System.out.println("The first non repetating element is" +array[min]);
		}
		else {
			System.out.println("There are no repetating elements:");
		}
		
	}
}
