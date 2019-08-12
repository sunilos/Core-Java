package com.sunilos.p11thread;

/**
 * Account class containing synchronized method and synchronized block
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class Account {

	/**
	 * Contains balance of amount
	 */
	private int balance = 0;

	/**
	 * Deposits amount in account. It is synchronized, only one thread can
	 * deposit amount at a time.
	 * 
	 * This uses method synchronization
	 * 
	 * @param msg
	 * @param amt
	 */
	public synchronized void deposit(String msg, int amt) {
		int bal = getBalance() + amt;
		setBalance(bal);
		System.out.println(msg + " new balance " + bal);
	}

	/**
	 * Withdraws amount from account. It is synchronized, only one thread can
	 * withdraw amount at a time.
	 * 
	 * This uses block synchronization
	 * 
	 * @param msg
	 * @param amt
	 */
	public synchronized void withdraw(String msg, int amt) {
		int bal = 0;
		synchronized (this) { // Block syncronization
			bal = getBalance() - amt;
			setBalance(bal);
		}
		System.out.println(msg + " Now Balance is " + bal);
	}

	/**
	 * Gets the account balance
	 * 
	 * @return
	 */
	public int getBalance() {
		// Assuming that Database operation will take 200 milliseconds
		databaseDelay();
		return balance;
	}

	/**
	 * Sets the balance
	 * 
	 * @param balance
	 */
	public void setBalance(int balance) {
		// Assuming that Database operation will take 200 milliseconds
		databaseDelay();
		this.balance = balance;
	}

	/**
	 * Assumed that Database operation will take 200 milliseconds
	 */
	public void databaseDelay() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
		}
		this.balance = balance;
	}

}
