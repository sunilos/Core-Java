package com.sunilos.p06oop;

import java.util.Date;

/**
 * Person expert class containing related attributes and methods.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class Person {

	private String name = null;
	private String address = null;
	private Date dateOfBirth = null;

	public static final int AVERAGE_AGE = 60;

	/**
	 * Default constructor
	 */
	public Person() {
	}

	/**
	 * Parameterized constructor
	 * 
	 * @param name
	 * @param address
	 */

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	/**
	 * Parameterized constructor
	 * 
	 * @param name
	 * @param address
	 * @param dateOfBirth
	 */
	public Person(String name, String address, Date d) {
		this.name = name;
		this.address = address;
		this.dateOfBirth = d;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
