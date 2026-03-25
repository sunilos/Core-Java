
```java
package com.sunilos.p06oop;

/**
 * The ThisPkgOtherClass demonstrates the use of the MyClass class
 * within the same package. It accesses and prints the attributes 
 * of MyClass to illustrate the visibility of different access specifiers.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class ThisPkgOtherClass {

    public static void main(String[] args) {
        // Create an instance of MyClass.
        MyClass c = new MyClass();
        
        // Access and print the default attribute from MyClass.
        System.out.println(c.defaultAttribute);       // Accessible since it's in the same package.

        // Access and print the protected attribute from MyClass.
        System.out.println(c.protectedAttribute);     // Accessible since it's in the same package.

        // Access and print the public attribute from MyClass.
        System.out.println(c.publicAttribute);         // Accessible from anywhere.
    }
}
```

### Explanation:

- **Purpose:** The `ThisPkgOtherClass` is designed to demonstrate how to use and access attributes from another class (`MyClass`) within the same package. It highlights the visibility rules of different access specifiers (default, protected, public).

- **Creating an Instance:** An instance of `MyClass` is created, allowing access to its attributes.

- **Accessing Attributes:**
  - The `defaultAttribute` is accessed and printed. Since it's a default access specifier, it is accessible within the same package.
  - The `protectedAttribute` is accessed and printed. Protected members are accessible within the same package and by subclasses, so it can also be accessed here.
  - The `publicAttribute` is accessed and printed. Public members are accessible from anywhere, including other packages.

- **Illustration of Access Specifiers:** This class effectively illustrates how different access specifiers work in Java by demonstrating access to each type of attribute from `MyClass`.
