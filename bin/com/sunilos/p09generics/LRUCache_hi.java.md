```java
package com.sunilos.p09generics;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LRUCache वर्ग जो Least Recently Used (LRU) कैश को लागू करता है।
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class LRUCache<E> {

    private Map<Object, E> fCacheMap; // कैश किए गए आइटम स्टोर करने के लिए मैप
    private int fCacheSize; // कैश का अधिकतम आकार

    /**
     * निर्दिष्ट आकार के साथ कैश को आरंभ करने वाला कंस्ट्रक्टर।
     *
     * @param size अधिकतम संख्या जो कैश रख सकता है
     */
    LRUCache(int size) {
        fCacheSize = size;

        // अभिगम क्रम के साथ समन्वयित LinkedHashMap बनाएँ
        fCacheMap = Collections.synchronizedMap(
            // true = सम्मिलन क्रम के बजाय अभिगम क्रम का उपयोग करें
            new LinkedHashMap<Object, E>(fCacheSize, .75F, true) {
                @Override
                public boolean removeEldestEntry(Map.Entry eldest) {
                    // यह निर्धारित करें कि कब सबसे पुराना प्रविष्टि हटा दी जाए
                    return size() > fCacheSize; // यदि आकार अधिकतम सीमा को पार करता है तो हटाएँ
                }
            });
    }

    /**
     * कैश में एक कुंजी-मान जोड़ी डालता है।
     *
     * @param key कैश किए गए आइटम के लिए कुंजी
     * @param elem कैश करने के लिए मान
     */
    public void put(Object key, E elem) {
        fCacheMap.put(key, elem); // कैश में तत्व जोड़ें
    }

    /**
     * कुंजी द्वारा कैश से एक आइटम प्राप्त करता है।
     *
     * @param key कैश किए गए आइटम के लिए कुंजी
     * @return कैश किया गया आइटम, या नहीं मिलने पर null
     */
    public E get(Object key) {
        return fCacheMap.get(key); // कैश किया गया तत्व लौटाएँ
    }
    
    public static void main(String[] args) {
        // मुख्य विधि LRUCache कार्यक्षमता का परीक्षण करने के लिए उपयोग की जा सकती है
    }
}
```

### व्याख्या:

1. **Imports:** कक्षा आवश्यक संग्रहों को आयात करती है ताकि `LinkedHashMap` और समन्वयण का उपयोग किया जा सके।

2. **Class Declaration:** `LRUCache` वर्ग Least Recently Used कैश तंत्र को लागू करता है जो एक generic प्रकार `<E>` का उपयोग करता है, जिससे इसे किसी भी प्रकार की वस्तु संग्रहित करने की अनुमति मिलती है।

3. **Private Variables:**
   - `fCacheMap`: एक `Map` जो कैश किए गए आइटम को रखता है, जो क्रम बनाए रखने के लिए `LinkedHashMap` का उपयोग करता है।
   - `fCacheSize`: एक पूर्णांक जो कैश में अधिकतम आइटम की संख्या को संग्रहीत करता है।

4. **Constructor:**
   - कंस्ट्रक्टर एक पूर्णांक `size` को स्वीकार करता है जो कैश का अधिकतम आकार सेट करता है।
   - यह `fCacheMap` को एक समन्वयित `LinkedHashMap` के रूप में आरंभ करता है, जो अभिगम के क्रम को बनाए रखता है:
     - **Access Order:** कंस्ट्रक्टर `true` का उपयोग करता है यह निर्दिष्ट करने के लिए कि क्रम अभिगम के आधार पर होना चाहिए (हाल ही में अभिगमित आइटम अंत में जाते हैं)।
   - `removeEldestEntry` मेथड को ओवरराइड किया गया है ताकि जब कैश निर्दिष्ट आकार को पार कर जाए, तो सबसे पुरानी प्रविष्टि हटा दी जाए।

5. **Methods:**
   - **`put(Object key, E elem)`:** कैश में एक कुंजी-मान जोड़ी जोड़ता है। यदि कैश अपने आकार को पार कर जाता है, तो सबसे कम हाल में उपयोग किए गए आइटम को स्वचालित रूप से हटा दिया जाएगा।
   - **`get(Object key)`:** निर्दिष्ट कुंजी के साथ जुड़े मान को प्राप्त करता है। यदि कुंजी उपलब्ध नहीं है, तो यह `null` लौटाता है।

6. **Main Method:** `main` विधि वर्तमान में खाली है और इसे `LRUCache` कार्यक्षमता के परीक्षण या प्रदर्शन के लिए उपयोग किया जा सकता है।

### मुख्य बिंदु:
- **LRU Cache तंत्र:** कैश स्वचालित रूप से आकार प्रबंधित करता है और सीमा पहुंचने पर सबसे हाल में उपयोग किए गए आइटमों को हटाता है।
- **Generics:** जनरालिज्म का उपयोग यह सुनिश्चित करता है कि कैश किसी भी प्रकार की वस्तु को संग्रहित कर सकता है, जिससे लचीलापन और उपयोगिता बढ़ती है।
- **Synchronized Map:** कैश थ्रेड-सुरक्षित है, जिससे यह समवर्ती वातावरणों में उपयोग के लिए उपयुक्त होता है।
