package com.sunrays.collection.generics;

/**
 * Test Generic class DataPair. It creates two DataPair objects 
 * one holds Account info and
 * second holds Marksheet info
 * 
 * @see DataPair
 *
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 */

public class TestDataPair {

	public static void main(String[] args) {

		// Keep Account Information
		DataPair<String, Double> account = null;
		account = new DataPair<String, Double>("SBI-100", 20.5);

		System.out.println("Account Information");
		account.showType(); // Show the type of data used by iOb.
		String accNum = account.getKey(); // No type cast is required.
		double accBal = account.getValue();
		System.out.println(accNum + " : " + accBal);

		// Keep Marksheet Information
		DataPair<String, Integer> marksheet = null;
		marksheet = new DataPair<String, Integer>("RN_786", 98);

		System.out.println("Marksheet Information");
		marksheet.showType(); // Show the type of data used by iOb.
		String rollNo = marksheet.getKey();
		int marks = marksheet.getValue();

		System.out.println(rollNo + " : " + marks);

	}
}
