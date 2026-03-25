```java
package com.sunilos.p10io;

import java.io.DataOutputStream; // प्राइमिटिव डेटा प्रकार लिखने के लिए DataOutputStream को आयात करें
import java.io.FileOutputStream; // फ़ाइलों में लिखने के लिए FileOutputStream को आयात करें

/**
 * बाइनरी स्ट्रीम में प्राइमिटिव डेटा लिखता है
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class WritePrimitiveData {

    public static void main(String[] args) throws Exception {
        // बाइनरी डेटा को निर्दिष्ट फ़ाइल में लिखने के लिए FileOutputStream बनाएं
        FileOutputStream file = new FileOutputStream("f:/binary.dat");
        
        // प्राइमिटिव डेटा प्रकार लिखने के लिए FileOutputStream को DataOutputStream के साथ लपेटें
        DataOutputStream out = new DataOutputStream(file);

        // आउटपुट स्ट्रीम में एक पूर्णांक लिखें
        out.writeInt(1); // पूर्णांक मान 1 लिखता है

        // आउटपुट स्ट्रीम में एक बूलियन लिखें
        out.writeBoolean(true); // बूलियन मान true लिखता है

        // आउटपुट स्ट्रीम में एक वर्ण लिखें
        out.writeChar('A'); // वर्ण 'A' लिखता है

        // आउटपुट स्ट्रीम में एक डबल लिखें
        out.writeDouble(1.2); // डबल मान 1.2 लिखता है

        // DataOutputStream को बंद करें
        out.close(); // यह सुनिश्चित करता है कि सभी डेटा फ़ाइल में लिखा गया है और संसाधन मुक्त हो गए हैं

        // पुष्टि संदेश
        System.out.println("Primitive Data successfully written"); // सफल ऑपरेशन का संकेत करता है
    }
}
```

### मुख्य भागों की व्याख्या:

- **DataOutputStream**: यह क्लास जावा प्राइमिटिव डेटा प्रकार (जैसे `int`, `boolean`, `char`, `double`) को आउटपुट स्ट्रीम में एक पोर्टेबल तरीके से लिखने की अनुमति देती है। यह डेटा के बाइनरी स्वरूप को बनाए रखने में मदद करती है।

- **प्राइमिटिव डेटा लिखना**: कोड यह दर्शाता है कि विभिन्न प्राइमिटिव डेटा प्रकारों को बाइनरी फ़ाइल में कैसे लिखा जाए। प्रत्येक विधि एक विशिष्ट डेटा प्रकार के लिए होती है:
  - `writeInt(int v)`: एक पूर्णांक लिखता है।
  - `writeBoolean(boolean v)`: एक बूलियन लिखता है।
  - `writeChar(char v)`: एक वर्ण लिखता है।
  - `writeDouble(double v)`: एक डबल लिखता है।

- **संसाधन प्रबंधन**: `DataOutputStream` को बंद करना यह सुनिश्चित करने के लिए आवश्यक है कि सभी डेटा सही ढंग से फ़ाइल में लिखा गया है और सिस्टम संसाधन मुक्त हो गए हैं।

- **पुष्टि संदेश**: एक साधारण प्रिंट स्टेटमेंट यह पुष्टि करता है कि डेटा लेखन ऑपरेशन सफल था।
