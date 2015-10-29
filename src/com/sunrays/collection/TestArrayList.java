package com.sunrays.collection;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.*;

public class TestArrayList {

	public static void main1(String[] args) {
		
		//Vector v = new Vector();
		ArrayList v = new ArrayList();
		v.add("Manish");
		v.add("Rajnish");
		v.add("Rakesh");

		Object o = v.get(0);

		Integer i = new Integer(5);
		v.add(i);

		Integer value = (Integer) v.get(3);

		System.out.println("3 value is " + value);

		for (int j = 0; j < v.size(); j++) {
			System.out.println(j + " : " + v.get(j));
		}
		
		Iterator it = v.iterator();
		while(it.hasNext()){
			Object oo = it.next();
			System.out.println(" From It -- " +oo);
		}
		
	}

	public static void main(String[] args) {

		Hashtable h = new Hashtable();
		//HashMap h = new HashMap();

		h.put("One", "Praveen");
		h.put("Two", new Integer(786));
		h.put("Three", "Brajesh");

		Integer value = (Integer) h.get("Two");

		System.out.println("Two value is " + value);
		
		Set keys = h.keySet();
		
		Iterator it = keys.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		Collection  c = h.values();
		it = c.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		System.out.println("---Enumeration --- ");
		
		Enumeration e = h.keys();//Hashtable
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		
		
	}
}
