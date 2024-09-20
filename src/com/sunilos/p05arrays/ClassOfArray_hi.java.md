```java
package com.sunilos.p05arrays;

/**
 * Prints the name of the array class.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class ClassOfArray {

    public static void main(String[] args) {
        // एक विशेष अक्षरों के साथ एक कैरेक्टर एरे को इनिशियलाइज़ करें
        char[] myArray = { 'S', 'U', 'N', 'R', 'A', 'Y', 'S' };
        
        // रिफ्लेक्शन का उपयोग करके एरे का क्लास नाम प्राप्त करें
        String name = myArray.getClass().getName();
        
        // कैरेक्टर एरे के क्लास का नाम प्रिंट करें
        System.out.println("char[] एरे का नाम है " + name);
    }
}
```

### व्याख्या:
- यह प्रोग्राम एक कैरेक्टर एरे को परिभाषित करता है और `getClass()` मेथड का उपयोग करके इसका क्लास नाम प्राप्त करता है, जिसे फिर कंसोल पर प्रिंट किया जाता है। आउटपुट यह दिखाएगा कि यह एक कैरेक्टर एरे (`char[]`) है।
