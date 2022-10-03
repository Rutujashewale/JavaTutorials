class Pattern{
	public static void main(String args[]){
		int i,j,k,rows=8;
		for(i=1;i<=rows;i++){
			for(j=1;j<=rows;j++){
				System.out.println("");
			}
			for(k=1;k<=(2*i-1);k++){
				if(k==1 || i==rows || k== (2*i-1)){
					System.out.print("+");
				}else{
					System.out.print(" ");
				}
			}
				System.out.println("");
		}
	}
}