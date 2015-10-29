package com.sunrays.system;

import java.util.Map;
import java.util.Set;

/**
 * This class uses System class to read OS environment variables and print.
 * 
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 */

public class ReadSystemEnvironmentVariables {
	public static void main(String[] args) {

		// Read a single environment variable
		String path = System.getenv("PATH");
		System.out.println("$PATH=" + path);

		// Read all Environment Variables
		Map<String, String> envMap = System.getenv();
		Set<String> keySet = envMap.keySet();
		for (String key : keySet) {
			String val = envMap.get(key);
			System.out.println(key + "=" + val);
		}

	}
}
