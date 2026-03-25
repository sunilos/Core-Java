```java
package com.sunilos.p01basics;

/**
 * The TestStaticBlock class demonstrates the use of static blocks in Java.
 * 
 * Static blocks are used to initialize static variables or members of a class.
 * They are executed when the class is loaded, before the main method is called.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestStaticBlock {

    static {
        System.out.println("I will call first!"); // Static block is executed first
    }

    public static void main(String[] args) {
        System.out.println("I will call second!!"); // Main method is executed after static block

    }

    /**
     * Output:
     * I will call first! 
     * I will call second!!
     */
}
```

### Explanation:
- **Static Block**: This block is executed when the class is loaded into memory, before the main method runs. It is used for static initialization.
- **Main Method**: This method is the entry point of the program and is executed after the static block.
- **Output**: The output will show "I will call first!" followed by "I will call second!!" because static blocks run before the main method.
