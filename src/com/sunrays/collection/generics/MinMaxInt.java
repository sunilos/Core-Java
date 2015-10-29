package com.sunrays.collection.generics;

/**
 * Generic interface
 *
 * @param <T> Class type must implement Comparable interface.
 * 
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 * 
 */
public interface MinMaxInt<T extends Comparable<T>> {
	T min();
	T max();
}
 