```java
package com.sunilos.p10io;

import java.io.File; // फ़ाइल संचालन के लिए File वर्ग को आयात करें
import java.util.Date; // तिथि और समय को संभालने के लिए Date वर्ग को आयात करें

/**
 * फ़ाइल प्रणाली के लिए फ़ाइल जानकारी प्राप्त करता है और उसे प्रिंट करता है।
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class FileInfo {

    public static void main(String[] args) {

        // "c:/a.txt" को संदर्भित करने के लिए एक File ऑब्जेक्ट बनाएं
        File f = new File("c:/a.txt");

        // जाँच करें कि फ़ाइल मौजूद है या नहीं
        if (f.exists()) {
            // फ़ाइल का नाम प्रिंट करें
            System.out.println("Name: " + f.getName());
            // फ़ाइल का पूर्ण पथ प्रिंट करें
            System.out.println("Path: " + f.getAbsolutePath());

            // पहुँच अनुमतियों की जाँच करें और प्रिंट करें
            System.out.println("Access permission");
            System.out.println("Writable: " + f.canWrite()); // जाँच करें कि फ़ाइल लिखी जा सकती है
            System.out.println("Readable: " + f.canRead()); // जाँच करें कि फ़ाइल पढ़ी जा सकती है

            // जाँच करें कि File ऑब्जेक्ट एक फ़ाइल या निर्देशिका का संदर्भ देता है
            System.out.println("Is File: " + f.isFile()); // यदि यह एक फ़ाइल है तो true
            System.out.println("Is Dir: " + f.isDirectory()); // यदि यह एक निर्देशिका है तो true

            // फ़ाइल के अंतिम संशोधित दिनांक को प्राप्त करें और प्रिंट करें
            Date d = new Date(f.lastModified()); // अंतिम संशोधित टाइमस्टैम्प से एक Date ऑब्जेक्ट बनाएँ
            System.out.println("Date Modified: " + d);

            // फ़ाइल की लंबाई को बाइट्स में प्राप्त करें और प्रिंट करें
            long length = f.length(); // बाइट्स में लंबाई
            System.out.println("Length: " + length + " bytes");

        } else {
            // यदि फ़ाइल मौजूद नहीं है तो एक संदेश प्रिंट करें
            System.out.println("File does not exist");
        }
    }
}
```

### मुख्य भागों की व्याख्या:

- **File Class**: फ़ाइल या निर्देशिका के पथ का प्रतिनिधित्व करने के लिए उपयोग किया जाता है, जो फ़ाइल विशेषताओं को क्वेरी करने और फ़ाइल संचालन करने के लिए विधियाँ प्रदान करता है।

- **Checking File Existence**: `exists()` विधि जांचती है कि `File` ऑब्जेक्ट द्वारा प्रतिनिधित्व की गई फ़ाइल या निर्देशिका फ़ाइल प्रणाली में मौजूद है या नहीं।

- **File Information**: 
  - `getName()`: फ़ाइल या निर्देशिका का नाम लौटाता है।
  - `getAbsolutePath()`: फ़ाइल या निर्देशिका का पूर्ण पथ लौटाता है।
  - `canWrite()` और `canRead()`: यह जांचते हैं कि फ़ाइल लिखी जा सकती है और पढ़ी जा सकती है, क्रमशः।

- **File Type Check**: 
  - `isFile()`: यदि `File` ऑब्जेक्ट एक फ़ाइल है तो `true` लौटाता है।
  - `isDirectory()`: यदि `File` ऑब्जेक्ट एक निर्देशिका है तो `true` लौटाता है।

- **Last Modified Date**: `lastModified()` अंतिम संशोधित समय को मिलीसेकंड में लौटाता है जो शताब्दी की शुरुआत से है, जिसे पढ़ने योग्य प्रारूप के लिए एक `Date` ऑब्जेक्ट में परिवर्तित किया जाता है।

- **File Length**: `length()` फ़ाइल के आकार को बाइट्स में लौटाता है।
