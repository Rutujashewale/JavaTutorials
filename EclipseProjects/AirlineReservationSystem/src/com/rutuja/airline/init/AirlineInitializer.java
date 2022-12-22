package com.rutuja.airline.init;

import java.util.ArrayList;
import java.util.List;

import com.rutuja.airline.entity.Crews;
import com.rutuja.airline.entity.Customer;
import com.rutuja.airline.entity.Flight;


public class AirlineInitializer {
	public static List<Customer> loadCustomerData() {
		 List<Customer> listOfCustomers = new ArrayList<Customer>();
		 
		 Customer c1=new Customer(123456, new ArrayList<>(), 123,"Nasik","Indian","Rutuja","Female");
		 Customer c2=new Customer(34567,new ArrayList<>(), 345,"Pune","Indian","Rut","Female");
		 Customer c3=new Customer(56789,new ArrayList<>(),567,"Mumbai","Indian","Rutu","Female");
		 Customer c4=new Customer(78912,new ArrayList<>(),789,"Delhi","Indian","Ru","Female");
		 Customer c5=new Customer(5,new ArrayList<>(),345,"New Jercy","American","Ram","Male");
		 
		 listOfCustomers.add(c1);
		 listOfCustomers.add(c2);
		 listOfCustomers.add(c3);
		 listOfCustomers.add(c4);
		 listOfCustomers.add(c5);
		 
		return listOfCustomers;
	}
	
	
	public static List<Flight> loadFlightData(){
		 List<Flight> listOfFlights = new ArrayList<Flight>();
		// int flightcode, int capacity, int filledSeats, int totalSeats, int availableSeats, String flightName,
		//	String source, String destination, String classCode, String className
		 Flight f1=new Flight(1234,200, 0,10,10 ,"QuatarAirways","India","Dubai","A","First class");
		 Flight f2=new Flight(3456,150,0,10,10,"Indigo","Mumbai","Delhi","B","Business class");
		 Flight f3=new Flight(5678,100,0,10,10,"Vistara","India","USA","c","Economy class");
		 Flight f4=new Flight(7890,200,0,10,10,"SpiceJet","Mumbai","Bangalore","c","Economy class");
		 Flight f5=new Flight(456678,200,0,10,10,"AirIndia","India","Singapore","B","Business class");
		
		 listOfFlights.add(f1);
		 listOfFlights.add(f2);
		 listOfFlights.add(f3);
		 listOfFlights.add(f4);
		 listOfFlights.add(f5);
		return listOfFlights;
	}
	
	public static List<Crews> loadCrewData(){
		 List<Crews> listOfCrews = new ArrayList<Crews>();
		 
		 //int id, String name, String age, String contactNo
		 
		 Crews c1=new Crews(1,"ABC",25,"123456");
		 Crews c2=new Crews(2,"PQR",26,"223456");
		 Crews c3=new Crews(3,"LMN",27,"323456");
		 Crews c4=new Crews(4,"XYZ",28,"423456");
		 
		 listOfCrews.add(c1);
		 listOfCrews.add(c2);
		 listOfCrews.add(c3);
		 listOfCrews.add(c4);
		 
		return listOfCrews;
		
	}
}
