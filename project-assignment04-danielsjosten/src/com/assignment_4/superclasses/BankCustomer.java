package com.assignment_4.superclasses;

import java.util.ArrayList;

import com.assignment_4.subclasses.BankAccount;

/**
 * <h1>The BankAssignement!</h1>
 * @author Daniel Sjösten
 * @version 1.0
 * @since 2016-10-03
 *
 */
public class BankCustomer extends Human {

	ArrayList<BankAccount> customerAccounts = new ArrayList<BankAccount>();

	/**
	 * @param name constructor that inherits the attribute name from the class human
	 * @param age constructor that inherits the attribute age from the class human
	 */
	public BankCustomer(String name, int age) {
		super(name, age);
	}

	/**
	 * @param bankAccount adds a bank account to a customer
	 */
	public void addAccount(BankAccount bankAccount) {
		customerAccounts.add(bankAccount);
		
		
	}

	/**
	 * 
	 * This method makes a deposit to an account
	 * 
	 * @param accountNumber specifies from witch account the deposit is to
	 * @param amount specifies the amount to deposit
	 */
	public void depositToAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccounts.size(); i++) {
			if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccounts.get(i).depositMoney(amount);
			}
		}
	}

	/**
	 * This method makes an withdrawal from an account
	 * 
	 * @param accountNumber specifies from witch account the withdrawal is from
	 * @param amount specifies the amount to withdraw
	 */
	public void withdrawFromAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccounts.size(); i++) {
			if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccounts.get(i).withdrawMoney(amount);
			}
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		//Creating a 'formatedString' to remove the brackets around the arraylist when printing it.
		String formatedString = customerAccounts.toString().replace("[", "").replace("]", "");
		return "Customer: " + getName() + ", Age: " + getAge() + "\n" + formatedString;

	}

	// Get and set
	/**
	 * @return customerAccounts method that gets customerAccounts
	 */
	public ArrayList<BankAccount> getCustomerAccounts() {
		return customerAccounts;
	}

	/**
	 * @param customerAccounts method that sets customerAccounts
	 */
	public void setCustomerAccounts(ArrayList<BankAccount> customerAccounts) {
		this.customerAccounts = customerAccounts;
		
	}

}
