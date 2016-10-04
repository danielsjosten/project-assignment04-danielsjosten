package com.assignment_4.subclasses;

import java.util.UUID;

/**
 * <h1>The BankAssignement!</h1>
 * @author Daniel Sjösten
 * @version 1.0
 * @since 2016-10-03
 *
 */
public class SavingAccount extends BankAccount {

	/**
	 * This is a constructor that sets an accountnumber to a new savingsaccount
	 */
	public SavingAccount() {
		this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6));
		this.setAccountType("Saving Account");
		this.setBalance(0.0);
	}

	
	
}
