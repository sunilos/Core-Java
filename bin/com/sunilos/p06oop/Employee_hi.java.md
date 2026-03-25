
```java
package com.sunilos.p06oop;

/**
 * Employee क्लास Person क्लास से बढ़ती है (विरासत में लेती है)।
 * इसका मतलब है कि Employee क्लास सभी गुण और व्यवहार (methods) को Person क्लास से विरासत में लेती है।
 * 
 * @version 1.0
 * @since 16 नवंबर 2014
 * @author सुनील साहू
 * @Copyright (c) सुनील साहू
 * @url www.sunilbooks.com
 */
public class Employee extends Person {

    // 'salary' फ़ील्ड Employee क्लास का एक विशेष गुण है, जिसे डिफ़ॉल्ट रूप से 0 पर प्रारंभ किया गया है।
    private float salary = 0;

    // Employee क्लास के लिए डिफ़ॉल्ट कंस्ट्रक्टर।
    // यह Employee ऑब्जेक्ट को बिना किसी गुण को सेट किए प्रारंभ करता है।
    public Employee() {
    }

    // Employee क्लास के लिए पैरामीट्राइज़्ड कंस्ट्रक्टर।
    // यह कंस्ट्रक्टर कर्मचारी का नाम, पता, और वेतन स्वीकार करता है।
    // 'super' कीवर्ड का उपयोग Parent क्लास (Person) के कंस्ट्रक्टर को कॉल करने के लिए किया जाता है,
    // जिससे 'name' और 'address' गुण सेट होते हैं।
    public Employee(String name, String add, float sal) {
        super(name, add); // Parent क्लास के कंस्ट्रक्टर को कॉल करना (Person)
        salary = sal;     // Employee क्लास के लिए विशिष्ट वेतन सेट करना
    }

    // 'salary' फ़ील्ड के लिए गेटर मेथड।
    // यह मेथड कर्मचारी का वेतन लौटाता है।
    public float getSalary() {
        return salary;
    }

    // 'salary' फ़ील्ड के लिए सेट्टर मेथड।
    // यह मेथड कर्मचारी का वेतन अपडेट करने की अनुमति देता है।
    public void setSalary(float salary) {
        this.salary = salary;
    }

}
```

### विवरण:

- `Employee` क्लास `Person` क्लास से विरासत में लेती है।
- `salary` गुण Employee क्लास के लिए विशेष है, जबकि `name` और `address` को `Person` से विरासत में लिया गया है।
- इस क्लास में एक डिफ़ॉल्ट कंस्ट्रक्टर और एक पैरामीट्राइज़्ड कंस्ट्रक्टर है, जो कर्मचारी के विवरण को प्रारंभ करता है।
- गेटर और सेट्टर मेथड्स `salary` फ़ील्ड तक पहुँच को नियंत्रित करते हैं।
