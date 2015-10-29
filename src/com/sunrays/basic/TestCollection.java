package com.sunrays.basic;

/**
 * Java training example source code developed by sunRays Technologies, Indore
 * Copyright (c) 2008 sunRays Technologies
 * @date 08/08/08
 * @version 1.0
 * @author sunRays Developer
 * 
 */

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;

/*
 * Test a collection ArrayList
 */
public class TestCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList ar = new ArrayList();
		ar.add("One");
		ar.add("Two");
		ar.add(new Rectangle());

		System.out.println("Second Element " + ar.get(1));

		Iterator it = ar.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		testHashMap(null);

	}

	public static void testHashMap(String[] args) {

		HashMap m = new HashMap();
		m.put("1", "One");
		m.put("2", "Two");
		m.put("3", "Three");

		System.out.println(" 2 = " + m.get("2"));

		Iterator it = m.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(key + " : " + m.get(key));
		}

	}
	
}
