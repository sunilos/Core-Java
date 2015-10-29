package com.sunrays.controlstatements;

public class SwitchTest {
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
			dayString = "Invalid Day";
		}
		System.out.println(dayString);

		String month = "March";

		switch (month) {
		case "January":
			System.out.println("1st Month The Year");
			break;
		case "February":
			System.out.println("2nd Month The Year");
			break;
		case "March":
			System.out.println("3rd Month The Year");
			break;
		}
	}

}
