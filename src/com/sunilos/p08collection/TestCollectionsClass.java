package com.sunilos.p08collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Test the Collections class and its utility methods for 1. Copy collections 2.
 * Search collections 3. Sort collections 4. Reverse Collections 5. Create empty
 * collections 6. Shuffle collections 7. Synchronize collections
 * 
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */

public class TestCollectionsClass {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		a.add("Zero");
		a.add("One");
		a.add("Two");
		a.add("Three");
		a.add("Four");
		a.add("Five");

		// // Copy collection
		ArrayList toList = new ArrayList(10);
		toList.add("0");
		toList.add("1");
		toList.add("2");
		toList.add("3");
		toList.add("4");
		toList.add("5");

		Collections.copy(toList, a);
		System.out.println("Copied List : " + toList);

		// // Search an elements
		int ind = Collections.binarySearch(a, "Two");
		System.out.println("Index of element \"Two\" is " + ind);

		// // Sort a collection elements
		Collections.sort(a);
		System.out.println("Sorted List : " + a);

		ArrayList employeesList = new ArrayList();
		employeesList.add(new Employee(1, "Sandeep", "Vishwakarma"));
		employeesList.add(new Employee(2, "Karan", "Sahu"));
		employeesList.add(new Employee(3, "Prachi", "Pacharne"));
		employeesList.add(new Employee(4, "Ashish", "Gupta"));
		employeesList.add(new Employee(5, "Ranu", "Gupta"));
		employeesList.add(new Employee(6, "Rahul", "Sahu"));

		// Sort collection of employee objects using comparator
		EmployeeByNameComparator empComp = new EmployeeByNameComparator();
		Collections.sort(employeesList, empComp);
		System.out.println("Sorted List By Conparator : " + employeesList);

		// // reverse a collection elements
		Collections.reverse(a);
		System.out.println("Reversed List : " + a);

		// // Create Empty collections
		Enumeration e = Collections.emptyEnumeration();
		Iterator it = Collections.emptyIterator();
		List lt = Collections.emptyList();
		Set st = Collections.emptySet();
		Map mp = Collections.emptyMap();

		// // Shuffle collection
		Collections.shuffle(a);
		System.out.println("Shuffled List : " + a);

		// // Synchronize Collections
		// Sync a collection
		Collection c = Collections.synchronizedCollection(new ArrayList());

		// Synchronize List
		ArrayList al = new ArrayList();
		List l = Collections.synchronizedList(al);

		// Synchronize Set
		HashSet hs = new HashSet();
		Set s = Collections.synchronizedSet(hs);

		TreeSet ts = new TreeSet();
		SortedSet ss = Collections.synchronizedSortedSet(ts);

		// Synchronize Map
		HashMap hm = new HashMap();
		Map m = Collections.synchronizedMap(hm);

		TreeMap tm = new TreeMap();
		SortedMap sm = Collections.synchronizedSortedMap(tm);

	}

}
