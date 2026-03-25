```java
package com.sunilos.p01basics;
/**
 * Example to Test Primitive Data Types
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestPrimitiveType {

    public static void main(String[] args) {

        // Primitive Literals

        boolean result = true; // Boolean literal

        // Integer Literals
        byte b = 100; // Byte literal
        short s = 10000; // Short literal
        int i = 100000; // Integer literal
        long l = 100000L; // Long literal with 'L' suffix

        // Other number systems
        // The prefix 0x indicates hexadecimal and 0b indicates binary:

        int decVal = 26; // The number 26, in decimal
        int hexVal = 0x1a; // The number 26, in hexadecimal
        int binVal = 0b11010; // The number 26, in binary

        System.out.println("Decimal Value : " + decVal);
        System.out.println("Hex Value : " + hexVal);
        System.out.println("Binary Value : " + binVal);

        // Floating-Point Literals
        float f = 1.5F; // Float literal with 'F' suffix
        double d = 1.5; // Double literal
        double d1 = 1.5D; // Double literal with 'D' suffix

        // Using Under score in Java SE 7
        long creditCardNumber = 1234_5678_9012_3456L; // Long literal with underscores
        long socialSecurityNumber = 999_99_9999L; // Long literal with underscores

        System.out.println("Credit Card Number : " + creditCardNumber);
        System.out.println("Social Security Number :" + socialSecurityNumber);

        // Character and String Literals
        char capitalC = 'C'; // Character literal
        char unicodeCapitalC = '\u0043'; // Unicode character literal
        String name = "SUNRAYS"; // String literal
        String unicodeName = "SUN\u0052AYS"; // String literal with Unicode escape

        System.out.println("Unicode C : " + unicodeCapitalC);
        System.out.println("Unicode SUNRAYS : " + unicodeName);

        // Escape sequences
        // \b (backspace), \t (tab), \n (line feed), \f (form feed), \r
        // (carriage return), \" (double quote), \' (single quote), and \\ 
        // (backslash).

        char backspace = '\b'; // Backspace
        char tab = '\t'; // Tab
        char lineFeed = '\n'; // Line feed
        char formFeed = '\f'; // Form feed
        char carriageReturn = '\r'; // Carriage return
        char doubleQuote = '\"'; // Double quote
        char singleQuote = '\''; // Single quote
        char backslash = '\\'; // Backslash

    }

}
```

### Explanation:
- This program demonstrates the use of various primitive data types and their literals in Java.
- It covers integer literals, floating-point literals, character literals, and string literals, including their use with hexadecimal, binary, and Unicode values.
- It also shows how to use underscores in numeric literals for better readability and escape sequences for special characters.
