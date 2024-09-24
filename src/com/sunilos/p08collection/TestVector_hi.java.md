```java
package com.sunilos.p08collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * Vector क्लास का परीक्षण करें
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestVector {

    public static void main(String[] args) {

        // एक Vector उदाहरण बनाएं
        Vector l = new Vector();
        // Vector में तत्व जोड़ें
        l.add("Zero");  // अनुक्रमणिका# 0
        l.add("One");   // अनुक्रमणिका# 1
        l.add("Two");   // अनुक्रमणिका# 2
        l.add("Three"); // अनुक्रमणिका# 3
        l.add("Five");  // अनुक्रमणिका# 4

        // Vector का आकार प्राप्त करें
        int size = l.size(); 
        System.out.println("Vector की लंबाई : " + size);
        
        // अनुक्रमणिका # 4 पर "Four" डालें; "Five" अनुक्रमणिका # 5 पर चला जाएगा
        l.add(4, "Four");

        // अनुक्रमणिका # 2 ("Two") पर तत्व को "Twoooo" से बदलें
        l.set(2, "Twoooo");

        // अनुक्रमणिका # 0 ("Zero") पर तत्व को हटा दें
        l.remove(0);

        // अनुक्रमणिका # 1 पर 2nd तत्व प्राप्त करें और उसे प्रिंट करें
        System.out.println("\nVector का 2nd तत्व ");
        String val = (String) l.get(1); // अनुक्रमणिका # 1 पर तत्व प्राप्त करें
        System.out.println(val); // "One" प्रिंट करें

        // फॉर लूप का उपयोग करके Vector के सभी तत्व प्रिंट करें
        System.out.println("\nफॉर लूप द्वारा प्रिंट किए गए तत्व");
        for (Object ele : l) {
            String str = (String) ele; // प्रत्येक तत्व को String में परिवर्तित करें
            System.out.println(str); // प्रत्येक तत्व प्रिंट करें
        }

        // Iterator का उपयोग करके सभी तत्व प्रिंट करें
        System.out.println("\nIterator द्वारा प्रिंट किए गए तत्व");
        Iterator it = l.iterator(); // Vector के लिए एक iterator बनाएं
        while (it.hasNext()) {
            String str = (String) it.next(); // अगला तत्व प्राप्त करें
            System.out.println(str); // तत्व प्रिंट करें
        }

        // Enumerator का उपयोग करके सभी तत्व प्रिंट करें
        System.out.println("\nEnumerator द्वारा प्रिंट किए गए तत्व");
        Enumeration en = l.elements(); // Vector के लिए एक enumerator बनाएं
        while (en.hasMoreElements()) {
            String str = (String) en.nextElement(); // अगला तत्व प्राप्त करें
            System.out.println(str); // तत्व प्रिंट करें
        }

        // Vector के तत्वों को क्रमबद्ध करें
        Collections.sort(l); // प्राकृतिक क्रम में Vector को क्रमबद्ध करता है
        System.out.println("\nक्रमबद्ध सूची के तत्व");
        for (Object ele : l) {
            String str = (String) ele; // प्रत्येक तत्व को String में परिवर्तित करें
            System.out.println(str); // प्रत्येक क्रमबद्ध तत्व प्रिंट करें
        }

        // Vector को एक array में परिवर्तित करें
        System.out.println("\nपरिवर्तित array[] के तत्व");
        Object[] nums = l.toArray(); // Vector को एक array में परिवर्तित करें
        for (Object n : nums) {
            System.out.println(n); // array के प्रत्येक तत्व को प्रिंट करें
        }

        // Vector की एक उपसूची प्राप्त करें
        System.out.println("\nउपसूची के तत्व");
        Vector subList = new Vector(l.subList(1, 3)); // अनुक्रमणिका #1 से #2 तक उपसूची निकालें
        System.out.println(subList); // उपसूची प्रिंट करें
    }
}
```

### व्याख्या:

1. **Imports:** आवश्यक कक्षाएं आयात की गई हैं ताकि `Vector`, `Collections`, और उपयोगिता कक्षाओं के साथ काम किया जा सके।

2. **Class Declaration:** `TestVector` कक्षा `Vector` की कार्यक्षमता को प्रदर्शित करने के लिए बनाई गई है।

3. **Main Method:**
   - **Vector Initialization:** `l` नाम का एक `Vector` उदाहरण बनाया गया है जो तत्वों को धारण करेगा।
   - **Adding Elements:** कई स्ट्रिंग तत्वों को `add()` विधि का उपयोग करके Vector में जोड़ा गया है, जो स्वचालित रूप से अनुक्रमणिका असाइन करता है।
   - **Size Retrieval:** `size()` विधि का उपयोग करके Vector का आकार प्राप्त किया जाता है और उसे प्रिंट किया जाता है।
   - **Inserting and Modifying Elements:**
     - `add(int index, Object element)` विधि अनुक्रमणिका 4 पर "Four" डालती है, जिससे "Five" अनुक्रमणिका 5 पर चला जाता है।
     - `set(int index, Object element)` विधि अनुक्रमणिका 2 पर "Two" को "Twoooo" से बदलती है।
   - **Removing an Element:** `remove(int index)` विधि का उपयोग करके अनुक्रमणिका 0 पर "Zero" हटाया जाता है।
   - **Element Retrieval:** `get(int index)` विधि अनुक्रमणिका 1 (अब "One") पर 2nd तत्व को प्राप्त करती है, जिसे प्रिंट किया जाता है।
   - **Printing Elements:**
     - सभी तत्वों को प्रिंट करने के लिए एक फॉर-ईच लूप का उपयोग किया जाता है।
     - तत्वों को प्रिंट करने के लिए एक `Iterator` बनाया जाता है, जो Vector में पुनरावृत्ति का एक और तरीका दर्शाता है।
     - तत्वों को प्रिंट करने के लिए `Enumeration` का उपयोग किया जाता है, जो पुनरावृत्ति का एक पुराना तरीका प्रदर्शित करता है।
   - **Sorting:** `Collections.sort()` विधि Vector के तत्वों को उनके प्राकृतिक क्रम में क्रमबद्ध करती है और उन्हें प्रिंट करती है।
   - **Converting to Array:** `toArray()` विधि Vector को एक array में परिवर्तित करती है, जिसे प्रिंट किया जाता है।
   - **Sublist Retrieval:** `subList(int fromIndex, int toIndex)` विधि अनुक्रमणिका 1 से 2 तक की उपसूची निकालती है और उसे प्रिंट करती है।

### मुख्य बिंदु:
- **डायनेमिक साइजिंग:** `Vector` तत्वों को जोड़े जाने पर डायनेमिक रूप से बढ़ सकता है।
- **थ्रेड सुरक्षा:** `Vector` समन्वयित है, जिससे यह थ्रेड-सेफ है, लेकिन `ArrayList` जैसी अन्य सूची कार्यान्वयनों की तुलना में यह संभवतः धीमा होता है।
- **विविध पुनरावृत्ति:** यह कक्षा `Vector` के तत्वों के माध्यम से पुनरावृत्त करने के कई तरीके दिखाती है।

यह कक्षा `Vector` की मुख्य कार्यक्षमताओं और संचालन को प्रभावी ढंग से प्रदर्शित करती है।
