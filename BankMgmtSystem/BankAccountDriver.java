import java.util.*;
class BankAccountDriver{
	static List<BankAccount> bankAccounts=new ArrayList<>();
	public static void main(String args[]){
		
		
		System.out.println("Enter the details for 4 Customers:");
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<3;i++){
			System.out.println("Enter the customer name " +(i+1));
			String customerName=s.next();
			System.out.println("Enter the customer ID " +(i+1));
			String customerId=s.next();
			BankAccount ba=new BankAccount(0,0,customerId,customerName,new ArrayList<String>());
			bankAccounts.add(ba);
		}
		System.out.println(bankAccounts);
		
		
		BankAccountDriver bad=new BankAccountDriver();
		bad.bankOperations();
		
		
	}
	
	public void bankOperations(){
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your choice to perform following operations");
		System.out.println("1.Current bank balance:");
		System.out.println("2.Deposit amount:");
		System.out.println("3.Withdraw amount:");
		System.out.println("4.Previous transaction details:");
		System.out.println("5.Last 2 transactions:");
		System.out.println("6.Current account details:");
		System.out.println("Select from above:");
		int choice=s.nextInt();
		List<String> existingList = null;
		
		switch(choice){
			case 1:
					System.out.println("Check current bank balance:");
					System.out.println("Enter valid customerID:" );
					String customerId=s.next();
					
					
					for(int i=0;i<bankAccounts.size();i++){
						BankAccount ba=bankAccounts.get(i);
						
						if(ba.getCustomerId().equals(customerId)){
							System.out.println("Check current bank balance:" +ba.getBalance());
							existingList = ba.getTransactions();
								existingList.add("Checked Balance");					
							ba.setTransactions(existingList);
						}
					}
					
					
					
					break;
			case 2:
					System.out.println("Deposit amount functionality :");
					System.out.println("Enter valid customerID:" );
				    customerId=s.next();
					
					for(int i=0;i<bankAccounts.size();i++){
						BankAccount ba=bankAccounts.get(i);
						
						
						if(ba.getCustomerId().equals(customerId)){
							System.out.println("balance before deposit is:"+ba.getBalance());
							System.out.println("Enter an amount to deposit");
							int amount=s.nextInt();
							if(amount !=0){
								int newBalance=ba.getBalance()+amount;
								int previousTransaction=amount;
								ba.setBalance(newBalance);
								ba.setPreviousTransaction(previousTransaction);
								System.out.println("balance after deposit is:"+ba.getBalance());
								
								existingList = ba.getTransactions();
								existingList.add("Deposited "+amount);					
								ba.setTransactions(existingList);
								
							}
						}	
					}
					
					break;
			case 3:
					System.out.println("Withdraw amount functionality:");
					
					System.out.println("Enter valid customer id:");
					customerId=s.next();
					
					for(int i=0;i<bankAccounts.size();i++){
						BankAccount ba=bankAccounts.get(i);
						
						
						if(ba.getCustomerId().equals(customerId)){
							System.out.println("Balance before withdrawal:"+ba.getBalance());
							System.out.println("Enter an amount to withdraw:");
							int amount=s.nextInt();
							if(amount !=0 && ba.getBalance()>=amount){
								int updatedBalance=ba.getBalance()-amount;
								int previousTransaction = -amount;
								ba.setBalance(updatedBalance);
								ba.setPreviousTransaction(previousTransaction);
								System.out.println("Balance after withdraw is:" +ba.getBalance());
								
								
								existingList = ba.getTransactions();
								existingList.add("Withrawn "+amount);					
								ba.setTransactions(existingList);
							}
						
						}
					}
					break;
			case 4:
					System.out.println("Previous transaction details:");
					
					System.out.println("Enter customer Id to check transaction details");
					customerId=s.next();
					
					for(int i=0;i<bankAccounts.size();i++){
						BankAccount ba=bankAccounts.get(i);
						if(ba.getCustomerId().equals(customerId)){
							System.out.println("previous transaction is:" +ba.getPreviousTransaction());
								
							}
						
					}
					break;
			case 5: 
					System.out.println("All transactions:");
					System.out.println("Enter customer Id to check transaction details");
					customerId=s.next();
					for(int i=0;i<bankAccounts.size();i++){
						BankAccount ba = bankAccounts.get(i);
						if(ba.getCustomerId().equals(customerId)){
							System.out.println("previous transactions are:" +ba.getTransactions());
						}
					}
					
					break;
			case 6:
					System.out.println("Current account details");
		
					System.out.println("Enter customer Id to check transaction details");
					customerId=s.next();		
					
					for(int i=0;i<bankAccounts.size();i++){
						BankAccount ba=bankAccounts.get(i);
						if(ba.getCustomerId().equals(customerId)){
							System.out.println(ba);
						
						}
					}
					break;    
			default:
					System.out.println("Kindly select valid operations: ");
					break;
					
		
		}
		char ch;
		
		System.out.println("press Y/N to continue or not :");
		ch=s.next().charAt(0);
		
		if(ch=='Y' || ch=='y')
		{
			bankOperations();
		}else
			System.out.println("You have entered No :");
	}
}