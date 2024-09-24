```java
package com.sunilos.p10io;

import java.io.DataOutputStream; // DataOutputStream (इस उदाहरण में उपयोग नहीं किया गया)
import java.io.FileOutputStream; // फ़ाइलों में बाइनरी डेटा लिखने के लिए FileOutputStream को आयात करें
import java.io.ObjectOutputStream; // ऑब्जेक्ट को सीरियलाइज करने के लिए ObjectOutputStream को आयात करें

/**
 * एक एक्सटर्नलाइज्ड ऑब्जेक्ट को सीरियलाइज करें और फ़ाइल में लिखें
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class WriteExtObject {

    public static void main(String[] args) throws Exception {
        // फ़ाइल में लिखने के लिए FileOutputStream बनाएं
        FileOutputStream file = new FileOutputStream("f:/object.ser");

        // सीरियलाइजेशन के लिए FileOutputStream को ObjectOutputStream के साथ लपेटें
        ObjectOutputStream out = new ObjectOutputStream(file);

        // MarksheetBeanExt का एक उदाहरण बनाएँ
        MarksheetBeanExt m = new MarksheetBeanExt();
        
        // ऑब्जेक्ट के फ़ील्ड के लिए मान सेट करें
        m.setName("Raju"); // छात्र का नाम सेट करें
        m.setMaths(90); // गणित के स्कोर सेट करें
        m.setPhysics(80); // भौतिकी के स्कोर सेट करें
        m.setChemistry(89); // रसायन विज्ञान के स्कोर सेट करें
        m.setTemp(99); // अस्थायी मान सेट करें

        // कुल अंक और प्रतिशत की गणना और प्रदर्शन करें
        System.out.println("Total Marks : " + m.getTotal()); // कुल अंक प्रिंट करें
        System.out.println("Percentage : " + m.getPercentage()); // प्रतिशत प्रिंट करें

        // MarksheetBeanExt ऑब्जेक्ट को सीरियलाइज करें
        out.writeObject(m); // ऑब्जेक्ट को आउटपुट स्ट्रीम में लिखें

        // ObjectOutputStream को बंद करें
        out.close(); // यह सुनिश्चित करने के लिए स्ट्रीम को बंद करें कि डेटा फ़ाइल में लिखा गया है

        System.out.println("Object is serialized and persisted."); // सीरियलाइजेशन की पुष्टि करें
    }
}
```

### मुख्य भागों की व्याख्या:

- **ObjectOutputStream**: यह स्ट्रीम में ऑब्जेक्ट्स को सीरियलाइज करने के लिए उपयोग किया जाता है। यह `Serializable` या `Externalizable` इंटरफ़ेस को लागू करने वाले जटिल ऑब्जेक्ट्स को लिखने में सक्षम है।

- **MarksheetBeanExt**: यह वह क्लास है जिसे सीरियलाइज किया जा रहा है। इसे सीरियलाइजेशन को नियंत्रित करने के लिए `Externalizable` इंटरफ़ेस को लागू करना चाहिए।

- **ऑब्जेक्ट मान सेट करना**: उदाहरण दर्शाता है कि कैसे एक ऑब्जेक्ट बनाएं और सीरियलाइजेशन से पहले इसकी प्रॉपर्टीज सेट करें, जिससे ऑब्जेक्ट में सार्थक डेटा हो सके।

- **सीरियलाइजेशन प्रक्रिया**: `writeObject()` का उपयोग करके ऑब्जेक्ट को फ़ाइल में लिखा जाता है, जिससे इसे बाद में डीसिरियलाइज किया जा सके और ऑब्जेक्ट की स्थिति प्राप्त की जा सके।

- **संसाधन प्रबंधन**: उचित रूप से `ObjectOutputStream` को बंद करने से यह सुनिश्चित होता है कि सभी डेटा फ्लश हो जाए और संसाधनों को मुक्त किया जाए, जो फ़ाइल प्रबंधन के लिए महत्वपूर्ण है।
