
/*interface A{
	int X=10;
}

interface B{
	int X=100;
}

class InterfaceDemo implements A,B{
	public static void main(String args[]){
		System.out.println(A.X);
		System.out.println(B.X);
	}
}
*/



interface FourWheeler{
	void drive();
}

interface TwoWheeler{
	void ride();
}
abstract Car extends FourWheeler,TwoWheeler{
	public abstract void features();
}
class InterfaceDemo implements Car{
	
	public void drive(){
		System.out.println("Driving");
	}
	public void ride(){
		System.out.println("Riding");
	}
	public void features(){
	System.out.println("Features");
	}
	
	public static void main(String args[]){
		Car c = new Car();
		
		c.drive();
		c.ride();
		c.features();
	}
}