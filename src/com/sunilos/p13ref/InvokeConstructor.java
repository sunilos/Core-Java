package com.sunilos.p13ref;

import java.lang.reflect.Constructor;
import java.util.Date;

import com.sunilos.p06oop.Person;

/**
 * Creates an instance using constructor. Constructor is invoked by reflection
 * API.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class InvokeConstructor {

	public static void main(String[] args) throws Exception {

		// Create instance
		Class c = Class.forName("com.sunilbooks.selflearnjava.oop.Person");

		// get constructor with specific name and parameters
		Constructor oneCunst = c.getConstructor(String.class, String.class,
				Date.class);

		// Create instance using constructor
		Person p = (Person) oneCunst.newInstance("Abhay", "Sadar Bazar",
				new Date());

		System.out.println("Class Name : " + c.getName());
		System.out.println();
		System.out.println("Person Information");
		System.out.println("Name : " + p.getName());
		System.out.println("Address : " + p.getAddress());
		System.out.println("Date : " + p.getDateOfBirth());

	}
}
