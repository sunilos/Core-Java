
```java
package com.sunilos.p08collection;

import java.util.Comparator;

/**
 * Compares two Employee objects based on their last names and first names.
 * This comparator can be used to sort Employee objects in a collection.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class EmployeeByNameComparator implements Comparator<Employee> {

    /**
     * Compares two Employee objects by their last name and, if equal, by their first name.
     * 
     * @param e1 The first Employee to compare
     * @param e2 The second Employee to compare
     * @return a negative integer, zero, or a positive integer as the first Employee
     *         is less than, equal to, or greater than the second Employee, respectively.
     */
    public int compare(Employee e1, Employee e2) {

        // Compare last names using the String compareTo method
        int i = e1.getLastName().compareTo(e2.getLastName());

        // If last names are equal, compare first names
        if (i == 0) {
            i = e1.getFirstName().compareTo(e2.getFirstName());
        }
        return i; // Return the comparison result
    }
}
```

### Explanation:

- **Class Purpose:** The `EmployeeByNameComparator` class implements the `Comparator` interface to define a custom comparison logic for sorting `Employee` objects based on their names.

- **Comparator Interface:** By implementing `Comparator<Employee>`, this class can be used wherever sorting or ordering of `Employee` objects is required, such as in a list or a collection.

- **compare Method:**
  - **Parameters:** Accepts two `Employee` objects (`e1` and `e2`) for comparison.
  - **Comparison Logic:**
    - **Last Name Comparison:** The `compareTo` method of the `String` class is used to compare the last names of the two employees.
    - **First Name Comparison:** If the last names are equal (i.e., `i == 0`), it proceeds to compare the first names.
  - **Return Values:** 
    - Returns a negative integer if `e1` comes before `e2` (i.e., `e1`'s name is "less than" `e2`'s).
    - Returns zero if both names are equal.
    - Returns a positive integer if `e1` comes after `e2`.

Overall, this comparator allows for straightforward sorting of employees by name, ensuring a consistent and logical order based on last and first names.
