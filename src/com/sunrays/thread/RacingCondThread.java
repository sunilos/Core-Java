package com.sunrays.thread;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class RacingCondThread extends Thread {
	
	public static Account data = new Account();
	
	private String name = null;

	public RacingCondThread(String name) {
		
		this.name = name;
	}
	
	public void run() {
		
		for(int i=0;i<5;i++){
			data.deposit(name, 1000);	
		}
		
	}
	
	public static void main(String[] args) {

		RacingCondThread user1 = new RacingCondThread("Dhoni");
		RacingCondThread user2 = new RacingCondThread("Yuvraj");
		
		user1.start();
		user2.start();

	}

}
