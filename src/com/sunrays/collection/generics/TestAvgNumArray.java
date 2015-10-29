package com.sunrays.collection.generics;

/**
 * Test AveNumArray class.
 * 
 * @see AvgNumArray
 * 
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 */
public class TestAvgNumArray {

	public static void main(String[] args) {

		Integer numArray[] = { 1, 2, 3, 4, 5 };
		AvgNumArray<Integer> avgIntArray = new AvgNumArray<Integer>(numArray);

		double v = avgIntArray.average();
		System.out.println("Integers Array average is " + v);

		Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		AvgNumArray<Double> avgDoubleArray = new AvgNumArray<Double>(dnums);

		double w = avgDoubleArray.average();
		System.out.println("Double Array average is " + w);

		// Compilation Error in below statement
		// AvgNumArray<String> sArray = new AvgNumArray<Double>(dnums);

		if (avgIntArray.sameAvg(avgDoubleArray)) {
			System.out.println("Average are same");
		} else {
			System.out.println("Average is not same");
		}

	}

}
