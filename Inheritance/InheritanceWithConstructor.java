class Parent{
	String name;
	String address;
	
	Parent(String name, String address){
		this.name=name;
		this.address=address;
	
	}

}

class Child extends Parent{
	int Contact_no;
	
	Child(String name, String address,int contact_no){
	
		super(name,address);
		this.Contact_no=Contact_no;
	
	
	}
	/*public String toString(){
		return "Name: " + this.name + 
					" Address: " + this.address + "ContactNo: " + this.contact_no;
	}*/
	
	void display(){
		System.out.println("Name : " +name+ "Address : " +address+ "ContactNo : " +Contact_no);
	
	}
}

class InheritanceWithConstructor{	
	public static void main(String args[]){
		Child c= new Child("abc", "XYZ", 548327);
		
		c.display();

	}
}