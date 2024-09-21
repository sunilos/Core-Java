
```java
package com.sunilos.p09generics;

/**
 * A simple generic class that holds only Numbers. T is a type parameter and
 * is constrained to extend the Number class, meaning it can only hold 
 * numeric types.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class NumberData<T extends Number> {

    // Declare an object of type T, which can be any subclass of Number
    T value;

    /**
     * Constructor to initialize the NumberData object with a value of type T.
     * 
     * @param val the value to be stored, which must be a subclass of Number
     */
    public NumberData(T val) {
        value = val; // Assign the provided value to the instance variable
    }

    /**
     * Method to retrieve the stored value.
     * 
     * @return the value of type T
     */
    T getValue() {
        return value; // Return the stored value
    }

    /**
     * Method to show the data type of the stored object.
     */
    void showType() {
        System.out.println("Type of T is " + value.getClass().getName()); // Print the class name of the type
    }

    public static void main(String[] args) {
        // Create a NumberData object that holds an Integer
        NumberData<Integer> iData = new NumberData<Integer>(5);
        iData.showType(); // Show type of stored value (Integer)

        // Create a NumberData object that holds a Double
        NumberData<Double> dData = new NumberData<Double>(5.5);
        dData.showType(); // Show type of stored value (Double)

        // The following line would cause a compile-time error because String does not extend Number
        // NumberData<String> sData = new NumberData<String>("5.5"); // Incorrect
    }
}
```

### Explanation:

1. **Imports:** No external imports are required since the class only uses built-in Java functionality.

2. **Class Declaration:** The `NumberData` class is a generic class that allows storage of numeric types only. The type parameter `T` is bounded by `Number`, meaning `T` can only be a subclass of `Number` (e.g., `Integer`, `Double`, etc.).

3. **Private Variable:**
   - `value`: An instance variable of type `T`, which will store the numeric value.

4. **Constructor:**
   - The constructor accepts a parameter of type `T`, allowing any subclass of `Number` to be passed during object creation. It initializes the instance variable `value` with the provided argument.

5. **Methods:**
   - **`getValue()`**: Returns the stored numeric value of type `T`.
   - **`showType()`**: Prints the class name of the type of the stored value, which helps in confirming the type at runtime.

6. **Main Method:**
   - Creates an instance of `NumberData` with an `Integer` type and displays its type using the `showType()` method.
   - Creates another instance of `NumberData` with a `Double` type and displays its type.
   - An attempt to create a `NumberData` instance with a `String` type is commented out, highlighting that it would result in a compile-time error due to the type constraint.

### Key Points:
- **Generics with Upper Bounds:** The class demonstrates how to restrict a type parameter to a specific range (subclass of `Number`).
- **Type Safety:** The use of generics ensures type safety at compile time, preventing runtime errors associated with type mismatches.
- **Type Identification:** The `showType()` method allows for dynamic type checking, providing flexibility in handling different numeric types.
