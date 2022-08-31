class StaticVariableDemo{
	int roll_no;
	String name;
	static String city="Nasik";
	
	StaticVariableDemo(){
	}
	
	StaticVariableDemo(int roll_no,String name){
		this.roll_no=roll_no;
		this.name=name;
	}
	
	public void display(){
		System.out.println(roll_no+ " " + name + " " +city);
	}
}