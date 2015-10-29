package com.sunrays.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class TestCollection {

	public static void main1(String[] args) {

		Vector v = new Vector();
		// ArrayList v = new ArrayList();

		v.add("Manish");
		v.add("Rajnish");
		v.add("Rakesh");

		Integer i = new Integer(5);
		v.add(i);

		Integer value = (Integer) v.get(3);

		System.out.println("3 value is " + value);

		/*
		 * for(int j =0; j < v.size(); j++){ System.out.println( j + " : " +
		 * v.get(j)); }
		 */
		Iterator it = v.iterator();

		Object val;
		int ind = 0;

		while (it.hasNext()) {

			val = it.next();
			System.out.println(ind + " : " + val);
			ind++;

		}
	}

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
		//HashMap h = new HashMap();
		
		h.put("One", "Praveen");
		h.put("Two", "Alok");
		h.put("Three", "Brajesh");
		

		String value = (String)h.get("Two");
		
		System.out.println("Two value is " + value);
		
		// Iterator and Enumaration both are same
		
		Enumeration e = h.keys();
		
		int ind = 0;
		String key= null;
		
		System.out.println("This is Hashtable");
		
		while(e.hasMoreElements()){
			
			key = (String)e.nextElement();
			value = (String)h.get(key);
			System.out.println(ind + " : " + key + "-" + value);
			ind++;
			
		}
		
		
		
		

	}
}
