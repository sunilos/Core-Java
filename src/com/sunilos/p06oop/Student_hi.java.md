
```java
package com.sunilos.p06oop;

/**
 * Student क्लास एक स्टूडेंट का प्रतिनिधित्व करता है और Person क्लास को एक्सटेंड करता है।
 * इसमें स्टूडेंट से संबंधित अतिरिक्त गुण और मेथड्स शामिल हैं।
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Student extends Person {

    // स्टूडेंट का रोल नंबर।
    private String rollNo = null;

    // स्टूडेंट द्वारा प्राप्त किए गए अंक।
    private int marks = 0;

    /**
     * एक स्थैतिक (static) मेथड जो स्टूडेंट्स की औसत उम्र को लौटाता है।
     * इस मेथड को कॉल करने के लिए Student का इंस्टेंस बनाना जरूरी नहीं है।
     * 
     * @return स्टूडेंट्स की औसत उम्र, जिसे 10 सेट किया गया है।
     */
    public static int getAge() {
        return 10;  // एक फिक्स्ड औसत उम्र लौटाता है
    }

    /**
     * स्टूडेंट के रोल नंबर के लिए गेटर (getter) मेथड।
     * 
     * @return रोल नंबर।
     */
    public String getRollNo() {
        return rollNo;
    }

    /**
     * स्टूडेंट के रोल नंबर के लिए सेटर (setter) मेथड।
     * 
     * @param rollNo सेट करने के लिए रोल नंबर।
     */
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    /**
     * स्टूडेंट के अंकों के लिए गेटर मेथड।
     * 
     * @return प्राप्त किए गए अंक।
     */
    public int getMarks() {
        return marks;
    }

    /**
     * स्टूडेंट के अंकों के लिए सेटर मेथड।
     * 
     * @param marks सेट करने के लिए अंक।
     */
    public void setMarks(int marks) {
        this.marks = marks;
    }
}
```

### व्याख्या:

- **इनहेरिटेंस (Inheritance):** `Student` क्लास `Person` क्लास को एक्सटेंड करता है, जिससे वह उसके गुण और मेथड्स को इनहेरिट करता है। इससे `Student` क्लास में `Person` की कार्यक्षमता का पुनः उपयोग और विस्तार हो सकता है।

- **गुण (Attributes):** 
  - `rollNo`: यह स्टूडेंट का अद्वितीय रोल नंबर है।
  - `marks`: यह स्टूडेंट द्वारा प्राप्त किए गए अंकों को दर्शाता है।

- **स्थैतिक मेथड `getAge()`:** यह मेथड स्टूडेंट्स की औसत उम्र (10) लौटाता है। यह एक स्थैतिक मेथड है, इसलिए इसे `Student` क्लास का ऑब्जेक्ट बनाए बिना भी कॉल किया जा सकता है।

- **गेटर और सेटर मेथड्स:** ये मेथड्स `rollNo` और `marks` गुणों को नियंत्रित रूप से एक्सेस करने की सुविधा देते हैं, जिससे उनके मूल्यों को प्राप्त और बदला जा सकता है।
