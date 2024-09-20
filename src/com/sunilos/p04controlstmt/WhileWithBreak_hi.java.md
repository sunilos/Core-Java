```java
package com.sunilos.p04controlstmt;

/**
 * Break statement is used to terminate a WHILE loop
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class WhileWithBreak {

    public static void main(String[] args) {

        // स्थानीय चर i को 0 से प्रारंभ करें
        int i = 0;
        // एक बूलियन फ्लैग जो true से प्रारंभ होता है
        boolean flag = true;

        // जब तक फ्लैग true है, WHILE लूप चलाएं
        while (flag) {
            // यदि i की वैल्यू 5 है, तो लूप तोड़ दें
            if (i == 5) {
                break; // लूप से बाहर निकलें
            }
            // i की वर्तमान वैल्यू के साथ एक संदेश प्रिंट करें
            System.out.println(i + " Hello While loop");
            // i को 1 से बढ़ाएं
            i++;
        }
    }
}
```

### व्याख्या:
- **`int i = 0;`**: चर `i` को 0 से प्रारंभ करता है, जो लूप काउंटर के रूप में उपयोग किया जाएगा।
- **`boolean flag = true;`**: एक बूलियन चर `flag` घोषित करता है जो लूप के निष्पादन को नियंत्रित करता है।
- **`while (flag)`**: एक WHILE लूप शुरू करता है जो तब तक चलता है जब तक `flag` true है।
- **`if (i == 5) { break; }`**: जाँचता है कि `i` 5 के बराबर है; यदि सत्य है, तो `break` का उपयोग कर लूप को समाप्त कर देता है।
- **`System.out.println(i + " Hello While loop");`**: कंसोल पर `i` की वर्तमान वैल्यू के साथ एक संदेश प्रिंट करता है।
- **`i++;`**: प्रत्येक इटरेशन के बाद `i` की वैल्यू को 1 से बढ़ाता है, जिससे लूप अंततः ब्रेक कंडीशन तक पहुंच सके।
