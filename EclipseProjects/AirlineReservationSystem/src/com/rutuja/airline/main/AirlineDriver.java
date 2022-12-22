package com.rutuja.airline.main;

import java.util.*;

import com.rutuja.airline.entity.Crews;
import com.rutuja.airline.entity.Customer;
import com.rutuja.airline.entity.Flight;
import com.rutuja.airline.entity.Tickets;
import com.rutuja.airline.init.AirlineInitializer;
import com.rutuja.airline.service.AirlineService;


public class AirlineDriver {
	public static List<Customer> listOfCustomers = AirlineInitializer.loadCustomerData();
	public static List<Flight> listOfFlights = AirlineInitializer.loadFlightData();
	public static List<Crews> listOfCrews = AirlineInitializer.loadCrewData();
	public static void main(String args[]) {
		System.out.println("List of customers" + listOfCustomers);
		System.out.println("List of Flights" + listOfFlights);
		System.out.println("List of Crews" + listOfCrews);
		manageAirline();
	}


	public static void manageAirline(){
		int choice;
		char ch;
		AirlineService airlineService=new AirlineService();
		Scanner s=new Scanner(System.in);
		System.out.println("Choose the option :");
		System.out.println("1.Check availability of seats :");
		System.out.println("2.Book a ticket :");
		System.out.println("3. Flight details:");
		System.out.println("4.Flight search :");
		System.out.println("5. Customer Details :");
		System.out.println("Select from above :");
		choice = s.nextInt();

		switch(choice){
		case 1 :
			System.out.println("1.Check availability of seats :");
			
			System.out.println("Enter the flight Code:");
			int fCode=s.nextInt();
			airlineService.checkSeatAvailability(fCode);

			break;

		case 2:
			System.out.println("2.Book a ticket:");
			
			System.out.println("Enter flightCode to book a ticket:");
			 fCode=s.nextInt();
			
			 airlineService.bookATicket(fCode);

		break;
	case 3:
		System.out.println("3. Flight details:");
		System.out.println("Enter flight code:");
		fCode=s.nextInt();

		airlineService.flightDetails(fCode);
		break;  

	case 4:
		System.out.println("4.Flight search :");
		System.out.println("Enter the Flight code to search flight:");
		fCode=s.nextInt();
		airlineService.flightSearch(fCode);
		break;

	case 5:
		System.out.println("5. Customer Details :");
		System.out.println("Enter customer passport Number:");
		int cPassportNo=s.nextInt();

		airlineService.customerDetails(cPassportNo);
		break;

	default:
		System.out.println("Please enter valid choice :");
		break;

	}
	System.out.println("press Y/N to continue or not :");
	ch=s.next().charAt(0);

	if(ch=='Y' || ch=='y')
	{
		manageAirline();
	}else
		System.out.println("You have entered No :");
}
}
