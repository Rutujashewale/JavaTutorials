class StaticMethodDriver{
	public static void main(String args[]){
	
	StaticMethodDemo.display1();
	System.out.println(StaticMethodDemo.display11());
	System.out.println(StaticMethodDemo.a);
	StaticMethodDemo sm = new StaticMethodDemo();
	
	System.out.println("Values from 1st method:");
	sm.display();
	System.out.println("Value  from 2nd method:");
	sm.display1();
	
	}
}
