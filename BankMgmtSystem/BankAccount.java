import java.util.*;
class BankAccount{
	private List<String> transactions;
	
	
	private int previousTransaction,balance;
	private String customerName,customerId;
	
	
	BankAccount(){
	}
	BankAccount(int balance,int previousTransaction,String customerId, String customerName,List<String> transactions){
		this.balance=balance;
		this.previousTransaction=previousTransaction;
		this.customerId=customerId;
		this.customerName=customerName;
		this.transactions=transactions;
	}
	
	public int getBalance(){
		return this.balance;
	}
	
	public int getPreviousTransaction(){
		return this.previousTransaction;
	}
	
	public String getCustomerId(){
		return this.customerId;
	}
	
	public String getCustomerName(){
		return this.customerName;
	}
	
	public void setBalance(int balance){
		this.balance=balance;
	}
	
	public void setPreviousTransaction(int previousTransaction){
		this.previousTransaction=previousTransaction;
	}
	public void setCustomerId(String customerId){
		this.customerId=customerId;
	}
	public void setCustomerName(String customerName){
		this.customerName=customerName;
	}
	public List<String> getTransactions(){
		return this.transactions;
	}
	public void setTransactions(List<String> transactions){
		this.transactions=transactions;
	}
	
	
	
	
	public String toString(){
		return this.balance + " "  + this.previousTransaction + " " + this.customerId + " " + this.customerName + " " +this.transactions;
	}
}