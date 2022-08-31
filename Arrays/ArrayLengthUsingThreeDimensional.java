class ArrayLengthUsingThreeDimensional{
	public static void main(String args[]){
	int [][][] arr= { {{1,2},{3,4},{5,6}}, {{7,8},{9,1},{2,3}} };
	
	System.out.println("Array length :");
	System.out.println(arr.length);
	System.out.println(arr[0].length);
	System.out.println(arr[0][0].length);
	System.out.println(arr[0][1].length);
	System.out.println(arr[0][2].length);
	
	
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[i].length;j++){
			for(int k=0;k<arr[i][j].length;k++){
				System.out.println(arr[i][j][k] +"\t");
			}
		}
	}
	}
}