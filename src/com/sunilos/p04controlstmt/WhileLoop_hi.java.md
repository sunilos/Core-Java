```java
package com.sunilos.p04controlstmt;

/**
 * Example class for WHILE loop
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class WhileLoop {

    public static void main(String[] args) {

        // स्थानीय चर i को 0 से प्रारंभ करें
        int i = 0;

        // लूप को तब तक चलाएं जब तक i 5 से कम है
        while (i < 5) {
            // i की वर्तमान वैल्यू के साथ एक संदेश प्रिंट करें
            System.out.println(i + " Hello While loop");
            // अनंत लूप से बचने के लिए i को 1 से बढ़ाएं
            i++;
        }
    }
}
```

### व्याख्या:
- **`int i = 0;`**: चर `i` को 0 से प्रारंभ करता है, जो लूप काउंटर के रूप में उपयोग होगा।
- **`while (i < 5)`**: एक WHILE लूप शुरू करता है जो तब तक चलता है जब तक `i` 5 से कम है।
- **`System.out.println(i + " Hello While loop");`**: कंसोल पर `i` की वर्तमान वैल्यू के साथ एक संदेश प्रिंट करता है।
- **`i++;`**: प्रत्येक इटरेशन के बाद `i` की वैल्यू को 1 से बढ़ाता है, यह सुनिश्चित करते हुए कि लूप अंततः समाप्त होगा जब `i` 5 तक पहुंचेगा।
