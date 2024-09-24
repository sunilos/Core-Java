```java
package com.sunilos.p07exception;

/**
 * एक अंकगणितीय अपवाद का परीक्षण करता है जब एक संख्या को ZERO से विभाजित करने की कोशिश की जाती है।
 * यह निष्पादन के समय एक ArithmeticException को सक्रिय करेगा।
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestArithmeticException {

    public static void main(String[] args) {

        int k = 0; // हर गुणांक शून्य पर सेट किया गया
        int i = 15; // हर गुणांक

        System.out.println("Before Exception: I will be executed");

        /**
         * ZERO से विभाजित करने का प्रयास ArithmeticException को उठाएगा।
         * यह इसलिए होता है क्योंकि शून्य से विभाजन गणित में अपरिभाषित है।
         */
        double div = i / k; // यह पंक्ति अपवाद फेंकेगी

        /**
         * निम्नलिखित कथन निष्पादित नहीं होंगे क्योंकि पहले की विभाजन प्रक्रिया 
         * द्वारा उठाया गया अपवाद बिना हैंडल किए JVM को सौंपा गया है।
         */
        System.out.println("After Exception: I will NOT be executed");
        System.out.println("Div is " + div); // यह पंक्ति निष्पादित नहीं होगी

    }
}
```

### व्याख्या:

- **उद्देश्य:** `TestArithmeticException` क्लास इस व्यवहार को प्रदर्शित करने के लिए डिज़ाइन की गई है जब `ArithmeticException` उत्पन्न होता है, जो शून्य से विभाजन के कारण होता है।

- **चर आरंभ करना:** 
  - `k` को `0` पर प्रारंभ किया गया है, जो विभाजन क्रिया में हर गुणांक है।
  - `i` को `15` पर प्रारंभ किया गया है, जो हर गुणांक है।

- **निष्पादन प्रवाह:**
  - प्रोग्राम एक संदेश प्रिंट करता है जो बताता है कि यह सामान्य रूप से निष्पादित होगा।
  - अगली पंक्ति `i / k` का विभाजन करने का प्रयास करती है। चूंकि `k` `0` है, यह क्रिया `ArithmeticException` को सक्रिय करती है।
  
- **अपवाद हैंडलिंग:**
  - जब अपवाद उत्पन्न होता है, तो नियंत्रण JVM को स्थानांतरित किया जाता है, जो प्रोग्राम को समाप्त कर देगा जब तक कि अपवाद को पकड़ा और संभाला न जाए। परिणामस्वरूप, विभाजन क्रिया के बाद की पंक्तियाँ निष्पादित नहीं होंगी।
  
- **आउटपुट:**
  - पहली प्रिंट स्टेटमेंट सफलतापूर्वक निष्पादित होती है, लेकिन बाद की पंक्तियाँ कभी नहीं पहुँचती हैं क्योंकि अपवाद उठाया गया है।