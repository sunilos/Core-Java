package com.sunrays.io;

import java.util.StringTokenizer;

/*
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 * 
 */

public class WordCount {

	public static void main(String[] args) {

		String str = "sunRays,sunRays,sunRays,sunRays,sunRays";

		StringTokenizer stn = new StringTokenizer(str, ",");

		String token = null;

		int count = 0;

		while (stn.hasMoreElements()) {
			token = stn.nextToken();
			if ("sunRays".equals(token)) {
				count++;
			}
		}
		System.out.println("Word Count for Sunil is " + count);
	}

}
