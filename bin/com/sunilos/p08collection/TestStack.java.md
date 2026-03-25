
```java
package com.sunilos.p08collection;

import java.util.Stack;

/**
 * Test the Stack class
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestStack {

    public static void main(String[] args) {

        // Create a Stack instance to hold elements
        Stack stack = new Stack();

        // Push elements onto the stack
        stack.push("1"); // Adds "1" to the top of the stack
        stack.push("2"); // Adds "2" to the top of the stack
        stack.push("3"); // Adds "3" to the top of the stack

        // Peek at the top object without removing it from the stack
        Object objTop = stack.peek(); // Should return "3"
        System.out.println(objTop); // Print the top object

        // Pop the top object from the stack, which also removes it
        Object obj3 = stack.pop(); // Removes and returns "3"
        System.out.println(obj3); // Print the popped object

        // Pop the next object from the stack
        Object obj2 = stack.pop(); // Removes and returns "2"
        System.out.println(obj2); // Print the popped object

        // Pop the last object from the stack
        Object obj1 = stack.pop(); // Removes and returns "1"
        System.out.println(obj1); // Print the popped object
    }
}
```

### Explanation:

1. **Imports:** The `Stack` class from the `java.util` package is imported, allowing us to use the stack data structure.

2. **Class Declaration:** The `TestStack` class demonstrates how to use the `Stack` class.

3. **Main Method:**
   - **Stack Initialization:** A `Stack` instance named `stack` is created to hold elements.
   - **Pushing Elements:** 
     - Three strings ("1", "2", and "3") are pushed onto the stack using the `push()` method. Each call to `push()` adds an element to the top of the stack.
   - **Peeking at the Top Element:**
     - The `peek()` method retrieves the top element of the stack without removing it. In this case, it returns "3".
     - The top element is printed to the console.
   - **Popping Elements:**
     - The `pop()` method is called three times, which removes and returns the top element each time.
     - Each call to `pop()` will print the element being removed: first "3", then "2", and finally "1".

### Key Points:
- **LIFO Structure:** The stack follows a Last In, First Out (LIFO) principle, meaning the last element added is the first one to be removed.
- **Methods Used:** 
  - `push()`: Adds an element to the top of the stack.
  - `peek()`: Returns the top element without removing it.
  - `pop()`: Removes and returns the top element. 

This class effectively illustrates the basic functionality of the `Stack` class, demonstrating how to add, retrieve, and remove elements from a stack.
