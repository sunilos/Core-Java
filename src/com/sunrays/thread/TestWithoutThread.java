package com.sunrays.thread;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class TestWithoutThread {

	public static void main(String[] args) {

		HelloWithoutThread t1 = new HelloWithoutThread("1");

		t1.run();

		HelloWithoutThread t2 = new HelloWithoutThread("2");

		t2.run();

	}

}
