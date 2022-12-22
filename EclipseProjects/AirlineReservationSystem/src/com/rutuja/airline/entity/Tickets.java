package com.rutuja.airline.entity;

public class Tickets {
	private long pnrNo;

	public Tickets(long pnrNo) {
		super();
		this.pnrNo = pnrNo;
	}

	public long getPnrNo() {
		return pnrNo;
	}

	public void setPnrNo(long pnrNo) {
		this.pnrNo = pnrNo;
	}

	@Override
	public String toString() {
		return "Tickets [pnrNo=" + pnrNo + "]";
	}
	
}
