package com.sunrays.operator;

import java.util.Collections;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class TestOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a =  5 + 10 * 3;
		System.out.println("5 + 10 * 3 = " + a);
		
		int i= 1;
		
		System.out.println(i++ + " - " + i++ + " - " + i++);
		
		i = 1;
		System.out.println(++i + " - " + ++i + " - " + ++i);
		
		//Integer Arithmetic
		
		int k= 25; 
		int j = 10;
		
		float f = k/ (float)j;
		
		System.out.println(" f= " + f);
		
		

	}

}
