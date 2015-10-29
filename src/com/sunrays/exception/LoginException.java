package com.sunrays.exception;

public class LoginException extends Exception {
	public LoginException() {
		super("User Not Found");
	}
}
