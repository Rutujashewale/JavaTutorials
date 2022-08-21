class Person{
	transient int age;
	static String name = "Sud";
	transient String aadharNumber;
	String profession;
	
	public Person(){
	}
	
	public Person(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	public Person(int age){
		this.age = age;
	}
	
	public Person(Integer age){
		this.age = age;
	}
	
	public Person(int age, String name, String aadharNumber){
		this.age = age;
		this.name = name;
		this.aadharNumber = aadharNumber;
	}
	
	public Person(int age, String name, String aadharNumber, String profession){
		this.age = age;
		this.name = name;
		this.aadharNumber = aadharNumber;
		this.profession = profession;
	}
	
	public String toString(){
		return "Age: " + this.age + "name: " + this.name +
					" aadharNumber: " + this.aadharNumber + "profession: " + this.profession;
	}
	
	public int getAge(){
		return this.age*10;
	}
	
	private String getName(){
		return this.name;
	}
	
	public static String getClassName(){
		return "Sudarshan Hiray" + name;
	}
	
}