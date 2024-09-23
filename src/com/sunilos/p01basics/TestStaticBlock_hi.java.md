```java
package com.sunilos.p01basics;

/**
 * TestStaticBlock क्लास Java में static blocks के उपयोग को दर्शाता है।
 * 
 * Static blocks का उपयोग क्लास के static वेरिएबल्स या सदस्यों को इनिशियलाइज करने के लिए किया जाता है।
 * ये ब्लॉक्स क्लास के लोड होने पर, main मेथड के कॉल होने से पहले execute होते हैं।
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestStaticBlock {

    static {
        System.out.println("I will call first!"); // Static block सबसे पहले execute होता है
    }

    public static void main(String[] args) {
        System.out.println("I will call second!!"); // Main method static block के बाद execute होता है

    }

    /**
     * Output:
     * I will call first! 
     * I will call second!!
     */
}
```

### समझाइश:
- **Static Block**: यह block क्लास के मेमोरी में लोड होने पर execute होता है, और main मेथड से पहले चलता है। इसका उपयोग static इनिशियलाइजेशन के लिए किया जाता है।
- **Main Method**: यह प्रोग्राम का entry point है और static block के बाद execute होता है।
- **Output**: Output में सबसे पहले "I will call first!" और फिर "I will call second!!" दिखेगा, क्योंकि static blocks main मेथड से पहले चलते हैं।
