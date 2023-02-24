import java.util.Arrays;
import java.util.Scanner;

class Compute 
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size=s.nextInt();

		System.out.println("Enter array elements");
		int[] a=new int[size];

		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(a));

	/*	int min=a[0];
		int max=a[0];
		for(int i=0;i<a.length;i++){
			if(min > a[i]){
				min=a[i];

			}
			if(max<a[i]) {
				max=a[i];
			}


		}
		System.out.println("Minimum is" +min);
		System.out.println("Maximum is" +max); 
		
		*/
		
		int[] b= new int[a.length+1];
		int data=5;
		for(int i=0;i<a.length;i++) {
			
				b[i]=a[i];
			}
		b[a.length]=data;
		
		System.out.println("Elements in the b are:"+Arrays.toString(b));
	}
} 