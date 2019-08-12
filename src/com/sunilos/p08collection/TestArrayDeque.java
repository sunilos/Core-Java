package com.sunilos.p08collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

/**
 * Test the ArrayDeque implementation of Deque interface
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestArrayDeque {

	public static void main(String[] args) {

		Deque q = new ArrayDeque();

		// Add an element
		q.add("One");
		q.addFirst("Two");
		q.addLast("Three");

		// Examine top element
		Object ele = q.element();

		// Remove an element
		Object firstElement = q.remove();
		System.out.println(firstElement);

		firstElement = q.removeFirst();
		System.out.println(firstElement);

		Object lastElement = q.removeLast();
		System.out.println(lastElement);

		System.out.println(ele);

		// access via Iterator
		Iterator it = q.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
