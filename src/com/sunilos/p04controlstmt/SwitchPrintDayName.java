package com.sunilos.p04controlstmt;

/**
 * Example program of SWITCH control statement that prints the name of the day
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */

public class SwitchPrintDayName {

	public static void main(String[] args) {
		int day = 1;
		String dayString = null;
		switch (day) {
		case 0:
			dayString = "Sunday";
			break;
		case 1:
			dayString = "Monday";
			break;
		case 2:
			dayString = "Tuesday";
			break;
		case 3:
			dayString = "Wednesday";
			break;
		case 4:
			dayString = "Thursday";
			break;
		case 5:
			dayString = "Friday";
			break;
		case 6:
			dayString = "Saturday";
			break;
		default:
			dayString = "This day yet to come, pl wait!!";
		}
		System.out.println(dayString);

	}

}
