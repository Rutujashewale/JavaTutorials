class Vehicle{
	String color;
	int size;
	String type;
	
	public Vehicle(String color,int size, String type){
		this.color=color;
		this.size=size;
		this.type=type;
	}
	
	public void speed(){
		System.out.println("Speed of vehicle :");
	}

	public String toString(){
		return( "Color" + color +"Size" + size + "Type" + type);
	}
	
}

class Bike extends Vehicle{
	String handle;
	public Bike(String color,int size, String type){
	super(color,size,type);
	this.handle=handle;
	}
}



class Inheritance{
	
	public static void main(String args[]){
	
	Bike b = new Bike("Black" , 4 , "Auto" );
	System.out.println(b.toString());
	
	b.speed();
	
	}
}