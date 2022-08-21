class Student{
	int age=123;
	static String name = "Sud";
	String aadharNumber;
	String profession;
	
	public Student(){
	}
	
	public Student(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	public Student(int age){
		this.age = age;
	}

	
	public String toString(){
		return "Age: " + this.age + "name: " + this.name +
					" aadharNumber: " + this.aadharNumber + "profession: " + this.profession;
	}
	
	private int getAge(){
		return this.age*10;
	}
	
	protected int getAgeOfStudent(){
		return this.age*10;
	}
	
}