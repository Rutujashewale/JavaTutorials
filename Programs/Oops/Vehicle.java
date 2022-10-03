abstract class Vehicle{
	
	
	abstract void bike();
	
	void car(){
		System.out.println("Car is running");
	}
}

class Honda extends Vehicle{
	 void bike(){
		System.out.println("Bike is running");
	}
}
