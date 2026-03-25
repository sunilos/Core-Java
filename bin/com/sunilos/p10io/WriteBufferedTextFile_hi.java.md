```java
package com.sunilos.p10io;

import java.io.BufferedWriter; // कुशल लेखन के लिए BufferedWriter को आयात करें
import java.io.FileWriter; // कैरेक्टर फ़ाइलों में लेखन के लिए FileWriter को आयात करें

/**
 * टेक्स्ट फ़ाइल में बफ़र्ड कैरेक्टर स्ट्रीम लिखता है। कुशल लेखन के लिए BufferedWriter और
 * PrintWriter क्लास ऑब्जेक्ट्स का उपयोग किया जा सकता है।
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class WriteBufferedTextFile {

    public static void main(String[] args) throws Exception {
        System.out.println("Write to a Text file char by char"); // किए जा रहे कार्य को संकेत करें

        // FileWriter का उपयोग करके फ़ाइल खोलें
        FileWriter file = new FileWriter("f:/test11.txt");

        // कुशल लेखन के लिए FileWriter को BufferedWriter के साथ लपेटें
        BufferedWriter out = new BufferedWriter(file);

        // लिखने के लिए एक कैरेक्टर ऐरे बनाएँ
        char[] cArray = { 'H', 'i' };

        // कैरेक्टर ऐरे को फ़ाइल में लिखें
        out.write(cArray); // कैरेक्टर ऐरे की सामग्री लिखें

        // फ़ाइल में एकल कैरेक्टर लिखें
        out.write(','); // एक कॉमा लिखें

        // फ़ाइल में एक स्ट्रिंग लिखें
        out.write("SUNRAYS"); // स्ट्रिंग "SUNRAYS" लिखें

        // BufferedWriter को बंद करें
        out.close(); // सभी डेटा को फ्लश करने और संसाधनों को मुक्त करने के लिए BufferedWriter को बंद करें

        // FileWriter को बंद करें
        file.close(); // FileWriter को बंद करें
    }
}
```

### मुख्य भागों की व्याख्या:

- **BufferedWriter**: यह टेक्स्ट को एक कैरेक्टर आउटपुट स्ट्रीम में लिखने के लिए उपयोग किया जाता है, जो टेक्स्ट के कुशल लेखन के लिए कैरेक्टर्स को बफर करता है।

- **FileWriter**: यह फ़ाइल में कैरेक्टर लिखने के लिए उपयोग किया जाता है। इसे प्रदर्शन सुधारने के लिए `BufferedWriter` में लपेटा जा सकता है।

- **कैरेक्टर ऐरे**: कोड कैरेक्टर ऐरे और एक स्ट्रिंग दोनों को फ़ाइल में लिखने का प्रदर्शन करता है, जो `BufferedWriter` की लचीलापन को दर्शाता है।

- **संसाधन प्रबंधन**: उचित रूप से `BufferedWriter` और `FileWriter` को बंद करने से यह सुनिश्चित होता है कि सभी डेटा फ़ाइल में फ्लश हो जाए और सिस्टम संसाधनों को मुक्त किया जाए।
