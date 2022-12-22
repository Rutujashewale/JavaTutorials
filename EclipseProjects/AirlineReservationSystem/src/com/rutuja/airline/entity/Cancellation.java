package com.rutuja.airline.entity;

public class Cancellation {
	private long passangerNumber,cancellationNo,tocketId,flightCode;
	private String cancellationDate;
	
	Cancellation(){
		
	}

	public long getPassangerNumber() {
		return passangerNumber;
	}

	public void setPassangerNumber(long passangerNumber) {
		this.passangerNumber = passangerNumber;
	}

	public long getCancellationNo() {
		return cancellationNo;
	}

	public void setCancellationNo(long cancellationNo) {
		this.cancellationNo = cancellationNo;
	}

	public long getTocketId() {
		return tocketId;
	}

	public void setTocketId(long tocketId) {
		this.tocketId = tocketId;
	}

	public long getFlightCode() {
		return flightCode;
	}

	public void setFlightCode(long flightCode) {
		this.flightCode = flightCode;
	}

	public String getCancellationDate() {
		return cancellationDate;
	}

	public void setCancellationDate(String cancellationDate) {
		this.cancellationDate = cancellationDate;
	}

	@Override
	public String toString() {
		return "Cancellation [passangerNumber=" + passangerNumber + ", cancellationNo=" + cancellationNo + ", tocketId="
				+ tocketId + ", flightCode=" + flightCode + ", cancellationDate=" + cancellationDate + "]";
	}
	
}
