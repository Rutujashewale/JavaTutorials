import java.util.Scanner;
public class VowelsAndConsonant {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the string to check:");
		String str=s.next();
		str=str.toLowerCase();
		int vCount=0,cCount=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u') {
				vCount++;
				
			}else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				cCount++;
				
			}
		
		}
		System.out.println("No of vowels are: " +vCount);
		System.out.println("No of Consonents are: " +cCount);
		
	}
}
