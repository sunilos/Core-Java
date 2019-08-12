package com.sunilos.p08collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * Test the Vector class
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestVector {

	public static void main(String[] args) {

		Vector l = new Vector();
		l.add("Zero"); // Index# 0
		l.add("One");// Index# 1
		l.add("Two");// Index# 2
		l.add("Three");// Index# 3
		l.add("Five");// Index# 4

		// Get length of array
		int size = l.size();
		System.out.println("Length of Vector : " + size);
		// Insert "Four" at Index # 4, element "Five" will be moved to Index #
		// 5"
		l.add(4, "Four");

		// Replace "Two with Twoooo"
		l.set(2, "Twoooo");

		// Remove element "Zero"
		l.remove(0);

		// Get 2nd element of array by index # 1
		System.out.println("\n2nd Element of Vector ");
		String val = (String) l.get(1);
		System.out.println(val);

		// Print all elements of array
		System.out.println("\nElements printed by for loop");
		for (Object ele : l) {
			String str = (String) ele;
			System.out.println(str);
		}

		// Print all elements using Iterator
		System.out.println("\nElements printed by Iterator");
		Iterator it = l.iterator();
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.println(str);
		}

		// Print all elements by enumerator
		System.out.println("\nElements printed by Enumerator");
		Enumeration en = l.elements();
		while (en.hasMoreElements()) {
			String str = (String) en.nextElement();
			System.out.println(str);
		}

		// Sort the list elements
		Collections.sort(l);
		System.out.println("\nSorted List Elements");
		for (Object ele : l) {
			String str = (String) ele;
			System.out.println(str);
		}

		// Convert Vector to array

		System.out.println("\nElements of converted array[]");
		Object[] nums = l.toArray();
		for (Object n : nums) {
			System.out.println(n);
		}

		// Get sublist, extract two elements
		// index #1 and #2 from list l
		System.out.println("\nElements of sublist");
		Vector subList = new Vector(l.subList(1, 3));
		System.out.println(subList);

	}
}
