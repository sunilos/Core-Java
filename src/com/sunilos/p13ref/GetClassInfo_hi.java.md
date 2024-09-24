
```java
package com.sunilos.p13ref;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;
import com.sunilos.p06oop.Person;

/**
 * रिफ्लेक्शन API का उपयोग करके एक कक्षा का उदाहरण बनाएं और कक्षा
 * की जानकारी प्रिंट करें।
 * 
 * @संस्करण 1.0
 * @तारीख 16 नवम्बर 2014
 * @लेखक सुनिल साहू
 * @कॉपीराइट (c) सुनिल साहू
 * @वेबसाइट www.sunilbooks.com
 */
public class GetClassInfo {

    public static void main(String[] args) throws Exception {

        // Person कक्षा के लिए Class ऑब्जेक्ट प्राप्त करें
        Class<?> c = Class.forName("com.sunilos.p06oop.Person");

        // Person कक्षा का एक उदाहरण बनाएं
        Person person = (Person) c.newInstance();

        // व्यक्ति की जानकारी सेट करें
        person.setName("Abhay");
        person.setAddress("Sadar Bazar");
        person.setDateOfBirth(new Date());

        // कक्षा विवरण प्रिंट करें
        System.out.println("कक्षा जानकारी");
        System.out.println("\tनाम: " + c.getName());
        System.out.println("\tपैकेज: " + c.getPackage());
        System.out.println();

        // फ़ील्ड जानकारी प्राप्त करें
        Field[] fields = c.getFields();
        System.out.println("फ़ील्ड जानकारी");

        // सभी फ़ील्ड्स परiterate करें और उनके नाम और प्रकार प्रिंट करें
        for (Field f : fields) {
            System.out.println("\tनाम: " + f.getName());
            System.out.println("\tप्रकार: " + f.getType());
        }
        System.out.println();

        // कक्षा के कंस्ट्रक्टर्स प्राप्त करें
        Constructor<?>[] ctrs = c.getConstructors();
        System.out.println("कंस्ट्रक्टर जानकारी");

        // सभी कंस्ट्रक्टर्स परiterate करें और उनके नाम और पैरामीटर प्रकार प्रिंट करें
        for (Constructor<?> ctr : ctrs) {
            System.out.println("\tनाम: " + ctr.getName());
            Class<?>[] params = ctr.getParameterTypes();
            if (params.length > 0) {
                System.out.println("\tकंस्ट्रक्टर पैरामीटर प्रकार");
                for (Class<?> p : params) {
                    System.out.println("\t\t" + p.getName());
                }
            }
            System.out.println();
        }

        // कक्षा के तरीकों को प्राप्त करें
        Method[] methods = c.getMethods();
        System.out.println("तरीका जानकारी");

        // सभी तरीकों परiterate करें और उनके नाम, लौटने के प्रकार और पैरामीटर प्रकार प्रिंट करें
        for (Method m : methods) {
            System.out.println("\tनाम: " + m.getName());
            System.out.println("\tलौटने का प्रकार: " + m.getReturnType());
            Class<?>[] params = m.getParameterTypes();
            if (params.length > 0) {
                System.out.println("\tतरीका पैरामीटर प्रकार");
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
- **रिफ्लेक्शन API**: यह कोड जावा के रिफ्लेक्शन API का उपयोग करके `Person` कक्षा का निरीक्षण और हेरफेर करता है।
- **Class ऑब्जेक्ट**: यह `Class.forName()` का उपयोग करके `Person` कक्षा के लिए `Class` ऑब्जेक्ट प्राप्त करता है, जो कक्षा के मेटाडेटा तक पहुँचने की अनुमति देता है।
- **उदाहरण बनाना**: `newInstance()` का उपयोग करके `Person` का एक उदाहरण बनाया जाता है, जिससे कोड उस वस्तु पर गुण सेट कर सके।
- **कक्षा की जानकारी**: कक्षा का नाम और पैकेज पहचान के लिए प्रिंट किया जाता है।
- **फ़ील्ड जानकारी**: यह `Person` कक्षा के सभी सार्वजनिक फ़ील्ड्स को प्राप्त करता है और उनके नाम और प्रकार प्रिंट करता है।
- **कंस्ट्रक्टर जानकारी**: यह कक्षा के सभी कंस्ट्रक्टर्स को प्राप्त करता है और उनके नाम और स्वीकार किए गए किसी भी पैरामीटर को प्रिंट करता है।
- **तरीका जानकारी**: अंत में, यह सभी तरीकों को प्राप्त करता है और उनके नाम, लौटने के प्रकार, और स्वीकार किए गए किसी भी पैरामीटर को प्रिंट करता है।
