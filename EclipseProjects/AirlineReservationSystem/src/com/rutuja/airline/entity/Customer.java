package com.rutuja.airline.entity;

import java.util.List;

public class Customer {
	private long passportNumber,flightCode;
	private String address,nationality,customerName,gender;
	private List<Tickets> tickets;



	public Customer(long passportNumber,List<Tickets> tickets, long flightCode, String address, String nationality,
			String customerName, String gender) {

		this.passportNumber = passportNumber;
		this.tickets=tickets;
		this.flightCode = flightCode;
		this.address = address;
		this.nationality = nationality;
		this.customerName = customerName;
		this.gender = gender;
	}

	public long getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(long passportNumber) {
		this.passportNumber = passportNumber;
	}


	public long getFlightCode() {
		return flightCode;
	}

	public void setFlightCode(long flightCode) {
		this.flightCode = flightCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		address = address;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		nationality = nationality;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		gender = gender;
	}
	public List<Tickets> getTickets(){
		return this.tickets;
	}
	public void setTickets(List<Tickets> tickets){
		this.tickets=tickets;
	}
	@Override
	public String toString() {
		return this.passportNumber + " " + this.tickets + " " + this.flightCode + " " + this.address + " " + this.nationality + " " + this.customerName+ " " + this.gender ;
	}






}
