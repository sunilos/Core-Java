
```java
package com.sunilos.p09generics;

/**
 * A simple generic class that holds any Class of data. 
 * T is a type parameter that will be replaced by a real type 
 * when an object of type Data is created.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Data<T> {

    // Declare an object of type T to hold the value.
    T value;

    // Constructor that takes a parameter of type T and assigns it to the value.
    public Data(T val) {
        value = val; // Initialize the value with the passed parameter.
    }

    /**
     * Method to get the stored value.
     * @return Object of type T
     */
    T getValue() {
        return value; // Return the stored value.
    }

    /**
     * Method to show the data type of the stored object.
     */
    void showType() {
        // Print the class name of the stored object using reflection.
        System.out.println("Type of T is " + value.getClass().getName());
    }

    public static void main(String[] args) {

        // Create a Data<Integer> object and assign Integer value 786.
        System.out.println("\nInteger Data Type ");
        Data<Integer> i = new Data<Integer>(786); // Instantiate Data with Integer type.

        i.showType(); // Show the type of data used by i.
        int v = i.getValue(); // Retrieve the value without type casting.
        System.out.println("Value: " + v); // Print the value.

        // Create a Data object for Strings.
        System.out.println("\nString Data Type ");
        Data<String> str = new Data<String>("Vijay"); // Instantiate Data with String type.
        str.showType(); // Show the type.
        String val = str.getValue(); // Retrieve the value without type casting.
        System.out.println("Value: " + val); // Print the value.

        // Raw Type: If the type parameter is not specified, it defaults to a raw type.
        Data rawData = new Data("Ram"); // Instantiate Data without specifying type.
        val = (String) rawData.getValue(); // Type casting is required to retrieve the value.
        System.out.println("\nRaw Type Value: " + val); // Print the raw type value.
    }

}
```

### Explanation:

1. **Imports:** No additional imports are necessary since the class relies on basic Java functionality.

2. **Class Declaration:** The `Data` class is defined as a generic class with a type parameter `<T>`. This allows it to hold any type of data.

3. **Field Declaration:**
   - **Generic Field:** `T value;` declares a field of type `T` to store the actual value.

4. **Constructor:**
   - **Parameter Initialization:** The constructor `public Data(T val)` initializes the `value` field with the parameter passed during instantiation.

5. **Methods:**
   - **`getValue()`:** Returns the stored value of type `T`.
   - **`showType()`:** Uses reflection to print the class name of the object stored in `value`. This illustrates the type of data currently held by the instance.

6. **Main Method:**
   - **Integer Data Example:**
     - An instance of `Data<Integer>` is created with the value `786`.
     - The type is shown and the value is retrieved and printed without needing type casting.
   - **String Data Example:**
     - An instance of `Data<String>` is created with the value `"Vijay"`.
     - Similar to the Integer example, the type and value are printed.
   - **Raw Type Example:**
     - A `Data` object is created without specifying a type parameter. This creates a raw type, which defaults to `Object`.
     - The stored value is retrieved, but requires explicit type casting to `String` before use.

### Key Points:
- **Generics:** The use of generics (`<T>`) allows for type safety and eliminates the need for casting when retrieving values.
- **Raw Types:** Demonstrating the use of raw types highlights the importance of specifying type parameters to avoid runtime errors and type safety issues.
- **Type Reflection:** The `showType()` method showcases how Java allows for introspection of the type information at runtime.

This class serves as a straightforward example of how generics work in Java, emphasizing the benefits of type safety and flexibility.
