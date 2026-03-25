```java
package com.sunilos.p03date;

import java.util.Calendar;
import java.util.Date;

/**
 * Test date arithmetic
 * 
 * This program demonstrates how to perform various date manipulations using the `Calendar` and `Date` classes.
 * It includes operations to get past and future dates, and compares dates.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestDateArithmetic {

    public static void main(String[] args) {

        // Get the current date
        Date today = new Date();

        // Get a Calendar instance set to the current locale and time zone
        Calendar cal = Calendar.getInstance();

        // Set the calendar to the current date
        cal.setTime(today);

        // Subtract one day to get yesterday’s date
        cal.add(Calendar.DATE, -1);
        Date yesterday = cal.getTime(); // Get the date for yesterday

        // Add two days to get tomorrow’s date
        cal.add(Calendar.DATE, 2);
        Date tomorrow = cal.getTime(); // Get the date for tomorrow

        // Add 30 days to get a future date
        cal.add(Calendar.DATE, 30);
        Date nextEvent = cal.getTime(); // Get the date 30 days from now

        // Print the calculated dates
        System.out.println("Yesterday : " + yesterday);
        System.out.println("Today : " + today);
        System.out.println("Tomorrow : " + tomorrow);
        System.out.println("Event after 30 Days : " + nextEvent);

        // Get the day of the year for the current date
        int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);

        // Compare today's date with yesterday's date
        if (today.getTime() > yesterday.getTime()) {
            System.out.println("Today is greater than Yesterday");
        }

        // Check if today is after yesterday
        if (today.after(yesterday)) {
            System.out.println("Today comes after Yesterday");
        }

        // Compare dates using compareTo method
        if (yesterday.compareTo(today) == -1) {
            System.out.println("Yesterday is smaller than Today");
        }

        if (today.compareTo(yesterday) == 1) {
            System.out.println("Yesterday is smaller than Today");
        }

        if (today.compareTo(today) == 0) {
            System.out.println("Today is today, do not lose it");
        }
    }
}
```

### Explanation:
- **`Calendar.getInstance()`**: Gets a calendar for the current time zone and locale.
- **`setTime(Date date)`**: Sets the calendar to a specific date.
- **`add(Calendar.DATE, int value)`**: Adds (or subtracts) days from the current date.
- **`getTime()`**: Returns a `Date` object representing the calendar's time.
- **`getTime()` and `after()`**: Used for comparing dates.
- **`compareTo()`**: Compares two dates. It returns:
  - `0` if the dates are equal,
  - `1` if the current date is after the compared date,
  - `-1` if the current date is before the compared date.
