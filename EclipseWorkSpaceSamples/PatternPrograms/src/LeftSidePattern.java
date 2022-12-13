	
public class LeftSidePattern {
	public static void main(String args[]) {
		int N=5;
		
		for(int i=0;i<N;i++) {
			for(int j=2*(N-i);j>=0;j--) {
				System.out.println(" ");
				
			}
		
		for(int k=0;k<=i;k++) {
			System.out.print(" *");
		}System.out.println();
	}
	}
		
}
