```java
package com.sunilos.p08collection;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Marksheet संग्रह का परीक्षण करें और इसे प्राकृतिक क्रम (Comparable) द्वारा और
 * विभिन्न विशेषताओं पर Comparator द्वारा क्रमबद्ध करें।
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestMarksheetSorting {

    public static void main(String[] args) {

        // Marksheet वस्तुओं को रखने के लिए एक सूची बनाएँ
        ArrayList marksheets = new ArrayList();

        // सूची में Marksheet वस्तुएँ जोड़ें
        marksheets.add(new Marksheet("A2", "Suraj", 90));    // ID: A2, Name: Suraj, Marks: 90
        marksheets.add(new Marksheet("A3", "Ankush", 80));   // ID: A3, Name: Ankush, Marks: 80
        marksheets.add(new Marksheet("A1", "Saurabh", 95));   // ID: A1, Name: Saurabh, Marks: 95
        marksheets.add(new Marksheet("A5", "Rishi", 89));     // ID: A5, Name: Rishi, Marks: 89
        marksheets.add(new Marksheet("A4", "Zuber", 89));     // ID: A4, Name: Zuber, Marks: 89
        marksheets.add(new Marksheet("A0", "Amit", 91));      // ID: A0, Name: Amit, Marks: 91

        // Sorting से पहले सूची के सभी तत्व प्रिंट करें
        System.out.println("**वास्तविक सूची**");
        for (Object o : marksheets) {
            System.out.println(o);
        }

        // प्राकृतिक क्रम में तत्वों को क्रमबद्ध करें (Comparable का उपयोग करके)
        Collections.sort(marksheets);

        // प्राकृतिक क्रम में क्रमबद्ध होने के बाद सभी तत्व प्रिंट करें
        System.out.println("\n**क्रमबद्ध सूची प्राकृतिक क्रम में**");
        for (Object o : marksheets) {
            System.out.println(o);
        }

        // नाम के अनुसार चढ़ते क्रम में तत्वों को क्रमबद्ध करें (Comparator का उपयोग करके)
        OrderByName cName = new OrderByName(); // नाम के लिए एक comparator बनाएँ
        Collections.sort(marksheets, cName); // सूची को नाम के अनुसार क्रमबद्ध करें

        // नाम के अनुसार क्रमबद्ध होने के बाद सभी तत्व प्रिंट करें
        System.out.println("\n**नाम Comparator द्वारा क्रमबद्ध**");
        for (Object o : marksheets) {
            System.out.println(o);
        }

        // नाम के अनुसार अवरोही क्रम में तत्वों को क्रमबद्ध करें (Comparator का उपयोग करके)
        OrderByNameDesc cDecName = new OrderByNameDesc(); // अवरोही नाम के लिए एक comparator बनाएँ
        Collections.sort(marksheets, cDecName); // सूची को अवरोही नाम के अनुसार क्रमबद्ध करें

        // अवरोही नाम के अनुसार क्रमबद्ध होने के बाद सभी तत्व प्रिंट करें
        System.out.println("\n**अवरोही नाम Comparator द्वारा क्रमबद्ध**");
        for (Object o : marksheets) {
            System.out.println(o);
        }

        // अवरोही क्रम में अंक के अनुसार तत्वों को क्रमबद्ध करें (Comparator का उपयोग करके)
        OrderByMarksDesc cMarks = new OrderByMarksDesc(); // अवरोही अंक के लिए एक comparator बनाएँ
        Collections.sort(marksheets, cMarks); // सूची को अवरोही अंक के अनुसार क्रमबद्ध करें

        // अवरोही अंक के अनुसार क्रमबद्ध होने के बाद सभी तत्व प्रिंट करें
        System.out.println("\n**अवरोही अंक Comparator द्वारा क्रमबद्ध**");
        for (Object o : marksheets) {
            System.out.println(o);
        }

    }

}
```

### व्याख्या:

1. **Imports:** आवश्यक कक्षाओं को आयात किया गया है, जिसमें `ArrayList` और `Collections` शामिल हैं।

2. **Class Declaration:** `TestMarksheetSorting` कक्षा `Marksheet` वस्तुओं के संग्रह को क्रमबद्ध करने का प्रदर्शन करने के लिए डिज़ाइन की गई है।

3. **Main Method:**
   - **Marksheet List Creation:** `Marksheet` वस्तुओं को स्टोर करने के लिए एक `ArrayList` का निर्माण किया गया है।
   - **Adding Marksheet Objects:** कई `Marksheet` वस्तुओं को ID, नाम और अंक के साथ उत्पन्न किया गया है और सूची में जोड़ा गया है।
   - **Printing Original List:** कोई भी क्रमबद्धन होने से पहले मूल सूची को प्रिंट किया जाता है।
   - **Natural Ordering Sort:** `Collections.sort()` विधि को प्राकृतिक क्रम में क्रमबद्ध करने के लिए कॉल किया जाता है, जो `Marksheet` वर्ग में परिभाषित किया गया है (जिसे `Comparable` लागू करना चाहिए)।
   - **Sorting by Name (Ascending):** एक कस्टम comparator (`OrderByName`) का उपयोग किया जाता है जो नाम के अनुसार चढ़ते क्रम में मार्कशीट को क्रमबद्ध करता है।
   - **Sorting by Name (Descending):** एक अन्य कस्टम comparator (`OrderByNameDesc`) का उपयोग किया जाता है जो नाम के अनुसार अवरोही क्रम में क्रमबद्ध करता है।
   - **Sorting by Marks (Descending):** `OrderByMarksDesc` comparator अंक के अनुसार अवरोही क्रम में मार्कशीट को क्रमबद्ध करता है।

4. **Print Statements:** प्रत्येक क्रमबद्धन के बाद, मार्कशीट की अद्यतन सूची को प्रिंट किया जाता है ताकि क्रमबद्धन संचालन के परिणाम दिखाए जा सकें।

यह वर्ग प्राकृतिक क्रम और कस्टम comparators दोनों का उपयोग करके वस्तुओं को विभिन्न मानदंडों के आधार पर क्रमबद्ध करने के लिए Java संग्रहों की लचीलापन को प्रभावी ढंग से प्रदर्शित करता है।
