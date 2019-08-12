package com.sunilos.p14system;

import java.util.Properties;
import java.util.Set;

/**
 * This class uses System class to read System properties and print.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class ReadSystemProperties {

	public static void main(String[] args) {

		// Get All System Defined Properties
		Properties prop = System.getProperties();
		Set<Object> keySet = prop.keySet();

		for (Object o : keySet) {
			String key = (String) o;
			String val = prop.getProperty(key);
			System.out.println(key + "=" + val);
		}

		// Get Specific Property
		String country = System.getProperty("user.country");
		System.out.println(country);

		// Clear property example
		System.clearProperty("user.country");

		System.out.println(System.getProperty("user.country")); // print null

		// Set System property
		System.setProperty("user.country", "IN");
		country = System.getProperty("user.country");
		System.out.println(country); // prints "IN"

	}

}
