
```java
package com.sunilos.p12swing;

/**
 * Test Day enum class
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */

public class TestEnumDay {

    public static void main(String[] args) {

        // Create an instance of the Day enum for FRIDAY
        Day fd = Day.FRIDAY;
        System.out.println(fd.getWeekDay()); // Print the numeric value of the day

        // Switch statement to print messages based on the selected day
        switch (fd) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
            case SATURDAY:
                System.out.println("Saturdays are Cool !!!!");
                break;
            case SUNDAY:
                System.out.println("Let's Chill, it is Sunday!!!!");
                break;
        }

        // Print all days defined in the Day enum
        Day[] days = Day.values();
        for (Day d : days) {
            System.out.println(d);
        }
    }

    /**
     * Output 
     * 5 
     * Fridays are better. 
     * SUNDAY 
     * MONDAY 
     * TUESDAY 
     * WEDNESDAY 
     * THURSDAY
     * FRIDAY 
     * SATURDAY
     */
}
```

### Explanation:
- **Enum Usage**: The `Day` enum is used to represent days of the week. The variable `fd` is set to `Day.FRIDAY`.
- **Method Call**: The `getWeekDay()` method (assumed to exist in the `Day` enum) prints the numeric representation of the day.
- **Switch Statement**: A switch-case construct is used to display different messages depending on the value of `fd`.
- **Iterating Enum Values**: The `values()` method of the enum is used to get all instances of `Day`, which are then printed in a loop.

### Note:
Make sure that your `Day` enum is defined with appropriate values and methods (like `getWeekDay()`) for this class to function correctly.
