package com.rutuja.bank.services;

import java.util.List;
import java.util.Scanner;

import com.rutuja.bank.main.BankAccountDriver;
import com.rutuja.bank.service.BankOperations;
import com.rutuja.billing.entity.BankAccount;

public class BankService {

	public static void checkBalance(String customerId) {
		for(int i=0;i<BankAccountDriver.bankAccounts.size();i++){
			BankAccount ba=BankAccountDriver.bankAccounts.get(i);
			List<String> existingList = null;
			if(ba.getCustomerId().equals(customerId)){
				System.out.println("Check current bank balance:" +ba.getBalance());
				existingList = ba.getTransactions();
				existingList.add("Checked Balance");					
				ba.setTransactions(existingList);
			}
		}
	}

	public static void depositAmount(String customerId) {
		Scanner s=new Scanner(System.in);
		List<String> existingList = null;
		for(int i=0;i<BankAccountDriver.bankAccounts.size();i++){
			BankAccount ba=BankAccountDriver.bankAccounts.get(i);
			
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
	}
	public static void withdrawAmount(String customerId) {
		Scanner s=new Scanner(System.in);
		List<String> existingList = null;
		for(int i=0;i<BankAccountDriver.bankAccounts.size();i++){
			BankAccount ba=BankAccountDriver.bankAccounts.get(i);
			
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
				}else {
					System.out.println("Insufficient fund to withdraw");
				}

			}
		}
	}
	public static void previousTransactionDetails(String customerId) {
		for(int i=0;i<BankAccountDriver.bankAccounts.size();i++){
			BankAccount ba=BankAccountDriver.bankAccounts.get(i);
			if(ba.getCustomerId().equals(customerId)){
				System.out.println("previous transaction is:" +ba.getPreviousTransaction());

			}

		}
	}
	public static void AllTransactions(String customerId) {
		for(int i=0;i<BankAccountDriver.bankAccounts.size();i++){
			BankAccount ba=BankAccountDriver.bankAccounts.get(i);
			if(ba.getCustomerId().equals(customerId)){
				System.out.println(ba);

			}
		}
	}
	
	public static void CurrentAccountDetails(String customerId) {
		for(int i=0;i<BankAccountDriver.bankAccounts.size();i++){
			BankAccount ba=BankAccountDriver.bankAccounts.get(i);
			if(ba.getCustomerId().equals(customerId)){
				System.out.println(ba);

			}
		}
	}
}
