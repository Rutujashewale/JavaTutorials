class ConstructorDemo{
	
	String name;
	int age;
	int id;
	
	ConstructorDemo(String n,int a){
		name=n;
		age=a;
	}
	
	ConstructorDemo(String n,int a,int i){
		name=n;
		age=a;
		id=i;
	}
	
	
	void display(){
		System.out.println(name+""+age+""+id);
	}
	public static void main(String args[]){
	ConstructorDemo c=new ConstructorDemo("abc",1223);

	ConstructorDemo c2=new ConstructorDemo("fdgfdsc",1342,545);
	
	c.display();
	
	c2.display();
	
	
	
	}
}