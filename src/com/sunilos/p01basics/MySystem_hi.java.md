```java
package com.sunilos.p01basics;

/**
 * MySystem क्लास एक Java प्रोग्राम है जो नॉटपैड (notepad.exe) नामक नटिव एप्लिकेशन को लॉन्च करता है।
 * 
 * यह प्रोग्राम Java के `Runtime` क्लास का उपयोग करके बाहरी एप्लिकेशन को चलाने का तरीका दर्शाता है।
 * यह प्रोग्राम Windows सिस्टम पर Notepad एप्लिकेशन को लॉन्च करता है।
 * 
 * @author Sunil Sahu
 * @version 1.0
 * @since 16 Nov 2014
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class MySystem {
    
    /**
     * मुख्य विधि (main method) प्रोग्राम की एंट्री पॉइंट है।
     * यह `Runtime.getRuntime().exec` विधि का उपयोग करके Notepad एप्लिकेशन को लॉन्च करता है।
     *
     * @param args रनटाइम आर्ग्यूमेंट्स (इस प्रोग्राम में उपयोग नहीं किए जाते)।
     * @throws Exception यदि आदेश को निष्पादित करते समय कोई त्रुटि होती है।
     */
    public static void main(String[] args) throws Exception {
        Runtime.getRuntime().exec("notepad.exe");
    }

}
```

**व्याख्या:**
- यह प्रोग्राम Windows सिस्टम पर Notepad एप्लिकेशन को लॉन्च करता है।
- यह Java के `Runtime.getRuntime().exec` विधि का उपयोग करके Notepad खोलने का आदेश देता है।
