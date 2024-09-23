यहां `Person` क्लास का सरल हिंदी में अनुवाद है:

```java
package com.sunilos.p06oop;

import java.util.Date;

/**
 * Person क्लास एक व्यक्ति को दर्शाती है, जिसमें नाम, पता,
 * और जन्मतिथि जैसे गुण होते हैं। यह इन गुणों के लिए कन्स्ट्रक्टर
 * और गेटर/सेटर मेथड भी प्रदान करती है।
 * 
 * @version 1.0
 * @since 16 नवंबर 2014
 * @author सुनील साहू
 * @Copyright (c) सुनील साहू
 * @url www.sunilbooks.com
 */
public class Person {

    // व्यक्ति के नाम, पते, और जन्मतिथि को स्टोर करने के लिए गुण।
    private String name = null;
    private String address = null;
    private Date dateOfBirth = null;

    // औसत मानव आयु का प्रतिनिधित्व करने वाला एक स्थिरांक।
    public static final int AVERAGE_AGE = 60;

    /**
     * डिफ़ॉल्ट कन्स्ट्रक्टर। बिना किसी गुण के एक Person ऑब्जेक्ट को इनिशियलाइज़ करता है।
     */
    public Person() {
    }

    /**
     * पैरामीटराइज्ड कन्स्ट्रक्टर जो दिए गए नाम और पते के साथ
     * एक Person ऑब्जेक्ट को इनिशियलाइज़ करता है।
     * 
     * @param name व्यक्ति का नाम
     * @param address व्यक्ति का पता
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * पैरामीटराइज्ड कन्स्ट्रक्टर जो दिए गए नाम, पते, और जन्मतिथि के साथ
     * एक Person ऑब्जेक्ट को इनिशियलाइज़ करता है।
     * 
     * @param name व्यक्ति का नाम
     * @param address व्यक्ति का पता
     * @param dateOfBirth व्यक्ति की जन्मतिथि
     */
    public Person(String name, String address, Date dateOfBirth) {
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    // नाम गुण के लिए गेटर मेथड।
    public String getName() {
        return name;
    }

    // नाम गुण के लिए सेटर मेथड।
    public void setName(String name) {
        this.name = name;
    }

    // पता गुण के लिए गेटर मेथड।
    public String getAddress() {
        return address;
    }

    // पता गुण के लिए सेटर मेथड।
    public void setAddress(String address) {
        this.address = address;
    }

    // जन्मतिथि गुण के लिए गेटर मेथड।
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    // जन्मतिथि गुण के लिए सेटर मेथड।
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
```

### विवरण:

- **गुण:** `name`, `address`, और `dateOfBirth` प्राइवेट गुण हैं जो एक व्यक्ति के मुख्य विवरण दर्शाते हैं। इन्हें गेटर और सेटर मेथड का उपयोग करके एनकैप्सुलेट किया गया है।
- **कन्स्ट्रक्टर्स:** तीन कन्स्ट्रक्टर्स हैं: एक डिफ़ॉल्ट कन्स्ट्रक्टर और दो पैरामीटराइज्ड कन्स्ट्रक्टर्स जो विभिन्न डेटा सेट के साथ एक `Person` ऑब्जेक्ट को इनिशियलाइज़ करने की अनुमति देते हैं।
- **स्थिरांक:** `AVERAGE_AGE` एक `public static final` स्थिरांक है जो औसत मानव आयु को दर्शाता है।
- **एनकैप्सुलेशन:** गेटर और सेटर मेथड का उपयोग प्राइवेट गुणों के लिए नियंत्रित पहुँच प्रदान करने के लिए किया जाता है।
