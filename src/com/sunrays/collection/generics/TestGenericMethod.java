package com.sunrays.collection.generics;

/**
 * Example of Generic Method
 * 
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class TestGenericMethod {

	/**
	 * A Generic methods that determine if an object is in an array. 
	 * Upper bound of V is T
	 */
	static <T, V extends T> boolean contains(T x, V[] y) {
		for (int i = 0; i < y.length; i++)
			if (x.equals(y[i]))
				return true;
		return false;
	}

	public static void main(String[] args) {

		Integer nums[] = { 1, 2, 3, 4, 5 };
		if (contains(2, nums))
			System.out.println("2 is in nums");
		if (!contains(7, nums))
			System.out.println("7 is not in nums");
		System.out.println();

		// Use isIn() on Strings.
		String strs[] = { "one", "two", "three", "four", "five" };

		if (contains("two", strs))
			System.out.println("two is in strs");

		if (!contains("seven", strs))
			System.out.println("seven is not in strs");

		// Compilation error ! Types must be compatible.
		// if(isIn("two", nums))
		// System.out.println("two is in strs");
	}

}
