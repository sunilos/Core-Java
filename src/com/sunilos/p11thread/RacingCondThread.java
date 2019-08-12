package com.sunilos.p11thread;

/**
 * Tread access the Account object and raise a racing condition. Account resolve
 * the racing condition by synchronized deposit method.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class RacingCondThread extends Thread {

	// Creats single static copy of account
	public static Account data = new Account();

	// Initializes name of the thread
	public RacingCondThread(String name) {
		super(name);
	}

	/**
	 * Deposit Rs 1000 five times, total Rs 5000
	 */
	public void run() {
		for (int i = 0; i < 5; i++) {
			data.deposit(getName(), 1000);
		}
	}

	public static void main(String[] args) {

		RacingCondThread u1 = new RacingCondThread("Ram");
		RacingCondThread u2 = new RacingCondThread("Shyam");

		u1.start();
		u2.start();

	}

}
