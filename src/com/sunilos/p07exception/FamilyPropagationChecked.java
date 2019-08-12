package com.sunilos.p07exception;

/**
 * Tests propagation of checked exception .
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class FamilyPropagationChecked {

	public static void main(String[] args) {
		dad();
	}

	/**
	 * dad() handles the exception raised by son()
	 */
	public static void dad() {
		try {
			mom();
		} catch (MistakeException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * mom() propagates MistakeException
	 * 
	 * @throws MistakeException
	 */
	public static void mom() throws MistakeException {
		son();
	}

	/**
	 * son() propagates MistakeException
	 * 
	 * @throws MistakeException
	 */
	public static void son() throws MistakeException {
		MistakeException e = new MistakeException();
		throw e;
	}

}
