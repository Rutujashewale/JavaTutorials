package com.rutuja.lib.entity;

public  class Student{
	
		

		private String name;
		private int id,roll_no;
		private double contact_no;
		
		public Student(){
		}
		
		public Student(String name,int id,int roll_no){
			this.name=name;
			this.id=id;
			this.roll_no=roll_no;
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getRoll_no() {
			return roll_no;
		}

		public void setRoll_no(int roll_no) {
			this.roll_no = roll_no;
		}

		public double getContact_no() {
			return contact_no;
		}

		public void setContact_no(double contact_no) {
			this.contact_no = contact_no;
		}
		
		public String toString(){
			return this.name + " " + this.id + " " + this.roll_no ; 
		}
	
}