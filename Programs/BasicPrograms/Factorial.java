import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Factorial{
	public static void main(String args[])throws IOException{
		int fact=1;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number :");
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=n;i++){
			fact=fact*i;
			
		}System.out.println(fact);
	}
}