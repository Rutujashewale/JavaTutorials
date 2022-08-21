class SampleDriver{
	public static void main(String[] args){
		System.out.println("Hello World Sudarshan:)");
		System.out.println(Person.name);
		System.out.println(Person.getClassName());
		Person p = new Person();
		System.out.println(p.toString());
		//System.out.println(p);
		System.out.println(p.getClassName());
		
		Person p1 = new Person(11, "hirya");
		System.out.println(p1.name);
		
		System.out.println(p1.toString());
		System.out.println(p.getClassName());
		System.out.println(p1.getClassName());
		
		Person p2 = new Person(new Integer(111));
		int age = p2.getAge();
		System.out.println("age"+age);
		System.out.println(p2.name);
		
		Person p3 = new Person(111);
		System.out.println(p3.getAge());
		// System.out.println(p3.toString());
		System.out.println(p3.name);
		p3.name = "Rutuja";
		System.out.println(p3.name);
		System.out.println(p3.getClassName());
		
		Person p4= new Person(11,"abc","68506802","Teacher");
		System.out.println(p4);
		System.out.println(p4.name);
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p3.name);
		
		System.out.println(p1.getClassName());
		System.out.println(p2.getClassName());
		//Student s = new Student();
		//  System.out.println(s.getAgeOfStudent());
	}
	
}