package com.sunrays.thread;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class HelloWithRunnableThread extends Object implements Runnable  {

	String name = null;
	public HelloWithRunnableThread(String threadName) {
		
		name = threadName;
	}

	public void run() { // TODO Auto-generated method stub
		try{
		for (int i = 0; i < 50; i++) {
			System.out.println(i + " Hello Runnable Thread " + name);
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
