package com.sunrays.exception;

public class FamilyNoOne {

	public static void main(String[] args) {
		padosi();
	}

	public static void padosi() {
		dad();

	}

	public static void dad() {
		mom();

	}

	public static void mom() {
		raju();

	}

	public static void raju() {

		RuntimeException e = new RuntimeException("I Lost Rs 500");
		throw e;

	}
}
