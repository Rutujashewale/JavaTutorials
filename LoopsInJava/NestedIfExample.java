import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class NestedIfExample {    
	public static void main(String[] args) throws IOException {    
    
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the Age: ");
	int age = Integer.parseInt(br.readLine());
	
	System.out.println("Enter the Weight: ");
	int weight = Integer.parseInt(br.readLine());
    
    if(age>=18){    
        if(weight>50){  
            System.out.println("You are eligible to donate blood");  
        }    
    }    
}}  