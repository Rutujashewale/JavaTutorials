import java.util.Scanner;

class AirthmeticOperations{
		public static void main(String args[]){
			hello();
			calculator();
		}
		public static void hello(){
			System.out.println("Helllo world");
		}
		public static void calculator(){
		
			int no1,no2,ch;
			char ch1;
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter numbers");
            no1=sc.nextInt();
            no2=sc.nextInt();
			System.out.println("1 Addition");
			System.out.println("2 Subtraction");
			System.out.println("3 Multiplication");
			System.out.println("4 Division");
			System.out.print("Enter your choice: ");
			ch = sc.nextInt();

        switch(ch)
        {
            case 1:
                
                System.out.print("Addition=" + (no1+no2));
                break;

            case 2:
                
                System.out.print("Subtraction=" + (no1-no2));
                break;

            case 3:
               
                System.out.print("Multiplication=" + (no1*no2));
                break;

            case 4:
               
                System.out.print("Division=" + (no1/no2));
                break;

            default:
                System.out.print("Invalid Choice");
        }
		System.out.println("Enter Y/N to continue :" );
		ch1=sc.next().charAt(0);
		if(ch1=='Y' || ch1=='y'){
			AirthmeticOperations.calculator();
			
		}else{
			System.out.println("You have entered N: ");
		}
		
		}
		
}


