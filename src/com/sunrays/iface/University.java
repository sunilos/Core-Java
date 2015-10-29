package com.sunrays.iface;

/**
 * Contains University attributes and implements DropDownList interface
 *
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 */

public class University implements DropDownList {

	private int code = 0;

	private String name = null;

	private String street = null;

	public University(int code, String name, String street) {
		this.code = code;
		this.name = name;
		this.street = street;

	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getKey() {
		String key = "" + code; 
		//String key = String.valueOf(code); 
 
		return key;
	}

	public String getValue() {
		String value = code + " - " + name;
		return value;
	}

}
