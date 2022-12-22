package com.rutuja.airline.entity;

import com.rutuja.airline.main.AirlineDriver;

public class Flight {
	private int flightcode,capacity,filledSeats,totalSeats,availableSeats;
	private String flightName,source,destination,classCode,className;



	public Flight(int flightcode, int capacity, int filledSeats, int totalSeats, int availableSeats, String flightName,
			String source, String destination, String classCode, String className) {
		super();
		this.flightcode = flightcode;
		this.capacity = capacity;
		this.filledSeats = filledSeats;
		this.totalSeats = totalSeats;
		this.availableSeats = availableSeats;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
		this.classCode = classCode;
		this.className = className;
	}

	public int getFilledSeats() {
		
		return filledSeats;
	}

	public void setFilledSeats(int filledSeats) {
		this.filledSeats = filledSeats;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public int getAvailableSeats() {
		this.availableSeats=(this.getTotalSeats()-this.getFilledSeats());
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public int getFlightcode() {
		return flightcode;
	}

	public void setFlightcode(int flightcode) {
		this.flightcode = flightcode;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	@Override
	public String toString() {
		return "Flight [flightcode=" + flightcode + ", capacity=" + capacity + ", filledSeats=" + filledSeats
				+ ", totalSeats=" + totalSeats + ", availableSeats=" + availableSeats + ", flightName=" + flightName
				+ ", source=" + source + ", destination=" + destination + ", classCode=" + classCode + ", className="
				+ className + "]";
	}


}
