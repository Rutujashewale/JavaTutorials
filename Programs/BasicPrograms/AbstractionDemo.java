abstract class Vehicle{
	abstract void bike();
}
class Honda extends Vehicle{
	@override void bike(){
		System.out.println("Bike is running");
	}
}