import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=s.next();
		
		char[] reverse=str.toCharArray();
		
		for(int i=reverse.length-1;i>=0;i--) {
			System.out.print(reverse[i]);
		}
	}
}
