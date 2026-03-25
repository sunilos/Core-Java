```java
package com.sunilos.p10io;

import java.io.BufferedWriter; // बफर्ड कैरेक्टर आउटपुट के लिए BufferedWriter को आयात करें
import java.io.FileWriter; // फ़ाइलों में लिखने के लिए FileWriter को आयात करें
import java.io.PrintWriter; // वस्तुओं के स्वरूपित प्रतिनिधित्व को टेक्स्ट-आउटपुट स्ट्रीम में प्रिंट करने के लिए PrintWriter को आयात करें

/**
 * PrintWriter क्लास का उपयोग करके टेक्स्ट लिखता है।
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class WritePrintWriterTextFile {

    public static void main(String[] args) throws Exception {
        // लेखन प्रक्रिया के शुरू होने का संकेत देने वाला पुष्टि संदेश
        System.out.println("Write to a Text file using PrintWriter");
        
        // लेखन के लिए एक फ़ाइल खोलें
        FileWriter file = new FileWriter("f:/test11.txt");
        
        // आसान टेक्स्ट आउटपुट के लिए FileWriter को PrintWriter के साथ लपेटें
        // PrintWriter के कंस्ट्रक्टर में 'true' पैरामीटर ऑटो-फ्लशिंग सक्षम करता है
        PrintWriter out = new PrintWriter(file, true);
        
        // फ़ाइल में टेक्स्ट की पंक्तियाँ लिखें
        out.println("Line 1"); // पहली पंक्ति लिखें
        out.println("Line 2"); // दूसरी पंक्ति लिखें
        out.println("Line 3"); // तीसरी पंक्ति लिखें
        
        // PrintWriter को बंद करें
        out.close(); // सुनिश्चित करता है कि सभी बफर्ड डेटा फ़ाइल में लिखा गया है
        
        // FileWriter को बंद करें
        file.close(); // फ़ाइल से संबंधित संसाधनों को मुक्त करता है
    }
}
```

### मुख्य भागों की व्याख्या:

- **PrintWriter**: यह क्लास फ़ाइल में स्वरूपित टेक्स्ट लिखने के लिए सुविधाजनक विधियाँ प्रदान करती है। यह साधारण टेक्स्ट और अधिक जटिल स्वरूपित आउटपुट दोनों को संभाल सकती है।

- **ऑटो-फ्लशिंग**: `PrintWriter` के कंस्ट्रक्टर में `true` पैरामीटर ऑटो-फ्लशिंग सक्षम करता है। इसका मतलब है कि जब भी एक नया लाइन कैरेक्टर लिखा जाता है, आउटपुट बफर स्वचालित रूप से फ्लश हो जाता है, यह सुनिश्चित करता है कि डेटा तुरंत फ़ाइल में सहेजा जाए।

- **पंक्तियाँ लिखना**: `println()` विधि का उपयोग करके टेक्स्ट की प्रत्येक पंक्ति लिखी जाती है। `println()` को कॉल करने पर निर्दिष्ट टेक्स्ट एक नया लाइन कैरेक्टर के साथ लिखा जाता है।

- **संसाधन प्रबंधन**: यह सुनिश्चित करने के लिए कि सभी डेटा फ़ाइल में फ्लश किया गया है और सिस्टम संसाधन ठीक से मुक्त हो गए हैं, `PrintWriter` और `FileWriter` दोनों को बंद करना महत्वपूर्ण है।
