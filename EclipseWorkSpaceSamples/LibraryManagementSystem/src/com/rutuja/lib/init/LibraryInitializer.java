package com.rutuja.lib.init;
import java.util.ArrayList;
import java.util.List;

import com.rutuja.lib.entity.Book;
import com.rutuja.lib.entity.Student;

public class LibraryInitializer {
	public static List<Book> loadBookData() {
		 List<Book> listOfBooks = new ArrayList<Book>();
		
			Book b1=new Book(111,1,101,"The midnight Library","Fiction","Matt Haig");
			Book b2=new Book(112,2,102,"the subtitle Art of not giving fuck","Fiction","Mark manson");
			Book b3=new Book(113,3,103,"Automic habits","Fiction","James James clear");
			Book b4=new Book(114,4,104,"Fear not be strong","Fiction","Advita Asharma");
			Book b5=new Book(115,5,105,"Do epic shit","Fiction","book1");
			Book b6=new Book(116,6,106,"The girl with no dreams","Fiction","Depak gupta");
			Book b7=new Book(117,7,107,"Death","Fiction","Sadguru");
			Book b8=new Book(118,8,108,"Better than best friends","Fiction","Ahona sadhu");
			Book b9=new Book(119,9,109,"Rich dad poor dad","Fiction","Robert Kiyosaki");
			Book b10=new Book(110,10,110,"The art of reading minds","Fiction","Henrik Fexeus");
			
			listOfBooks.add(b1);
			listOfBooks.add(b2);
			listOfBooks.add(b3);
			listOfBooks.add(b4);
			listOfBooks.add(b5);
			listOfBooks.add(b6);
			listOfBooks.add(b7);
			listOfBooks.add(b8);
			listOfBooks.add(b9);
			listOfBooks.add(b10);
			return listOfBooks;
		
		
		
	}
	
	public static List<Student> loadStudentData() {
		 List<Student> listOfStudents = new ArrayList<Student>();
		
	
		
		Student s1=new Student("Ram", 121,1);
		Student s2=new Student("Shyam", 122,2);
		Student s3=new Student("Guru", 123,3);
		Student s4=new Student("ABC", 124,4);
		Student s5=new Student("PQR", 125,5);
		
		listOfStudents.add(s1);
		listOfStudents.add(s2);
		listOfStudents.add(s3);
		listOfStudents.add(s4);
		listOfStudents.add(s5);
		return listOfStudents;		
	
}

}
