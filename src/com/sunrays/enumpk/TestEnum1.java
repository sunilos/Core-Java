package com.sunrays.enumpk;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */

public class TestEnum1 {

	public static void main(String[] args) {

		Day[] ds = Day.values();
		
		for (int i = 0; i < ds.length; i++) {
			System.out.println(ds[i]);
			System.out.println(ds[i].getWeekDay());
		}
		
		
	}

}
