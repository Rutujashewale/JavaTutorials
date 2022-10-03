//package staticPolymorphism;
 
 class AdditionUsingPolymorphism{
	void sum(int a,int b){
		int c = a+b;
		System.out.println("Addition of two no's is :" + c);
	}
	void sum(int a,int b,int d){
		int c = a+b+d;
		System.out.println("Addition of three no's is :" +c);
	}
	
	public static void main(String args[]){
		AdditionUsingPolymorphism addition = new AdditionUsingPolymorphism();
		addition.sum(5,5);
		addition.sum(5,5,5);
	}
}