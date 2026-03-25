```java
package com.sunilos.p04controlstmt;

import java.util.ArrayList;

/**
 * FOR EACH लूप का उदाहरण वर्ग
 * 
 * यह प्रोग्राम फॉर-ईच लूप के उपयोग को प्रदर्शित करता है, जो सरणियों और संग्रहों पर पुनरावृत्ति को सरल बनाता है।
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class ForEachLoop {
    public static void main(String[] args) {
        // पूर्णांकों का एक सरणी बनाएं
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // फॉर-ईच लूप का उपयोग करके सरणी के सभी तत्वों को प्रिंट करें
        for (int n : numbers) {
            System.out.println(n); // वर्तमान संख्या प्रिंट करें
        }

        // स्ट्रिंग तत्वों को रखने के लिए एक ArrayList बनाएं
        ArrayList<String> names = new ArrayList<String>();
        names.add("One"); // सूची में "One" जोड़ें
        names.add("Two"); // सूची में "Two" जोड़ें

        // फॉर-ईच लूप का उपयोग करके ArrayList के सभी तत्वों को प्रिंट करें
        for (String n : names) {
            System.out.println(n); // वर्तमान नाम प्रिंट करें
        }
    }
}
```

### व्याख्या:
- **फॉर-ईच लूप**: एक संक्षिप्त तरीका है जिससे सरणी या संग्रह के प्रत्येक तत्व पर पुनरावृत्ति की जा सकती है बिना इंडेक्स की आवश्यकता के।
- **`int[] numbers`**: 1 से 10 तक पूर्णांकों का एक सरणी।
- **`ArrayList<String> names`**: एक गतिशील सरणी जो स्ट्रिंग तत्वों को रखती है। तत्वों को बिना निश्चित आकार निर्दिष्ट किए जोड़ा जा सकता है।
- **आउटपुट**: प्रोग्राम `numbers` सरणी में सभी पूर्णांकों को प्रिंट करता है, उसके बाद `names` सूची में नाम प्रिंट करता है।
