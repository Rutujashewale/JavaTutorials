class Loops{
    public static void main(String args[]){
		
		int i,j,n=5;
		for(i=0;i<n;i++){
			System.out.println("");
         
			for(j=0;j<=i;j++){
				System.out.print("*");
			} 
		}
		System.out.println();
	}
}



/*class Loops{
	  public static void main(String args[]){
		int sum=0,i;
		
		
		int array[]= {1,2,3,4,5,6,7};
		
		for(int A : array){
			//System.out.print(A);
			//for(i=1;i<=20;i++){
				sum=sum+A;
				
			}
			 System.out.print("Sum is :" + sum);
	}
}*/


/*class Loops{
	public static void main(String args[]){
		
		int i,j;
		
		for(i=1;i<3;i++){
			for(j=1;j<i;j++){
				System.out.println(i+ " " +j);
			}
		}
	}
}*/

/* pattern program


class Loops{
	public static void main(String args[]){
		int i,j,n=5;
		for(i=1;i<n;i++){
			for(j=n;j>i;j--){
				System.out.print("+");
			}
			System.out.println();
		}
	}
}
		
*/

/*pattern to print 1 to n and n-1
class Loops{
	public static void main(String args[]){
		int i,j,n=5;
		for(i=0;i<=n;i++){
			System.out.print(" ");
			for(j=0;j<=i;j++){
				System.out.print("?");
			}
			System.out.println();
		}
		for(i=0;i<=n;i++){
			System.out.print(" ");
			for(j=n;j>=i;j--){
				System.out.print("?");
			}
			System.out.println();
		}
	}
}	*/


/* sandglass pattern
class Loops{
	public static void main(String args[]){
		int i,j,n=5;
		for(i=0;i<=n-1;i++){
			
			for(j=5;j>i;j--){
				System.out.print("?");
			}
			System.out.println();
		}
		
		for(i=1;i<n;i++){
			for(j=1;j<=i;j++){
				System.out.print("?");
			}
			System.out.println();
		}
	}
}
*/


	
		
			                                                                           