package com.sunrays.collection.generics;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Define genetic method to copy an Array elements into the Collection. We can
 * call this method with any kind of collection whose element type is a
 * supertype of the element type of the array.
 * 
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 */
public class GenericMethods {

	public static void main(String[] args) {

		Object[] objectArray = new Object[100];
		Collection<Object> objectList = new ArrayList<Object>();
		copyArrayToCollection(objectArray, objectList); // T inferred to be
		// Object

		String[] strArray = new String[100];

		Collection<String> strCollection = new ArrayList<String>();
		copyArrayToCollection(strArray, strCollection); // T inferred to be
		// String
		copyArrayToCollection(strArray, objectList); // T inferred to be
		// Object

		Integer[] intArray = new Integer[100];
		Float[] floatArray = new Float[100];
		Number[] numberArray = new Number[100];

		Collection<Number> numCollection = new ArrayList<Number>();
		copyArrayToCollection(intArray, numCollection); // T inferred to be
		// Number
		copyArrayToCollection(floatArray, numCollection); // T inferred to be
		// Number
		copyArrayToCollection(numberArray, numCollection); // T inferred to be
		// Number
		copyArrayToCollection(numberArray, objectList); // T inferred to be
		// Object

		// fromArrayToCollection(numberArray, strCollection); // compile-time
		// error
	}

	/**
	 * @param <T> T could be any Data Type like String, Number, Float
	 * @param a
	 * @param c
	 */

	public static <T> void copyArrayToCollection(T[] a, Collection<T> c) {
		for (T o : a) {
			c.add(o); // CorrecT
		}
	}

}
