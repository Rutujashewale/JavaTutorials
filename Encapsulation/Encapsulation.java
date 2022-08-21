class Parent{

	 private int age;
	
	 
	 public int getAge(){
		return age;
	}
	
	public void setAge(int age){
	
		this.age=age;
		
	}
}

class Encapsulation{

	public static void main(String args[]){
	
		Parent p=new Parent();
		
		p.setAge(20);
		
		System.out.println("Age of the person is : " + p.getAge());
	}
}



