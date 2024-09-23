```java
package com.sunilos.p04controlstmt;

/**
 * Example program of IF-ELSE control statement that prints the grade of a student
 * based on their marks.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class StudentGrade {

    public static void main(String[] args) {

        // Marks of the student
        int marks = 80;

        // Determine the grade based on marks
        if (marks >= 90) {
            // If marks are 90 or above, print Grade A
            System.out.println("Grade A ");
        } else if (marks >= 80) {
            // If marks are between 80 and 89, print Grade B
            System.out.println("Grade B ");
        } else if (marks >= 70) {
            // If marks are between 70 and 79, print Grade C
            System.out.println("Grade C ");
        } else if (marks >= 60) {
            // If marks are between 60 and 69, print Grade D
            System.out.println("Grade D ");
        } else {
            // If marks are below 60, print Grade F
            System.out.println("Grade F ");
        }
    }
}
```

### Explanation:
- **`int marks = 80;`**: Declares and initializes a variable `marks` with a value of 80.
- **`if (marks >= 90)`**: Checks if the marks are 90 or higher; if true, prints "Grade A".
- **`else if (marks >= 80)`**: Checks if the marks are between 80 and 89; if true, prints "Grade B".
- **`else if (marks >= 70)`**: Checks if the marks are between 70 and 79; if true, prints "Grade C".
- **`else if (marks >= 60)`**: Checks if the marks are between 60 and 69; if true, prints "Grade D".
- **`else`**: Executes if all previous conditions are false, printing "Grade F" for marks below 60.
