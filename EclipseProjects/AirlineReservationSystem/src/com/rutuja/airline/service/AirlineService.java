package com.rutuja.airline.service;

import java.util.List;
import java.util.Scanner;

import com.rutuja.airline.entity.Customer;
import com.rutuja.airline.entity.Flight;
import com.rutuja.airline.entity.Tickets;
import com.rutuja.airline.main.AirlineDriver;

public  class AirlineService {


	public  void checkSeatAvailability(int fCode) {
		Flight f=getFlightFromTheList(fCode);
		System.out.println("Flight code matched:");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of seats you want to book:");
		int noOfSeats=s.nextInt();

		if(noOfSeats<=f.getAvailableSeats()) {
			System.out.println("Seats available:");
		}else {
			System.out.println("Sorry seats aren't available");
		}
	}

	public  void bookATicket(int fCode) {
		List<Tickets> existingList = null;
		Scanner s=new Scanner(System.in);
		Flight f=getFlightFromTheList(fCode);


		System.out.println("Enter number of seats you want to book:");
		int noOfSeats=s.nextInt();
		if( noOfSeats<=f.getAvailableSeats()) {
			for(int k=0;k<noOfSeats;k++) {
				System.out.println("Enter your passport number to book a ticket:");
				long passportno=s.nextLong();
				Customer c=getCustomerFromTheList(passportno);	
				System.out.println("Seat booked successfully:");
				long pnrNo=(long)Math.random();
				Tickets ticket=new Tickets(pnrNo);
				existingList = c.getTickets();
				existingList.add(ticket);
				c.setTickets(existingList);
				// We are deducting 1 from available seats and
				// We are adding 1 to the filled Seats.
				f.setAvailableSeats(f.getAvailableSeats()-1);
				f.setFilledSeats(f.getFilledSeats()+1);

			}
		}else {
			System.out.println("Oops... seats aren't available:");
		}
	}
	public Flight getFlightFromTheList(int fCode) {
		Flight f=null;
		for(int i=0;i<AirlineDriver.listOfFlights.size();i++) {
			Flight flight = AirlineDriver.listOfFlights.get(i);
			if(fCode==flight.getFlightcode()) {
				f=flight;
				System.out.println(f);
				return f;
			}
		}
		return f;
	}

	public Customer getCustomerFromTheList(long cPassportNo) {
		Customer c=null;
		for(int i=0;i<AirlineDriver.listOfCustomers.size();i++) {
			Customer customer = AirlineDriver.listOfCustomers.get(i);
			if(cPassportNo==customer.getPassportNumber()) {
				c=customer;
				System.out.println(c);
				return c;
			}
		}
		return c;
	}
	public  void flightDetails(int fCode) {
		Flight f=getFlightFromTheList(fCode);
	}

	public  void flightSearch(int fCode) {
		boolean flag=false;
		for(int i=0;i<AirlineDriver.listOfFlights.size();i++) {
			Flight f = AirlineDriver.listOfFlights.get(i);

			if(fCode==f.getFlightcode()) {
				System.out.println("Flight available:");
				flag=true;
				break;

			}
		}
		if(flag==false) {
			System.out.println("Flight not available:");
		}

	}

	public void customerDetails(int cPassportNo) {
		Customer c=getCustomerFromTheList(cPassportNo);	
	}
}


