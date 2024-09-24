```java
package com.sunilos.p08collection;

/**
 * Hashtable इंटरफेस और इसके ठोस वर्ग का परीक्षण करें
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.*;

public class TestHashtable {

    public static void main(String[] args) {

        // की-मान जोड़े स्टोर करने के लिए एक नया Hashtable उदाहरण बनाएं
        Hashtable map = new Hashtable();

        // तत्व जोड़ें
        // अगले लाइनों को अनकमेंट करने से NullPointerException होगा 
        // क्योंकि Hashtable में null कुंजी या मान की अनुमति नहीं है
        // map.put(null, "Zero"); // null कुंजी अनुमति नहीं है
        // map.put("0", null);    // null मान अनुमति नहीं है
        map.put("1", "One");    // की-मान जोड़ना
        map.put("2", "Two");
        map.put("3", "Three");
        map.put("4", "Four");
        map.put("5", "Five");

        // Hashtable का आकार प्राप्त करें
        int size = map.size();
        System.out.println("Length : " + size);

        // कुंजी द्वारा एक तत्व प्राप्त करें
        String val = (String) map.get("2");
        System.out.println(val); // कुंजी "2" से संबंधित मान प्रिंट करें

        // कुंजी द्वारा एक तत्व हटा दें
        map.remove("1"); // कुंजी "1" के साथ प्रविष्टि को हटाता है

        // चेक करें कि एक विशिष्ट कुंजी मौजूद है या नहीं
        boolean flag = map.containsKey("1");
        System.out.println(flag); // चूंकि कुंजी "1" हटा दी गई थी, false प्रिंट करता है

        // चेक करें कि एक विशिष्ट मान मौजूद है या नहीं
        flag = map.containsValue("Two");
        System.out.println(flag); // चूंकि मान "Two" मौजूद है, true प्रिंट करता है

        System.out.println("\nKey Set View");
        // कुंजियों का संग्रह प्राप्त करें और प्रिंट करें
        Set keys = map.keySet();
        for (Object k : keys) {
            System.out.println(k); // Hashtable में प्रत्येक कुंजी प्रिंट करें
        }

        System.out.println("\nValue Collection View");
        // मानों का संग्रह प्राप्त करें और प्रिंट करें
        Collection values = map.values();
        for (Object v : values) {
            System.out.println(v); // Hashtable में प्रत्येक मान प्रिंट करें
        }

        System.out.println("\nKey-Value Pair View");
        // की-मान जोड़ियों को प्राप्त करें और प्रिंट करें
        Set keyValue = map.entrySet();
        for (Object ele : keyValue) {
            Map.Entry pair = (Map.Entry) ele; // की-मान जोड़ियों के लिए Map.Entry में कास्ट करें
            System.out.println(pair.getKey() + " - " + pair.getValue()); // की-मान जोड़ियाँ प्रिंट करें
        }

    }
}
```

### व्याख्या:

1. **Imports:** आवश्यक कक्षाएं `java.util` से आयात की गई हैं, जिनमें `Hashtable`, `Collection`, `Set` आदि शामिल हैं।

2. **Class Declaration:** `TestHashtable` `Hashtable` वर्ग के उपयोग का प्रदर्शन करता है।

3. **Main Method:**
   - **Hashtable Creation:** एक नया `Hashtable` उदाहरण बनाया जाता है जो की-मान जोड़ियों को रखता है।
   - **Adding Elements:** कई की-मान जोड़ियाँ जोड़ी जाती हैं। यह महत्वपूर्ण है कि `Hashtable` null कुंजी या मानों की अनुमति नहीं देता है (अनकमेंट की गई पंक्तियाँ इस बात को स्पष्ट करती हैं)।
   - **Getting Size:** `size()` विधि का उपयोग करके `Hashtable` में प्रविष्टियों की संख्या प्रिंट की जाती है।
   - **Retrieving Values:** विशेष कुंजी ("2") से संबंधित मान को प्राप्त करके प्रिंट किया जाता है।
   - **Removing Elements:** `remove()` विधि का उपयोग करके एक प्रविष्टि को हटाया जाता है।
   - **Key Existence Check:** एक विशेष कुंजी की उपस्थिति की जांच `containsKey()` के साथ की जाती है, और परिणाम प्रिंट किया जाता है।
   - **Value Existence Check:** एक विशेष मान की उपस्थिति की जांच `containsValue()` के साथ की जाती है, और परिणाम प्रिंट किया जाता है।
   - **Printing Keys and Values:**
     - कुंजियों को `keySet()` का उपयोग करके प्रिंट किया जाता है।
     - मानों को `values()` का उपयोग करके प्रिंट किया जाता है।
   - **Printing Key-Value Pairs:** की-मान जोड़ियों को `entrySet()` का उपयोग करके प्रिंट किया जाता है, जो दिखाता है कि कुंजियों और उनके संबंधित मानों तक कैसे पहुँचना है।

यह वर्ग `Hashtable` की मुख्य कार्यक्षमताओं को प्रदर्शित करता है, जिसमें की-मान जोड़ियाँ जोड़ना, प्राप्त करना और प्रबंधित करना शामिल है।
