import java.util.Arrays;
import java.util.Scanner;

public class NegativeNumbers {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size=s.nextInt();
		
		System.out.println("Enter array elements");
		int[] array=new int[size];
		
		for(int i=0;i<array.length;i++) {
		array[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(array));
		
		int j=0,temp;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]>0) {
				if(i !=j) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
				j++;
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
