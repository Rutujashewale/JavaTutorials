import java.util.*; 
class AirthmaticOperators{
	
	public static void main(String args[]){
	
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter the value of a:");
	int a=s.nextInt();
	
	
	System.out.println("Enter the value of a:");
	int b=s.nextInt();
	
	
	System.out.println(a+b);
	
	System.out.println(a-b);
	
	System.out.println(a*b);
	try{
          divide(a,b);
        }
      catch(ArithmeticException e){
        //e.printStackTrace();
		System.out.println("Please enter numbers above 0");
		
      }
	  finally{
		System.out.println("Inside Finally block");
	  }
	
	//System.out.println(a/b);
	
	// System.out.println(a<<b);
	
	
	}
	
	public static int divide(int a, int b){
		return divideAgain(a,b);
	}
	
	public static int divideAgain(int a, int b){
		return a/b;
	}
}