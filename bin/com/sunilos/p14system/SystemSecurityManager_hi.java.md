
```java
package com.sunilos.p14system;

/**
 * एप्लिकेशन सिक्योरिटी मैनेजर लागू करें।
 * 
 * @संस्करण 1.0
 * @तारीख 16 नवम्बर 2014
 * @लेखक सुनिल साहू
 * @कॉपीराइट (c) सुनिल साहू
 * @वेबसाइट www.sunilbooks.com
 */
public class SystemSecurityManager {

    public static void main(String[] args)  {

        // वर्तमान सुरक्षा प्रबंधक प्राप्त करें
        SecurityManager secManager = System.getSecurityManager();
        
        // जांचें कि क्या कोई सुरक्षा प्रबंधक कॉन्फ़िगर किया गया है
        if (secManager == null) {
            System.out.println("SecurityManager कॉन्फ़िगर नहीं है");
        }

        // SecurityManager का एक नया उदाहरण बनाएं
        SecurityManager mySecManager = new SecurityManager();
        
        // नया सुरक्षा प्रबंधक सेट करें
        System.setSecurityManager(mySecManager);

        // फिर से वर्तमान सुरक्षा प्रबंधक प्राप्त करें
        secManager = System.getSecurityManager();
        
        // पुष्टि करें कि अब सुरक्षा प्रबंधक कॉन्फ़िगर किया गया है
        if (secManager != null) {
            System.out.println("SecurityManager कॉन्फ़िगर किया गया है");
        }
    }
}
```

### व्याख्या:
- **सुरक्षा प्रबंधक (Security Manager)**: जावा में `SecurityManager` वर्ग का उपयोग एप्लिकेशन के लिए सुरक्षा नीति लागू करने के लिए किया जाता है, जो यह परिभाषित करता है कि एप्लिकेशन कौन से संसाधनों तक पहुंच सकता है।
- **वर्तमान सुरक्षा प्रबंधक की जाँच**: प्रोग्राम सबसे पहले यह जांचता है कि कोई `SecurityManager` पहले से सेट है या नहीं। अगर नहीं, तो यह एक संदेश प्रिंट करता है।
- **नया सुरक्षा प्रबंधक सेट करना**: एक नया `SecurityManager` उदाहरण बनाया जाता है और `System.setSecurityManager()` का उपयोग करके वर्तमान सुरक्षा प्रबंधक के रूप में सेट किया जाता है।
- **सत्यापन**: नया सुरक्षा प्रबंधक सेट करने के बाद, प्रोग्राम दोबारा जांचता है और पुष्टि करता है कि अब सुरक्षा प्रबंधक कॉन्फ़िगर किया गया है और एक संबंधित संदेश प्रिंट करता है।

