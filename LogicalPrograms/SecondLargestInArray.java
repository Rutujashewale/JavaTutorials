import java.util.Arrays;
class SecondLargestInArray{
	public static void main(String args[]){
		int arr[]= {23,35,56,23,12,46,68,54};
		int size=arr.length;
		Arrays.sort(arr);
		
		System.out.println("Array after sorting is :"+Arrays.toString(arr));
		
		int result=arr[size-2];
		System.out.println("Second largest element is :" +result);
	}
}