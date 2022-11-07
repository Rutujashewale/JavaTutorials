class ArmstrongNo{
	public static void main(String args[]){
		int number=153;
		int sum=0,temp,a;
		
		temp=number;
		while(number>0){
			a=number%10;
			number=number/10;
			sum=sum+(a*a*a);
		}
		if(temp == sum){
			System.out.println(temp + "No is armstrong");
		}
		else{
			System.out.println(temp + "No is not armstrong");
		}
	}
}