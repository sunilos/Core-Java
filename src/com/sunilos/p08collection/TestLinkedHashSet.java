package com.sunilos.p08collection;

/**
 * Test the LinkedHashSet class
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {

		LinkedHashSet s = new LinkedHashSet();
		s.add("Zero");
		s.add("One");
		s.add("Two");
		s.add("Three");
		s.add("Five");

		// Print all elements using Iterator
		System.out.println("\nElements printed by Iterator");
		Iterator it = s.iterator();
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.println(str);
		}

	}
}
