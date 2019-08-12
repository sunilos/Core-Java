package com.sunilos.p09generics;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Define generic method to copy an Array elements into the Collection. We can
 * call this method with any kind of collection whose element type is a
 * supertype of the element type of the array.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
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

		Integer[] iArray = new Integer[100];
		Collection<Integer> iCol = new ArrayList<Integer>();
		copyArrayToCollection(iArray, iCol); // T inferred to be

		Float[] fArray = new Float[100];
		Collection<Float> fCol = new ArrayList<Float>();
		copyArrayToCollection(fArray, fCol); // T inferred to be
	}

	/**
	 * @param <T>
	 *            T could be any Data Type like String, Number, Float
	 * @param a
	 * @param c
	 */

	public static <T> void copyArrayToCollection(T[] a, Collection<T> c) {
		for (T o : a) {
			c.add(o); // CorrecT
		}
	}
}
