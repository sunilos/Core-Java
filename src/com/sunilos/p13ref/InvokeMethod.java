package com.sunilos.p13ref;

import java.lang.reflect.Method;
import java.util.Date;

import com.sunilos.p06oop.Person;

/**
 * Invokes methods to set and get values using reflection API
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class InvokeMethod {

	public static void main(String[] args) throws Exception {

		// Create instance
		Person person = new Person();
		Class c = person.getClass();
		System.out.println("Class Name : " + c.getName());

		// Call setter method by reflection API

		// get method with specific name and parameters
		Method oneMethod = c.getMethod("setName", String.class);
		// Set Name
		oneMethod.invoke(person, "Abhay");

		// Set Address
		oneMethod = c.getMethod("setAddress", String.class);
		oneMethod.invoke(person, "Sadar Bazar");

		// Set Date of Birth
		oneMethod = c.getMethod("setDateOfBirth", Date.class);
		oneMethod.invoke(person, new Date());

		// gets all methods, exclude parent methods
		Method[] methods = c.getDeclaredMethods();

		// Call all Get methods
		String name = null;
		for (Method m : methods) {
			name = m.getName();
			if (name.startsWith("get")) {
				Object o = m.invoke(person, null);
				System.out.println(name + "=" + o);
			}
		}

	}
}
