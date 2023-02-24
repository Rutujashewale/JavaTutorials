import java.util.Arrays;
import java.util.Scanner;

class Solution
{

public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter size of an array:");
	int size=s.nextInt();
	
	System.out.println("Enter array elements:");
	int[] array=new int[size];

	for(int i=0;i<array.length;i++) {
		array[i]=s.nextInt();
	}

	System.out.println(Arrays.toString(array));
	int n=array.length;
	
	Solution s1=new Solution();
	System.out.println("Index of peak element is"+s1.peakElement(array, n));
	
}
	public int peakElement(int[] arr,int n)
    {
      
      for(int i=0;i<n;i++){
        if(i==0 && arr[i]>arr[i+1]){
            return i;
        }
        
        if(i==(n-1) && arr[i-1]<arr[i]){
            return i;
        }
        if((i-1)>=0 && (i+1)<n){
            if(arr[i-1]<arr[i] && arr[i]<arr[i+1]){
                return i;
            }
        }
      }
      return 0;
    }
}