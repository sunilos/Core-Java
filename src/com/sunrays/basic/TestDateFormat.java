package com.sunrays.basic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {


	public static void main(String[] args) throws Exception {
		
		SimpleDateFormat format= 
			new SimpleDateFormat("dd/MM/yyyy");
		
		Date d = new Date();
		String str = format.format(d);
		
		System.out.println(d);
		System.out.println("String : " +str);
		
		String str1 = "22/03/2009";
		
		Date d1 = format.parse(str1);
		System.out.println(d1);
		

	}

}
