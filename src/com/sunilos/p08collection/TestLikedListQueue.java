package com.sunilos.p08collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Test the LinkedList implementation of Queue interface
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestLikedListQueue {

	public static void main(String[] args) {

		Queue q = new LinkedList();

		// Add an element
		q.add("One");
		q.add("Two");
		q.add("Three");
		q.add("Four");
		q.add("Five");
		q.add("Six");
		q.add("Seven");

		// Examine top element
		Object ele = q.element();

		// Remove an element
		ele = q.remove();

		System.out.println(ele);

		// print all elements using Iterator. It does maintain insertion order
		// of elements
		Iterator it = q.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
