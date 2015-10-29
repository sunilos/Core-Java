package com.sunrays.clone;

/**
 * This program is the example of DEEP CLONING. Customer contains BankAccount.
 * When Customer is cloned BankAccoubt is also cloned. For deep cloning all
 * containing classes must be clone able.
 * 
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 */

public class Customer implements Cloneable {

	/**
	 * Customer ID
	 */
	public int custId;

	/**
	 * Customer Name
	 */
	public String name;

	/**
	 * Bank Account of Customer
	 */
	public BankAccount acc = new BankAccount();

	/**
	 * Overridden Clone method makes clone of all containing objects and return.
	 */
	public Object clone() throws CloneNotSupportedException {
		Customer obj = (Customer) super.clone();
		obj.acc = (BankAccount) acc.clone();
		return obj;
	}

	/**
	 * Test Deep cloning
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		Customer c1 = new Customer();
		Customer c3 = (Customer) c1.clone();// calls the override clone method.
	}

}
