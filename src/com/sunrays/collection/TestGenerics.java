package com.sunrays.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class TestGenerics {

	public static void main1(String[] args) {

		ArrayList<String> l = new ArrayList<String>();
		l.add("One");
		l.add("Two");
		l.add("Three");
		l.add("Four");
		l.add("Five");

		Iterator<String> it = l.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}

	public static void main(String[] args) {

		ArrayList<String> l = new ArrayList<String>();
		l.add("One");
		l.add("Two");
		l.add("Three");
		l.add("Four");
		l.add("Five");
		String str = l.get(2);
		System.out.println(str);
		
		
		Iterator<String> it = l.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());

		}
		
		HashMap<String,Integer> map 
		= new HashMap<String,Integer>();
		

	}	
	
}
