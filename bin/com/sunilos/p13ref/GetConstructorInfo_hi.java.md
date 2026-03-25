
```java
package com.sunilos.p13ref;

import java.lang.reflect.Constructor;
import com.sunilos.p06oop.Person;

/**
 * रिफ्लेक्शन API का उपयोग करके एक कक्षा के कंस्ट्रक्टर विवरण प्राप्त करता है।
 * 
 * @संस्करण 1.0
 * @तारीख 16 नवम्बर 2014
 * @लेखक सुनिल साहू
 * @कॉपीराइट (c) सुनिल साहू
 * @वेबसाइट www.sunilbooks.com
 */
public class GetConstructorInfo {

    public static void main(String[] args) throws Exception {

        // Person कक्षा का एक उदाहरण बनाएं
        Person person = new Person();
        Class<?> c = person.getClass(); // Person के लिए Class ऑब्जेक्ट प्राप्त करें
        System.out.println("कक्षा का नाम: " + c.getName());

        // Person कक्षा के सभी कंस्ट्रक्टर्स प्राप्त करें
        Constructor<?>[] constructors = c.getConstructors();
        System.out.println("कंस्ट्रक्टर जानकारी:");

        // सभी कंस्ट्रक्टर्स परiterate करें और उनके नाम और पैरामीटर प्रकार प्रिंट करें
        for (Constructor<?> ctr : constructors) {
            System.out.println("\tनाम: " + ctr.getName());
            Class<?>[] params = ctr.getParameterTypes(); // कंस्ट्रक्टर के पैरामीटर प्रकार प्राप्त करें
            if (params.length > 0) {
                System.out.println("\tकंस्ट्रक्टर पैरामीटर प्रकार:");
                for (Class<?> p : params) {
                    System.out.println("\t\t" + p.getName());
                }
            }
            System.out.println();
        }
    }
}
```

### व्याख्या:
- **रिफ्लेक्शन API**: यह कोड जावा के रिफ्लेक्शन API का उपयोग करके `Person` कक्षा के कंस्ट्रक्टर्स के बारे में विवरण प्राप्त और प्रिंट करता है।
- **Class ऑब्जेक्ट**: यह `getClass()` का उपयोग करके `Person` उदाहरण के लिए `Class` ऑब्जेक्ट प्राप्त करता है, जो कक्षा के मेटाडेटा तक पहुँचने की अनुमति देता है।
- **कंस्ट्रक्टर जानकारी**: `getConstructors()` का उपयोग करके `Person` कक्षा के कंस्ट्रक्टर्स को प्राप्त किया जाता है।
- **कंस्ट्रक्टर्स परiterate करना**: प्रोग्राम प्रत्येक कंस्ट्रक्टर के माध्यम सेiterate करता है, उसके नाम और आवश्यक पैरामीटर प्रकारों को प्रिंट करता है। यदि किसी कंस्ट्रक्टर के पैरामीटर हैं, तो उनके प्रकार भी प्रिंट किए जाते हैं।

यह कोड `Person` कक्षा में उपलब्ध कंस्ट्रक्टर्स का स्पष्ट दृश्य प्रदान करता है, जो इस कक्षा के ऑब्जेक्ट्स को कैसे प्रारंभ किया जाए और कौन से पैरामीटर आवश्यक हैं, यह समझने के लिए उपयोगी है।
