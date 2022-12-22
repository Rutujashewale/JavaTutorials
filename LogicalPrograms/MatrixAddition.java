class MatrixAddition{
	public static void main(String args[]){
		int a[][]={{1,2,3},{3,4,5},{5,6,7}};
		int b[][]={{7,8,9},{2,3,4},{6,5,4}};
		int c[][]=[3][3];
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				c[i][j]=a[i][j]+b[i][j];
			}
		}System.out.println(c[i][j]);
		System.out.print();
	}
}