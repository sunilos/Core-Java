```java
package com.sunilos.p03date;

import java.util.Calendar;
import java.util.Date;

/**
 * तारीख गणना का परीक्षण
 * 
 * यह प्रोग्राम `Calendar` और `Date` क्लास का उपयोग करके विभिन्न तारीख हेरफेर (manipulations) प्रदर्शित करता है।
 * इसमें पिछले और भविष्य की तारीखों को प्राप्त करना और तारीखों की तुलना करना शामिल है।
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestDateArithmetic {

    public static void main(String[] args) {

        // वर्तमान तारीख प्राप्त करें
        Date today = new Date();

        // वर्तमान समय क्षेत्र और लोकेल के अनुसार Calendar प्राप्त करें
        Calendar cal = Calendar.getInstance();

        // Calendar को वर्तमान तारीख पर सेट करें
        cal.setTime(today);

        // एक दिन घटाएँ और कल की तारीख प्राप्त करें
        cal.add(Calendar.DATE, -1);
        Date yesterday = cal.getTime(); // कल की तारीख प्राप्त करें

        // दो दिन जोड़ें और कल की तारीख प्राप्त करें
        cal.add(Calendar.DATE, 2);
        Date tomorrow = cal.getTime(); // कल की तारीख प्राप्त करें

        // 30 दिन जोड़ें और भविष्य की तारीख प्राप्त करें
        cal.add(Calendar.DATE, 30);
        Date nextEvent = cal.getTime(); // 30 दिनों के बाद की तारीख प्राप्त करें

        // गणना की गई तारीखें प्रदर्शित करें
        System.out.println("Yesterday : " + yesterday);
        System.out.println("Today : " + today);
        System.out.println("Tomorrow : " + tomorrow);
        System.out.println("Event after 30 Days : " + nextEvent);

        // वर्तमान तारीख का वर्ष का दिन प्राप्त करें
        int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);

        // आज की तारीख की तुलना कल की तारीख से करें
        if (today.getTime() > yesterday.getTime()) {
            System.out.println("Today is greater than Yesterday");
        }

        // जाँचें कि क्या आज की तारीख कल के बाद आती है
        if (today.after(yesterday)) {
            System.out.println("Today comes after Yesterday");
        }

        // compareTo मेथड से तारीखों की तुलना करें
        if (yesterday.compareTo(today) == -1) {
            System.out.println("Yesterday is smaller than Today");
        }

        if (today.compareTo(yesterday) == 1) {
            System.out.println("Yesterday is smaller than Today");
        }

        if (today.compareTo(today) == 0) {
            System.out.println("Today is today, do not lose it");
        }
    }
}
```

### Explanation (साधारण हिंदी में):
- **`Calendar.getInstance()`**: यह वर्तमान समय क्षेत्र और स्थान के अनुसार एक कैलेंडर प्राप्त करता है।
- **`setTime(Date date)`**: यह कैलेंडर को किसी विशिष्ट तारीख पर सेट करता है।
- **`add(Calendar.DATE, int value)`**: वर्तमान तारीख में दिनों को जोड़ता (या घटाता) है।
- **`getTime()`**: यह कैलेंडर के समय का प्रतिनिधित्व करने वाला एक `Date` ऑब्जेक्ट लौटाता है।
- **`getTime()` और `after()`**: तारीखों की तुलना करने के लिए उपयोग होता है।
- **`compareTo()`**: यह दो तारीखों की तुलना करता है। यह लौटाता है:
  - `0`, अगर तारीखें समान हैं,
  - `1`, अगर वर्तमान तारीख बाद की है,
  - `-1`, अगर वर्तमान तारीख पहले की है।
