```java
package com.sunilos.p08collection;

/**
 * HashMap इंटरफ़ेस और इसके ठोस वर्ग का परीक्षण करें
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap {

    public static void main(String[] args) {

        // एक नया HashMap उदाहरण बनाएं
        HashMap map = new HashMap();

        // मैप में तत्व जोड़ें
        map.put(null, "Zero"); // null कुंजी जोड़ना
        map.put("0", null); // null मान के साथ कुंजी जोड़ना
        map.put("00", null); // एक और कुंजी null मान के साथ
        map.put("1", "One"); // कुंजी-मूल्य जोड़ा जोड़ना
        map.put("2", "Two");
        map.put("3", "Three");
        map.put("4", "Four");
        map.put("5", "Five");

        // मैप का आकार प्राप्त करें
        int size = map.size();
        System.out.println("लंबाई : " + size); // आकार प्रिंट करें

        // कुंजी द्वारा एक तत्व प्राप्त करें
        String val = (String) map.get("2"); // कुंजी "2" के लिए मान प्राप्त करें
        System.out.println(val); // मान प्रिंट करें

        // कुंजी द्वारा एक तत्व हटा दें
        map.remove("1"); // कुंजी "1" और उसके संबंधित मान को हटाएं

        // जांचें कि क्या कोई कुंजी मैप में मौजूद है
        boolean flag = map.containsKey("1");
        System.out.println(flag); // यदि कुंजी "1" मौजूद है तो true प्रिंट करें, अन्यथा false

        // जांचें कि क्या कोई विशेष मान मैप में मौजूद है
        flag = map.containsValue("Two");
        System.out.println(flag); // यदि मान "Two" मौजूद है तो true प्रिंट करें, अन्यथा false

        System.out.println("\nकुंजी सेट दृश्य");
        // कुंजी का सेट दृश्य प्राप्त करें और प्रत्येक कुंजी प्रिंट करें
        Set keys = map.keySet();
        for (Object k : keys) {
            System.out.println(k);
        }

        System.out.println("\nमान संग्रह दृश्य");
        // मानों का संग्रह दृश्य प्राप्त करें और प्रत्येक मान प्रिंट करें
        Collection values = map.values();
        for (Object v : values) {
            System.out.println(v);
        }

        System.out.println("\nकुंजी-मान जोड़ी दृश्य");
        // कुंजी-मान जोड़ी प्राप्त करें और उन्हें प्रिंट करें
        Set keyValue = map.entrySet();
        for (Object ele : keyValue) {
            Map.Entry pair = (Map.Entry) ele; // Map.Entry में कास्ट करें
            System.out.println(pair.getKey() + " - " + pair.getValue()); // कुंजी-मान जोड़ियों को प्रिंट करें
        }
    }
}
```

### व्याख्या:

1. **Imports:** आवश्यक कक्षाएं `java.util` पैकेज से आयात की गई हैं।

2. **Class Declaration:** `TestHashMap` `HashMap` वर्ग का उपयोग दिखाता है।

3. **Main Method:**
   - **HashMap Creation:** एक नया `HashMap` उदाहरण बनाया जाता है।
   - **Adding Elements:** विभिन्न कुंजी-मूल्य जोड़े जोड़े जाते हैं, जिसमें null कुंजी और मान भी शामिल हैं।
   - **Size of Map:** `size()` का उपयोग करके मैप का आकार प्राप्त किया जाता है और प्रिंट किया जाता है।
   - **Getting Values:** एक विशेष कुंजी ("2") से संबंधित मान `get()` का उपयोग करके प्राप्त किया जाता है।
   - **Removing Elements:** `remove()` का उपयोग करके एक कुंजी-मूल्य जोड़ा हटाया जाता है।
   - **Key Existence Check:** `containsKey()` यह जांचता है कि कोई विशेष कुंजी मैप में मौजूद है या नहीं।
   - **Value Existence Check:** `containsValue()` यह जांचता है कि कोई विशेष मान मैप में मौजूद है या नहीं।
   - **Key Set View:** मैप की कुंजियों को `keySet()` का उपयोग करके प्राप्त किया जाता है और प्रिंट किया जाता है।
   - **Value Collection View:** मानों को `values()` का उपयोग करके प्राप्त किया जाता है और प्रिंट किया जाता है।
   - **Key-Value Pair View:** कुंजी-मान जोड़ियों को `entrySet()` का उपयोग करके प्राप्त किया जाता है और प्रिंट किया जाता है। प्रत्येक प्रविष्टि को `Map.Entry` में कास्ट किया जाता है ताकि कुंजियों और मूल्यों तक पहुंचा जा सके।

यह वर्ग `HashMap` वर्ग की मुख्य कार्यक्षमताओं को प्रभावी ढंग से प्रदर्शित करता है, जिसमें तत्वों को जोड़ना, प्राप्त करना और हटाना, साथ ही कुंजी और मानों की उपस्थिति की जांच करना शामिल है।
