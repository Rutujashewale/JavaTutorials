import java.util.*;

class ComparatorInterfaceDriver{
	public static void main(String args[]){
		ArrayList<Student> demo = new ArrayList<>();
		
		Student s1 =new Student(112,"FGBC","Nasik");
		Student s2 =new Student(21,"PDGQR","Pune");
		Student s3 =new Student(123,"AEWXYZ","Mumbai");
		demo.add(s1);
		demo.add(s2);
		demo.add(s3);
		
		
		System.out.println("Unsorted Data : "+ demo);
		Collections.sort(demo,new SortByRollno());
		for (int i = 0; i < demo.size(); i++){
            System.out.println(demo.get(i));
		}
		System.out.println();
		Collections.sort(demo,new SortByName());
		for (int i = 0; i < demo.size(); i++){
            System.out.println(demo.get(i));
		}
	}
}