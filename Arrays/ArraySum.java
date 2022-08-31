class ArraySum{
	public static void main(String args[]){
	int[] arr={2,4,3,12,12,13};
	int sum=0;
	sum= arraySum(arr);
	System.out.println("Sum of array elements :" + sum);
	}



	static int arraySum(int[] arr){
	
	int sum=0;
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+"\t");
		sum += arr[i];
	}
	return sum;
	}

}