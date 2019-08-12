package com.sunilos.p08collection;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Test the SortedSet interface
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestSortedSet {

	public static void main(String[] args) {

		SortedSet s = new TreeSet();
		s.add("One");
		s.add("Two");
		s.add("Three");

		// Elements are automatically sorted in ascending order.
		for (Object ele : s) {
			System.out.print(ele);
		}

		System.out.println();

		// get first element (One)
		System.out.println(s.first());

		// get last element (Two)
		System.out.println(s.last());

		/**
		 * Output
		 * 
		 * OneThreeTwo One Two
		 */
	}
}
