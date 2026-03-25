
```java
package com.sunilos.p09generics;

/**
 * Generic class specifies two type parameters K and V, separated by a comma.
 * Because it has two type parameters, two type arguments must be passed to 
 * DataPair when an object is created.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class DataPair<K, V> {

    K key; // Declare an object of type K to hold the key.
    V value; // Declare an object of type V to hold the value.

    /**
     * Constructor to initialize the key and value.
     * 
     * @param key : Key object of type K
     * @param val : Value object of type V
     */
    public DataPair(K key, V val) {
        this.key = key; // Initialize the key with the passed parameter.
        value = val; // Initialize the value with the passed parameter.
    }

    /**
     * @return Key of Pair
     */
    K getKey() {
        return key; // Return the stored key.
    }

    /**
     * @return Value of Pair
     */
    V getValue() {
        return value; // Return the stored value.
    }

    /**
     * Show data type of the key and value objects.
     */
    void showType() {
        // Print the class name of the key using reflection.
        System.out.println("Type of K is " + key.getClass().getName());
        // Print the class name of the value using reflection.
        System.out.println("Type of V is " + value.getClass().getName());
    }

    public static void main(String[] args) {

        // Keep Account Information
        System.out.println("\nAccount Information");

        // Declare a DataPair to hold account number (String) and balance (Double)
        DataPair<String, Double> account = null;
        // Instantiate DataPair with account number and balance.
        account = new DataPair<String, Double>("SBI-100", 20.5);

        account.showType(); // Show the type of data used in the account object.
        String accNum = account.getKey(); // Retrieve the account number without casting.
        double accBal = account.getValue(); // Retrieve the account balance.
        System.out.println(accNum + " : " + accBal); // Print the account information.

        // Keep Marksheet Information
        System.out.println("\nMarksheet Information");

        // Declare a DataPair to hold roll number (String) and marks (Integer)
        DataPair<String, Integer> marksheet = null;
        // Instantiate DataPair with roll number and marks.
        marksheet = new DataPair<String, Integer>("RN_786", 98);

        marksheet.showType(); // Show the type of data used in the marksheet object.
        String rollNo = marksheet.getKey(); // Retrieve the roll number without casting.
        int marks = marksheet.getValue(); // Retrieve the marks without casting.
        System.out.println(rollNo + " : " + marks); // Print the marksheet information.
    }
}
```

### Explanation:

1. **Imports:** No additional imports are needed as the class relies on core Java features.

2. **Class Declaration:** The `DataPair` class is a generic class with two type parameters `K` and `V`, allowing it to store a key-value pair of any types.

3. **Field Declaration:**
   - **Key Field:** `K key;` stores the key of the pair.
   - **Value Field:** `V value;` stores the value of the pair.

4. **Constructor:**
   - **Parameter Initialization:** The constructor takes two parameters (key and value) and initializes the corresponding fields.

5. **Methods:**
   - **`getKey()`:** Returns the stored key of type `K`.
   - **`getValue()`:** Returns the stored value of type `V`.
   - **`showType()`:** Prints the class names of both the key and value using reflection, providing insight into the types stored in the pair.

6. **Main Method:**
   - **Account Information Example:**
     - An instance of `DataPair<String, Double>` is created to hold an account number and balance.
     - The type is displayed, and the key and value are retrieved and printed.
   - **Marksheet Information Example:**
     - An instance of `DataPair<String, Integer>` is created to hold a roll number and marks.
     - Similar to the account example, the type is displayed, and the key and value are retrieved and printed.

### Key Points:
- **Generics:** The use of two type parameters (`K` and `V`) allows the class to be flexible and type-safe when storing pairs of data.
- **Type Safety:** By specifying the types when creating instances, the need for type casting is eliminated, reducing potential runtime errors.
- **Reflection:** The `showType()` method demonstrates how Java can provide information about the types of objects at runtime.

This class effectively illustrates the power and utility of generics in Java, particularly for creating key-value pairs.
