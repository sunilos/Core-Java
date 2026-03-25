```java
package com.sunilos.p01basics;
/**
 * Primitive Data Types का परीक्षण करने के लिए उदाहरण
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestPrimitiveType {

    public static void main(String[] args) {

        // Primitive Literals

        boolean result = true; // बूलियन लिटेरल

        // Integer Literals
        byte b = 100; // बाइट लिटेरल
        short s = 10000; // शॉर्ट लिटेरल
        int i = 100000; // इन्टेजर लिटेरल
        long l = 100000L; // लॉन्ग लिटेरल 'L' प्रत्यय के साथ

        // अन्य नंबर सिस्टम
        // 0x हैक्साडेसिमल और 0b बाइनरी के लिए उपसर्ग हैं:

        int decVal = 26; // दशमलव में 26
        int hexVal = 0x1a; // हैक्साडेसिमल में 26
        int binVal = 0b11010; // बाइनरी में 26

        System.out.println("Decimal Value : " + decVal);
        System.out.println("Hex Value : " + hexVal);
        System.out.println("Binary Value : " + binVal);

        // Floating-Point Literals
        float f = 1.5F; // फ्लोट लिटेरल 'F' प्रत्यय के साथ
        double d = 1.5; // डबल लिटेरल
        double d1 = 1.5D; // डबल लिटेरल 'D' प्रत्यय के साथ

        // Java SE 7 में अंडरस्कोर का उपयोग
        long creditCardNumber = 1234_5678_9012_3456L; // लॉन्ग लिटेरल अंडरस्कोर के साथ
        long socialSecurityNumber = 999_99_9999L; // लॉन्ग लिटेरल अंडरस्कोर के साथ

        System.out.println("Credit Card Number : " + creditCardNumber);
        System.out.println("Social Security Number :" + socialSecurityNumber);

        // कैरेक्टर और स्ट्रिंग लिटेरल
        char capitalC = 'C'; // कैरेक्टर लिटेरल
        char unicodeCapitalC = '\u0043'; // युनिकोड कैरेक्टर लिटेरल
        String name = "SUNRAYS"; // स्ट्रिंग लिटेरल
        String unicodeName = "SUN\u0052AYS"; // युनिकोड एस्केप के साथ स्ट्रिंग लिटेरल

        System.out.println("Unicode C : " + unicodeCapitalC);
        System.out.println("Unicode SUNRAYS : " + unicodeName);

        // एस्केप सीक्वेंस
        // \b (बैकस्पेस), \t (टैब), \n (लाइन फीड), \f (फॉर्म फीड), \r
        // (कैरेज रिटर्न), \" (डबल क्वोट), \' (सिंगल क्वोट), और \\ 
        // (बैकस्लाश)

        char backspace = '\b'; // बैकस्पेस
        char tab = '\t'; // टैब
        char lineFeed = '\n'; // लाइन फीड
        char formFeed = '\f'; // फॉर्म फीड
        char carriageReturn = '\r'; // कैरेज रिटर्न
        char doubleQuote = '\"'; // डबल क्वोट
        char singleQuote = '\''; // सिंगल क्वोट
        char backslash = '\\'; // बैकस्लाश

    }

}
```

### व्याख्या:
- यह प्रोग्राम विभिन्न प्राइमिटिव डेटा प्रकारों और उनके लिटेरल्स का उपयोग दिखाता है।
- इसमें इंटीजर लिटेरल्स, फ्लोटिंग-पॉइंट लिटेरल्स, कैरेक्टर लिटेरल्स, और स्ट्रिंग लिटेरल्स शामिल हैं, साथ ही हैक्साडेसिमल, बाइनरी और युनिकोड मानों का उपयोग भी शामिल है।
- इसमें अंडरस्कोर के साथ न्यूमेरिक लिटेरल्स और विशेष कैरेक्टरों के लिए एस्केप सीक्वेंस का उपयोग भी दिखाया गया है।
