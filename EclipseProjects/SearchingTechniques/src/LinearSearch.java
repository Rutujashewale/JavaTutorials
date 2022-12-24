import java.util.Scanner;

public class LinearSearch {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the size of an Array:");
		int size=s.nextInt();
		
		System.out.println("Enter " + size +" Array elements:");
		int[] array=new int[size];
		for(int i=0;i<array.length;i++) {
			array[i]=s.nextInt();
		}
		System.out.println("Enter the element to be searched:");
		int number=s.nextInt();
		int index=linearSearch(array,number);
		
		
		if(index != -1) {
			System.out.println("Element found at location" + index);
		}else {
			System.out.print("not found");
		}
				
				
	}

	private static int linearSearch(int[] array, int number) {
		for(int i=0;i<array.length;i++) {
			if(array[i]==number) {
				return i;
			}
		}	
		 return -1;
	}
}
