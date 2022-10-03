import java.util.Scanner;
class MaxNumber{
	
	public void maxDemo(int elements){
	
		Scanner s=new Scanner(System.in);
		int a[]= new int[elements];
		
		for(int i=0;i< elements;i++){
			a[i]=s.nextInt();
		}
		int max=0,min=0;
		
		
		for(int i=0;i<elements;i++){
			if(max<a[i])
				max=a[i];
				
		
			if(min>a[i])
				min=a[i];
				
		
		
		}
		System.out.println("Maximum no is : " + max);
		System.out.println("Minimum no is : " + min);
		//int min=0;
		
	//	for(int i=0;i<elements;i++){
	//		if(min>a[i]){
//min=a[i];
				
	
	
	}
}