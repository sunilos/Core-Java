```java
package com.sunilos.p02string;

/**
 * Parse Strings into Primitive Data Types using Wrapper classes.
 * Each wrapper class has a static method `parse<Type>()` that converts a String into the respective primitive type.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class ParseStringsIntoPrimitiveData {

    public static void main(String[] args) {

        // Parse a String into a byte value
        byte bt = Byte.parseByte("1");
        System.out.println("byte value " + bt);
        
        // Parse a String into a short value
        short s = Short.parseShort("2");
        System.out.println("short value " + s);
        
        // Parse a String into an int value
        int i = Integer.parseInt("3");
        System.out.println("int value " + i);
        
        // Parse a String into a long value
        long l = Long.parseLong("4444");
        System.out.println("long value " + l);
        
        // Parse a String into a float value
        float f = Float.parseFloat("5.2");
        System.out.println("float value " + f);
        
        // Parse a String into a double value
        double d = Double.parseDouble("5.5");
        System.out.println("double value " + d);
        
        // Parse a String into a boolean value
        boolean b = Boolean.parseBoolean("true");
        System.out.println("boolean value " + b);

    }
}
```

### Explanation:
- **Wrapper classes**: Each primitive type in Java has a corresponding wrapper class (`Byte`, `Short`, `Integer`, `Long`, `Float`, `Double`, `Boolean`).
- **parse<Type>() methods**: These static methods are used to convert `String` values into their respective primitive types.
  - `Byte.parseByte()`, `Short.parseShort()`, `Integer.parseInt()`, and `Long.parseLong()` convert a `String` into a numeric value.
  - `Float.parseFloat()` and `Double.parseDouble()` convert a `String` into a floating-point value.
  - `Boolean.parseBoolean()` converts a `String` into a `boolean` value, returning `true` for `"true"` (case-insensitive) and `false` otherwise.
