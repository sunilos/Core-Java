package com.sunrays.basic;

/**
 * Java training example source code developed by sunRays Technologies, Indore
 * Copyright (c) 2008 sunRays Technologies
 * @date 08/08/08
 * @version 1.0
 * @author sunRays Developer
 * 
 */

import java.util.ResourceBundle;

public class AccessData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ResourceBundle rb = ResourceBundle.getBundle("com.basic.messages");

		String db = rb.getString("database");

		getData(getDataBase(db));

	}

	public static Database getDataBase(String db) {

		System.out.println("***" + db + "****");

		if (db.equals("oracle")) {

			return new Oracle();

		} else if (db.equals("mysql")) {

			return new MySQL();
		} else {
			return null;
		}

	}

	public static void getData(Database db) {
		System.out.println(db.getData());

	}

}
