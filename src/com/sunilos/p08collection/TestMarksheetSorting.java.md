
```java
package com.sunilos.p08collection;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Tests Marksheet collection and sort it by natural ordering (Comparable) and
 * on different attributes by Comparator.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestMarksheetSorting {

    public static void main(String[] args) {

        // Create a list to hold Marksheet objects
        ArrayList marksheets = new ArrayList();

        // Add Marksheet objects to the list
        marksheets.add(new Marksheet("A2", "Suraj", 90));    // ID: A2, Name: Suraj, Marks: 90
        marksheets.add(new Marksheet("A3", "Ankush", 80));   // ID: A3, Name: Ankush, Marks: 80
        marksheets.add(new Marksheet("A1", "Saurabh", 95));   // ID: A1, Name: Saurabh, Marks: 95
        marksheets.add(new Marksheet("A5", "Rishi", 89));     // ID: A5, Name: Rishi, Marks: 89
        marksheets.add(new Marksheet("A4", "Zuber", 89));     // ID: A4, Name: Zuber, Marks: 89
        marksheets.add(new Marksheet("A0", "Amit", 91));      // ID: A0, Name: Amit, Marks: 91

        // Print all elements of the list before sorting
        System.out.println("**Actual List**");
        for (Object o : marksheets) {
            System.out.println(o);
        }

        // Sort elements in natural order using Comparable
        Collections.sort(marksheets);

        // Print all elements after natural ordering sort
        System.out.println("\n**Sorted List Natural Ordering**");
        for (Object o : marksheets) {
            System.out.println(o);
        }

        // Sort elements by Name in ascending order using Comparator
        OrderByName cName = new OrderByName(); // Create a comparator for name
        Collections.sort(marksheets, cName); // Sort the list by name

        // Print all elements after sorting by name
        System.out.println("\n**Sorted By Name Comparator**");
        for (Object o : marksheets) {
            System.out.println(o);
        }

        // Sort elements by Name in descending order using Comparator
        OrderByNameDesc cDecName = new OrderByNameDesc(); // Create a comparator for descending name
        Collections.sort(marksheets, cDecName); // Sort the list by descending name

        // Print all elements after sorting by name in descending order
        System.out.println("\n**Sorted By desc Name Comparator**");
        for (Object o : marksheets) {
            System.out.println(o);
        }

        // Sort elements by Marks in descending order using Comparator
        OrderByMarksDesc cMarks = new OrderByMarksDesc(); // Create a comparator for descending marks
        Collections.sort(marksheets, cMarks); // Sort the list by descending marks

        // Print all elements after sorting by marks in descending order
        System.out.println("\n**Sorted By desc Marks Comparator**");
        for (Object o : marksheets) {
            System.out.println(o);
        }

    }

}
```

### Explanation:

1. **Imports:** The necessary classes are imported, including `ArrayList` and `Collections`.

2. **Class Declaration:** The `TestMarksheetSorting` class is designed to demonstrate sorting a collection of `Marksheet` objects.

3. **Main Method:**
   - **Marksheet List Creation:** An `ArrayList` is created to store `Marksheet` objects.
   - **Adding Marksheet Objects:** Several `Marksheet` objects are instantiated with ID, name, and marks, and added to the list.
   - **Printing Original List:** The original list of marksheets is printed before any sorting occurs.
   - **Natural Ordering Sort:** The `Collections.sort()` method is called to sort the list based on the natural ordering defined in the `Marksheet` class (which should implement `Comparable`).
   - **Sorting by Name (Ascending):** A custom comparator (`OrderByName`) is used to sort the marksheets by name in ascending order.
   - **Sorting by Name (Descending):** Another custom comparator (`OrderByNameDesc`) is used to sort by name in descending order.
   - **Sorting by Marks (Descending):** The `OrderByMarksDesc` comparator sorts the marksheets based on marks in descending order.

4. **Print Statements:** After each sort, the updated list of marksheets is printed to show the results of the sorting operations.

This class effectively demonstrates the flexibility of Java collections for sorting objects based on different criteria using both natural ordering and custom comparators.
