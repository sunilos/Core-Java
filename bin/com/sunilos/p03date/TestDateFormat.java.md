```java
package com.sunilos.p03date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {

    public static void main(String[] args) throws Exception {

        // Create a SimpleDateFormat object with the specified date format "dd/MM/yyyy"
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        // Create a new Date object representing the current date and time
        Date d = new Date();

        // Format the current date into a string using the specified format
        String str = format.format(d);

        // Print the current Date object (default format)
        System.out.println(d);

        // Print the formatted date string (in "dd/MM/yyyy" format)
        System.out.println("String : " + str);

        // Define a string representing a specific date in "dd/MM/yyyy" format
        String str1 = "22/03/2009";

        // Parse the date string into a Date object using the SimpleDateFormat object
        Date d1 = format.parse(str1);

        // Print the parsed Date object
        System.out.println(d1);
    }
}
```

### Explanation:
- **`SimpleDateFormat`**: A class that provides methods to format and parse dates into specific string patterns.
- **`new SimpleDateFormat("dd/MM/yyyy")`**: This creates a formatter that will handle dates in the format of day/month/year.
- **`format(Date date)`**: This method converts a `Date` object into a string, formatted according to the specified pattern.
- **`parse(String source)`**: This method takes a string (in the specified format) and converts it back into a `Date` object.
- **`Date d = new Date()`**: Creates a `Date` object with the current system time.
