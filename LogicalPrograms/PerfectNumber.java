import java.util.Scanner;
class PerfectNumber{
	public static void main(String args[]){
		int sum=0,i=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to be checked:");
		int number=s.nextInt();
		
		while(i<=number/2){
			if(number%i == 0){
				sum +=i;
			}
			i++;
		}
		if(sum == number){
			System.out.println(number + "is a perfect number");
		}
		else{
			System.out.println(number + ": is not a perfect number");
		}
		
	}
}


