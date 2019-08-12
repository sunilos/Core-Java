package com.sunilos.p07exception;

/**
 * Tests custom LoginException class.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestCustomLoginException {

	public static void main(String[] args) {

		try {
			authenticate("SUNRAYS", "SUNRAYS");
		} catch (LoginException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void authenticate(String login, String pwd)
			throws LoginException {
		boolean flag = true;
		if (flag) {
			throw new LoginException();
		}
	}

}
