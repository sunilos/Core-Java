```java
package com.sunilos.p10io;

import java.io.FileReader; // कैरेक्टर फ़ाइल पढ़ने के लिए FileReader को आयात करें

/**
 * टेक्स्ट फ़ाइल को कैरेक्टर द्वारा और कैरेक्टर ऐरे द्वारा पढ़ता है।
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class ReadTextFile {

    public static void main(String[] args) throws Exception {
        readByChar(); // कैरेक्टर द्वारा फ़ाइल पढ़ने के लिए विधि को कॉल करें
        System.out.println(); // पृथक्करण के लिए एक नई पंक्ति प्रिंट करें
        readByArray(); // कैरेक्टर ऐरे द्वारा फ़ाइल पढ़ने के लिए विधि को कॉल करें
    }

    private static void readByChar() throws Exception {
        System.out.println("Read file char by char"); // कार्यान्वित की जा रही विधि को संकेत करें

        // FileReader का उपयोग करके फ़ाइल खोलें
        FileReader r = new FileReader("c:/test.txt");

        // एकल कैरेक्टर पढ़ता है
        int ch = r.read(); // पहला कैरेक्टर पढ़ें
        char chr; // कैरेक्टर को धारण करने के लिए वेरिएबल

        // यदि फ़ाइल में कोई और कैरेक्टर नहीं बचा है तो ch -1 है
        while (ch != -1) {
            chr = (char) ch; // पूर्णांक को कैरेक्टर में परिवर्तित करें
            System.out.print(chr); // कैरेक्टर प्रिंट करें
            ch = r.read(); // अगला कैरेक्टर पढ़ें
        }
        r.close(); // संसाधनों को मुक्त करने के लिए FileReader को बंद करें
    }

    private static void readByArray() throws Exception {
        System.out.println("Read file by char Array"); // कार्यान्वित की जा रही विधि को संकेत करें

        // FileReader का उपयोग करके फ़ाइल खोलें
        FileReader r = new FileReader("c:/test.txt");

        // बफरिंग के लिए एक कैरेक्टर ऐरे बनाएं
        char[] buffer = new char[10]; // 10 कैरेक्टर का बफर आकार

        // फ़ाइल से कैरेक्टर ऐरे पढ़ें
        int count = r.read(buffer); // बफर में कैरेक्टर पढ़ें

        // यदि फ़ाइल में कोई और कैरेक्टर नहीं बचा है तो count 0 है
        while (count > 0) {
            // कैरेक्टर ऐरे से एक स्ट्रिंग बनाएं
            String str = new String(buffer);

            // स्ट्रिंग से खाली कैरेक्टर को ट्रिम करें
            str = str.substring(0, count); // केवल पढ़े गए कैरेक्टर की संख्या का उपयोग करें

            System.out.print(str); // स्ट्रिंग प्रिंट करें
            // बफर में और कैरेक्टर पढ़ें
            count = r.read(buffer);
        }
        // FileReader को बंद करें
        r.close(); // संसाधनों को मुक्त करने के लिए FileReader को बंद करें
    }
}
```

### मुख्य भागों की व्याख्या:

- **FileReader**: यह क्लास कैरेक्टर फ़ाइलें पढ़ने के लिए उपयोग की जाती है। यह कैरेक्टर एन्कोडिंग को स्वचालित रूप से संभालती है।

- **readByChar() विधि**: यह फ़ाइल को एक समय में एक कैरेक्टर पढ़ती है। यह तब तक जारी रहती है जब तक पढ़ने के लिए कोई और कैरेक्टर न बचा हो (`read()` -1 लौटाता है)।

- **readByArray() विधि**: यह एक बार में कई कैरेक्टर्स को एक कैरेक्टर ऐरे में पढ़ती है, जिससे अधिक कुशल पढ़ाई संभव होती है।

- **बफर प्रबंधन**: एक कैरेक्टर ऐरे (`buffer`) का उपयोग एक ब्लॉक के कैरेक्टर्स को पढ़ने के लिए किया जाता है, जो एक समय में एक कैरेक्टर पढ़ने की तुलना में प्रदर्शन में सुधार करता है।

- **स्ट्रिंग निर्माण और ट्रिमिंग**: कैरेक्टर ऐरे से एक स्ट्रिंग बनाई जाती है, और केवल मान्य कैरेक्टर प्रिंट करने के लिए `substring()` का उपयोग किया जाता है।

- **संसाधन प्रबंधन**: फ़ाइल ऑपरेशनों के बाद सिस्टम संसाधनों को मुक्त करने के लिए `FileReader` को बंद करना आवश्यक है।
