
```java
package com.sunilos.p06oop;

/**
 * Demonstrates the use of different access specifiers (private, default, protected, public)
 * in a class.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class MyClass {

    // Private attribute: Accessible only within this class.
    private int privateAttribute = 0;

    // Default (package-private) attribute: Accessible within the same package.
    int defaultAttribute = 0;

    // Protected attribute: Accessible within the same package and in subclasses.
    protected int protectedAttribute = 0;

    // Public attribute: Accessible from anywhere in the program.
    public int publicAttribute = 0;

}
```

### Explanation:

- **private:** The `privateAttribute` is accessible only within the `MyClass` class.
- **default (package-private):** The `defaultAttribute` is accessible within the same package but not from outside the package.
- **protected:** The `protectedAttribute` is accessible within the same package and also in subclasses (even if they are in a different package).
- **public:** The `publicAttribute` is accessible from any other class or package in the program.
