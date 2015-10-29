package com.sunrays.collection.generics;

/**
 * Example of bundled type. Class except parameter type of Number or its Child
 * classes.
 * 
 * @param <T> is Number or Child class type
 * 
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 */

public class AvgNumArray<T extends Number> {

	/**
	 * Array contains Number or its Child classes
	 */
	T[] nums = null;

	public AvgNumArray(T[] n) {
		nums = n;
	}

	/**
	 * Find Average of array.
	 * 
	 * @return
	 */
	double average() {
		double sum = 0.0;
		for (int i = 0; i < nums.length; i++)
			sum += nums[i].doubleValue();
		return sum / nums.length;
	}

	/**
	 * Determine if two averages are the same. It uses Wildcard mapping.
	 * 
	 * @param ob
	 * @return
	 */
	boolean sameAvg(AvgNumArray<?> ob) {
		if (average() == ob.average())
			return true;
		return false;
	}

}
