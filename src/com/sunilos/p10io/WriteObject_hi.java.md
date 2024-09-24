```java
package com.sunilos.p10io;

import java.io.DataOutputStream; // DataOutputStream (इस उदाहरण में उपयोग नहीं किया गया)
import java.io.FileOutputStream; // फ़ाइलों में बाइनरी डेटा लिखने के लिए FileOutputStream को आयात करें
import java.io.ObjectOutputStream; // ऑब्जेक्ट को सीरियलाइज करने के लिए ObjectOutputStream को आयात करें

/**
 * एक ऑब्जेक्ट को सीरियलाइज करें और फ़ाइल में लिखें
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class WriteObject {

    public static void main(String[] args) throws Exception {
        // फ़ाइल में लिखने के लिए FileOutputStream बनाएं
        FileOutputStream file = new FileOutputStream("f:/object.ser");

        // सीरियलाइजेशन के लिए FileOutputStream को ObjectOutputStream के साथ लपेटें
        ObjectOutputStream out = new ObjectOutputStream(file);

        // MarksheetBean का एक उदाहरण बनाएँ
        MarksheetBean m = new MarksheetBean();
        
        // ऑब्जेक्ट के फ़ील्ड के लिए मान सेट करें
        m.setName("Raju"); // छात्र का नाम सेट करें
        m.setMaths(90); // गणित के स्कोर सेट करें
        m.setPhysics(80); // भौतिकी के स्कोर सेट करें
        m.setChemistry(89); // रसायन विज्ञान के स्कोर सेट करें
        m.setTemp(99); // अस्थायी मान सेट करें

        // कुल अंक और प्रतिशत की गणना और प्रदर्शन करें
        System.out.println("Total Marks : " + m.getTotal()); // कुल अंक प्रिंट करें
        System.out.println("Percentage : " + m.getPercentage()); // प्रतिशत प्रिंट करें

        // MarksheetBean ऑब्जेक्ट को सीरियलाइज करें
        out.writeObject(m); // ऑब्जेक्ट को आउटपुट स्ट्रीम में लिखें

        // ObjectOutputStream को बंद करें
        out.close(); // यह सुनिश्चित करने के लिए स्ट्रीम को बंद करें कि डेटा फ़ाइल में लिखा गया है

        System.out.println("Object is serialized and persisted."); // सीरियलाइजेशन की पुष्टि करें
    }
}
```

### मुख्य भागों की व्याख्या:

- **ObjectOutputStream**: यह स्ट्रीम में ऑब्जेक्ट्स को सीरियलाइज करने के लिए उपयोग किया जाता है। यह क्लास ऑब्जेक्ट्स को बाइट स्ट्रीम में परिवर्तित करने का प्रबंधन करती है, जिसे बाद में फ़ाइल में सहेजा जा सकता है।

- **MarksheetBean**: यह वह ऑब्जेक्ट है जिसे सीरियलाइज किया जा रहा है। इसे `Serializable` इंटरफ़ेस को लागू करना चाहिए, जिससे इसे बाइट स्ट्रीम में परिवर्तित किया जा सके।

- **ऑब्जेक्ट मान सेट करना**: कोड यह दर्शाता है कि एक ऑब्जेक्ट कैसे बनाया जाए और इसकी प्रॉपर्टीज़ सेट की जाएं, जिससे सार्थक डेटा को सीरियलाइज किया जा सके।

- **सीरियलाइजेशन प्रक्रिया**: ऑब्जेक्ट को `writeObject()` विधि का उपयोग करके फ़ाइल में लिखा जाता है। यह चरण ऑब्जेक्ट की स्थिति को बाइट स्ट्रीम में परिवर्तित करता है, जिसे फ़ाइल में सहेजा जा सकता है।

- **संसाधन प्रबंधन**: `ObjectOutputStream` को उचित रूप से बंद करना यह सुनिश्चित करता है कि सभी डेटा फ्लश हो जाए और संसाधनों को मुक्त किया जाए, जो फ़ाइल प्रबंधन के लिए महत्वपूर्ण है।
