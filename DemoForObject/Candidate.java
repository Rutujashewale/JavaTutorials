import java.util.Scanner;

class Candidate{
	public void candidateEligibility(){
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter your age");
	
	int age=s.nextInt();
	
	if(age>=18){
		System.out.println("You are eligible for voting");
	
	}else{
		System.out.println("Not eligible");
	
	}
	}

}