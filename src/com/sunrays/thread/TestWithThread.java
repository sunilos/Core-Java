package com.sunrays.thread;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class TestWithThread {

	public static void main(String[] args) {

		HelloWithThread t1 = new HelloWithThread("Dhoni");
		
		//Thread t1 = new Thread(new HelloWithRunnableThread("One"));
		//t1.setPriority(1);

		HelloWithThread t2 = new HelloWithThread("Yuvraj");

		//Thread t2 = new Thread(new HelloWithRunnableThread("Two"));
		//t2.setPriority(6);

		t1.start();
		t2.start();
		
		for (int i = 0; i < 500; i++) {
			System.out.println(i + " This is Main");
		}

	}

}
