```java
package com.sunilos.p10io;

import java.io.BufferedInputStream; // बफ़र्ड फ़ाइल पढ़ने के लिए BufferedInputStream वर्ग को आयात करें
import java.io.BufferedOutputStream; // बफ़र्ड फ़ाइल लिखने के लिए BufferedOutputStream वर्ग को आयात करें
import java.io.FileInputStream; // फ़ाइल पढ़ने के लिए FileInputStream वर्ग को आयात करें
import java.io.FileOutputStream; // फ़ाइल लिखने के लिए FileOutputStream वर्ग को आयात करें

/**
 * बफ़र्ड इनपुट और आउटपुट स्ट्रीम कक्षाओं का उपयोग करके एक बाइनरी फ़ाइल कॉपी करें
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class CopyBufferedBinaryFile {

    public static void main(String[] args) throws Exception {

        // स्रोत फ़ाइल पथ और लक्ष्य फ़ाइल पथ को परिभाषित करें
        String source = "f:/baby.jpg"; // कॉपी की जाने वाली फ़ाइल
        String target = "f:/girl.jpg"; // गंतव्य फ़ाइल

        // स्रोत फ़ाइल से पढ़ने के लिए एक BufferedInputStream बनाएं
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));
        // लक्ष्य फ़ाइल में लिखने के लिए एक BufferedOutputStream बनाएं
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(target));

        // डेटा के टुकड़ों को पढ़ने के लिए एक बाइट एरे बफर बनाएँ
        byte[] buff = new byte[256]; // 256 बाइट्स का बफर आकार

        // बफर में बाइट्स का एक टुकड़ा पढ़ें
        int count = in.read(buff); // एक बाइट एरे पढ़ें

        // तब तक लूप करें जब तक फ़ाइल का अंत (EOF) नहीं पहुँचता
        while (count > 0) { // EOF पहुँचने पर count 0 हो जाएगा
            out.write(buff, 0, count); // बफर से लक्ष्य फ़ाइल में बाइट्स लिखें
            count = in.read(buff); // बफर में अगला बाइट टुकड़ा पढ़ें
        }

        // सिस्टम संसाधनों को मुक्त करने के लिए आउटपुट स्ट्रीम बंद करें
        out.close();
        // सिस्टम संसाधनों को मुक्त करने के लिए इनपुट स्ट्रीम बंद करें
        in.close();

        // कॉपी संचालन पूर्ण होने का संदेश प्रिंट करें
        System.out.println(source + " को " + target + " में कॉपी किया गया।");
    }
}
```

### मुख्य भागों की व्याख्या:

- **BufferedInputStream और BufferedOutputStream**: ये कक्षाएँ बफ़रिंग प्रदान करती हैं, जो I/O प्रदर्शन में सुधार कर सकती हैं क्योंकि यह डिस्क एक्सेस संचालन की संख्या को कम करती हैं। डेटा को एक बार में एक बाइट पढ़ने या लिखने के बजाय बड़े टुकड़ों में पढ़ा और लिखा जाता है।
  
- **बाइट एरे बफर**: एक बाइट एरे (`buff`) का उपयोग डेटा को 256 बाइट्स के टुकड़ों में पढ़ने और लिखने के लिए किया जाता है। यह एक बार में एक बाइट पढ़ने और लिखने की तुलना में अधिक कुशल है।
  
- **टुकड़ों में पढ़ना और लिखना**: लूप तब तक जारी रहता है जब तक कोई और बाइट नहीं पढ़ी जाती (अर्थात, `count` 0 हो जाता है)। `write` विधि बफर से लक्ष्य फ़ाइल में निर्दिष्ट संख्या में बाइट्स लिखती है।
  
- **संसाधन प्रबंधन**: पिछले उदाहरण की तरह, यह महत्वपूर्ण है कि स्ट्रीम को बंद किया जाए ताकि सिस्टम संसाधनों को मुक्त किया जा सके।
