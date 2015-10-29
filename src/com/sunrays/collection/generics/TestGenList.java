package com.sunrays.collection.generics;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class TestGenList {

	public static void main(String[] args) {

		// ArrayList will contain only String objects
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ram");
		names.add("Shyam");
		// name.add(new Integer (5)); //produce compilation Error

		// Type casting is not required when you get object from collection
		String value = names.get(1);
		System.out.println("Name # 1 " + value);

		// Iterator will contain only String Objects
		Iterator<String> it = names.iterator();

		System.out.println("Iterate Name List  ");
		while (it.hasNext()) {
			value = it.next();
			System.out.println(value);
		}
	}

}
