import java.util.Arrays;
import java.util.Scanner;

public class ZerosAndOnes {
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
		
			int low=0;
			int mid=0;
			int high=array.length-1;
			int temp=0;
		
		
		while(mid <=high) {
			switch(array[mid]) {
				// if the element is zero.
			case 0:
				temp=array[low];
				array[low]=array[mid];
				array[mid]=temp;
				low++;
				mid++;
				break;
				
			case 1:
				//if the element is 1.
				mid++;
				break;
			
			case 2:
				// if the element is 2.
				
				temp=array[mid];
				array[mid]=array[high];
				array[high]=temp;
				high--;
				break;
			}
		}
		
		System.out.println(Arrays.toString(array));
	}
}
