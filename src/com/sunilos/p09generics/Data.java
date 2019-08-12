package com.sunilos.p09generics;

/**
 * A simple generic class that holds any Class of data, T is a type parameter
 * that will be replaced by a real type when an object of type Data is created.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class Data<T> {

	// declare an object of type T
	T value;

	// pass the parameter of type T.
	public Data(T val) {
		value = val;
	}

	/**
	 * @return Object
	 */
	T getValue() {
		return value;
	}

	/**
	 * Show data type of stored object
	 */
	void showType() {
		System.out.println("Type of T is " + value.getClass().getName());
	}

	public static void main(String[] args) {

		// Create a Data<Integer> object and assign Integer value 786.
		System.out.println("\nInteger Data Type ");
		Data<Integer> i = new Data<Integer>(786);

		i.showType(); // Show the type of data used by iOb.
		int v = i.getValue(); // No type cast is required.
		System.out.println("Value: " + v);

		// Create a Data object for Strings.
		System.out.println("\nString Data Type ");
		Data<String> str = new Data<String>("Vijay");
		str.showType(); // Show Type
		String val = str.getValue(); // No type cast
		System.out.println("value: " + val);

		// Raw Type : If do not pass type parameter
		Data rawData = new Data("Ram");
		val = (String) rawData.getValue(); // type casting required
		System.out.println("\nRaw Type Value: " + val);

	}

}