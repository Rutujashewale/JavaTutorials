class Account{
	private long acc_no;
	String name,email;
	private float amount;
	
	public long getAcc_no(){
		return acc_no;
	}
	public void setAcc_no(long acc_no){
		this.acc_no=acc_no;
	}
	
	public float getAmount(){
		return amount;
	}
	
	public float setAmount(float amount){
		this.amount=amount;
	}
}

class EncapsulationDemo{
	public static void main(String args[]){
		Account account=new Account();
		
		account.setAcc_no(347854957);
		account.setAmount(500000);
		
		System.out.println(account.getAcc_no() + "" + account.getAmount());
	}
}