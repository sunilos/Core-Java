package com.sunrays.oop;

/**
 * Contains Person attributes and overloaded constructors to initialize
 * attributes.
 * 
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 */
public class Person {

	protected String firstName = null;

	protected String lastName = null;

	protected String address = null;

	protected String dob = null;

	private static int AVE_AGE = 60;

	public Person() {
		System.out.println("***Person Default Constructor");
	}

	/**
	 * Parameterized constructor
	 * 
	 * @param fn
	 * @param ln
	 */
	public Person(String fn, String ln) {

		System.out.println("***Person 2 param constructor");

		firstName = fn;
		lastName = ln;
	}

	/**
	 * Parameterized constructor
	 * 
	 * @param fn
	 * @param ln
	 * @param address
	 */
	public Person(String fn, String ln, String address) {

		this(fn, ln);

		this.address = address;

		System.out.println("***Person 3 param constructor");
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void changeAddress() {
		System.out.println("Person ka change Address");
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

}
