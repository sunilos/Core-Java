package com.sunilos.p08collection;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Test the TreeMap class
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestTreeMap {

	public static void main(String[] args) {

		TreeMap map = new TreeMap();

		// Add Elements
		map.put(1, "One");
		map.put(3, "Three");
		map.put(2, "Two");
		map.put(4, "Four");
		map.put(5, "Five");

		// Get a value and print
		String val = (String) map.get(1);
		System.out.println(val);

		// Remove a value
		map.remove(4);

		// //Collection Views

		// Get collection of Keys and print
		Set keys = map.keySet();
		for (Object k : keys) {
			System.out.println(k);
		}

		System.out.println("Iterartor");
		Iterator it = keys.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// Get collection of Values and print
		Collection vals = map.keySet();
		for (Object v : vals) {
			System.out.println(v);
		}

		// Print all key and value pairs
		for (Object k : map.keySet()) {
			System.out.println(k + " = " + map.get(k));
		}

		SortedMap m = Collections.synchronizedSortedMap(map);

	}
}
