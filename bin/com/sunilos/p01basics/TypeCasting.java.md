```java
package com.sunilos.p01basics;

/**
 * Example of explicit and implicit type casting
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TypeCasting {

    public static void main(String[] args) {

        int i = 1;
        double d;
        char c = 'S';

        // Converting int to double
        d = i; // Implicit conversion: int to double is done automatically
        System.out.println("int -> double = " + d);

        // Converting double to int
        i = (int) d; // Explicit conversion: double to int requires a cast
        System.out.println("double -> int = " + i);

        // Converting char to double
        d = c; // Implicit conversion: char to double is done automatically
        System.out.println("char -> double = " + d);

        // Converting double to char
        c = (char) d; // Explicit conversion: double to char requires a cast
        System.out.println("double -> char = " + c);

    }

}
```

### Explanation:
- **Implicit Conversion**: Automatically converts a smaller or compatible data type to a larger or compatible data type. For example, `int` to `double` and `char` to `double` are implicitly converted.
- **Explicit Conversion**: Requires a cast to convert a larger data type to a smaller or incompatible data type. For example, `double` to `int` and `double` to `char` require explicit casting.
