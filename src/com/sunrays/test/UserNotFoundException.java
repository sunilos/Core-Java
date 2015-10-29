package com.sunrays.test;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class UserNotFoundException extends Exception{
	public UserNotFoundException(){
		super("User nahi mila");
	}

}
