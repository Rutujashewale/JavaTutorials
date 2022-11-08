import java.util.Scanner;
class StringReverse{
	public static void main(String args[]){
	boolean flag=false;
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter a string to check palindrome or not");
	String str=s.next();
	
	for(int i=0;i<str.length()/2;i++){
		System.out.println(i);
		if(str.charAt(i)!=str.charAt(str.length()-i-1)){
			System.out.println("String not palindrome");
			flag=true;
			break;
		}
	}
		if(flag==false){
			System.out.println("String is palindrome");
		}
	}
	
}