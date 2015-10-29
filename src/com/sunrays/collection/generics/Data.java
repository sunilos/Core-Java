package com.sunrays.collection.generics;

/**
 * A simple generic class that holds any Class of data, T is a type parameter
 * that will be replaced by a real type when an object of type Data is created.
 * 
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 */

public class Data<T> {

	T ob; // declare an object of type T

	// Pass the constructor a reference to an object of type T.
	Data(T o) {
		ob = o;
	}

	/**
	 * @return Object
	 */
	T getob() {
		return ob;
	}

	/**
	 * Show data type of stored object
	 */
	void showType() {
		System.out.println("Type of T is " + ob.getClass().getName());
	}
}