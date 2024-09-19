```java
package com.sunilos.p01basics;

/**
 * Explicit और implicit type casting का उदाहरण
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TypeCasting {

    public static void main(String[] args) {

        int i = 1;
        double d;
        char c = 'S';

        // int को double में बदलना
        d = i; // Implicit conversion: int को double में स्वतः बदल दिया जाता है
        System.out.println("int -> double = " + d);

        // double को int में बदलना
        i = (int) d; // Explicit conversion: double को int में बदलने के लिए cast की आवश्यकता होती है
        System.out.println("double -> int = " + i);

        // char को double में बदलना
        d = c; // Implicit conversion: char को double में स्वतः बदल दिया जाता है
        System.out.println("char -> double = " + d);

        // double को char में बदलना
        c = (char) d; // Explicit conversion: double को char में बदलने के लिए cast की आवश्यकता होती है
        System.out.println("double -> char = " + c);

    }

}
```

### Explanation:
- **Implicit Conversion**: स्वतः एक छोटे या संगत डेटा प्रकार को बड़े या संगत डेटा प्रकार में बदल दिया जाता है। उदाहरण के लिए, `int` को `double` और `char` को `double` में स्वतः बदल दिया जाता है।
- **Explicit Conversion**: एक बड़े डेटा प्रकार को छोटे या असंगत डेटा प्रकार में बदलने के लिए cast की आवश्यकता होती है। उदाहरण के लिए, `double` को `int` और `double` को `char` में बदलने के लिए explicit casting की आवश्यकता होती है।
