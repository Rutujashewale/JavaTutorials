abstract class Vehicle1{
	String msg;
	
	Vehicle1(String msg){
		this.msg=msg;
	}
	
	void display(){
		System.out.println(msg);
	}
}

class Honda extends Vehicle1{
	Honda(String msg){
		super(msg);
	}
}

class InheritanceDemo{
	public static void main(String args[]){
		Honda honda=new Honda("Inheritance example with constructor");
		
		honda.display();
	}
}