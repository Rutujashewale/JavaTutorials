import java.util.Scanner;
public class PatternTriangle {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of rows you want to print:");
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
