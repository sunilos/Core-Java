```java
package com.sunilos.p01basics;

/**
 * TestTernaryOperator क्लास टर्नरी ऑपरेटर का उपयोग दिखाता है।
 * 
 * टर्नरी ऑपरेटर एक संक्षिप्त तरीके से शर्तों को जांचता है।
 * यह एक शर्त के आधार पर दो मानों में से एक को लौटाता है।
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestTernaryOperator {

    public static void main(String[] args) {
        int num = 5;
        // टर्नरी ऑपरेटर का उपयोग करके यह जांचा जाता है कि संख्या सम (even) है या विषम (odd)
        String evenOdd = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(evenOdd); // 5 विषम है, इसलिए "Odd" प्रिंट होगा

        String name = "Vijay";
        // यह जांचता है कि नाम String क्लास का उदाहरण है या नहीं
        boolean result = name instanceof String;
        System.out.println(result); // 'name' वास्तव में एक String है, इसलिए true प्रिंट होगा
        
    }
}
```

### व्याख्या:
- **टर्नरी ऑपरेटर**: टर्नरी ऑपरेटर `(condition) ? value1 : value2` शर्त की जांच करता है। यदि शर्त सही है, तो यह `value1` लौटाता है; अन्यथा, यह `value2` लौटाता है। इस उदाहरण में, यह जांचता है कि `num` सम है या विषम।
- **Instanceof ऑपरेटर**: `instanceof` ऑपरेटर यह जांचता है कि कोई ऑब्जेक्ट किसी विशेष क्लास या सबक्लास का उदाहरण है या नहीं। यहाँ, यह पुष्टि करता है कि `name` वास्तव में एक `String` है।
