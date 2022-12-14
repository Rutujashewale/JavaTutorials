package com.rutuja.bank.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.rutuja.bank.main.BankAccountDriver;
import com.rutuja.bank.services.BankService;
import com.rutuja.billing.entity.BankAccount;

public class BankOperations {
	public static List<BankAccount> bankOperations(){
		List<BankAccount> bankAccounts=new ArrayList<>();


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


		switch(choice){
		case 1:
			System.out.println("Check current bank balance:");
			System.out.println("Enter valid customerID:" );
			String customerId=s.next();

			BankService.checkBalance(customerId);
			break;
		case 2:
			System.out.println("Deposit amount functionality :");
			System.out.println("Enter valid customerID:" );
			customerId=s.next();
			BankService.depositAmount(customerId);
		

		break;
	case 3:
		System.out.println("Withdraw amount functionality :");
		System.out.println("Enter valid customerID:" );
		customerId=s.next();
		BankService.withdrawAmount(customerId);

	break;
case 4:
	System.out.println("Previous transaction details:");

	System.out.println("Enter customer Id to check transaction details");
	customerId=s.next();
	BankService.previousTransactionDetails(customerId);
	
	break;
case 5: 
	System.out.println("All transactions:");
	System.out.println("Enter customer Id to check transaction details");
	customerId=s.next();
	BankService.AllTransactions(customerId);
	break;
case 6:
	System.out.println("Current account details");

	System.out.println("Enter customer Id to check transaction details");
	customerId=s.next();		

	BankService.CurrentAccountDetails(customerId);
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
return bankAccounts;
}

}
