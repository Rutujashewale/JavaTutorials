package com.rutuja.airline.entity;

public class Crews {
	private int id,age;
	private String name,contactNo;
	
	 
	 
	public Crews(int id, String name, int age, String contactNo) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.contactNo = contactNo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	@Override
	public String toString() {
		return "Crews [id=" + id + ", name=" + name + ", age=" + age + ", contactNo=" + contactNo + "]";
	}
	
}
