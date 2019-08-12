package com.sunilos.p08collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

/**
 * Test the generic collections
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestGenericCollection {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Ram"); // Correct
		names.add("Shyam"); // Correct
		names.add("Krishn"); // Correct
		// name.add(5); // will cause compilation Error

		// No typecasting is required to get an object
		String val = names.get(1);
		System.out.println("Index#1 value is " + val);

		// Other collections using generic data type

		// Sets
		Set<String> s = new HashSet<String>();
		s.add("One");
		s.add("Two");
		s.add("Three");

		System.out.println("\nSet elements");
		Iterator<String> it = s.iterator();
		while (it.hasNext()) {
			String sVal = it.next();
			System.out.println("Value is " + sVal);
		}

		TreeSet<String> ts = new TreeSet<String>();

		// Lists
		ArrayList<String> a = new ArrayList<String>();
		a.add("One");
		a.add("Two");
		a.add("Three");

		System.out.println("\nList elements");
		for (String sVal : a) {
			System.out.println("Value is " + sVal);
		}

		Vector<String> v = new Vector<String>();
		Enumeration<String> e = v.elements();

		// Queues
		Queue<String> q = new LinkedList<String>();

		// Maps
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("AC#1", 1000);
		map.put("AC#2", 2000);
		map.put("AC#3", 3000);

		int balance = map.get("AC#2");
		System.out.println("Balance of AC#2 is " + balance);

		Hashtable<String, Integer> mapTable = new Hashtable<String, Integer>();

	}
}
