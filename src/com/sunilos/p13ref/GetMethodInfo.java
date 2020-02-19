package com.sunilos.p13ref;

import java.lang.reflect.Method;

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

public class GetMethodInfo {

	public static void main(String[] args) throws Exception {

		// Create instance
		Person person = new Person();
		Class c = person.getClass();

		// Get all methods information
		Method[] methods = c.getMethods();

		System.out.println("Class : " + c.getName());

		System.out.println("Method information");
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

		System.out.println("Exclude Parent Methods");

		methods = c.getDeclaredMethods();

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
