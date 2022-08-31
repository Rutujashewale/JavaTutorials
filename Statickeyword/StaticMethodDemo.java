class StaticMethodDemo{
	static int a=10;
	int b=20;
	
	public void display(){
		System.out.println(a); // we can use static variables inside the same class
		System.out.println(b);
	}
	
	static void display1(){
		System.out.println(a);
		// variable b cant be used here because we can not use instance variables inside the static method
	}
	
	static String display11(){
		return "Sudarshan";
		// variable b cant be used here because we can not use instance variables inside the static method
	}
}