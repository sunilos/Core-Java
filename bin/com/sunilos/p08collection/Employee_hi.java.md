```java
package com.sunilos.p08collection;

/**
 * एक Java बीन जो कर्मचारी के विशेषताओं और कर्मचारियों के डेटा प्रबंधन के लिए विधियाँ प्रस्तुत करता है।
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Employee {

    private int employeeId; // कर्मचारी के लिए अद्वितीय पहचानकर्ता
    private String firstName; // कर्मचारी का पहला नाम
    private String lastName; // कर्मचारी का अंतिम नाम

    /**
     * डिफ़ॉल्ट कंस्ट्रक्टर जो किसी भी विशेषता सेट किए बिना एक Employee वस्तु को आरंभ करता है।
     */
    public Employee() {
    }

    /**
     * निर्दिष्ट विशेषताओं के साथ एक Employee बनाने के लिए पैरामीटरकृत कंस्ट्रक्टर।
     * 
     * @param employeeId कर्मचारी के लिए अद्वितीय आईडी
     * @param firstName कर्मचारी का पहला नाम
     * @param lastName कर्मचारी का अंतिम नाम
     */
    public Employee(int employeeId, String firstName, String lastName) {
        this.employeeId = employeeId; // कर्मचारी आईडी सेट करें
        this.firstName = firstName; // पहला नाम सेट करें
        this.lastName = lastName; // अंतिम नाम सेट करें
    }

    // employeeId के लिए गेटर और सेटर विधियाँ
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    // firstName के लिए गेटर और सेटर विधियाँ
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // lastName के लिए गेटर और सेटर विधियाँ
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Employee वस्तु का एक स्ट्रिंग प्रतिनिधित्व लौटाता है, प्रारूप में:
     * employeeId,lastName,firstName
     */
    @Override
    public String toString() {
        return employeeId + "," + lastName + "," + firstName;
    }

    /**
     * उनके कर्मचारी आईडी के आधार पर दो Employee वस्तुओं की तुलना करता है।
     * 
     * @param o इस Employee के साथ तुलना करने के लिए वस्तु
     * @return true यदि दोनों Employee वस्तुओं की कर्मचारी आईडी समान हैं, अन्यथा false
     */
    @Override
    public boolean equals(Object o) {
        if (o == null) // जांचें कि क्या वस्तु null है
            return false;
        if (!(o instanceof Employee)) // जांचें कि क्या वस्तु Employee का उदाहरण है
            return false;
        Employee other = (Employee) o; // Employee में कास्ट करें

        return this.employeeId == other.employeeId; // कर्मचारी आईडी की तुलना करें
    }

    /**
     * Employee वस्तु के लिए एक हैश कोड मान लौटाता है।
     * 
     * कर्मचारी आईडी को HashMap जैसी संग्रहों में वस्तु की अद्वितीय पहचान के लिए हैश कोड के रूप में उपयोग किया जाता है।
     */
    @Override
    public int hashCode() {
        return employeeId; // हैश कोड के रूप में कर्मचारी आईडी लौटाएँ
    }
}
```

### व्याख्या:

- **क्लास का उद्देश्य:** `Employee` क्लास एक Java बीन के रूप में कार्य करती है जो कर्मचारी-संबंधित डेटा को संलग्न करती है, और कर्मचारियों की विशेषताओं के लिए पहुंच और संशोधन के लिए विधियाँ प्रदान करती है।

- **विशेषताएँ:**
  - `employeeId`: एक पूर्णांक जो प्रत्येक कर्मचारी के लिए अद्वितीय पहचानकर्ता को दर्शाता है।
  - `firstName`: एक स्ट्रिंग जो कर्मचारी के पहले नाम को दर्शाता है।
  - `lastName`: एक स्ट्रिंग जो कर्मचारी के अंतिम नाम को दर्शाता है।

- **कंस्ट्रक्टर:**
  - **डिफ़ॉल्ट कंस्ट्रक्टर:** एक `Employee` वस्तु को बिना किसी प्रारंभिक विशेषता के बनाने की अनुमति देता है।
  - **पैरामीटरकृत कंस्ट्रक्टर:** `employeeId`, `firstName`, और `lastName` के लिए विशिष्ट मानों के साथ `Employee` वस्तु को प्रारंभ करता है।

- **गेटर और सेटर विधियाँ:** `Employee` क्लास की निजी विशेषताओं तक पहुंच प्रदान करती हैं, जिससे अन्य क्लासों को मान प्राप्त करने और संशोधित करने की अनुमति मिलती है, जबकि कार्यान्वयन को संकुचित किया जा सकता है।

- **toString विधि:** डिफ़ॉल्ट `toString()` विधि को ओवरराइड करती है ताकि कर्मचारी के एक स्वरूपित स्ट्रिंग प्रतिनिधित्व को लौटाया जा सके, जिससे कर्मचारी की जानकारी को प्रदर्शित करना या लॉग करना आसान हो जाता है।

- **equals विधि:** दो `Employee` वस्तुओं की तुलना करने के लिए `equals()` विधि को ओवरराइड करती है, जो उनकी `employeeId` के आधार पर होती है। यह समानता जांच पर निर्भर करने वाली संग्रह संचालन के लिए महत्वपूर्ण है।

- **hashCode विधि:** `hashCode()` विधि को ओवरराइड करती है ताकि `employeeId` लौटाया जा सके, जो `Employee` वस्तुओं को हैश-आधारित संग्रहों जैसे `HashMap` में प्रभावी ढंग से उपयोग करने की अनुमति देता है।

