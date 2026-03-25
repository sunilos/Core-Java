```java
package com.sunilos.p02string;

import java.util.Date;

/**
 * StringBuffer क्लास का परीक्षण जो स्ट्रिंग को जोड़ने और तारीख के साथ काम करने का उदाहरण दिखाता है।
 * StringBuffer का उपयोग तब किया जाता है जब एक स्ट्रिंग में कई बार बदलाव करने की ज़रूरत होती है, 
 * क्योंकि यह String से अधिक प्रभावी होता है।
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestStringBuffer {

    public static void main(String[] args) {

        // प्रारंभिक सामग्री के साथ StringBuffer ऑब्जेक्ट बनाना
        StringBuffer sb = new StringBuffer("This is Java");
        
        // StringBuffer में अतिरिक्त स्ट्रिंग जोड़ना
        sb.append(",Java is OOP");
        sb.append(",Java is guarantee for Job");
        
        // संशोधित StringBuffer को प्रिंट करना
        System.out.println(sb);

        // 15 मिनट के लिए मिलीसेकंड में समय की गणना करना
        long fifteenMin = 15 * 60 * 1000 ;
        
        // गणना किए गए समय का उपयोग करके Date ऑब्जेक्ट बनाना (1 जनवरी 1970 से 15 मिनट बाद)
        Date d = new Date(fifteenMin);
        
        // तारीख को प्रिंट करना
        System.out.println(d);
    }

}
```

### सरल हिंदी में व्याख्या:
- **`StringBuffer`**: यह चरित्रों का एक परिवर्तनीय अनुक्रम (mutable sequence) है, जिसका उपयोग तब होता है जब एक स्ट्रिंग में कई बार बदलाव करना हो (जैसे `append()` के जरिए जोड़ना)।
- **`append()`**: यह निर्दिष्ट स्ट्रिंग को StringBuffer की सामग्री के अंत में जोड़ता है।
- **`Date(long date)`**: यह एक तारीख (Date) ऑब्जेक्ट बनाता है, जो 1 जनवरी 1970 से मिलीसेकंड के आधार पर होती है। यहाँ 15 मिनट के मिलीसेकंड की गणना की गई है।
