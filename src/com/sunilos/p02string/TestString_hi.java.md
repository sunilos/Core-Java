```java
package com.sunilos.p02string;

/**
 * विभिन्न स्ट्रिंग मेथड्स का प्रदर्शन करने वाला प्रोग्राम जैसे लंबाई जानना, कैरेक्टर तक पहुंचना,
 * सबस्ट्रिंग निकालना, रिप्लेसमेंट और केस बदलना।
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestString {

    public static void main(String[] args) {

        // मूल स्ट्रिंग
        String name = "Vijay Dinanth Chouhan";

        // स्ट्रिंग की लंबाई प्राप्त करें
        System.out.println(" String Length- " + name.length());
        
        // 7वें स्थान (इंडेक्स 6) पर मौजूद कैरेक्टर को प्राप्त करें
        System.out.println(" 7 ths caharcter is- " + name.charAt(6));
        
        // "Dina" सबस्ट्रिंग का इंडेक्स प्राप्त करें
        System.out.println(" Dina index is- " + name.indexOf("Dina"));
        
        // 'i' के पहले आने वाले स्थान का इंडेक्स प्राप्त करें
        System.out.println(" First i Position- " + name.indexOf("i"));
        
        // 'i' के आखिरी बार आने वाले स्थान का इंडेक्स प्राप्त करें
        System.out.println(" Last i Position- " + name.lastIndexOf("i"));
        
        // 'a' को 'b' से बदलें
        System.out.println(" a is replaced by b- " + name.replace("a", "b"));
        
        // सभी 'a' को 'b' से बदलें
        System.out.println(" All a is replaced by b- " + name.replaceAll("a", "b"));
        
        // पूरी स्ट्रिंग को छोटे अक्षरों (lowercase) में बदलें
        System.out.println(" Chota vijay- " + name.toLowerCase());
        
        // पूरी स्ट्रिंग को बड़े अक्षरों (uppercase) में बदलें
        System.out.println(" Bada vijay- " + name.toUpperCase());
        
        // चेक करें कि स्ट्रिंग "Vijay" से शुरू होती है या नहीं
        System.out.println(" Starts With Vijay- " + name.startsWith("Vijay"));
        
        // चेक करें कि स्ट्रिंग "han" पर खत्म होती है या नहीं
        System.out.println(" Ends with han- " + name.endsWith("han"));
        
        // 7वें कैरेक्टर से शुरू होने वाला सबस्ट्रिंग निकालें
        System.out.println(" Substring- " + name.substring(6));

    }

}
```

### सरल हिंदी में व्याख्या:
- **`length()`**: स्ट्रिंग में मौजूद कैरेक्टर्स की संख्या को वापस करता है।
- **`charAt()`**: दिए गए इंडेक्स पर मौजूद कैरेक्टर को वापस करता है।
- **`indexOf()`**: किसी सबस्ट्रिंग या कैरेक्टर का पहला इंडेक्स वापस करता है।
- **`lastIndexOf()`**: किसी कैरेक्टर का आखिरी इंडेक्स वापस करता है।
- **`replace()` और `replaceAll()`**: स्ट्रिंग में निर्दिष्ट कैरेक्टर्स या सबस्ट्रिंग को बदलते हैं।
- **`toLowerCase()` और `toUpperCase()`**: पूरी स्ट्रिंग को छोटे या बड़े अक्षरों में बदलते हैं।
- **`startsWith()` और `endsWith()`**: चेक करते हैं कि स्ट्रिंग किसी विशेष सबस्ट्रिंग से शुरू या खत्म होती है या नहीं।
- **`substring()`**: स्ट्रिंग के एक हिस्से को दिए गए इंडेक्स से निकालता है।
