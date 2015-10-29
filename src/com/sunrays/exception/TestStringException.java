package com.sunrays.exception;

public class TestStringException {

	public static void case1(String[] args) {

		String name = "Vijay";

		try {
			System.out.println(name.length());
			System.out.println(name.charAt(6));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Please pura name do");
		} catch (NullPointerException e) {
			System.out.println("Name can not be null");
		}
	}

	public static void case2(String[] args) {

		String name = null;// "Vijay";

		try {
			System.out.println(name.length());
			System.out.println(name.charAt(6));
		} catch (RuntimeException e) {
			System.out.println("Error !!" + e.getMessage());
		}
	}

	public static void case3(String[] args) {

		String name = null;// "Vijay";

		try {
			System.out.println(name.length());
			System.out.println(name.charAt(6));
		} catch (NullPointerException e) {
			System.out.println("Value can not be null");
		} catch (RuntimeException e) {
			System.out.println("Error !!" + e.getMessage());
		}
	}

	public static void main(String[] args) {

		String name = "Vijay Dinanth Chohan";

		try {
			System.out.println(name.length());
			System.out.println(name.charAt(6));
		} catch (NullPointerException e) {
			System.out.println("Value can not be null");
		} catch (RuntimeException e) {
			System.out.println("Error !!" + e.getMessage());
		} finally {
			System.out.println("I M Pandit");
		}
	}

}
