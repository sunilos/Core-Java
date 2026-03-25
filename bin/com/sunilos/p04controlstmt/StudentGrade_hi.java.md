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

        // छात्र के अंक
        int marks = 80;

        // अंकों के आधार पर ग्रेड निर्धारित करें
        if (marks >= 90) {
            // अगर अंक 90 या उससे ऊपर हैं, तो Grade A प्रिंट करें
            System.out.println("Grade A ");
        } else if (marks >= 80) {
            // अगर अंक 80 से 89 के बीच हैं, तो Grade B प्रिंट करें
            System.out.println("Grade B ");
        } else if (marks >= 70) {
            // अगर अंक 70 से 79 के बीच हैं, तो Grade C प्रिंट करें
            System.out.println("Grade C ");
        } else if (marks >= 60) {
            // अगर अंक 60 से 69 के बीच हैं, तो Grade D प्रिंट करें
            System.out.println("Grade D ");
        } else {
            // अगर अंक 60 से कम हैं, तो Grade F प्रिंट करें
            System.out.println("Grade F ");
        }
    }
}
```

### व्याख्या:
- **`int marks = 80;`**: एक चर `marks` को 80 के मान से प्रारंभ करता है।
- **`if (marks >= 90)`**: चेक करता है कि अंक 90 या उससे अधिक हैं; यदि सही है, "Grade A" प्रिंट करता है।
- **`else if (marks >= 80)`**: चेक करता है कि अंक 80 से 89 के बीच हैं; यदि सही है, "Grade B" प्रिंट करता है।
- **`else if (marks >= 70)`**: चेक करता है कि अंक 70 से 79 के बीच हैं; यदि सही है, "Grade C" प्रिंट करता है।
- **`else if (marks >= 60)`**: चेक करता है कि अंक 60 से 69 के बीच हैं; यदि सही है, "Grade D" प्रिंट करता है।
- **`else`**: अगर सभी पिछले शर्तें गलत हैं, तो 60 से कम अंकों के लिए "Grade F" प्रिंट करता है।
