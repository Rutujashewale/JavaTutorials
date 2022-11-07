class Customer{
	private String customerName,customerContact,customerAddress;
	private int customerId;
	
	Customer(){
	}
	
	Customer(int customerId,String customerName,String customerContact,String customerAddress){
		this.customerId=customerId;
		this.customerName=customerName;
		this.customerContact=customerContact;
		this.customerAddress=customerAddress;
	}
	
	public int getCustomerId(){
		return this.customerId;
	}
	public String getCustomerName(){
		return this.customerName;
	}
	public String getCustomerContact(){
		return this.customerContact;
	}
	public String getCustomerAddress(){
		return this.customerAddress;
	}
	
	public void setCustomerId(int customerId){
		this.customerId=customerId;
	}
	public void setCustomerName(String customerName){
		this.customerName=customerName;
	}
	public void setCustomerContact(String customerContact){
		this.customerContact=customerContact;
	}
	public void setCustomerAddress(String customerAddress){
		this.customerAddress=customerAddress;
	}
	
	public String toString(){
	return this.customerId + " " + this.customerName + " " + this.customerContact + " " + this.customerAddress;
	}
}