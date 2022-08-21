interface GrandParent{
	 void eyes();
}
interface Parent {
	 void height();
}

interface Child extends GrandParent,Parent {
	 void walk();
}


class InheritanceWithInterface implements Child {
	
	 public void eyes()
    {
        System.out.println("Eyes :");
    }
	public void height()
    {
        System.out.println("Height :");
    }
	public void walk()
    {
        System.out.println("walk :");
    }
	public static void main(String args[]){
	
	Child c= new Child();
	
	c.eyes();
	
	c.height();
	
	c.walk();
	


	}
}
