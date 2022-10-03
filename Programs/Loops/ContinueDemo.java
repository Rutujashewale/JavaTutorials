class ContinueDemo{
	
	public static void main(String args[]){
		int i;
		for( i=5;i>0;i--){
			if(i==3){
				continue;
			}
			
			System.out.println(i);
		}
	}
}