```java
package com.sunilos.p10io;

import java.io.BufferedReader; // इनपुट स्ट्रीम से टेक्स्ट पढ़ने के लिए BufferedReader को आयात करें
import java.io.FileWriter; // फ़ाइल में वर्ण लिखने के लिए FileWriter को आयात करें
import java.io.InputStreamReader; // बाइट्स पढ़ने और उन्हें वर्णों में डिकोड करने के लिए InputStreamReader को आयात करें
import java.io.PrintWriter; // टेक्स्ट-आउटपुट स्ट्रीम में ऑब्जेक्ट्स के स्वरूपित प्रतिनिधियों को प्रिंट करने के लिए PrintWriter को आयात करें

/**
 * कीबोर्ड से टेक्स्ट पढ़ता है और उसे एक टेक्स्ट फ़ाइल में संग्रहित करता है।
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class KeyboardToFileCopy {

    public static void main(String[] args) throws Exception {

        // टेक्स्ट लिखने के लिए फ़ाइल खोलें
        FileWriter file = new FileWriter("f:/temp.txt");
        // फ़ाइल में स्वरूपित टेक्स्ट लिखने के लिए PrintWriter बनाएं
        PrintWriter out = new PrintWriter(file);

        // कीबोर्ड इनपुट खोलें
        InputStreamReader kb = new InputStreamReader(System.in);

        // इनपुट स्ट्रीम से पंक्ति दर पंक्ति टेक्स्ट पढ़ने के लिए BufferedReader बनाएं
        BufferedReader in = new BufferedReader(kb);

        // कीबोर्ड से पहली पंक्ति पढ़ें
        String line = in.readLine();

        // तब तक लूप करें जब तक उपयोगकर्ता "quit" न टाइप करे
        while (!line.equals("quit")) {
            out.println(line); // वर्तमान पंक्ति को फ़ाइल में लिखें
            line = in.readLine(); // कीबोर्ड से अगली पंक्ति पढ़ें
        }

        // संसाधनों को मुक्त करने के लिए फ़ाइल लेखक बंद करें
        out.close(); // PrintWriter को बंद करें, जो अंतर्निहित FileWriter को भी बंद कर देता है
        file.close(); // फ़ाइल लेखक को स्पष्ट रूप से बंद करें
        kb.close(); // सिस्टम संसाधनों को मुक्त करने के लिए InputStreamReader को बंद करें
    }
}
```

### मुख्य भागों की व्याख्या:

- **FileWriter**: यह क्लास फ़ाइल में वर्ण लिखने के लिए उपयोग की जाती है। यह फ़ाइल नहीं होने पर एक नई फ़ाइल बनाता है या मौजूदा फ़ाइल को अधिलेखित करता है।

- **PrintWriter**: यह `FileWriter` के लिए एक लपेटने वाला है जो स्वरूपित टेक्स्ट लिखने के लिए विधियाँ प्रदान करता है। यह पंक्तियों को लिखने और बफर को फ्लश करने के लिए सुविधाजनक है।

- **InputStreamReader**: यह क्लास बाइट स्ट्रीम (जैसे कीबोर्ड इनपुट) को वर्ण स्ट्रीम में परिवर्तित करती है, जिससे टेक्स्ट डेटा पढ़ना आसान होता है।

- **BufferedReader**: यह क्लास एक वर्ण-इनपुट स्ट्रीम से टेक्स्ट पढ़ती है, जिससे आप आसानी से टेक्स्ट की पंक्तियाँ पढ़ सकते हैं।

- **Reading and Writing Loop**: प्रोग्राम लगातार कीबोर्ड से पंक्तियाँ पढ़ता है और उन्हें फ़ाइल में लिखता है जब तक उपयोगकर्ता "quit" नहीं टाइप करता।

- **Closing Streams**: यह महत्वपूर्ण है कि स्ट्रीम (जैसे `FileWriter` और `BufferedReader`) को बंद किया जाए ताकि सिस्टम संसाधनों को मुक्त किया जा सके और यह सुनिश्चित किया जा सके कि सभी डेटा फ़ाइल में फ्लश हो जाए।
