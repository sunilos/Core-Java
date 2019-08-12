package com.sunilos.p07exception;

/**
 * Tests propagation of unchecked exception .
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class FamilyPropagation {

	public static void main(String[] args) {
		dad();
	}

	/**
	 * dad() handles the exception raised by son()
	 */
	public static void dad() {
		try {
			mom();
		} catch (RuntimeException e) {
			System.out.println("Caught by Dad,raised by son");
		}
	}

	/**
	 * mom() propagates RuntimeException
	 */
	public static void mom() {
		son();
	}

	/**
	 * son() propagates RuntimeException
	 */
	public static void son() {
		RuntimeException e = new RuntimeException("I made a mistake");
		throw e;
	}

}
