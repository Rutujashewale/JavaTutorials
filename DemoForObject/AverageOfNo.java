import java.util.Scanner;
class AverageOfNo{
	public static void main(String args[]){
	
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter marks in physics : ");
	int Physics=s.nextInt();
	
	System.out.println("Enter marks in English : ");
	int English=s.nextInt();
	
	System.out.println("Enter marks in Maths : ");
	int Maths=s.nextInt();
	
	System.out.println("Enter marks in History : ");
	int History=s.nextInt();
	
	float total = Physics + English + Maths + History;
	
	float Average = total / 4;
	float Percentage = (total / 400) * 100;
	    
	    System.out.println(" Total Marks =  " + total);
	    System.out.println(" Average Marks =  " + Average);
	    System.out.println(" Marks Percentage =  " + Percentage);
	
	}



}