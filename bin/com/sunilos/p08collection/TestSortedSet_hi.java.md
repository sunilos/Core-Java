```java
package com.sunilos.p08collection;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * SortedSet इंटरफ़ेस का परीक्षण करें
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestSortedSet {

    public static void main(String[] args) {

        // SortedSet इंटरफ़ेस का एक ठोस कार्यान्वयन TreeSet बनाएं
        SortedSet s = new TreeSet();
        // TreeSet में तत्व जोड़ें
        s.add("One");
        s.add("Two");
        s.add("Three");

        // जोड़े जाने पर तत्व स्वचालित रूप से आरोही क्रम में क्रमबद्ध होते हैं
        for (Object ele : s) {
            System.out.print(ele); // क्रमबद्ध सेट में प्रत्येक तत्व को प्रिंट करें
        }

        System.out.println(); // बेहतर आउटपुट फॉर्मेटिंग के लिए नई पंक्ति प्रिंट करें

        // क्रमबद्ध सेट में पहले तत्व को प्राप्त करें और प्रिंट करें (अपेक्षित: "One")
        System.out.println(s.first());

        // क्रमबद्ध सेट में अंतिम तत्व को प्राप्त करें और प्रिंट करें (अपेक्षित: "Three")
        System.out.println(s.last());

        /**
         * आउटपुट
         * 
         * OneTwoThree
         * One
         * Three
         */
    }
}
```

### व्याख्या:

1. **Imports:** आवश्यक कक्षाएं `SortedSet` और `TreeSet` आयात की गई हैं। `TreeSet` `SortedSet` इंटरफ़ेस का एक विशिष्ट कार्यान्वयन है।

2. **Class Declaration:** `TestSortedSet` कक्षा `SortedSet` इंटरफ़ेस के उपयोग को प्रदर्शित करती है।

3. **Main Method:**
   - **SortedSet Initialization:** एक `TreeSet` उदाहरण बनाया गया है, जो स्वचालित रूप से अपने तत्वों को प्राकृतिक (आरोही) क्रम में क्रमबद्ध करता है।
   - **Adding Elements:** स्ट्रिंग "One," "Two," और "Three" को `TreeSet` में जोड़ा गया है। `TreeSet` सुनिश्चित करता है कि तत्व क्रमबद्ध तरीके से संग्रहीत होते हैं।
   - **Printing Elements:** एक फॉर-ईच लूप `SortedSet` के माध्यम से पुनरावृत्त होता है, प्रत्येक तत्व को प्रिंट करता है। प्राकृतिक क्रम के कारण, तत्व "OneTwoThree" के रूप में प्रिंट होते हैं।
   - **Retrieving First Element:** `first()` विधि सेट में सबसे छोटे तत्व को प्राप्त करती है, जो "One" होगा।
   - **Retrieving Last Element:** `last()` विधि सेट में सबसे बड़े तत्व को प्राप्त करती है, जो "Three" होगा।

4. **Output Comment:** एक टिप्पणी प्रोग्राम के अपेक्षित आउटपुट को रेखांकित करती है, यह बताते हुए कि तत्व क्रमबद्ध क्रम में प्रिंट किए जाते हैं। 

यह वर्ग `SortedSet` इंटरफ़ेस की मूल कार्यक्षमता को प्रभावी ढंग से दर्शाता है, यह उजागर करते हुए कि तत्व कैसे क्रम में बनाए रखे जाते हैं और सेट में पहले और अंतिम तत्वों तक कैसे पहुँचें।
