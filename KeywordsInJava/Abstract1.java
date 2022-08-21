class Abstract1{
	int age;
	String name;
	int no;
	
	public abstract void  Abstract12();
	
	
	public Abstract1(int age, String name,int no){
		this.age = age;
		this.name = name;
		this.no = no;
	}
	
	public String toString(){
		return "Age: " + this.age + "name: " + this.name +
					" Number: " + this.no;
	}
	
	public int getAge(){
		return this.age;
	}

}