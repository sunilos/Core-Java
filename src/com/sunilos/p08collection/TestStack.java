package com.sunilos.p08collection;

import java.util.Stack;

/**
 * Test the Stack class
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestStack {

	public static void main(String[] args) {

		// Create a stack
		Stack stack = new Stack();

		// Push elements into stack
		stack.push("1");
		stack.push("2");
		stack.push("3");

		// Gets top object ("3"), without removing it from stack
		Object objTop = stack.peek();
		System.out.println(objTop);

		// Gets top object ("3"), and remove it from stack
		Object obj3 = stack.pop();
		System.out.println(obj3);

		// Gets top object ("2"), and remove it from stack
		Object obj2 = stack.pop();
		System.out.println(obj2);

		// Gets top object ("1"), and remove it from stack
		Object obj1 = stack.pop();
		System.out.println(obj1);
	}
}
