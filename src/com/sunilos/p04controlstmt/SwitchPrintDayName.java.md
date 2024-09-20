```java
package com.sunilos.p04controlstmt;

/**
 * Example program of SWITCH control statement that prints the name of the day.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class SwitchPrintDayName {

    public static void main(String[] args) {
        // Define an integer variable to represent the day of the week
        int day = 1;
        String dayString = null; // Variable to hold the name of the day

        // Switch statement to determine the day name based on the day number
        switch (day) {
            case 0:
                dayString = "Sunday"; // Assign name for Sunday
                break;
            case 1:
                dayString = "Monday"; // Assign name for Monday
                break;
            case 2:
                dayString = "Tuesday"; // Assign name for Tuesday
                break;
            case 3:
                dayString = "Wednesday"; // Assign name for Wednesday
                break;
            case 4:
                dayString = "Thursday"; // Assign name for Thursday
                break;
            case 5:
                dayString = "Friday"; // Assign name for Friday
                break;
            case 6:
                dayString = "Saturday"; // Assign name for Saturday
                break;
            default:
                dayString = "This day yet to come, pl wait!!"; // Message for invalid day numbers
        }

        // Print the name of the day
        System.out.println(dayString);
    }
}
```

### Explanation:
- **`int day = 1;`**: Initializes a variable `day` with the value 1, representing Monday.
- **`String dayString = null;`**: Declares a string variable `dayString` to hold the name of the day.
- **`switch (day)`**: Begins a switch statement to evaluate the value of `day`.
- **`case 1:`**: Checks if `day` is 1. If true, assigns "Monday" to `dayString`.
- **`break;`**: Exits the switch statement to prevent execution of subsequent cases.
- **`default:`**: Handles any values not matched in the cases, assigning a message for invalid day numbers.
- **`System.out.println(dayString);`**: Prints the name of the day based on the value of `day`.
