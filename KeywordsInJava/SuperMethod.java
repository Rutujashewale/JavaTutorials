
class SuperMethod{
    public static void main(String args[]){
        Student s = new Student();
        s.display();
    }
}


	class Person{
		void message(){
			System.out.println("This is person class");
			void display() {
        // will invoke or call current class message() method
        message();
			super.message();
		}
	}
  

	class Student extends Person{
		void message(){
        System.out.println("This is student class");
		}
  
       
  
        // will invoke or call parent class message() method
        
		}
	}
  
