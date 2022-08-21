import java.util.*;
class PrintNo{
	
	public void array(){
	
		int [] arr = new int [] {1, 2, 3, 4, 5};  
        System.out.println("Elements of given array: ");  
       
        for (int i = 0; i < arr.length; i++) {  
            System.out.println(arr[i] + " ");  
			
			
        }
			
			
    } 

	int Sum;
	public void printAddition(){
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the value of a and b");
		
		int a= s.nextInt();
		int b= s.nextInt();
		
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		
		Sum=a+b;
		
		System.out.println("Sum of two no's is:" +Sum);
	}  
}