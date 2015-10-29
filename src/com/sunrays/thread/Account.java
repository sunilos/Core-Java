package com.sunrays.thread;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class Account {

	private int balance = 0;

	public synchronized void deposit(String message, int amount) {

		// public void deposit(String message, int amount) {

		int bal;

		// synchronized (this){
		bal = getBalance() + amount;
		setBalance(bal);
		// }
		System.out.println(message + " Now Balance is " + bal);

	}

	public int getBalance() {
		try {
			Thread.sleep(200); // Simulate Database Operation
		} catch (InterruptedException e) {
		}
		return balance;
	}

	public void setBalance(int balance) {
		try {
			Thread.sleep(200);// Simulate Database Operation
		} catch (InterruptedException e) {
		}
		this.balance = balance;
	}

}
