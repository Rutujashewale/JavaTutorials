package com.rutuja.airline.entity;

public class PaymentDetails {
	private long pnrNo,paidAmount,chequeNo,cardNo,phoneNo;
	private String payDate;
	
	PaymentDetails(){
		
	}

	public long getPnrNo() {
		return pnrNo;
	}

	public void setPnrNo(long pnrNo) {
		this.pnrNo = pnrNo;
	}

	public long getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(long paidAmount) {
		this.paidAmount = paidAmount;
	}

	public long getChequeNo() {
		return chequeNo;
	}

	public void setChequeNo(long chequeNo) {
		this.chequeNo = chequeNo;
	}

	public long getCardNo() {
		return cardNo;
	}

	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPayDate() {
		return payDate;
	}

	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}

	@Override
	public String toString() {
		return "PaymentDetails [pnrNo=" + pnrNo + ", paidAmount=" + paidAmount + ", chequeNo=" + chequeNo + ", cardNo="
				+ cardNo + ", phoneNo=" + phoneNo + ", payDate=" + payDate + "]";
	}
	
	
}
