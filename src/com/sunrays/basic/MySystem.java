package com.sunrays.basic;

/**
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 * 
 */

public class MySystem {
	
	/**
	 * Launch and native application notepad.exe
	 * @param args
	 * @throws Exception
	 */
	
	public static void main(String[] args)throws Exception{
		Runtime.getRuntime().exec("notepad.exe");
	}

}
