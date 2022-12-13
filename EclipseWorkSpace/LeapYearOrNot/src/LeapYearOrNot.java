import java.util.Scanner;
public class LeapYearOrNot {
	public static void main(String args[]) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year to check leap year or not:");
		int year=s.nextInt();
		
		if(year % 400 == 0 || year%4 == 0 && year %100 !=0) {
			System.out.println(year +"is a leap year");
		}else {
			System.out.println("Not a leap year:");
		}
			
	}

}
