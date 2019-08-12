package com.sunilos.p06oop;

/**
 * Contains HDFC Bank attributes. It is child class of Bank. It is an example of
 * method overriding and runtime polymorphism.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class HDFCBank extends Bank {

	/**
	 * Returns HDFC Bank interest rate
	 */
	@Override
	public double interestRate() {
		return 10.10;
	}

	/**
	 * Return name of the Bank
	 * 
	 * @return
	 */
	@Override
	public String getName() {
		return "HDFC Bank";
	}

}
