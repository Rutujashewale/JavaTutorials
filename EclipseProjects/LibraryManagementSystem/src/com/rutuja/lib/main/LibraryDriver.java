package com.rutuja.lib.main;
import java.util.*;

import com.rutuja.lib.entity.Book;
import com.rutuja.lib.entity.Student;
import com.rutuja.lib.init.LibraryInitializer;
import com.rutuja.lib.services.LibraryService;
public class LibraryDriver{
	public static List<Book> listOfBooks = LibraryInitializer.loadBookData();
	public static List<Student> listOfStudents =LibraryInitializer.loadStudentData();
	public static List<Book> rentedBooks=new ArrayList<Book>();
	public static Map<Integer,Integer> rentedHash = new HashMap<Integer,Integer>();
	public static void main(String args[]){


		System.out.println("List of Books" + listOfBooks);
		System.out.println("List of Students" + listOfStudents);

		manageLibrary();
	}
	public static void manageLibrary(){
		int choice;
		char ch;
		LibraryService libraryService = new LibraryService();
		Scanner s=new Scanner(System.in);
		System.out.println("Choose the option :");
		System.out.println("1.rent a book :");
		System.out.println("2. Check Availability of book :");
		System.out.println("3.Check which student has rented the book :");
		System.out.println("4. Deposit a book :");
		System.out.println("Select from above :");
		choice = s.nextInt();

		switch(choice){
		case 1 :
			System.out.println("Rent a book :");
			System.out.println("Enter the book id :");
			int bookid=s.nextInt();

			System.out.println("Enter StudentId:");
			int studentid=s.nextInt();

			libraryService.rentABook(bookid,studentid);
			break;

		case 2:
			System.out.println("Check Availability of book");
			System.out.println("Enter the book id :");
			bookid=s.nextInt();
			libraryService.checkAvailability(bookid);
			break;      

		case 3:

			System.out.println("Check which student has rented the book :");
			System.out.println("Enter the book id :");
			bookid=s.nextInt();

			libraryService.rentedBooks(bookid);

			break;

		case 4:
			System.out.println("Deposit a book :");

			System.out.println("Enter the book id :");
			bookid=s.nextInt();

			libraryService.depositABook(bookid);
			break;
			
		default:
			System.out.println("Please enter valid choice :");
			break;

		}
		System.out.println("press Y/N to continue or not :");
		ch=s.next().charAt(0);

		if(ch=='Y' || ch=='y')
		{
			manageLibrary();
		}else
			System.out.println("You have entered No :");
	}

}