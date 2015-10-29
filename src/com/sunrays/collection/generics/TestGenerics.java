package com.sunrays.collection.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Generics - Pass Data Type of a Collection to Compiler
 * 
 * 
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 * 
 */

public class TestGenerics {

	public static void main(String[] args) {

		// ArrayList will contain only String objects
		ArrayList<String> name = new ArrayList<String>();
		name.add("Ram");
		name.add("Shyam");
		name.add("Hira");
		name.add("Moti");
		// name.add(new Integer (5)); //Compilation Error

		// Type casting is not required when you get object from collection
		String value = name.get(2);
		System.out.println("Name # 3 " + value);

		// Iterator will contain only String Objects
		Iterator<String> it = name.iterator();

		System.out.println("\n\nIterate Name List  ");
		while (it.hasNext()) {
			value = it.next();
			System.out.println(value);
		}

		// HashMap will Roll No. <String> and Marks <Integer>
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("ROLL_NO_1", 100);
		map.put("ROLL_NO_2", 200);
		map.put("ROLL_NO_3", 300);

		int val = map.get("ROLL_NO_1");

		System.out.println("map.get(A1)" + val);
	}

}
