package com.rutuja.bank.main;
import java.util.*;

import com.rutuja.bank.service.BankOperations;
import com.rutuja.billing.entity.BankAccount;
public class BankAccountDriver{

	public static List<BankAccount> bankAccounts=new ArrayList<>();
	public static void main(String args[]){
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the details for 4 Customers:");
		

		for(int i=0;i<3;i++){
			System.out.println("Enter the customer name " +(i+1));
			String customerName=s.next().toLowerCase();
			System.out.println("Enter the customer ID " +(i+1));
			String customerId=s.next();
			BankAccount ba=new BankAccount(0,0,customerId,customerName,new ArrayList<String>());
			bankAccounts.add(ba);
		}
		System.out.println(bankAccounts);

		BankOperations.bankOperations();
	}
}
