import java.util.Scanner;
class Average {
 
	double average,n;
	
	
	
    /*public  void averageNo() {
		
		int sum;
	 
       Scanner sc=new Scanner(System.in);
	   
	  System.out.println("Total count of number to find the average of: ");
         n = sc.nextInt();
        
         sum = 0;
        
        System.out.println("Enter the numbers: ");
        
        for(int i=0;i<n;i++){
            sum += sc.nextInt();
        }
        
        average=sum/n;
		
		System.out.print("Average is :" + average);
		
	
        
    }*/
	
	
	public void Sum(){
		int a,b,sum;
		
		Scanner sc=new Scanner(System.in);
	   
		System.out.println("Enter no 1: ");
		a = sc.nextInt();
        
		
		 System.out.println("Enter no 2: ");
         b = sc.nextInt();
        
		System.out.println("a:" + a);
		System.out.print("b:" + b);
		
		 sum=a+b;
		 
		 System.out.println("Sum is: " + sum);
        
	}
	
	public int getSum(int a,int b){
	
		int sum= a+b;
		return sum;
	
	}
	
	
	public float getDivision(float a,float b){
		float division= a/b;
		
		return division;
	}
	
}