```java
package com.sunilos.p05arrays;

/**
 * Copy array elements using java.lang.System
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class CopyAnArray {

    public static void main(String[] args) {
        // विशेष अक्षरों के साथ स्रोत एरे को इनिशियलाइज़ करें
        char[] copyFrom = { 'S', 'U', 'N', 'R', 'A', 'Y', 'S' };
        
        // कॉपी किए गए तत्वों को रखने के लिए लक्ष्य एरे बनाएं
        char[] copyTo = new char[4];

        /**
         * System.arraycopy() मेथड के पैरामीटर हैं:
         * स्रोत एरे: वह एरे जिससे तत्व कॉपी किए जाएंगे (copyFrom)
         * स्रोत एरे का प्रारंभिक इंडेक्स: स्रोत एरे में कॉपी करने के लिए प्रारंभिक इंडेक्स (3)
         * लक्ष्य एरे: वह एरे जिसमें तत्व कॉपी किए जाएंगे (copyTo)
         * लक्ष्य एरे का प्रारंभिक इंडेक्स: लक्ष्य एरे में कॉपी करने के लिए प्रारंभिक इंडेक्स (0)
         * कॉपी किए जाने वाले तत्वों की संख्या: कितने तत्व कॉपी करने हैं (4)
         */

        // copyFrom के इंडेक्स 3 से 4 तत्वों को copyTo में इंडेक्स 0 से कॉपी करें
        System.arraycopy(copyFrom, 3, copyTo, 0, 4);

        // कॉपी किए गए तत्वों को एक स्ट्रिंग के रूप में प्रिंट करें
        System.out.println(new String(copyTo));
    }
}
```

### व्याख्या:
- यह प्रोग्राम एक स्रोत कैरेक्टर एरे और एक लक्ष्य कैरेक्टर एरे को इनिशियलाइज़ करता है। यह `System.arraycopy()` का उपयोग करके स्रोत एरे से लक्षित एरे में एक निश्चित रेंज के तत्वों को कॉपी करता है, और फिर कॉपी किए गए तत्वों को एक स्ट्रिंग के रूप में प्रिंट करता है। इस मामले में कॉपी किए गए तत्व "RAYS" होंगे।