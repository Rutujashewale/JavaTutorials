import java.util.*;
class Employee{
	String name;
	int age,e_id,contact_no;
	List<String> skillset=new ArrayList<String>();
	List<String> workrespo = new ArrayList<String>();
	
	public Employee(){
	}
	
	public Employee(String name,int age,int e_id,int contact_no){
		this.name = name;
		this.age = age;
		this.e_id = e_id;
		this.contact_no = contact_no;
	}
	
	public Employee(String name,int age,int e_id,int contact_no,List<String> skillset,List<String> workrespo){
		this.name = name; 
		this.age = age;
		this.e_id = e_id;
		this.contact_no = contact_no;
		this.skillset=skillset;
		this.workrespo = workrespo;
		
	}
	public String toString(){
		return this.name + " " + this.age + " " + this.e_id + " " + this.contact_no + " " + this.skillset + " " + this.workrespo;
	}
}