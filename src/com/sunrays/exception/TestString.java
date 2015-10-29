package com.sunrays.exception;

public class TestString {

	public static void main(String[] args) {
		//case1();
		//case2();
	    //case3();
		//case4();
		//case5();
		case6();

	}

	/**
	 * Normal String checks
	 */

	public static void case1() {

		String name = "Vijay Dinanth Chohan";
		System.out.println("Length of name is " + name.length());
		System.out.println("Charter at 7 position is " + name.charAt(6));
	}

	/**
	 * Raise String Out Of Bounds Exception
	 */
	public static void case2() {

		String name = "Vijay";

		System.out.println("Length of name is " + name.length());
		System.out.println("Charter at 7 position is " + name.charAt(6));
	}

	/**
	 * Handle String Out Of Bounds Exception
	 */

	public static void case3() {

		String name = "Vijay";

		try {
			System.out.println("Length of name is " + name.length());
			System.out.println("Charter at 7 position is " + name.charAt(6));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String abhi choti he");
		}
	}

	/**
	 * Raise multiple exceptions
	 */

	public static void case4() {

		String name = null;
		try {
			System.out.println("Length of name is " + name.length());
			System.out.println("Charter at 7 position is " + name.charAt(6));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String abhi choti he");
		} finally {
			System.out.println("Pandit hu me");
		}
	}

	/**
	 * Handle multiple exceptions with help of multiple caches
	 */
	public static void case5() {

		String name = null;
		try {
			System.out.println("Length of name is " + name.length());
			System.out.println("Charter at 7 position is " + name.charAt(6));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String abhi choti he");
		} catch (NullPointerException e) {
			System.out.println("Name can not be null");
		} finally {
			System.out.println("%%% I am Pandit");
		}
	}

	/**
	 * Parents can handle Chield's exceptions
	 */
	public static void case6() {
		String name = null;
		try {
			System.out.println("Length of name is " + name.length());
			System.out.println("Charter at 7 position is " + name.charAt(6));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String abhi choti he");
		} catch (RuntimeException e) {
			System.out.println(" Parent's Says - Name can not be null");
		} finally {
			System.out.println(">>>I am Pandit");
		}
	}

}
