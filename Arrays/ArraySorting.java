import java.util.Arrays;

class ArraySorting{
	public static void main(String args[]){
	//	int[] arr={10,45,32,56,34,67,3,12,45,1};
		int[] arr={10,45,32,56};
	
		
		System.out.println("Array before sorting:"+ Arrays.toString(arr));
		
//		 Arrays.parallelSort(arr);
		Arrays.Sort(arr); // using to and From Index
		
		
		System.out.println("Array after sorting:"+ Arrays.toString(arr));
	}
}