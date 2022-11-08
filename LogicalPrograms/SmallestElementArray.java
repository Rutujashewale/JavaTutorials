class SmallestElementArray{
	public static void main(String args[]){
		int arr[]={12,2,34,56,67,345,57};
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++){
			if(min>arr[i]) { 
				min = arr[i];
			}
		}System.out.println("Smallest element is :" +min);
	}
}