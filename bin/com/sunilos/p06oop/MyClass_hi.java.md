
```java
package com.sunilos.p06oop;

/**
 * विभिन्न एक्सेस स्पेसिफायर (private, default, protected, public)
 * के उपयोग का प्रदर्शन करता है।
 * 
 * @version 1.0
 * @since 16 नवंबर 2014
 * @author सुनील साहू
 * @Copyright (c) सुनील साहू
 * @url www.sunilbooks.com
 */
public class MyClass {

    // प्राइवेट एट्रिब्यूट: केवल इस क्लास के भीतर ही पहुँच योग्य है।
    private int privateAttribute = 0;

    // डिफ़ॉल्ट (पैकेज-प्राइवेट) एट्रिब्यूट: उसी पैकेज के भीतर पहुँच योग्य है।
    int defaultAttribute = 0;

    // प्रोटेक्टेड एट्रिब्यूट: उसी पैकेज में और सबक्लास में पहुँच योग्य है।
    protected int protectedAttribute = 0;

    // पब्लिक एट्रिब्यूट: प्रोग्राम में कहीं से भी पहुँच योग्य है।
    public int publicAttribute = 0;

}
```

### विवरण:

- **private:** `privateAttribute` केवल `MyClass` क्लास के भीतर ही पहुँच योग्य है।
- **default (पैकेज-प्राइवेट):** `defaultAttribute` उसी पैकेज के भीतर पहुँच योग्य है, लेकिन पैकेज के बाहर से नहीं।
- **protected:** `protectedAttribute` उसी पैकेज में और सबक्लास में (यदि वे किसी अन्य पैकेज में हैं) पहुँच योग्य है।
- **public:** `publicAttribute` प्रोग्राम में किसी अन्य क्लास या पैकेज से पहुँच योग्य है।
