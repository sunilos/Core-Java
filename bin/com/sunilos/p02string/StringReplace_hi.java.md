```java
package com.sunilos.p02string;

/**
 * एक स्ट्रिंग में सबस्ट्रिंग को `replace()` मेथड का उपयोग करके बदलने का प्रोग्राम।
 * यह प्रोग्राम एक विशेष सबस्ट्रिंग को ढूंढता है और उसे दूसरी सबस्ट्रिंग से बदलता है।
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class StringReplace {

    public static void main(String[] args) {
        // मूल स्ट्रिंग
        String str = "This is Google";
        
        // "Google" सबस्ट्रिंग का इंडेक्स प्राप्त करें
        System.out.println(str.indexOf("Google"));
        
        // "Google" को "Sunrays" से मूल स्ट्रिंग में बदलें
        String newStr = str.replace("Google", "Sunrays");
        
        // बदली गई स्ट्रिंग को प्रिंट करें
        System.out.println(newStr);
    }

}
```

### सरल हिंदी में व्याख्या:
- **`indexOf()`**: यह मेथड निर्दिष्ट सबस्ट्रिंग ("Google") के पहले मिलने वाले स्थान (इंडेक्स) को वापस करता है। इससे पता चलता है कि स्ट्रिंग में सबस्ट्रिंग कहां से शुरू हो रही है।
- **`replace()`**: यह मेथड सभी मिलने वाले सबस्ट्रिंग्स ("Google") को नई सबस्ट्रिंग ("Sunrays") से बदल देता है। इस उदाहरण में, केवल "Google" का एक उदाहरण बदला गया है।
