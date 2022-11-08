import java.util.Scanner;
class EvenOrOdd{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number :");
		int no=0;
		try{
			no=s.nextInt();
		}catch(Exception e){
			System.out.println("Please enter valid number");
			System.exit(0);
		}
		if(no<=0){
			throw new IllegalArgumentException("Invalid number" + no);
		}else{
		if(no%2==0){
			System.out.println(no + "is even");
		}else{
			System.out.println(no + ": is odd");
		}
		}
	}
}