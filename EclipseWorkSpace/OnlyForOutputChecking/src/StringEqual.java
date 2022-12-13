import java.util.Scanner;

public class StringEqual {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=s.next();
		int i;
		boolean flag=false;
		for( i=0;i<str.length()/2;i++) {
			System.out.println(i);
		
		
		if(str.charAt(i) !=str.charAt(str.length()-i-1)) {
			System.out.println("Not equal");
			flag=true;
			break;
			
		}
		}
		if(flag==false) {
			System.out.println("Equal");
		}
	}
}
