import java.util.Scanner;

class Person{
	String name;
	String contact_no;
	int age;
	public  void details(){
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter name of person:");
		System.out.println("Enter contact no of person : ");
		System.out.println("Enter age of person :");
		 name= s.nextLine();
		 contact_no=s.nextLine();
		age=s.nextInt();
		
		
		
	}
}