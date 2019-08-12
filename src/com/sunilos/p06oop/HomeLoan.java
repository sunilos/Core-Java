package com.sunilos.p06oop;

/**
 * Calculates the interest rate of Home Loan and depicts runtime (Dynamic)
 * polymorphism behaviour of Bank and its Child classes.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class HomeLoan {

	public static void main(String[] args) {
		Bank[] banks = new Bank[3];
		banks[0] = new AxisBank();
		banks[1] = new HDFCBank();
		banks[2] = new ICICIBank();
		loanEnquiry(banks);
	}

	public static void loanEnquiry(Bank[] banks) {
		for (Bank b : banks) {
			// different implementation of getName and interestRate
			String name = b.getName();
			double rate = b.interestRate();
			System.out.print(name + " = " + rate);
		}
	}
}
