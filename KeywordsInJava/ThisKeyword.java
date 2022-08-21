class ThisKeyword{
		int a,b;
	
		ThisKeyword(int a,int b){
			this.a=a;
			this.b=b;
		}
		void disply(){
			System.out.print("a:" + a+ "b :" +b);
		}
		public static void main(String args[]){
		
		ThisKeyword tk=new ThisKeyword(10,20);
		tk.disply();
		
		}
	

}