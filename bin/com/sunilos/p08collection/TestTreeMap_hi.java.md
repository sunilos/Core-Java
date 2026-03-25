```java
package com.sunilos.p08collection;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * TreeMap वर्ग का परीक्षण करें
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestTreeMap {

    public static void main(String[] args) {

        // एक TreeMap उदाहरण बनाएं
        TreeMap map = new TreeMap();

        // मैप में कुंजी-मूल्य जोड़ें
        map.put(1, "One");   // कुंजी 1 "One" से मैप होती है
        map.put(3, "Three"); // कुंजी 3 "Three" से मैप होती है
        map.put(2, "Two");   // कुंजी 2 "Two" से मैप होती है
        map.put(4, "Four");  // कुंजी 4 "Four" से मैप होती है
        map.put(5, "Five");  // कुंजी 5 "Five" से मैप होती है

        // कुंजी द्वारा मूल्य प्राप्त करें और उसे प्रिंट करें
        String val = (String) map.get(1); // कुंजी 1 के लिए मूल्य प्राप्त करें
        System.out.println(val); // "One" प्रिंट करें

        // कुंजी 4 के साथ एक प्रविष्टि हटाएं
        map.remove(4); // कुंजी 4 के लिए प्रविष्टि हटाएं

        // संग्रह दृश्य

        // कुंजियों का सेट प्राप्त करें और उन्हें प्रिंट करें
        Set keys = map.keySet(); // कुंजियों का सेट प्राप्त करें
        for (Object k : keys) {
            System.out.println(k); // प्रत्येक कुंजी प्रिंट करें
        }

        // कुंजियों को प्रिंट करने के लिए Iterator का उपयोग करना
        System.out.println("Iterator");
        Iterator it = keys.iterator(); // कुंजियों के लिए एक Iterator बनाएं
        while (it.hasNext()) {
            System.out.println(it.next()); // Iterator का उपयोग करके प्रत्येक कुंजी प्रिंट करें
        }

        // मूल्यों का संग्रह प्राप्त करें और उन्हें प्रिंट करें
        Collection vals = map.values(); // मूल्यों का संग्रह प्राप्त करें
        for (Object v : vals) {
            System.out.println(v); // प्रत्येक मूल्य प्रिंट करें
        }

        // मैप में सभी कुंजी-मूल्य जोड़े प्रिंट करें
        for (Object k : map.keySet()) {
            System.out.println(k + " = " + map.get(k)); // कुंजी और संबंधित मूल्य प्रिंट करें
        }

        // थ्रेड-सेफ संचालन के लिए TreeMap का समन्वयित संस्करण बनाएं
        SortedMap m = Collections.synchronizedSortedMap(map);
    }
}
```

### व्याख्या:

1. **Imports:** आवश्यक कक्षाएं आयात की गई हैं ताकि `TreeMap`, संग्रह और `java.util` पैकेज से उपयोगिताएँ इस्तेमाल की जा सकें।

2. **Class Declaration:** `TestTreeMap` कक्षा `TreeMap` कक्षा की कार्यक्षमता का प्रदर्शन करने के लिए बनाई गई है।

3. **Main Method:**
   - **TreeMap Initialization:** `map` नामक एक `TreeMap` उदाहरण बनाया गया है, जो कुंजी-मूल्य जोड़ियों को संग्रहीत करने के लिए है। `TreeMap` प्रविष्टियों को कुंजियों के प्राकृतिक क्रम के आधार पर क्रमबद्ध करता है।
   - **Adding Elements:** 
     - कई कुंजी-मूल्य जोड़ियाँ `put()` विधि का उपयोग करके मैप में जोड़ी गई हैं। कुंजी पूर्णांक हैं और मान स्ट्रिंग हैं।
   - **Retrieving a Value:**
     - `get()` विधि कुंजी `1` से संबंधित मूल्य प्राप्त करती है, जिसे बाद में प्रिंट किया जाता है।
   - **Removing an Element:**
     - कुंजी `4` के साथ `remove()` विधि को बुलाया गया है, जो मैप से संबंधित प्रविष्टि को हटा देती है।
   - **Collection Views:**
     - `keySet()` विधि कुंजियों का एक सेट प्राप्त करती है, जिसे एक फॉर-ईच लूप और एक इटरेटर का उपयोग करके प्रिंट किया जाता है।
     - `values()` विधि मूल्यों का एक संग्रह प्राप्त करती है, जिसे इसी तरह प्रिंट किया जाता है।
   - **Printing Key-Value Pairs:**
     - एक लूप कुंजियों के माध्यम से पुनरावृत्ति करता है, प्रत्येक कुंजी के साथ उसके संबंधित मूल्य को `get()` का उपयोग करके प्राप्त करता है और प्रिंट करता है।
   - **Synchronized SortedMap:**
     - `Collections.synchronizedSortedMap()` विधि `TreeMap` का एक समन्वयित संस्करण बनाती है, जो सुरक्षित समवर्ती पहुंच की अनुमति देती है।

### मुख्य बिंदु:
- **क्रमबद्ध क्रम:** `TreeMap` कुंजियों को उनके प्राकृतिक क्रम के आधार पर क्रमबद्ध रखता है।
- **कुंजी-मूल्य संचालन:** किए गए संचालन दर्शाते हैं कि `TreeMap` में तत्वों को कैसे जोड़ा, पुनः प्राप्त, हटाया और पुनरावृत्त किया जाए।
- **समन्वय:** समन्वयित मानचित्र यह सुनिश्चित करता है कि कई थ्रेड इसे सुरक्षित रूप से एक्सेस कर सकें। 

यह कक्षा `TreeMap` कक्षा की मूल सुविधाओं और संचालन को प्रभावी ढंग से प्रदर्शित करती है।
