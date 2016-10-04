package com.assignment_4.main;

import com.assignment_4.subclasses.BankAccount;
import com.assignment_4.subclasses.PersonalAccount;
import com.assignment_4.subclasses.SavingAccount;
import com.assignment_4.superclasses.BankCustomer;
/**
 * <h1>The BankAssignement!</h1>
 * @author Daniel Sjösten
 * @version 1.0
 * @since 2016-10-03
 *
 */
public class Main {

	/**
	 * @param args 
	 * This is the main method of the bank program that lets you create an account or several and deposit/withdraw money from/to it.
	 * 
	 */
	public static void main(String[] args) {

		String account = "";
		
		BankCustomer bc = new BankCustomer("Kalle", 28);
		bc.addAccount(new BankAccount());
		bc.addAccount(new PersonalAccount());
		bc.addAccount(new SavingAccount());
		System.out.println(bc.toString());
		
		System.out.println();
		
		account = bc.getCustomerAccounts().get(0).getAccountNumber();
		System.out.println("Depositing 30.0 to the first account");
		bc.depositToAccount(account, 30.0);
		System.out.println(bc.toString());
		
		System.out.println();
		
		System.out.println("Withdrawing 200.0 from the second account");
		account = bc.getCustomerAccounts().get(1).getAccountNumber();
		bc.withdrawFromAccount(account, 200.0);
		System.out.println(bc.toString());
		
		System.out.println();
		
		System.out.println("Depositing 200.0 to the third account");
		account = bc.getCustomerAccounts().get(2).getAccountNumber();
		bc.depositToAccount(account, 200.0);
		System.out.println(bc.toString());
	}

}
