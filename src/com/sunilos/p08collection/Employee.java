package com.sunilos.p08collection;

/**
 * A Java bean that contains Employee attributes and methods
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class Employee {

	private int employeeId;
	private String firstName;
	private String lastName;

	/**
	 * Default constructor
	 */
	public Employee() {
	}

	/**
	 * Parameterized constructor
	 * 
	 * @param employeeId
	 * @param firstName
	 * @param lastName
	 */
	public Employee(int employeeId, String firstName, String lastName) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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

	@Override
	public String toString() {
		return employeeId + "," + lastName + "," + firstName;
	}

	/**
	 * compares two Employee objects by employee id
	 */
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (!(o instanceof Employee))
			return false;
		Employee other = (Employee) o;

		return this.employeeId == other.employeeId;
	}

	/**
	 * Employee ID is become hashcode to uniquely identify object in a Map
	 */
	@Override
	public int hashCode() {
		return employeeId;
	}

}
