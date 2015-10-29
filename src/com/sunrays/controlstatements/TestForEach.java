package com.sunrays.controlstatements;

import java.util.ArrayList;
import java.util.List;

public class TestForEach {
	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// Iterate array elements
		for (int n : numbers) {
			System.out.println(n);
		}

		//Create a List
		List<String> names = new ArrayList();
		
		//Add Elements 
		names.add("Jay");
		names.add("Vijay");
		names.add("Abhay");

		//Display all elements 
		for (String n : names) {
			System.out.println(n);
		}

	}
}
