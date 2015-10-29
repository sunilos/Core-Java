package com.sunrays.collection;

import java.util.HashMap;

import com.sunrays.inheritance.Employee;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class TestIndex {

	public static void main(String[] args) {

		HashMap indexList = new HashMap();

		indexList.put("1", "One");
		indexList.put("2", "Two");
		indexList.put("3", "Three");
		indexList.put("4", "Four");
		indexList.put("5", "Five");
		
		Employee e = new Employee("Nakul","Shukla","****");
		
		indexList.put("6", e);

		String value = (String) indexList.get("5");
		
		Employee e1 = (Employee)indexList.get("6");
		

		System.out.println(value);
		System.out.println(e1.getFirstName());
		

	}

}
