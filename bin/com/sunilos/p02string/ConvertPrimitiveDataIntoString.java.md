```java
package com.sunilos.p02string;

/**
 * Converts Primitive data into Strings using the `String.valueOf()` method.
 * The method is used to convert various primitive data types into their String representations.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class ConvertPrimitiveDataIntoString {
    public static void main(String[] args) {
        // Convert byte value (represented by an int) to String
        String btStr = String.valueOf(1); 
        
        // Convert short value (represented by an int) to String
        String shortStr = String.valueOf(2); 
        
        // Convert int value to String
        String intStr = String.valueOf(3); 
        
        // Convert long value to String
        String longStr = String.valueOf(4L); 
        
        // Convert float value to String
        String floatStr = String.valueOf(5.5); 
        
        // Convert double value to String
        String doubleStr = String.valueOf(5.5D); 
        
        // Convert boolean value to String
        String boolStr = String.valueOf(true); 
    }
}
```

### Explanation:
- **String.valueOf()**: This method is used to convert primitive types to their corresponding `String` representation.
  - `byte`, `short`, `int`, and `long` are converted to their numeric string equivalents.
  - `float` and `double` are converted to their decimal string equivalents.
  - `boolean` is converted to `"true"` or `"false"`.
