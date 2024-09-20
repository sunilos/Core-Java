```java
package com.sunilos.p03date;

import java.util.Random;

/**
 * Get the Random numbers
 * 
 * This program demonstrates how to generate random numbers using both `Math.random()` and the `Random` class.
 * It generates random integers and doubles in a specified range.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class GetRandomNumbers {

    public static void main(String[] args) {

        // Generate random integers between 0 and 100 using Math.random()
        System.out.println("Random integer between 1 to 100 using Math.random()");
        for (int i = 0; i < 10; i++) {
            // Math.random() generates a double between 0.0 and 1.0, which is then multiplied by 100 and cast to an int
            int randomNo = (int) (Math.random() * 100); 
            System.out.println((i + 1) + " :" + randomNo); // Print the random integer
        }

        // Generate random integers between 0 and 100 using the Random class
        System.out.println("\nRandom integer between 1 to 100 using Random class");
        Random r = new Random(); // Create a new Random object
        for (int i = 0; i < 10; i++) {
            int randomInt = r.nextInt(100); // Generate a random integer between 0 and 100
            System.out.println(randomInt); // Print the random integer
        }

        // Generate random double numbers using the Random class
        System.out.println("\nRandom double between 1 to 100 using Random class");
        for (int i = 0; i < 10; i++) {
            double randomD = r.nextDouble(); // Generate a random double between 0.0 and 1.0
            System.out.println(randomD); // Print the random double
        }

    }
}
```

### Explanation:
- **`Math.random()`**: Generates a double value between 0.0 and 1.0. By multiplying it with 100 and casting it to an integer, we generate random integers between 0 and 100.
- **`Random` class**: This class provides more advanced random number generation, including methods like `nextInt()` for integers and `nextDouble()` for double values.
- **`nextInt(100)`**: Generates random integers between 0 and 100.
- **`nextDouble()`**: Generates random double values between 0.0 and 1.0.
