package com.sunilos.p08collection;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Tests Marksheet collection and sort it by natural ordering (Comparable) and
 * on different attributes by Comparator.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestMarksheetSorting {

	public static void main(String[] args) {

		// Create Marksheet List
		ArrayList marksheets = new ArrayList();

		// Add marksheets
		marksheets.add(new Marksheet("A2", "Suraj", 90));
		marksheets.add(new Marksheet("A3", "Ankush", 80));
		marksheets.add(new Marksheet("A1", "Saurabh", 95));
		marksheets.add(new Marksheet("A5", "Rishi", 89));
		marksheets.add(new Marksheet("A4", "Zuber", 89));
		marksheets.add(new Marksheet("A0", "Amit", 91));

		// Print all elements of list
		System.out.println("**Actual List**");
		for (Object o : marksheets) {
			System.out.println(o);
		}

		// Sort elements in natural order using Comparable.
		Collections.sort(marksheets);

		// Print all elements
		System.out.println("\n**Sorted List Natural Ordering**");
		for (Object o : marksheets) {
			System.out.println(o);
		}

		// Sort elements by Name in ascending order using Comparator
		OrderByName cName = new OrderByName();
		Collections.sort(marksheets, cName);

		System.out.println("\n**Sorted By Name Comparator**");
		for (Object o : marksheets) {
			System.out.println(o);
		}

		// Sort elements by Name in descending order using Comparator
		OrderByNameDesc cDecName = new OrderByNameDesc();
		Collections.sort(marksheets, cDecName);

		System.out.println("\n**Sorted By desc Name Comparator**");
		for (Object o : marksheets) {
			System.out.println(o);
		}

		// Sort elements by Marks in descending order using Comparator
		OrderByMarksDesc cMarks = new OrderByMarksDesc();
		Collections.sort(marksheets, cMarks);

		System.out.println("\n**Sorted By desc Marks Comparator**");
		for (Object o : marksheets) {
			System.out.println(o);
		}

	}

}
