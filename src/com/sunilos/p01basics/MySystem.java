package com.sunilos.p01basics;

/**
 * Program to Launch and native application notepad.exe  
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
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
