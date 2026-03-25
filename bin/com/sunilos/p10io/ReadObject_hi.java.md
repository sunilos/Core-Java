```java
package com.sunilos.p10io;

import java.io.FileInputStream; // फ़ाइल डेटा पढ़ने के लिए FileInputStream को आयात करें
import java.io.ObjectInputStream; // सीरियलाइज़्ड ऑब्जेक्ट पढ़ने के लिए ObjectInputStream को आयात करें

/**
 * एक फ़ाइल से एक ऑब्जेक्ट को डीसीरियलाइज़ करें।
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class ReadObject {

    public static void main(String[] args) throws Exception {

        // सीरियलाइज़्ड ऑब्जेक्ट फ़ाइल पढ़ने के लिए FileInputStream बनाएं
        FileInputStream file = new FileInputStream("f:/object.ser");

        // ऑब्जेक्ट्स पढ़ने के लिए FileInputStream को ObjectInputStream में लपेटें
        ObjectInputStream in = new ObjectInputStream(file);

        // सीरियलाइज़्ड ऑब्जेक्ट को पढ़ें और इसे MarksheetBean में कास्ट करें
        MarksheetBean m = (MarksheetBean) in.readObject();

        // ऑब्जेक्ट का डेटा प्रिंट करें
        System.out.println("Name : " + m.getName()); // छात्र का नाम प्रिंट करें
        System.out.println("Physics : " + m.getPhysics()); // भौतिकी में मार्क्स प्रिंट करें
        System.out.println("Chemistry : " + m.getChemistry()); // रसायन विज्ञान में मार्क्स प्रिंट करें
        System.out.println("Maths :" + m.getMaths()); // गणित में मार्क्स प्रिंट करें
        System.out.println("Percentage : " + m.getPercentage()); // गणना की गई प्रतिशत प्रिंट करें
        System.out.println("Temp Value: " + m.getTemp()); // अस्थायी वेरिएबल का मान प्रिंट करें

        // ObjectInputStream और FileInputStream को बंद करें
        in.close(); // ObjectInputStream को बंद करें
        file.close(); // FileInputStream को बंद करें
    }
}
```

### मुख्य भागों की व्याख्या:

- **FileInputStream**: निर्दिष्ट फ़ाइल से बाइट पढ़ने के लिए उपयोग किया जाता है, इस मामले में, "f:/object.ser" में संग्रहीत सीरियलाइज़्ड ऑब्जेक्ट।

- **ObjectInputStream**: यह क्लास पहले से सीरियलाइज़ किए गए ऑब्जेक्ट्स को पढ़ने की अनुमति देती है, जिससे `MarksheetBean` ऑब्जेक्ट का पुनर्निर्माण संभव होता है।

- **डीसीरियलाइज़ेशन**: `readObject()` विधि इनपुट स्ट्रीम से सीरियलाइज़्ड ऑब्जेक्ट को पुनः प्राप्त करती है, जिसे फिर `MarksheetBean` में कास्ट किया जाता है।

- **डेटा आउटपुट**: प्राप्त ऑब्जेक्ट के फ़ील्ड्स को प्रिंट किया जाता है, जो छात्र की जानकारी, जैसे नाम, विषय के मार्क्स, प्रतिशत, और एक अस्थायी मान प्रदर्शित करता है।

- **संसाधन प्रबंधन**: स्ट्रीम को बंद करना आवश्यक है ताकि संसाधनों को मुक्त किया जा सके और सुनिश्चित किया जा सके कि सभी डेटा फ़ाइल से सही ढंग से पढ़ा गया है।
