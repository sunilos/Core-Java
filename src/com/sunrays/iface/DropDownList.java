package com.sunrays.iface;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 *
 */

/**
 * Contains Dropdown list interface methods. City, University implements this
 * inteface to make a drop down list
 * 
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 */

public interface DropDownList {

	/**
	 * Key of the List
	 * 
	 * @return
	 */
	public String getKey();

	/**
	 * Value of the List
	 * 
	 * @return
	 */
	public String getValue();

}
