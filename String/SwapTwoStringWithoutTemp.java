import java.util.Scanner;

public class SwapTwoStringWithoutTemp {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the string 1:");
		String str1=s.next();
		
		System.out.println("Enter the string 2:");
		String str2=s.next();
		
		System.out.println("Before Swapping:" + str1 +" " +str2);
		
		str1 = str1+str2;
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length());
		
		System.out.println("After swapping:" +str1 +" " +str2 );
		
	}
}
