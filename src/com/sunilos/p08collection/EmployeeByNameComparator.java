package com.sunilos.p08collection;

import java.util.Comparator;

/**
 * Compares two Employee Objects by the their lastName and firstName.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class EmployeeByNameComparator implements Comparator<Employee> {

	/**
	 * Compares Last Name and First name. Returns -1 when first Employee name is
	 * smaller, 0 if both are equals otherwise returns 1
	 */
	public int compare(Employee e1, Employee e2) {

		// Compare Last Name
		int i = e1.getLastName().compareTo(e2.getLastName());

		// If last name is equal then compare First Name
		if (i == 0) {
			i = e1.getFirstName().compareTo(e2.getFirstName());
		}
		return i;
	}
}
