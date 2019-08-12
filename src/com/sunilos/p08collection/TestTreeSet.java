package com.sunilos.p08collection;

/**
 * Test the TreeSet class
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {

		TreeSet s = new TreeSet();
		s.add("Zero");
		s.add("One");
		s.add("Two");
		s.add("Three");
		//s.add("Five");

		// Print all elements using Iterator
		System.out.println("\nElements printed by Iterator");
		Iterator it = s.iterator();
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.println(str);
		}

	}
}
