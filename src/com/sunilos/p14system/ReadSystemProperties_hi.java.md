
```java
package com.sunilos.p14system;

import java.util.Properties;
import java.util.Set;

/**
 * यह कक्षा सिस्टम कक्षा का उपयोग करके सिस्टम गुणों (System Properties) को पढ़ने और प्रिंट करने के लिए उपयोग की जाती है।
 * 
 * @संस्करण 1.0
 * @तारीख 16 नवम्बर 2014
 * @लेखक सुनिल साहू
 * @कॉपीराइट (c) सुनिल साहू
 * @वेबसाइट www.sunilbooks.com
 */
public class ReadSystemProperties {

    public static void main(String[] args) {

        // सभी सिस्टम-परिभाषित गुण प्राप्त करें
        Properties prop = System.getProperties(); // सिस्टम गुणों को एक Properties ऑब्जेक्ट के रूप में प्राप्त करें
        Set<Object> keySet = prop.keySet(); // कुंजियों का सेट (गुण नाम) प्राप्त करें

        // प्रत्येक सिस्टम गुण और उसके मान को प्रिंट करने के लिए keySet पर इटरेट करें
        for (Object o : keySet) {
            String key = (String) o; // कुंजी को String में कास्ट करें
            String val = prop.getProperty(key); // कुंजी से संबंधित मान प्राप्त करें
            System.out.println(key + "=" + val); // कुंजी-मूल्य जोड़ी को प्रिंट करें
        }

        // एक विशेष गुण प्राप्त करें
        String country = System.getProperty("user.country"); // "user.country" गुण का मान प्राप्त करें
        System.out.println("User Country: " + country); // मान प्रिंट करें

        // गुण साफ़ करने का उदाहरण
        System.clearProperty("user.country"); // "user.country" गुण को साफ़ करें
        System.out.println("User Country after clear: " + System.getProperty("user.country")); // null प्रिंट होना चाहिए

        // एक सिस्टम गुण सेट करें
        System.setProperty("user.country", "IN"); // "user.country" गुण को "IN" में सेट करें
        country = System.getProperty("user.country"); // नया सेट किया गया मान प्राप्त करें
        System.out.println("User Country after set: " + country); // "IN" प्रिंट होना चाहिए
    }
}
```

### व्याख्या:
- **सभी सिस्टम गुण पढ़ना**: प्रोग्राम सभी सिस्टम गुणों को एक `Properties` ऑब्जेक्ट में प्राप्त करता है और उनके कुंजी-मूल्य जोड़े को इटरेट करके प्रिंट करता है।
- **विशिष्ट गुण एक्सेस करना**: यह `"user.country"` गुण का मान प्राप्त करता है और उसे प्रिंट करता है।
- **गुण साफ़ करना**: प्रोग्राम यह दर्शाता है कि कैसे `System.clearProperty()` का उपयोग करके एक सिस्टम गुण को साफ़ किया जाता है, फिर पुष्टि करता है कि गुण साफ़ हो गया है।
- **गुण सेट करना**: अंत में, यह दिखाता है कि `System.setProperty()` का उपयोग करके एक सिस्टम गुण का नया मान कैसे सेट किया जाता है और अपडेटेड मान को प्रिंट करता है।

यह प्रोग्राम यह प्रदर्शित करता है कि जावा में सिस्टम गुणों का प्रबंधन कैसे किया जाता है, जो एप्लिकेशन सेटिंग्स को कॉन्फ़िगर करने में सहायक हो सकता है।
