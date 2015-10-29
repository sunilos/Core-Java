package com.sunrays.collection.generics;

/**
 * Generic class specifies two type parameters K and V, separated by a comma
 * Because it has two type parameters, two type arguments must be passed to
 * DataPair when an object is created.
 * 
 * @param <K>
 *            Key Class
 * @param <V>
 *            Value Class
 * 
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 */

public class DataPair<K, V> {

	K key; // declare an key object of type K
	V value; // declare an value object of type V

	/**
	 * Pass two objects to constructor
	 * 
	 * @param key :
	 *            Key object
	 * @param val :
	 *            Value Object
	 */
	DataPair(K key, V val) {
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
}