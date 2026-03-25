```java
package com.sunilos.p10io;

import java.io.BufferedReader; // कुशल टेक्स्ट पढ़ने के लिए BufferedReader को आयात करें
import java.io.FileReader; // कैरेक्टर फ़ाइल पढ़ने के लिए FileReader को आयात करें
import java.util.Scanner; // इनपुट पढ़ने के लिए Scanner को आयात करें

/**
 * BufferedReader और Scanner क्लास का उपयोग करके टेक्स्ट फ़ाइल से लाइन दर लाइन डेटा पढ़ता है।
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class ReadTextFileByLine {

    public static void main(String[] args) throws Exception {
        readByBufferedReader(); // BufferedReader का उपयोग करके फ़ाइल पढ़ने के लिए विधि को कॉल करें
        System.out.println(); // पृथक्करण के लिए एक नई पंक्ति प्रिंट करें
        readByScanner(); // Scanner का उपयोग करके फ़ाइल पढ़ने के लिए विधि को कॉल करें
    }

    /**
     * BufferedReader ऑब्जेक्ट की मदद से फ़ाइल को लाइन दर लाइन पढ़ता है
     * 
     * @throws Exception
     */
    public static void readByBufferedReader() throws Exception {
        System.out.println("Read file by Buffered Reader"); // कार्यान्वित की जा रही विधि को संकेत करें

        // FileReader का उपयोग करके फ़ाइल खोलें
        FileReader r = new FileReader("c:/test.txt");

        // लाइन पढ़ने के लिए BufferedReader के साथ FileReader को लपेटें
        BufferedReader br = new BufferedReader(r);

        // फ़ाइल से पहली पंक्ति पढ़ें
        String line = br.readLine();

        // फ़ाइल के अंत तक प्रक्रिया लूप
        while (line != null) {
            System.out.println(line); // वर्तमान पंक्ति प्रिंट करें
            line = br.readLine(); // अगली पंक्ति पढ़ें
        }

        // BufferedReader को बंद करें
        br.close(); // संसाधनों को मुक्त करने के लिए BufferedReader को बंद करें

        // FileReader को बंद करें
        r.close(); // FileReader को बंद करें
    }

    /**
     * Scanner ऑब्जेक्ट की मदद से फ़ाइल को लाइन दर लाइन पढ़ता है
     * 
     * @throws Exception
     */
    public static void readByScanner() throws Exception {
        System.out.println("Read file by Scanner"); // कार्यान्वित की जा रही विधि को संकेत करें

        // FileReader का उपयोग करके फ़ाइल खोलें
        FileReader r = new FileReader("c:/test.txt");

        // लाइन पढ़ने के लिए Scanner के साथ FileReader को लपेटें
        Scanner sc = new Scanner(r);

        String line = null; // वर्तमान पंक्ति को धारण करने के लिए वेरिएबल

        // पढ़ने के लिए पंक्तियाँ होने तक प्रक्रिया लूप
        while (sc.hasNext()) {
            line = sc.nextLine(); // अगली पंक्ति पढ़ें
            System.out.println(line); // वर्तमान पंक्ति प्रिंट करें
        }

        // Scanner को बंद करें
        sc.close(); // संसाधनों को मुक्त करने के लिए Scanner को बंद करें

        // FileReader को बंद करें
        r.close(); // FileReader को बंद करें
    }
}
```

### मुख्य भागों की व्याख्या:

- **BufferedReader**: यह टेक्स्ट को एक कैरेक्टर इनपुट स्ट्रीम से पढ़ने के लिए उपयोग किया जाता है, जो लाइनों के कुशल पढ़ने के लिए कैरेक्टर्स को बफर करता है।

- **readByBufferedReader() विधि**: यह `BufferedReader` का उपयोग करके फ़ाइल को लाइन दर लाइन पढ़ती है। यह तब तक जारी रहती है जब तक और कोई पंक्तियाँ न बची हों (जब `readLine()` `null` लौटाता है)।

- **Scanner**: यह एक सरल टेक्स्ट स्कैनर है जो नियमित अभिव्यक्तियों का उपयोग करके प्राइमेटिव प्रकारों और स्ट्रिंग्स को पार्स कर सकता है।

- **readByScanner() विधि**: यह `Scanner` का उपयोग करके फ़ाइल से पंक्तियाँ पढ़ती है। यह तब तक जारी रहती है जब तक और पंक्तियाँ उपलब्ध हों (`hasNext()` के माध्यम से)।

- **संसाधन प्रबंधन**: दोनों विधियाँ उपयोग के बाद रीडर्स को बंद करने की सुनिश्चितता करती हैं ताकि सिस्टम संसाधनों को मुक्त किया जा सके और मेमोरी लीक से बचा जा सके।
