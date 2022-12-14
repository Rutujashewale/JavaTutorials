package com.rutuja.lib.services;
import java.util.List;
import java.util.Map;

import com.rutuja.lib.entity.Book;
import com.rutuja.lib.entity.Student;
import com.rutuja.lib.main.LibraryDriver;

public class LibraryService {

	public void checkAvailability(int bookid) {
		int flag=0;
		for(int i=0;i<LibraryDriver.listOfBooks.size();i++){
			Book b = LibraryDriver.listOfBooks.get(i);
			
			if(b.getId()==bookid){
				System.out.println("Book found in the available book list\n" +b);
				flag=1;
				break;
			}
		}
			if(flag==0){
				System.out.println("Book not found");
			}
		
	}
	
	public void rentABook(int bookid,int studentid) {
		for(int i=0;i<LibraryDriver.listOfBooks.size();i++){
			Book b = LibraryDriver.listOfBooks.get(i);
			if(b.getId() == bookid){

				System.out.println("Book found in the available book list");
				System.out.println("Removing Book from the available book list");
				LibraryDriver.listOfBooks.remove(b);
				System.out.println("Adding the book to rented books");
				LibraryDriver.rentedBooks.add(b);

			}
		}

		LibraryDriver.rentedHash.put(bookid,studentid);

		for(Map.Entry m:LibraryDriver.rentedHash.entrySet()){  
			System.out.println(m.getKey()+" "+m.getValue());  
		}  
		System.out.println("The available book list");
		for(int i=0;i<LibraryDriver.listOfBooks.size();i++){
			Book b = LibraryDriver.listOfBooks.get(i);
			System.out.println(b);

		}
		System.out.println("The rented book list");
		for(int i=0;i<LibraryDriver.rentedBooks.size();i++){
			Book b = LibraryDriver.rentedBooks.get(i);
			System.out.println(b);

		} 
	}
	
	public  void rentedBooks(int bookid) {
		int studentid = LibraryDriver.rentedHash.get(bookid);
		System.out.println(studentid +" Found in the rentedHashMap");
		for(int i=0;i<LibraryDriver.listOfStudents.size();i++){
			Student student = LibraryDriver.listOfStudents.get(i);

			if(student.getId() == studentid){
				System.out.println("Student found: " +student);
			}
		}
	}
	
	public void depositABook(int bookid) {
		LibraryDriver.rentedHash.get(bookid);
		for(int i=0;i<LibraryDriver.rentedBooks.size();i++){
			Book b =LibraryDriver. rentedBooks.get(i);
			if(b.getId() == bookid){

				System.out.println("Book found in the Rented book list");
				System.out.println("Removing Book from the rented book list");
				LibraryDriver.rentedBooks.remove(b);
				System.out.println("Adding the book to available books");
				LibraryDriver.listOfBooks.add(b);

			}
		}

		LibraryDriver.rentedHash.remove(bookid);


		for(Map.Entry m:LibraryDriver.rentedHash.entrySet()){  
			System.out.println(m.getKey()+" "+m.getValue());  
		}  
		System.out.println("The available book list");
		for(int i=0;i<LibraryDriver.listOfBooks.size();i++){
			Book b = LibraryDriver.listOfBooks.get(i);
			System.out.println(b);

		}
		System.out.println("The rented book list");
		for(int i=0;i<LibraryDriver.rentedBooks.size();i++){
			Book b = LibraryDriver.rentedBooks.get(i);
			System.out.println(b);
		}
	}
}
