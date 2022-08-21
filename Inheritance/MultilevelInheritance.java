class GrandParent{
	public void eyes(){
		System.out.println("Eyes");
	}
}

class Parent extends GrandParent{
	public void height(){
		System.out.println("Height");
	}
}

class Child extends Parent{
	public void walk(){
		System.out.println("Walk");
	}
}


class MultilevelInheritance{
	public static void main(String args[]){
	
	Child c= new Child();
	
	c.walk();
	c.height();
	c.eyes();


	}
}
