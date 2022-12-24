
public class Employee{
	private String empId;
	private int age;
	private String name;
	Employee(String empId,String name,int age){
		this.empId=empId;
		this.age=age;
		this.name=name;
	}
	
	public String getempId() {
		return this.empId;
	}
	public void setempId(String empId) {
		this.empId=empId;
	}
	
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age=age;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name=name;
	}
	
	public String toString() {
		return this.empId +" " +this.name+ " " +this.age ;
	}
}



