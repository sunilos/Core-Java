package com.sunilos.p06oop;

/**
 * Fully encapsulated Account expert class.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class Account {

	/**
	 * Account Number
	 */
	String number = null;

	/**
	 * Type of Account
	 */
	String type = null;

	/**
	 * Balance of account
	 */
	double balance = 0;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public double deposit(double amount) {
		balance += amount;
		return balance;
	}

	public double withdraw(double amount) {
		balance -= amount;
		return balance;
	}

	public void fundTransfer(String accountNo, double amount) {
		// TODO
	}
}
