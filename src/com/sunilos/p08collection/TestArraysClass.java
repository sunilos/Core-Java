package com.sunilos.p08collection;

import java.util.Arrays;
import java.util.List;

/**
 * Test the key methods Arrays class
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestArraysClass {
	public static void main(String[] args) {

		String[] players = { "Dhoni", "Zahir", "Yuvraj", "Sachin" };

		String[] playersTwo = { "Dhoni", "Zahir", "Yuvraj", "Sachin" };

		System.out.println("Actual array ");
		for (String player : players) {
			System.out.println(player);
		}

		// Search an element
		int ind = Arrays.binarySearch(players, "Zahir");
		System.out.println("\nIndex # of \"Zahir\" is " + ind);

		// Compare arrays
		System.out.println(players.equals(playersTwo));

		// Sort an array
		Arrays.sort(players);
		System.out.println("\nSorted array ");
		for (String player : players) {
			System.out.println(player);
		}

		// Convert array to String
		String pString = Arrays.toString(players);
		System.out.println("\nCoverted String " + pString);

		// Convert array to a list
		List l = Arrays.asList(players);
		System.out.println("\nConverted List " + l);
	}

}
