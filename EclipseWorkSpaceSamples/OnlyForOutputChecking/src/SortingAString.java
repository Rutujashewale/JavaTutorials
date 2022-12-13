import java.util.Scanner;

public class SortingAString {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String to sort:");
		String str=s.next();
		
		char[] array=str.toCharArray();
		
		int i=0;
		while(i<array.length) {
			int j=i+1;
			while(j<array.length) {
				if(array[j]<array[i]) {
					char temp;
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
				j +=1;
			}
			i+=1;
		}
		System.out.println(array);
	}
}
