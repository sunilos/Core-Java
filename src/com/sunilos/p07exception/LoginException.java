package com.sunilos.p07exception;

/**
 * Custom checked exception class. It is checked because it inherits Exception
 * class.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class LoginException extends Exception {

	/**
	 * Default constructor
	 */
	public LoginException() {
		super("Invalide User ID/Password");
	}
}
