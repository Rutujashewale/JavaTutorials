interface Demo{
	final int a=10;
	static void display(){
		System.out.println("HI");
	
	}
}

class InterfaceDemo implements Demo{
	public static void main(String args[]){
		Demo.display();
	}
}