package com.sunilos.p06oop;

/**
 * Bank Account implements Cloneable interface to be part of Deep Cloning.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class BankAccount implements Cloneable {

	public double balance = 0;

	public BankAccount() {
	}

	public BankAccount(double b) {
		balance = b;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws Exception {

		BankAccount a1 = new BankAccount(10);
		BankAccount a2 = (BankAccount) a1.clone();
		a2.balance = 20;

		System.out.println(a1.balance);
		System.out.println(a2.balance);
	}

}
