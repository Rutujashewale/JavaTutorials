import java.util.Arrays;
import java.util.Scanner;

// Here in BInary search first thing we need to do is finding the middle element. if the search element is less than the mid element then again the same process will be continued and same for large element.
public class BinarySearch {
	public static void main(String[] args) {
		BinarySearch bSearch=new BinarySearch();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=s.nextInt();

		System.out.println("Enter the array elements:");
		int[] array=new int[size];
		for(int i=0;i<array.length;i++) {
			array[i]=s.nextInt();	
		}
		Arrays.sort(array);
		System.out.println("Array elements before sorting:" + Arrays.toString(array));

		System.out.println("Enter the number to be searched:");
		int number=s.nextInt();

		int result = bSearch.binarySearch(array,0,array.length-1,number);

		if(result == -1) {
			System.out.println("No not present:");
		}else {
			System.out.println("No found at index:" +result);
		}


	}

	int binarySearch(int[] array,int left,int right,int number) {
		if(right>=1) {    
			int mid=left+(right-left)/2;

			if(array[mid]==number) {
				return mid;
			}
			if(array[mid]>number) {
				return binarySearch(array,left,mid-1,number);
			}else {
				return binarySearch(array,mid+1,right,number);
			}
		}
		return -1;
	}
  

}
