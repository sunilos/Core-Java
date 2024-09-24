
```java
package com.sunilos.p13ref;

import java.lang.reflect.Method;
import java.util.Date;
import com.sunilos.p06oop.Person;

/**
 * रिफ्लेक्शन API का उपयोग करके मान सेट और प्राप्त करने के लिए विधियों को सक्रिय करता है।
 * 
 * @संस्करण 1.0
 * @तारीख 16 नवम्बर 2014
 * @लेखक सुनिल साहू
 * @कॉपीराइट (c) सुनिल साहू
 * @वेबसाइट www.sunilbooks.com
 */
public class InvokeMethod {

    public static void main(String[] args) throws Exception {

        // व्यक्ति कक्षा का एक उदाहरण बनाएं
        Person person = new Person();
        Class<?> c = person.getClass();
        System.out.println("कक्षा का नाम: " + c.getName());

        // रिफ्लेक्शन API का उपयोग करके सेटिंग मानों के लिए सेटटर विधियों को कॉल करें

        // उस setName विधि को प्राप्त करें जो एक String पैरामीटर लेती है
        Method setNameMethod = c.getMethod("setName", String.class);
        // व्यक्ति वस्तु पर setName विधि को सक्रिय करें
        setNameMethod.invoke(person, "Abhay");

        // उस setAddress विधि को प्राप्त करें जो एक String पैरामीटर लेती है
        Method setAddressMethod = c.getMethod("setAddress", String.class);
        // व्यक्ति वस्तु पर setAddress विधि को सक्रिय करें
        setAddressMethod.invoke(person, "Sadar Bazar");

        // उस setDateOfBirth विधि को प्राप्त करें जो एक Date पैरामीटर लेती है
        Method setDateOfBirthMethod = c.getMethod("setDateOfBirth", Date.class);
        // व्यक्ति वस्तु पर setDateOfBirth विधि को सक्रिय करें
        setDateOfBirthMethod.invoke(person, new Date());

        // व्यक्ति कक्षा की सभी घोषित विधियों को प्राप्त करें, विरासत में ली गई विधियों को छोड़कर
        Method[] methods = c.getDeclaredMethods();

        // मानों को प्राप्त करने के लिए सभी गेट्टर विधियों को कॉल करें
        String methodName;
        for (Method m : methods) {
            methodName = m.getName();
            // जांचें कि क्या विधि एक गेट्टर है (जिसका नाम "get" से शुरू होता है)
            if (methodName.startsWith("get")) {
                // गेट्टर विधि को सक्रिय करें और परिणाम प्रिंट करें
                Object value = m.invoke(person, null);
                System.out.println(methodName + " = " + value);
            }
        }
    }
}
```

### व्याख्या:
- **रिफ्लेक्शन API**: यह कोड रिफ्लेक्शन API का उपयोग करके `Person` कक्षा पर विधियों को गतिशील रूप से सक्रिय करता है ताकि मान सेट और प्राप्त किए जा सकें।
- **उदाहरण निर्माण**: `Person` कक्षा का एक उदाहरण बनाया जाता है, और इसकी कक्षा प्रकार प्राप्त की जाती है।
- **मान सेट करना**: `getMethod(...)` फ़ंक्शन विशिष्ट सेटटर विधियों (जैसे `setName`, `setAddress`, `setDateOfBirth`) को प्राप्त करता है। फिर `invoke(...)` फ़ंक्शन इन विधियों को सक्रिय करता है ताकि `person` उदाहरण के लिए मान सेट किए जा सकें।
- **मान प्राप्त करना**: मान सेट करने के बाद, कोड `Person` कक्षा की सभी घोषित विधियों को प्राप्त करता है। यह जांचता है कि क्या विधियाँ गेट्टर हैं, यह देखकर कि उनके नाम "get" से शुरू होते हैं, और उन्हें सक्रिय करके संपत्ति के मान प्रिंट करता है।
- **आउटपुट**: प्रोग्राम कक्षा का नाम और उन मानों को प्रिंट करता है जो `name`, `address`, और `date of birth` के लिए सेट किए गए हैं, संबंधित गेट्टर विधियों को सक्रिय करके।

