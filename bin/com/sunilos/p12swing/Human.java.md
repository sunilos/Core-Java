```java
package com.sunilos.p12swing;

/**
 * Enum class `Human` contains constants representing different human categories 
 * along with their associated weights.
 * 
 * Each constant (KID, MAN, OLDMAN) is associated with a specific weight value.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public enum Human {

    // Enum constants with associated weight values
    KID(10), MAN(50), OLDMAN(70);

    private final int weight; // Weight associated with the human category

    // Constructor to initialize the weight for each constant
    Human(int w) {
        this.weight = w;
    }

    /**
     * Displays the weight of the human category.
     */
    public void display() {
        System.out.println(weight);
    }

    /**
     * The main method demonstrates the usage of the Human enum.
     * 
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {

        // Create an instance of the KID constant and display its weight
        Human h = Human.KID;
        h.display(); // Outputs the weight of KID

        // Retrieve and display all enum constants
        Human[] hs = Human.values(); // Get all constants of the Human enum

        for (int i = 0; i < hs.length; i++) {
            System.out.println(hs[i]); // Print each constant
        }
    }
}
```

### Explanation:
1. **Enum Constants**:
   - The `Human` enum defines three constants: `KID`, `MAN`, and `OLDMAN`, each associated with a specific weight.

2. **Weight Field**:
   - A private final field `weight` stores the weight value for each enum constant.

3. **Constructor**:
   - The constructor initializes the `weight` for each constant when the enum is created.

4. **`display()` Method**:
   - This method prints the weight associated with the specific enum constant.

5. **`main` Method**:
   - An instance of `Human.KID` is created, and its weight is displayed using the `display()` method.
   - All enum constants are retrieved using `values()` and printed in a loop, demonstrating how to access and use enum values in Java.
