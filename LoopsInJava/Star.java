class Star{
	public static void main(String args[]){
		int i,j,count=4,n=4;
		for(i=0;i<n;i++){
			System.out.println("");
			for(int k=n;k>i;k--){
				System.out.print(" ");
			}
         
			for(j=0;j<=i;j++){
				System.out.print("* ");
			} 
		}
		System.out.println();
	}
}	
		