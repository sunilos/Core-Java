```java
package com.sunilos.p08collection;

import java.util.Comparator;

/**
 * एक Marksheet के लिए विशेषताएँ और विधियाँ शामिल करती है। Marksheet क्लास 
 * Comparable इंटरफेस को लागू करती है ताकि रोल नंबर के आधार पर स्वाभाविक क्रम प्रदान किया जा सके।
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Marksheet implements Comparable<Marksheet> {

    public String rollNo; // छात्र का रोल नंबर
    public String name; // छात्र का नाम
    public int marks; // छात्र द्वारा प्राप्त अंक

    /**
     * डिफ़ॉल्ट कंस्ट्रक्टर
     */
    public Marksheet() {
    }

    /**
     * दिए गए मानों के साथ Marksheet को प्रारंभ करने के लिए पैरामीटर कंस्ट्रक्टर।
     * 
     * @param rollNo छात्र का रोल नंबर
     * @param name छात्र का नाम
     * @param marks छात्र द्वारा प्राप्त अंक
     */
    public Marksheet(String rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    /**
     * स्वाभाविक क्रम रोल नंबर क्षेत्र द्वारा किया जाता है।
     * 
     * @param m तुलना के लिए Marksheet वस्तु
     * @return एक नकारात्मक पूर्णांक, शून्य, या सकारात्मक पूर्णांक जैसे यह Marksheet
     *         निर्दिष्ट Marksheet से कम, समान, या बड़ा है।
     */
    @Override
    public int compareTo(Marksheet m) {
        return rollNo.compareTo(m.rollNo);
    }

    /**
     * Marksheet के विशेषताओं को CSV प्रारूप में एक स्ट्रिंग के रूप में लौटाता है।
     * 
     * @return Marksheet का स्ट्रिंग प्रतिनिधित्व
     */
    @Override
    public String toString() {
        return rollNo + "," + name + "," + marks;
    }

    /**
     * दो Marksheet वस्तुएँ समान मानी जाती हैं यदि उनके रोल नंबर समान हों।
     * यह विधि संग्रह में तत्वों को खोजने के लिए उपयोग की जाती है।
     * 
     * @param o तुलना करने के लिए वस्तु
     * @return यदि दोनों वस्तुएँ Marksheet हैं और उनके पास समान रोल नंबर है तो true
     */
    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (!(o instanceof Marksheet))
            return false;
        Marksheet other = (Marksheet) o;
        return this.rollNo.equals(other.rollNo);
    }

    /**
     * Marksheet के लिए हैश कोड लौटाता है, जो रोल नंबर पर आधारित होता है।
     * जब एक वस्तु को कुंजी के रूप में उपयोग किया जाता है, तो यह हैश-आधारित संग्रहों द्वारा उपयोग किया जाता है।
     * 
     * @return Marksheet के लिए हैश कोड
     */
    @Override
    public int hashCode() {
        return rollNo.hashCode();
    }

}

/**
 * Marksheet तत्वों को नाम के अनुसार आरोही क्रम में क्रमबद्ध करने के लिए तुलनाकार क्लास।
 */
class OrderByName implements Comparator<Marksheet> {
    public int compare(Marksheet m1, Marksheet m2) {
        return m1.name.compareTo(m2.name);
    }
}

/**
 * Marksheet तत्वों को नाम के अनुसार अवरोही क्रम में क्रमबद्ध करने के लिए तुलनाकार क्लास।
 */
class OrderByNameDesc implements Comparator<Marksheet> {
    public int compare(Marksheet m1, Marksheet m2) {
        return m2.name.compareTo(m1.name);
    }
}

/**
 * Marksheet तत्वों को अंक के अनुसार अवरोही क्रम में क्रमबद्ध करने के लिए तुलनाकार क्लास।
 */
class OrderByMarksDesc implements Comparator<Marksheet> {
    public int compare(Marksheet m1, Marksheet m2) {
        if (m1.marks > m2.marks) {
            return -1; // m1 के अंक m2 से अधिक हैं
        } else if (m1.marks == m2.marks) {
            return 0; // दोनों के अंक समान हैं
        } else {
            return 1; // m1 के अंक m2 से कम हैं
        }
    }
}
```

### व्याख्या:

1. **Marksheet क्लास:**
   - **विशेषताएँ:** इस क्लास में तीन सार्वजनिक विशेषताएँ हैं: `rollNo`, `name`, और `marks`, जो एक छात्र के अंकों के विवरण को रखती हैं।
   - **कंस्ट्रक्टर:** इसमें एक डिफ़ॉल्ट कंस्ट्रक्टर और एक पैरामीटर कंस्ट्रक्टर शामिल है, जो उदाहरणों को प्रारंभ करता है।
   - **compareTo विधि:** यह विधि `Marksheet` वस्तुओं की स्वाभाविक क्रमबद्धता को उनके रोल नंबर के आधार पर परिभाषित करती है, जिसमें `String.compareTo()` का उपयोग किया जाता है।
   - **toString विधि:** Marksheet का एक स्ट्रिंग प्रतिनिधित्व प्रदान करती है, जो अल्पविराम से अलग किया गया प्रारूप होता है।
   - **equals और hashCode विधियाँ:** ये विधियाँ सुनिश्चित करती हैं कि दो Marksheet वस्तुओं को उनके रोल नंबर के आधार पर समान माना जाए, और उनके हैश कोड इस समानता के साथ संगत होते हैं।

2. **तुलनाकार क्लास:**
   - **OrderByName:** यह तुलनाकार Marksheet वस्तुओं को नाम के आधार पर आरोही क्रम में क्रमबद्ध करता है, `compareTo` विधि का उपयोग करके।
   - **OrderByNameDesc:** यह तुलनाकार Marksheet वस्तुओं को नाम के आधार पर अवरोही क्रम में क्रमबद्ध करता है, तुलना के क्रम को उलटते हुए।
   - **OrderByMarksDesc:** यह तुलनाकार Marksheet वस्तुओं को अंक के आधार पर अवरोही क्रम में क्रमबद्ध करता है, अंक के आधार पर क्रम निर्धारित करने के लिए एक शर्तीय दृष्टिकोण का उपयोग करता है।

कुल मिलाकर, ये क्लासें छात्र मार्कशीट के प्रबंधन और विभिन्न मानदंडों के आधार पर क्रमबद्ध करने का एक समग्र तरीका प्रदान करती हैं।
