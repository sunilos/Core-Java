```java
package com.sunilos.p03date;

import java.util.Random;

/**
 * यादृच्छिक (Random) संख्याएँ प्राप्त करें
 * 
 * यह प्रोग्राम `Math.random()` और `Random` क्लास का उपयोग करके यादृच्छिक संख्याएँ उत्पन्न करने का तरीका प्रदर्शित करता है।
 * यह एक निर्धारित सीमा में यादृच्छिक पूर्णांक और डबल उत्पन्न करता है।
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class GetRandomNumbers {

    public static void main(String[] args) {

        // Math.random() का उपयोग करके 0 और 100 के बीच यादृच्छिक पूर्णांक उत्पन्न करें
        System.out.println("Random integer between 1 to 100 using Math.random()");
        for (int i = 0; i < 10; i++) {
            // Math.random() 0.0 और 1.0 के बीच एक डबल उत्पन्न करता है, जिसे फिर 100 से गुणा कर int में बदल दिया जाता है
            int randomNo = (int) (Math.random() * 100); 
            System.out.println((i + 1) + " :" + randomNo); // यादृच्छिक पूर्णांक प्रिंट करें
        }

        // Random क्लास का उपयोग करके 0 और 100 के बीच यादृच्छिक पूर्णांक उत्पन्न करें
        System.out.println("\nRandom integer between 1 to 100 using Random class");
        Random r = new Random(); // एक नया Random ऑब्जेक्ट बनाएं
        for (int i = 0; i < 10; i++) {
            int randomInt = r.nextInt(100); // 0 और 100 के बीच एक यादृच्छिक पूर्णांक उत्पन्न करें
            System.out.println(randomInt); // यादृच्छिक पूर्णांक प्रिंट करें
        }

        // Random क्लास का उपयोग करके यादृच्छिक डबल संख्याएँ उत्पन्न करें
        System.out.println("\nRandom double between 1 to 100 using Random class");
        for (int i = 0; i < 10; i++) {
            double randomD = r.nextDouble(); // 0.0 और 1.0 के बीच एक यादृच्छिक डबल उत्पन्न करें
            System.out.println(randomD); // यादृच्छिक डबल प्रिंट करें
        }

    }
}
```

### Explanation (साधारण हिंदी में):
- **`Math.random()`**: 0.0 और 1.0 के बीच एक डबल मान उत्पन्न करता है। इसे 100 से गुणा करके और पूर्णांक में बदलकर, 0 और 100 के बीच यादृच्छिक पूर्णांक उत्पन्न करते हैं।
- **`Random` क्लास**: यह क्लास अधिक उन्नत यादृच्छिक संख्या उत्पन्न करने की विधियाँ प्रदान करती है, जैसे कि `nextInt()` पूर्णांकों के लिए और `nextDouble()` डबल मानों के लिए।
- **`nextInt(100)`**: 0 और 100 के बीच यादृच्छिक पूर्णांक उत्पन्न करता है।
- **`nextDouble()`**: 0.0 और 1.0 के बीच यादृच्छिक डबल मान उत्पन्न करता है।
