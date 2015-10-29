package com.sunrays.clone;

/**
 * Bank Account implements Cloneable interface to be part of Deep Cloning.
 * 
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 */

public class BankAccount implements Cloneable {

	/*
	 * Account ID
	 */
	public int accountId;

	/**
	 * Account Balance
	 */
	public double balance;

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
