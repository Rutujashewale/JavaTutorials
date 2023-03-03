import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the string 1");
		String str1 = s.next();
		
		System.out.println("Enter string 2");
		String str2=s.next();
		
		System.out.println("To check whether two strings are anagram or not:" + isAnagram(str1, str2));
	}
	
	static boolean isAnagram(String str1,String str2) {
		char[] firstStringCharArray = str1.toLowerCase().toCharArray();
		char[] secondStringCharArray = str2.toLowerCase().toCharArray();
		
		Arrays.sort(firstStringCharArray);
		Arrays.sort(secondStringCharArray);
		
		return Arrays.equals(firstStringCharArray, secondStringCharArray);
	}
}
