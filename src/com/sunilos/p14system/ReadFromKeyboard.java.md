
```java
package com.sunilos.p14system;

/**
 * A Class that reads a line from the keyboard and prints it to the console.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class ReadFromKeyboard {

    public static void main(String[] args) throws Exception {

        int ch = 0; // Variable to store the ASCII value of the character
        char chr = (char) ch; // Variable to convert the ASCII value to character
        StringBuffer sb = new StringBuffer(); // StringBuffer to hold the input line

        System.out.print("Enter a Line: "); // Prompt the user for input

        do {
            // Read a unicode character from standard input (keyboard)
            ch = System.in.read();

            // Convert the ASCII value to a character
            chr = (char) ch;

            // Append the character to the StringBuffer
            sb.append(chr);

        } while (ch != 13); // 13 is the ASCII value for the Enter key

        // Print the entered line, excluding the Enter key
        System.out.println("You have entered: " + sb.toString().trim());
    }
}
```

### Explanation:
- **Reading Input**: The program reads characters from the keyboard using `System.in.read()`, which captures the ASCII value of each character entered.
- **Character Conversion**: Each ASCII value is converted to a character and appended to a `StringBuffer`, which efficiently collects the input.
- **Termination Condition**: The loop continues until the Enter key (ASCII value 13) is pressed, indicating the end of the line.
- **Output**: After exiting the loop, the program prints the complete line that was entered, using `sb.toString().trim()` to remove any trailing newline characters.

This simple console application effectively demonstrates basic input handling in Java, leveraging low-level input methods to read user data directly from the keyboard.
