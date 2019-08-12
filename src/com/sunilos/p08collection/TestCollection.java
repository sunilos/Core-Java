package com.sunilos.p08collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Tests a collection creation, add elements and iterate all the elements.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestCollection {

	public static void main(String[] args) {

		// Creates a collection of ArrayList type
		Collection c = new ArrayList();

		// Add elements into Collection
		c.add("Bura mat Dekho"); // Index# 0
		c.add("Bura mat Suno");// Index# 1
		c.add("Bura mat Kaho");// Index# 2

		System.out.println("Length Of Collection: " + c.size());

		// Print all elements of Collection using foreach statement
		System.out.println("\nElements of Collection ");
		for (Object ele : c) {
			System.out.println(ele);
		}

		// Convert collection into array
		Object[] oArray = c.toArray();

		System.out.println("\nElements of Coneverted Array");

		// Print all elements of array using foreach statement
		for (Object ele : oArray) {
			String s = (String) ele;
			System.out.println(s);
		}

	}

}
