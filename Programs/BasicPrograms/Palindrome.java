import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Palindrome{
	public static void main(String args[])throws IOException{
		int r,sum=0,temp;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int n=Integer.parseInt(br.readLine());
		
		temp=n;
		
		while(n>0){
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum){
			System.out.println("NO is palindrome");
			
		}
		else
			System.out.println("Not palindrome");
	}
}