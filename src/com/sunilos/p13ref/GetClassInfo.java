package com.sunilos.p13ref;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;

import com.sunilos.p06oop.Person;

/**
 * Create instance of a class using reflection API and print the class
 * information.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class GetClassInfo {

	public static void main(String[] args) throws Exception {

		// Returns in class object
		Class c = Class.forName("com.sunilbooks.selflearnjava.oop.Person");

		// Create instance
		Person person = (Person) c.newInstance();

		// Set person information
		person.setName("Abhay");
		person.setAddress("Sadar Bazar");
		person.setDateOfBirth(new Date());

		// Print class details
		System.out.println("Class Information");
		System.out.println("\tName:" + c.getName());
		System.out.println("\tPackage:" + c.getPackage());
		System.out.println();

		// get field information
		Field[] fields = c.getFields();
		System.out.println("Field information");

		// Iterate all fields
		for (Field f : fields) {
			System.out.println("\tName:" + f.getName());
			System.out.println("\tType:" + f.getType());
		}
		System.out.println();

		// get class constructors
		Constructor[] ctrs = c.getConstructors();
		System.out.println("Constructor information");

		// Iterate all constructors
		for (Constructor ctr : ctrs) {
			System.out.println("\tName:" + ctr.getName());
			Class[] params = ctr.getParameterTypes();
			if (params.length > 0) {
				System.out.println("\tConstructor Parameter Types");
				for (Class p : params) {
					System.out.println("\t\t" + p.getName());
				}
			}
			System.out.println();
		}

		// Get class methods
		Method[] methods = c.getMethods();
		System.out.println("Method information");
		// Iterate all methods
		for (Method m : methods) {
			System.out.println("\tName:" + m.getName());
			System.out.println("\tReturn Type:" + m.getReturnType());
			Class[] params = m.getParameterTypes();
			if (params.length > 0) {
				System.out.println("\tMethod Parameter Types");
				for (Class p : params) {
					System.out.println("\t\t" + p.getName());
				}
			}
			System.out.println();
		}

	}
}
