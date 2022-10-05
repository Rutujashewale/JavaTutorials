import java.util.*;

class Student{
	int roll_no;
	String name,address;
	
	public Student(int roll_no,String name,String address){
		this.roll_no=roll_no;
		this.name=name;
		this.address=address;
	}
	
	public String toString(){
		return this.roll_no+ " " + this.name + " " + this.address ;
	}
}


class SortByRollno implements Comparator<Student>{
	public int compare(Student a, Student b){
		return a.roll_no - b.roll_no;
	}
}

class SortByName implements Comparator<Student>{
	public int compare (Student a, Student b){
		return a.name.compareTo(b.name);
	}
}