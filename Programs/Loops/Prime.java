import java.util.Scanner;
class Prime{
	public static void main(String args[]){
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		
		public boolean prime(int num){
			for(int i=2;i<num;i++){
				if(num%i==0)
				return false;
			}
			return true;
		}
	}
}