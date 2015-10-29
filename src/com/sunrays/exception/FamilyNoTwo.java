package com.sunrays.exception;

public class FamilyNoTwo {

	public static void main(String[] args) {
		try {
			padosi();
		} catch (LoginException exp) {
			System.out.println("Handled by main " + exp.getMessage());
			exp.printStackTrace();
		}
	}

	public static void padosi() throws LoginException {
		dad();

	}

	public static void dad() throws LoginException {
		mom();

	}

	public static void mom() throws LoginException {
		raju();
	}

	public static void raju() throws LoginException {
		LoginException e = new LoginException();
		throw e;
	}
}
