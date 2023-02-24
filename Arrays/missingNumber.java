import java.util.Arrays;
import java.util.Scanner;

public class missingNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter size of an array:");
		int size=s.nextInt();
		
		System.out.println("Enter array elements");
		int[] array=new int[size];
		
		for(int i=0;i<array.length;i++) {
			array[i]=s.nextInt();
		}
		
		System.out.println(Arrays.toString(array));
	
		int missingNum=0;
		
		for(int i=0;i<array.length;i++) {
			if(array[i] != (i+1)) {
				missingNum=(i+1);
				break;
			}
		}
		System.out.println("Missig number is:" +missingNum);
	}
}
