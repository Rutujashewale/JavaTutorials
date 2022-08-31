import java.util.*;
class ArrayLargestNo{
	
	
	//static int[] arr=new int[]{43,54,123,57,787,34,213};
	
	
	static int largest(int[] arr)
	{
		int currentMax=arr[0];
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>currentMax){
				currentMax=arr[i];
			}
		// return currentMax;
		}
		return currentMax;
	}
	

	
	public static void main(String args[]){
	
	Scanner s=new Scanner(System.in);
	
	int[] arr=new int[6];
	System.out.println("Enter "+ arr.length + " integer values:");
	
	for(int i=0;i<arr.length;i++){
		arr[i]=s.nextInt();
	}
	System.out.println("Array elements are:");
	
	 for (int i=0; i < arr.length; i++) {
      System.out.print(arr[i]+"\t");
    }
	

	int largestElement=largest(arr);
		System.out.println("Largest no is :" + largestElement);
	}
}
