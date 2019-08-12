package com.sunilos.p06oop;

/**
 * Contains AxisBank attributes. It is child class of Bank. It is an example of
 * method overriding and runtime polymorphism.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class AxisBank extends Bank {

	/**
	 * Returns Axis Bank interest rate
	 */
	@Override
	public double interestRate() {
		return 11.25;
	}

	/**
	 * Return name of the Bank
	 * 
	 * @return
	 */
	@Override
	public String getName() {
		return "Axis Bank";
	}

}
