
```java
package com.sunilos.p13ref;

import java.lang.reflect.Method;
import com.sunilos.p06oop.Person;

/**
 * रिफ्लेक्शन API का उपयोग करके एक कक्षा का उदाहरण बनाएं और कक्षा की जानकारी प्रिंट करें।
 * 
 * @संस्करण 1.0
 * @तारीख 16 नवम्बर 2014
 * @लेखक सुनिल साहू
 * @कॉपीराइट (c) सुनिल साहू
 * @वेबसाइट www.sunilbooks.com
 */
public class GetMethodInfo {

    public static void main(String[] args) throws Exception {

        // Person कक्षा का एक उदाहरण बनाएं
        Person person = new Person();
        Class<?> c = person.getClass(); // Person के लिए Class ऑब्जेक्ट प्राप्त करें

        // Person कक्षा से सभी मेथड की जानकारी प्राप्त करें
        Method[] methods = c.getMethods();

        System.out.println("कक्षा: " + c.getName());
        System.out.println("मेथड जानकारी:");

        // सभी मेथड परiterate करें और उनके नाम और रिटर्न प्रकार प्रिंट करें
        for (Method m : methods) {
            System.out.println("\tनाम: " + m.getName());
            System.out.println("\tरिटर्न प्रकार: " + m.getReturnType());
            Class<?>[] params = m.getParameterTypes(); // मेथड के पैरामीटर प्रकार प्राप्त करें
            if (params.length > 0) {
                System.out.println("\tमेथड पैरामीटर प्रकार:");
                for (Class<?> p : params) {
                    System.out.println("\t\t" + p.getName());
                }
            }
            System.out.println();
        }

        System.out.println("पेरेंट मेथड्स को छोड़ें:");

        // केवल Person कक्षा के घोषित मेथड्स प्राप्त करें (विरासत में प्राप्त मेथड्स को छोड़कर)
        methods = c.getDeclaredMethods();

        // घोषित मेथड्स परiterate करें और उनके विवरण प्रिंट करें
        for (Method m : methods) {
            System.out.println("\tनाम: " + m.getName());
            System.out.println("\tरिटर्न प्रकार: " + m.getReturnType());
            Class<?>[] params = m.getParameterTypes(); // पैरामीटर प्रकार प्राप्त करें
            if (params.length > 0) {
                System.out.println("\tमेथड पैरामीटर प्रकार:");
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
- **रिफ्लेक्शन API**: यह कोड जावा के रिफ्लेक्शन API का उपयोग करके `Person` कक्षा में मेथड्स के बारे में विवरण प्राप्त और प्रिंट करता है।
- **Class ऑब्जेक्ट**: यह `getClass()` का उपयोग करके `Person` उदाहरण के लिए `Class` ऑब्जेक्ट प्राप्त करता है, जो कक्षा के मेटाडेटा तक पहुँचने की अनुमति देता है।
- **मेथड जानकारी**:
  - `getMethods()`: यह मेथड `Person` कक्षा के सभी सार्वजनिक मेथड्स को प्राप्त करता है, जिसमें पेरेंट कक्षाओं से विरासत में प्राप्त मेथड्स शामिल होते हैं। प्रोग्राम इन मेथड्स के माध्यम सेiterate करता है, उनके नाम, रिटर्न प्रकार और कोई भी पैरामीटर प्रकार प्रिंट करता है।
  - `getDeclaredMethods()`: यह केवल उन मेथड्स को प्राप्त करता है जो `Person` कक्षा में घोषित किए गए हैं, विरासत में प्राप्त मेथड्स को छोड़कर। प्रोग्राम इन मेथड्स के लिए भी वही विवरण प्रिंट करता है।

यह कोड `Person` कक्षा में उपलब्ध मेथड्स का स्पष्ट दृश्य प्रदान करता है, जो इस कक्षा के ऑब्जेक्ट्स के कार्यों और उनके इनपुट को समझने के लिए उपयोगी है।
