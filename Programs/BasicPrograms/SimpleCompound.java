import java.util.Scanner;

class SimpleCompound{
	public  void simpleCompound(){
		double s_interest=0,r,p,t;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the value of principal : ");
			 p=s.nextDouble();
			System.out.println("Enter the value of rate of intrest : ");
			 r=s.nextDouble();
			System.out.println("Enter the Time : ");
			 t=s.nextDouble();
			
			System.out.println("1.Simple Intrest:");
			System.out.println("2.Compound Intrest:");
			System.out.print("Enter your choice:");
			int ch=s.nextInt();
			
			switch(ch){
			
				case 1:
						System.out.print("Simple intrest:");
						 s_interest = (p * r * t)/100;
						 System.out.println("Simple intrest is:" + s_interest);
						break;
						
				case 2:
						System.out.println("Compound Intrest:");
						double c_interest = p * Math.pow(1.0+r/100.0,t) - p;
						System.out.println(" COmpoundintrest :"+ c_interest);
						break;
						
				default:
						System.out.println("Enter valid choice:");
						break;
			} 
			System.out.println("Enter Y/N to continue :" );
			char ch1=s.next().charAt(0);
			if(ch1=='Y' || ch1=='y'){
				SimpleCompoundDriver.main(null);
			}
			else
				System.out.println("You have entered NO:");
			
	}
	
}