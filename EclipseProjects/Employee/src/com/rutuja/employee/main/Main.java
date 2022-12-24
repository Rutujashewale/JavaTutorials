package com.rutuja.employee.main;

import java.util.List;
import java.util.stream.Collectors;

import com.rutuja.employee.entity.Employee;
import com.rutuja.employee.init.EmployeeData;

public class Main {
	public static List<Employee> employee=EmployeeData.loadEmployeeData();
	public static void main(String args[]) {
		
		for(int i=0;i<employee.size();i++) {
			Employee e=employee.get(i);
		}
		
		List<Employee> getNewSalary=employee.stream().map(e ->{
		
			if(e.getAge() >25) {
				e.setSalary(e.getSalary() * 1.10);
			}
			return e;
		}).collect(Collectors.toList());
		
		System.out.println("\t\t\t" +getNewSalary);
	}
}
