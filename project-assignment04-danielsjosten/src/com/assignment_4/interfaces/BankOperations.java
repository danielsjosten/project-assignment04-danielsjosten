package com.assignment_4.interfaces;
/**
 * <h1>The BankAssignement!</h1>
 * @author Daniel Sjösten
 * @version 1.0
 * @since 2016-10-03
 *
 */
public interface BankOperations {

	/**
	 * @param amount interface
	 * Makes an withdraw from an account
	 */
	public void withdrawMoney(double amount);
	/**
	 * @param amount interface
	 * Makes a deposit to an account
	 */
	public void depositMoney(double amount);
	
	
}
