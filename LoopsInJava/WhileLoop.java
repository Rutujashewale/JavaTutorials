class WhileLoop{
	  public static void main(String args[]){
		int sum=0,i;
		
		
		int array[]= {1,2,3,4,5,6,7};
		
		i=0;
		while(i<array.length){
			sum=sum+array[i];
			++i;
		}	
		
			 System.out.print("Sum is :" + sum);
	}
}