
```java
package com.sunilos.p13ref;

import java.lang.reflect.Constructor;
import java.util.Date;
import com.sunilos.p06oop.Person;

/**
 * कंस्ट्रक्टर का उपयोग करके एक उदाहरण बनाता है। कंस्ट्रक्टर को
 * रिफ्लेक्शन API द्वारा सक्रिय किया जाता है।
 * 
 * @संस्करण 1.0
 * @तारीख 16 नवम्बर 2014
 * @लेखक सुनिल साहू
 * @कॉपीराइट (c) सुनिल साहू
 * @वेबसाइट www.sunilbooks.com
 */
public class InvokeConstructor {

    public static void main(String[] args) throws Exception {

        // व्यक्ति कक्षा को इसके पूर्ण रूप से योग्य नाम का उपयोग करके गतिशील रूप से लोड करें
        Class<?> c = Class.forName("com.sunilbooks.selflearnjava.oop.Person");

        // वह कंस्ट्रक्टर प्राप्त करें जो विशिष्ट पैरामीटर (String, String, Date) लेता है
        Constructor<?> oneConstructor = c.getConstructor(String.class, String.class, Date.class);

        // प्राप्त कंस्ट्रक्टर का उपयोग करके व्यक्ति का एक उदाहरण बनाएं
        Person p = (Person) oneConstructor.newInstance("Abhay", "Sadar Bazar", new Date());

        // कक्षा का नाम प्रिंट करें
        System.out.println("कक्षा का नाम: " + c.getName());
        System.out.println();

        // व्यक्ति की जानकारी प्रिंट करें
        System.out.println("व्यक्ति की जानकारी");
        System.out.println("नाम: " + p.getName());
        System.out.println("पता: " + p.getAddress());
        System.out.println("जन्म तिथि: " + p.getDateOfBirth());
    }
}
```

### व्याख्या:
- **रिफ्लेक्शन API**: यह कोड रिफ्लेक्शन के माध्यम से `Person` कक्षा के कंस्ट्रक्टर का उपयोग करके एक उदाहरण बनाने का प्रदर्शन करता है।
- **कक्षा लोडिंग**: `Class.forName(...)` कक्षा को गतिशील रूप से लोड करता है, जिससे प्रोग्राम को कक्षा संदर्भ को हार्ड-कोड करने की आवश्यकता नहीं होती।
- **कंस्ट्रक्टर प्राप्त करना**: `getConstructor(...)` मेथड उस विशेष कंस्ट्रक्टर को प्राप्त करता है जो दिए गए पैरामीटर प्रकारों (दो `String` और एक `Date`) से मेल खाता है।
- **उदाहरण निर्माण**: `newInstance(...)` कंस्ट्रक्टर को सक्रिय करता है ताकि एक नया `Person` ऑब्जेक्ट बनाया जा सके, आवश्यक तर्कों को पास करते हुए।
- **आउटपुट**: प्रोग्राम कक्षा का नाम और बनाए गए `Person` उदाहरण की जानकारी प्रिंट करता है, जिसमें नाम, पता, और जन्म तिथि शामिल हैं।

