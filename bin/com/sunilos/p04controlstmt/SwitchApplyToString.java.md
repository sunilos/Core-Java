```java
package com.sunilos.p04controlstmt;

/**
 * Example program of SWITCH control statement that applies to String.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class SwitchApplyToString {

    public static void main(String[] args) {

        // Define a variable to hold the name of the month
        String month = "March";

        // Switch statement to determine the month
        switch (month) {

            case "January":
                // If month is January, print the corresponding message
                System.out.println("1st Month of The Year");
                break;
            case "February":
                // If month is February, print the corresponding message
                System.out.println("2nd Month of The Year");
                break;
            case "March":
                // If month is March, print the corresponding message
                System.out.println("3rd Month of The Year");
                break;
            case "April":
                // If month is April, print the corresponding message
                System.out.println("4th Month of The Year");
                break;
            case "May":
                // If month is May, print the corresponding message
                System.out.println("5th Month of The Year");
                break;
            case "June":
                // If month is June, print the corresponding message
                System.out.println("6th Month of The Year");
                break;
            case "July":
                // If month is July, print the corresponding message
                System.out.println("7th Month of The Year");
                break;
            case "August":
                // If month is August, print the corresponding message
                System.out.println("8th Month of The Year");
                break;
            case "September":
                // If month is September, print the corresponding message
                System.out.println("9th Month of The Year");
                break;
            case "October":
                // If month is October, print the corresponding message
                System.out.println("10th Month of The Year");
                break;
            case "November":
                // If month is November, print the corresponding message
                System.out.println("11th Month of The Year");
                break;
            case "December":
                // If month is December, print the corresponding message
                System.out.println("12th Month of The Year");
                break;
        }
    }
}
```

### Explanation:
- **`String month = "March";`**: Defines a variable `month` with the value "March".
- **`switch (month)`**: Initiates a switch statement to evaluate the value of `month`.
- **`case "March":`**: Checks if `month` is equal to "March". If true, executes the following statement.
- **`System.out.println("3rd Month of The Year");`**: Prints the corresponding message for March.
- **`break;`**: Exits the switch statement to prevent fall-through to subsequent cases.
- Additional `case` statements check for other months, each printing the corresponding ordinal message.
