package com.sunilos.p09generics;

/**
 * Generic class specifies two type parameters K and V, separated by a comma
 * Because it has two type parameters, two type arguments must be passed to
 * DataPair when an object is created.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class DataPair<K, V> {

	K key; // declare an key object of type K
	V value; // declare an value object of type V

	/**
	 * Pass two objects to constructor
	 * 
	 * @param key
	 *            : Key object
	 * @param val
	 *            : Value Object
	 */
	public DataPair(K key, V val) {
		this.key = key;
		value = val;
	}

	/**
	 * @return Key of Pair
	 */
	K getKey() {
		return key;
	}

	/**
	 * @return Value of Pair
	 */
	V getValue() {
		return value;
	}

	/**
	 * Show data type of pair objects
	 */
	void showType() {
		System.out.println("Type of K is " + key.getClass().getName());
		System.out.println("Type of V is " + value.getClass().getName());
	}

	public static void main(String[] args) {

		// Keep Account Information

		System.out.println("\nAccount Information");

		DataPair<String, Double> account = null;
		account = new DataPair<String, Double>("SBI-100", 20.5);

		account.showType(); // Show the type of data used by iOb.
		String accNum = account.getKey(); // type casting not required.
		double accBal = account.getValue();
		System.out.println(accNum + " : " + accBal);

		// Keep Marksheet Information

		System.out.println("\nMarksheet Information");

		DataPair<String, Integer> marksheet = null;
		marksheet = new DataPair<String, Integer>("RN_786", 98);

		marksheet.showType(); // Show the type of data used by iOb.
		String rollNo = marksheet.getKey();// type casting not required.
		int marks = marksheet.getValue();// type casting not required.
		System.out.println(rollNo + " : " + marks);

	}
}