package com.sunilos.p01basics;

/**
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 * 
 */

public class Division1 {

	public static void main(String[] args) {
		
		if(args.length < 2){
			System.out.println("USAGE : java -cp <bin path> com.basic.Division1 <n1> <n2>");
			return;
		}

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		double div = a/b;

		System.out.println("Division is " + div);
	}
}
