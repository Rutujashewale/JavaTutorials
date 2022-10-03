import java.util.*;

class Student{
	int rollNo, age, contactNumber;
	String name;
	List<Integer> listOfMarks = new ArrayList<Integer>();

	public Student(){
	}
	
	public Student(int rollNo,int age,int contactNumber,String name){
		this.rollNo = rollNo;
		this.contactNumber = contactNumber;
		this.age= age;
		this.name = name;
	}
	
	public Student(int rollNo,int age,int contactNumber,String name, List<Integer> marks){
		this.rollNo = rollNo;
		this.contactNumber = contactNumber;
		this.age= age;
		this.name = name;
		this.listOfMarks = marks;
	}
	
	public String toString(){
		return this.rollNo + " " + this.contactNumber + " " + this.age + " "  + this.name;
	
	}
	
	public int average(){
	 int sum =0;
	 int average =0;
	 for(int i=0;i<this.listOfMarks.size();i++){
		sum = sum + this.listOfMarks.get(i);
	 }
	 average = sum/this.listOfMarks.size();
	 return average;
	}   
    
}