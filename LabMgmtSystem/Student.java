
class Student{
	
		String name;
		int id,roll_no;
		double contact_no;
		
		public Student(){
		}
		
		public Student(String name,int id,int roll_no){
			this.name=name;
			this.id=id;
			this.roll_no=roll_no;
		}
		
		public String toString(){
			return this.name + " " + this.id + " " + this.roll_no ; 
		}
	
}