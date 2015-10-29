package com.sunrays.collection.generics;

/**
 * Test MaxMinArrays class that implements Generic Interface.
 * 
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 * 
 */
public class TestMinMaxArray {

	public static void main(String[] args) {

		Integer numArray[] = { 3, 6, 2, 8, 6 };
		Character chrArray[] = { 'b', 'r', 'p', 'w' };

		// Object initialized by Number Array
		MinMaxArray<Integer> numObj = new MinMaxArray<Integer>(numArray);

		System.out.println("Max val: " + numObj.max());
		System.out.println("Min Val: " + numObj.min());

		// Object initialized by Character Array
		MinMaxArray<Character> chrObj = new MinMaxArray<Character>(chrArray);

		System.out.println("Max val: " + chrObj.max());
		System.out.println("Min Val: " + chrObj.min());

	}

}
