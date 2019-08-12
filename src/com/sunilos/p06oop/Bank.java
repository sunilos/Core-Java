package com.sunilos.p06oop;

/**
 * Contains Bank attributes. It is inherited by AxisBank, ICICIBank and HDFCBank
 * child class. It is an example of method overriding and runtime polymorphism.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class Bank {

	/**
	 * Returns Default Bank interest rate
	 */
	public double interestRate() {
		return 11.0;
	}

	/**
	 * Return name of the Bank
	 * 
	 * @return
	 */
	public String getName() {
		return "RBI";
	}

}
