import java.util.Scanner;

class PrintAlphabet{
	public static void main(String args[]){
	
	Scanner c=new Scanner(System.in);
	
	System.out.println("Enter the rows of alphabets");
	
	int row= c.nextInt();
	int alpha=65;
	
	for(int i=0 ; i<=row-1 ; i++){
	
	for(int j=row-1 ; j>i ; j--){
			System.out.print("A" + " ");
	}
	
	for(int k=0 ; k<=i ; k++){
		System.out.println((char)(alpha + i) + " ");
	}System.out.println("");
	
	}
	}
}