package com.sunrays.oop;

/**
 * Tests the person class
 * 
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 */

public class TestPerson {

	public static void main(String[] args) {

		System.out.println("$$Calling Person Class 3 Param Constructor");

		Person p = new Person("Savita", "Saluja", "Indore");

		System.out.println(" First Name " + p.getFirstName());

		System.out.println(" Last Name " + p.getLastName());

		System.out.println(" Address is " + p.getAddress());

		System.out.println("__________________________________ ");

		System.out.println("$$Calling Employee Class 3 Param Constructor");

		Employee e = new Employee("Nakul", "Shukla", "CEO");

		System.out.println(" First Name " + e.getFirstName());

		System.out.println(" Last Name " + e.getLastName());

		System.out.println(" Designation " + e.getDesignaiton());

		System.out.println("__________________________________ ");

		// Test overridden method

		System.out.println("$$Calling Person Class default Constructor");

		Person p1 = new Person();

		System.out.println("\n\n$$Calling Employee Class default Constructor");
		Person p2 = new Employee();

		p1.changeAddress();
		p2.changeAddress();

	}
}
