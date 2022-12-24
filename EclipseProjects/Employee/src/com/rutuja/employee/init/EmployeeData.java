package com.rutuja.employee.init;

import java.util.ArrayList;
import java.util.List;


import com.rutuja.employee.entity.Employee;

public class EmployeeData {
	public static List<Employee> loadEmployeeData(){
	 List<Employee> employee=new ArrayList<>();
	Employee emp=new Employee("Rutuja",21,10000);
	Employee emp1=new Employee("Rutu",20,5000);
	Employee emp2=new Employee("Rut",25,50000);
	Employee emp3=new Employee("Durga",20,10000);
	Employee emp4=new Employee("Rutu",16,80000);
	
	employee.add(emp);
	employee.add(emp1);
	employee.add(emp2);
	employee.add(emp3);
	employee.add(emp4);
	
	
	return employee;
	}
}
