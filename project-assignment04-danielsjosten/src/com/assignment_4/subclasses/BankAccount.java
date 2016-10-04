
package com.assignment_4.subclasses;

import java.util.UUID;

import com.assignment_4.interfaces.BankOperations;

/**
 * <h1>The BankAssignement!</h1>
 * @author Daniel Sjösten
 * @version 1.0
 * @since 2016-10-03
 *
 */

public class BankAccount implements BankOperations {

	String accountNumber = "";
	String accountType = "";
	double balance = 0.0;


	/**
	 * This is a constructor that sets an accountnumber to a new bankaccount
	 */
	public BankAccount() {
		this.accountNumber = UUID.randomUUID().toString().substring(0, 6);
		this.accountType = "Bank account";
		this.balance = 0;
	}



	/* (non-Javadoc)
	 * @see com.assignment_4.interfaces.BankOperations#withdrawMoney(double)
	 */
	public void withdrawMoney(double amount) {
		if (amount >= 0) {
			setBalance(getBalance() - amount);
		} else {
			System.out.println("You cant withdraw a negative value!");
		}
	}


	/* (non-Javadoc)
	 * @see com.assignment_4.interfaces.BankOperations#depositMoney(double)
	 */
	public void depositMoney(double amount) {
		if (amount > 0) {
			setBalance(getBalance() + amount);
		} else {
			System.out.println("Your deposit needs to be a positive number");
		}
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\nBankAccount: AccountNumber = " + getAccountNumber() + ", AccountType = " + getAccountType() + ",  \tBalance = " + getBalance();
	}

	// Get and set.
	/**
	 * @return accountNumber gets accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}


	/**
	 * @param accountNumber sets accountNumber
	 */

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return accountType gets accountType
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * @param accountType sets accountType
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/**
	 * @return balance gets balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance sets balance
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
