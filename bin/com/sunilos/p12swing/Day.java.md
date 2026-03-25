```java
package com.sunilos.p12swing;

/**
 * Enum class `Day` contains constants representing the days of the week.
 * 
 * Each constant corresponds to a day, and the enum provides a method to get
 * the corresponding weekday index (starting from 0 for Sunday).
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public enum Day {

    // Constants representing the days of the week
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    /**
     * Returns the index of the day in the week, where Sunday is 0 and Saturday is 6.
     * 
     * @return An integer representing the index of the day, starting with 0 for Sunday.
     */
    public int getWeekDay() {

        // Use a switch statement to map each enum constant to its corresponding index
        switch (this) {
            case SUNDAY:
                return 0;
            case MONDAY:
                return 1;
            case TUESDAY:
                return 2;
            case WEDNESDAY:
                return 3;
            case THURSDAY:
                return 4;
            case FRIDAY:
                return 5;
            case SATURDAY:
                return 6;
            default:
                return -1; // Default case to handle any unforeseen situations
        }
    }
}
```

### Explanation:
1. **Enum Constants**:
   - The enum `Day` defines constants for the days of the week (`SUNDAY` to `SATURDAY`).
   
2. **`getWeekDay()` Method**:
   - This method returns an integer representing the index of the day of the week, starting with `0` for `SUNDAY` and ending with `6` for `SATURDAY`.

3. **Switch Statement**:
   - The switch statement checks the current enum constant (`this`) and returns the corresponding integer value for each day.

4. **Default Case**:
   - A default case is provided, although it will not be reached under normal circumstances because all enum constants are explicitly handled. It returns `-1` as a fallback.
