class ArrayLengthUsingMultidimentional{
	
	public static void main(String args[]){
		int[][] arr={{10,32},{12,223},{23,34,43,43},{243,87}};
	
		System.out.println("Array length is : ");
		
		System.out.println(arr.length);
		
		System.out.println("arr[0] length" + arr[0].length);
		System.out.println("arr[1] length" + arr[1].length);
		System.out.println("arr[2] length" + arr[2].length);
		System.out.println("arr[3] length" + arr[3].length);
		
		System.out.println("Array elements :");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.println(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}