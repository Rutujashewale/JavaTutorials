import java.util.*;
class StudentDriver{
	public static void main(String args[]){
	
		List<Student> list = new ArrayList<Student>();
		System.out.println("Enter details for 5 students");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<2;i++){
			System.out.println("Enter name of student "+ (i+1));
			String name = sc.next();
			System.out.println("Enter age of student "+ (i+1));
			int age = sc.nextInt();
			System.out.println("Enter rollNo of student "+ (i+1));
			int rollNo = sc.nextInt();
			System.out.println("Enter contactNumber of student "+ (i+1));
			int contactNumber = sc.nextInt();
			
			List<Integer> listOfMarks = new ArrayList<Integer>();
			
			
			System.out.println("Enter marks for 5 subjects of student "+ (i+1));
			for(int j=0;j<5;j++){
				Integer marks = sc.nextInt();
				listOfMarks.add(marks);
			}
			Student s = new Student(rollNo, age, contactNumber, name, listOfMarks);
			System.out.println("Average is :" + s.average());
			
			list.add(s);
		}
		
		for(int k=0;k<list.size();k++){
			System.out.println(list.get(k));
		}
		
	
	}
}