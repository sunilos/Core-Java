```java
package com.sunilos.p02string;

/**
 * Program to replace a substring in a given string using the `replace()` method.
 * The program searches for a specific substring and replaces it with another substring.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class StringReplace {

    public static void main(String[] args) {
        // Original string
        String str = "This is Google";
        
        // Find the index of the substring "Google"
        System.out.println(str.indexOf("Google"));
        
        // Replace "Google" with "Sunrays" in the original string
        String newStr = str.replace("Google", "Sunrays");
        
        // Print the modified string
        System.out.println(newStr);
    }

}
```

### Explanation:
- **`indexOf()`**: This method returns the index of the first occurrence of the specified substring ("Google"). It helps identify the position where the substring starts in the original string.
- **`replace()`**: This method replaces all occurrences of the specified substring ("Google") with the new substring ("Sunrays"). In this case, only one occurrence of "Google" is replaced.
