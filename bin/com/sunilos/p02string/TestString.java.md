```java
package com.sunilos.p02string;

/**
 * Program to demonstrate various string methods such as length, character access, 
 * substring, replacements, and case conversion.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestString {

    public static void main(String[] args) {

        // Original string
        String name = "Vijay Dinanth Chouhan";

        // Get the length of the string
        System.out.println(" String Length- " + name.length());
        
        // Get the character at the 7th position (index 6)
        System.out.println(" 7 ths caharcter is- " + name.charAt(6));
        
        // Get the index of the substring "Dina"
        System.out.println(" Dina index is- " + name.indexOf("Dina"));
        
        // Get the index of the first occurrence of 'i'
        System.out.println(" First i Position- " + name.indexOf("i"));
        
        // Get the index of the last occurrence of 'i'
        System.out.println(" Last i Position- " + name.lastIndexOf("i"));
        
        // Replace the first occurrence of 'a' with 'b'
        System.out.println(" a is replaced by b- " + name.replace("a", "b"));
        
        // Replace all occurrences of 'a' with 'b'
        System.out.println(" All a is replaced by b- " + name.replaceAll("a", "b"));
        
        // Convert the entire string to lowercase
        System.out.println(" Chota vijay- " + name.toLowerCase());
        
        // Convert the entire string to uppercase
        System.out.println(" Bada vijay- " + name.toUpperCase());
        
        // Check if the string starts with "Vijay"
        System.out.println(" Starts With Vijay- " + name.startsWith("Vijay"));
        
        // Check if the string ends with "han"
        System.out.println(" Ends with han- " + name.endsWith("han"));
        
        // Get the substring starting from the 7th character
        System.out.println(" Substring- " + name.substring(6));

    }

}
```

### Explanation:
- **`length()`**: Returns the number of characters in the string.
- **`charAt()`**: Returns the character at a specified index.
- **`indexOf()`**: Returns the index of the first occurrence of a substring or character.
- **`lastIndexOf()`**: Returns the index of the last occurrence of a character.
- **`replace()` and `replaceAll()`**: Replace specified characters or substrings in the string.
- **`toLowerCase()` and `toUpperCase()`**: Convert the entire string to lowercase or uppercase.
- **`startsWith()` and `endsWith()`**: Check if the string starts or ends with a specific substring.
- **`substring()`**: Extracts a portion of the string starting from a specified index.
