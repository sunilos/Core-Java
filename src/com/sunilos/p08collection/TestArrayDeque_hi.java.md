```java
package com.sunilos.p08collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 * ArrayDeque इंटरफेस के कार्यान्वयन का परीक्षण करता है।
 * तत्वों को जोड़ने, हटाने, और उन पर पुनरावृत्ति करने जैसे बुनियादी संचालन का प्रदर्शन करता है।
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestArrayDeque {

    public static void main(String[] args) {

        // ArrayDeque का उपयोग करके एक Deque बनाना
        Deque<String> q = new ArrayDeque<>();

        // Deque में तत्व जोड़ें
        q.add("One");            // "One" को Deque के अंत में जोड़ता है
        q.addFirst("Two");      // "Two" को Deque के सामने जोड़ता है
        q.addLast("Three");     // "Three" को Deque के अंत में जोड़ता है

        // शीर्ष तत्व का परीक्षण करें बिना हटाए
        String ele = q.element(); // Deque के सिर को पुनः प्राप्त करता है

        // Deque से तत्व हटाएँ
        String firstElement = q.remove(); // सिर (पहला) तत्व को हटाता है और लौटाता है
        System.out.println(firstElement); // "One" प्रिंट करता है

        firstElement = q.removeFirst(); // पहले तत्व को हटाता है और लौटाता है
        System.out.println(firstElement); // "Two" प्रिंट करता है

        String lastElement = q.removeLast(); // अंतिम तत्व को हटाता है और लौटाता है
        System.out.println(lastElement); // "Three" प्रिंट करता है

        // पहले पहुँचाए गए शीर्ष तत्व को प्रिंट करें
        System.out.println(ele); // "One" प्रिंट करता है, जैसा कि यह हटाने से पहले पहुँचाया गया था

        // Iterator के माध्यम से तत्वों का अभिगम करें
        Iterator<String> it = q.iterator(); // Deque के लिए एक iterator बनाता है
        while (it.hasNext()) {
            System.out.println(it.next()); // Deque में प्रत्येक शेष तत्व को प्रिंट करता है
        }
    }
}
```

### व्याख्या:

1. **आयात:** क्लास आवश्यक कक्षाओं को आयात करती है जो `ArrayDeque`, `Deque`, और `Iterator` के साथ काम करने के लिए आवश्यक हैं।

2. **क्लास घोषणा:** `TestArrayDeque` एक सार्वजनिक क्लास है जो `ArrayDeque` की कार्यक्षमता का परीक्षण करती है।

3. **मुख्य विधि:**
   - `ArrayDeque` का उपयोग करके एक `Deque` का निर्माण किया जाता है।
   - विभिन्न तत्वों को `add()`, `addFirst()`, और `addLast()` का उपयोग करके जोड़ा जाता है, जो Deque के दोनों छोरों पर तत्वों को जोड़ने की लचीलापन को दर्शाता है।
   - `element()` विधि सिर के तत्व को पुनः प्राप्त करती है (लेकिन हटाती नहीं है)।
   - तत्वों को `remove()`, `removeFirst()`, और `removeLast()` का उपयोग करके हटाया जाता है, जो Deque की सामग्री को पहुँचाने और प्रबंधित करने का प्रदर्शन करता है।
   - `Iterator` शेष तत्वों को पार करने की अनुमति देता है, जब तक तत्वों को पहुँचाने के लिए शेष हैं, उन्हें प्रिंट करता है।

यह क्लास एक Deque के बुनियादी संचालन का प्रभावी ढंग से प्रदर्शन करती है, जो एक डबल-एंडेड कतार है जो दोनों छोरों से तत्वों को सम्मिलित और हटाने की अनुमति देती है।
