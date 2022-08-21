class StarWhilePattern{
	public static void main(String args[])
	{
		int n=4;
		
		int i=0;
		while(i<n){
			System.out.println("");
			i++;
				int k=n;
				while(k>i){
					System.out.print(" ");
					k--;
				}
				int j=0;
				while(j<i){
					System.out.print("+ ");
					j++;
				}
		}
		StarTest starTest= new StarTest();
		starTest.printStarPattern();
		//starTest.value;
		System.out.print("Value is :" + starTest.value);
	}
}