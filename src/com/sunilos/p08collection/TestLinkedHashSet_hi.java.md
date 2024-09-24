```java
package com.sunilos.p08collection;

/**
 * LinkedHashSet वर्ग का परीक्षण करें
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {

    public static void main(String[] args) {

        // तत्वों को स्टोर करने के लिए एक LinkedHashSet बनाएँ
        LinkedHashSet s = new LinkedHashSet();
        
        // LinkedHashSet में तत्व जोड़ें
        s.add("Zero");  // सेट में "Zero" जोड़ता है
        s.add("One");   // सेट में "One" जोड़ता है
        s.add("Two");   // सेट में "Two" जोड़ता है
        s.add("Three"); // सेट में "Three" जोड़ता है
        s.add("Five");  // सेट में "Five" जोड़ता है

        // Iterator का उपयोग करके सभी तत्वों को प्रिंट करें
        System.out.println("\nIterator द्वारा प्रिंट किए गए तत्व:");
        Iterator it = s.iterator(); // सेट के लिए एक iterator प्राप्त करें
        while (it.hasNext()) {
            String str = (String) it.next(); // अगला तत्व पुनः प्राप्त करें
            System.out.println(str); // तत्व को प्रिंट करें
        }

    }
}
```

### व्याख्या:

1. **Imports:** आवश्यक कक्षाओं को आयात किया गया है, जिसमें `Iterator` और `LinkedHashSet` शामिल हैं।

2. **Class Declaration:** `TestLinkedHashSet` `LinkedHashSet` के उपयोग को प्रदर्शित करता है, जो तत्वों के समावेशन क्रम को बनाए रखते हुए यह सुनिश्चित करता है कि प्रत्येक तत्व अद्वितीय है।

3. **Main Method:**
   - **LinkedHashSet Creation:** एक `LinkedHashSet` का निर्माण किया जाता है जो स्ट्रिंग तत्वों को होल्ड करता है।
   - **Adding Elements:** `add()` विधि का उपयोग करके कई स्ट्रिंग को सेट में जोड़ा जाता है। डुप्लिकेट मानों की अनदेखी की जाएगी।
   - **Iterating Through Elements:** `LinkedHashSet` के लिए Traversal करने के लिए एक `Iterator` बनाया जाता है।
     - लूप `hasNext()` के साथ यह जांचता है कि क्या और अधिक तत्व हैं, `next()` के साथ प्रत्येक तत्व को पुनः प्राप्त करता है, और उन्हें प्रिंट करता है।
   - **Order of Elements:** तत्वों को जोड़ने के क्रम में प्रिंट किया जाता है, जो `LinkedHashSet` की समावेशन-क्रम संरक्षण विशेषता को प्रदर्शित करता है।

यह वर्ग `LinkedHashSet` बनाने और प्रबंधित करने का प्रभावी ढंग से प्रदर्शन करता है, इसके मुख्य गुणों को उजागर करता है: समावेशन क्रम बनाए रखना और अद्वितीय तत्वों की अनुमति देना।
