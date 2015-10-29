package com.sunrays.test;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class TestLogin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			authenticat("sinrays", "sun");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void authenticat(String id, 
			String pwd)
			throws UserNotFoundException {

		if (!id.equals(pwd)) {
			throw new UserNotFoundException();
		}
	}

}
