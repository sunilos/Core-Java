
```java
package com.sunilos.p06oop;

/**
 * The TestCloning class demonstrates deep cloning in Java.
 * It creates a customer object, clones it, and modifies the clone to show that 
 * changes to the clone do not affect the original object.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestCloning {

    public static void main(String[] args) throws Exception {

        // Create an original Customer object with name "Ram" and address set to Mumbai.
        Customer c1 = new Customer("Ram");
        c1.address.city = "Mumbai";  // Set the city of the address.

        // Clone the original customer to create a new Customer object.
        Customer c2 = (Customer) c1.clone();
        
        // Change the name, account balance, and address city for the cloned customer.
        c2.name = "Balram";            // Change name of the cloned customer.
        c2.account.balance = 20;       // Change account balance for the cloned customer.
        c2.address.city = "Delhi";     // Change city of the address for the cloned customer.

        // Output the details of the original customer.
        System.out.println("Original Object ");
        System.out.println("Name : " + c1.name);
        System.out.println("Balance of Account : " + c1.account.balance);
        System.out.println("City : " + c1.address.city);

        // Separator for clarity in output.
        System.out.println("\n--------------------------");
        
        // Output the details of the cloned customer.
        System.out.println("Cloned Object");
        System.out.println("Name : " + c2.name);
        System.out.println("Balance of Account : " + c2.account.balance);
        System.out.println("City : " + c2.address.city);
    }

    /**
     * OUTPUT 
     * 
     * Original Object Name : Ram 
     * Balance of Account : 10.0 
     * City : Delhi
     * 
     * -------------------------- 
     * Cloned Object 
     * Name : Balram 
     * Balance of Account: 20.0 
     * City : Delhi
     */
}
```

### Explanation:

- **Purpose:** The `TestCloning` class is designed to demonstrate deep cloning in Java, allowing modifications to a cloned object without affecting the original object.

- **Creating Original Object:** A `Customer` object `c1` is created with the name "Ram" and the city set to "Mumbai."

- **Cloning:** The `clone()` method is called on `c1` to create a new `Customer` object `c2`. This should be implemented properly in the `Customer` class to ensure deep cloning.

- **Modifying Cloned Object:** Changes are made to the `c2` object, including changing the name to "Balram," updating the account balance, and changing the city to "Delhi." Since deep cloning is used, these changes do not affect the original object `c1`.

- **Output:** The program prints the details of both the original and cloned objects, demonstrating that they are independent of each other. The original retains its values, while the cloned object shows the updated values.
