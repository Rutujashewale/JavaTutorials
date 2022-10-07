import java.util.*;
class LibraryDriver{
	static List<Book> listOfBooks = new ArrayList<Book>();
	static List<Student> listOfStudents = new ArrayList<Student>();
	static List<Book> rentedBooks=new ArrayList<Book>();
	static Map<Integer,Integer> rentedHash = new HashMap<Integer,Integer>();
	public static void main(String args[]){
	 
		System.out.println("List of Books" + listOfBooks);
		System.out.println("List of Students" + listOfStudents);
		
		initialize();
		
		System.out.println("List of Books" + listOfBooks);
		System.out.println("List of Students" + listOfStudents);
	
		
		manageLibrary();
		
		
		
		
	}
	public static void manageLibrary(){
		int choice;
		char ch;
		
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
					
					for(int i=0;i<listOfBooks.size();i++){
						Book b = listOfBooks.get(i);
						if(b.id == bookid){
							
						System.out.println("Book found in the available book list");
						System.out.println("Removing Book from the available book list");
						listOfBooks.remove(b);
						System.out.println("Adding the book to rented books");
						rentedBooks.add(b);
					
						}
					}
					
					rentedHash.put(bookid,studentid);
					
					for(Map.Entry m:rentedHash.entrySet()){  
						System.out.println(m.getKey()+" "+m.getValue());  
					}  
					System.out.println("The available book list");
					for(int i=0;i<listOfBooks.size();i++){
						Book b = listOfBooks.get(i);
						System.out.println(b);
					
					}
					System.out.println("The rented book list");
					for(int i=0;i<rentedBooks.size();i++){
						Book b = rentedBooks.get(i);
						System.out.println(b);
					
					}
					
					 
					break;
			
			case 2:
					int flag=0;
					System.out.println("Check Availability of book");
				
					System.out.println("Enter the book id :");
					 bookid=s.nextInt();
					
					for(int i=0;i<listOfBooks.size();i++){
						Book b = listOfBooks.get(i);
						
						if(b.id==bookid){
							System.out.println("Book found in the available book list\n" +b);
							flag=1;
							break;
						}
					}
						if(flag==0){
							System.out.println("Book not found");
						}
					
					
					
					
					
					break;      
			
			case 3:
			
					System.out.println("Check which student has rented the book :");
					System.out.println("Enter the book id :");
					bookid=s.nextInt();
					
					studentid = rentedHash.get(bookid);
					System.out.println(studentid +" Found in the rentedHashMap");
					for(int i=0;i<listOfStudents.size();i++){
						Student student = listOfStudents.get(i);
						
						if(student.id == studentid){
							System.out.println("Student found: " +student);
							break;
						}
					}
					
					break;
					
			case 4:
					System.out.println("Deposit a book :");
					
					System.out.println("Enter the book id :");
					 bookid=s.nextInt();
					 
					rentedHash.get(bookid);
					for(int i=0;i<rentedBooks.size();i++){
						Book b = rentedBooks.get(i);
						if(b.id == bookid){
							
							System.out.println("Book found in the Rented book list");
							System.out.println("Removing Book from the rented book list");
							rentedBooks.remove(b);
							System.out.println("Adding the book to available books");
							listOfBooks.add(b);
					
						}
					}
					
					rentedHash.remove(bookid);
					
					
					for(Map.Entry m:rentedHash.entrySet()){  
						System.out.println(m.getKey()+" "+m.getValue());  
					}  
					System.out.println("The available book list");
					for(int i=0;i<listOfBooks.size();i++){
						Book b = listOfBooks.get(i);
						System.out.println(b);
					
					}
					System.out.println("The rented book list");
					for(int i=0;i<rentedBooks.size();i++){
						Book b = rentedBooks.get(i);
						System.out.println(b);
					
					}
					
				
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
			System.out.println("YOu have entered No :");
	}
	public static void initialize(){
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
		
	
		
	}
}