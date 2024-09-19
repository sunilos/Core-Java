```java
package com.sunilos.p01basics;

/**
 * FirstHello क्लास एक साधारण Java प्रोग्राम है जो कंसोल पर "Hello SunilOS" प्रिंट करता है।
 * 
 * यह एक बुनियादी प्रोग्राम है जो Java का परिचय देने के लिए है। यह प्रोग्राम दिखाता है कि 
 * संदेशों को कंसोल पर कैसे प्रिंट किया जाता है, वेरिएबल्स को कैसे परिभाषित और उपयोग किया जाता है, 
 * और while लूप का उपयोग कैसे किया जाता है।
 * 
 * @author Sunil Sahu
 * @version 1.0
 * @since 16 Nov 2014
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class FirstHello {
    /**
     * main मेथड एप्लिकेशन का एंट्री पॉइंट है।
     * यह कंसोल पर "Hello SunilOS" प्रिंट करता है, एक स्ट्रिंग वेरिएबल का उपयोग करके व्यक्तिगत संदेश प्रिंट करता है,
     * और while लूप का उपयोग करके "Hello SunilOS" को पांच बार प्रिंट करता है।
     *
     * @param args रनटाइम आर्गुमेंट्स (इस प्रोग्राम में उपयोग नहीं होते)।
     */
    public static void main(String[] args) {

        // कंसोल पर "Hello SunilOS" प्रिंट करें
        System.out.println("Hello SunilOS");

        // एक स्ट्रिंग वेरिएबल को परिभाषित करें और व्यक्तिगत संदेश प्रिंट करें
        String name = "SunilOS";
        System.out.println("Hello " + name);

        // while लूप का उपयोग करके "Hello SunilOS" को पांच बार प्रिंट करें
        int i = 0;
        while (i < 5) {
            System.out.println(i + " Hello SunilOS");
            i++;
        }

    }
}
```

स्पष्टीकरण:
- प्रोग्राम कंसोल पर "Hello SunilOS" प्रिंट करता है।
- यह `name` नामक स्ट्रिंग वेरिएबल को परिभाषित करता है और व्यक्तिगत संदेश प्रिंट करता है।
- यह while लूप का उपयोग करके "Hello SunilOS" को पांच बार प्रिंट करता है, हर बार लूप इंडेक्स के साथ।
