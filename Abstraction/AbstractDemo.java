abstract class Animal{
	public abstract void sound();
	
	
}

class Dog extends Animal{
	public void sound(){
		System.out.println("Woof");
	}
	
}

class Lion extends Animal{
	public void sound(){
		System.out.println("Roar");
	}
}
class AbstractDemo{
	public static void main(String agrs[]){
		Animal a=new Lion();
		a.sound();
		Animal a1=new Dog();
		a1.sound();
	}
}