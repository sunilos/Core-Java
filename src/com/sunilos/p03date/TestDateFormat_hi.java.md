```java
package com.sunilos.p03date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {

    public static void main(String[] args) throws Exception {

        // "dd/MM/yyyy" प्रारूप के साथ SimpleDateFormat ऑब्जेक्ट बनाएँ
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        // वर्तमान तारीख और समय को दर्शाने वाला नया Date ऑब्जेक्ट बनाएँ
        Date d = new Date();

        // निर्दिष्ट प्रारूप का उपयोग करके वर्तमान तारीख को स्ट्रिंग में बदलें
        String str = format.format(d);

        // वर्तमान Date ऑब्जेक्ट (डिफ़ॉल्ट प्रारूप में) प्रदर्शित करें
        System.out.println(d);

        // "dd/MM/yyyy" प्रारूप में दिनांक स्ट्रिंग प्रदर्शित करें
        System.out.println("String : " + str);

        // एक विशेष तारीख की स्ट्रिंग परिभाषित करें, जो "dd/MM/yyyy" प्रारूप में हो
        String str1 = "22/03/2009";

        // SimpleDateFormat ऑब्जेक्ट का उपयोग करके स्ट्रिंग को Date ऑब्जेक्ट में परिवर्तित करें
        Date d1 = format.parse(str1);

        // परिवर्तित Date ऑब्जेक्ट को प्रदर्शित करें
        System.out.println(d1);
    }
}
```

### Explanation (साधारण हिंदी में):
- **`SimpleDateFormat`**: यह एक क्लास है जो तारीखों को विशेष प्रारूप में बदलने और वापस से तारीख में बदलने की सुविधा देती है।
- **`new SimpleDateFormat("dd/MM/yyyy")`**: यह एक ऐसा फॉर्मेटर बनाता है जो दिन/महीना/वर्ष के प्रारूप में तारीखों को संभालेगा।
- **`format(Date date)`**: यह मेथड एक `Date` ऑब्जेक्ट को स्ट्रिंग में बदलता है, जो निर्धारित प्रारूप के अनुसार होता है।
- **`parse(String source)`**: यह मेथड एक स्ट्रिंग को (निर्धारित प्रारूप में) वापस एक `Date` ऑब्जेक्ट में बदलता है।
- **`Date d = new Date()`**: यह वर्तमान सिस्टम समय के साथ एक `Date` ऑब्जेक्ट बनाता है।
