class ArrayLength{
	
	public static void main(String args[]){
	
	int[] arr=new int[]{10,43,456,2312,121,121};
	
	System.out.println("The length of the array is :" +arr.length); // to display the length of array
	
	System.out.print("Array elements:");
	for(int i=0;i<arr.length;i++) // to display array elements
		System.out.print(arr[i]+" ");
	
	}
}