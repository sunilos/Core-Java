```java
package com.sunilos.p07exception;

/**
 * कस्टम LoginException क्लास का परीक्षण करता है, जो एक लॉगिन प्रमाणीकरण प्रक्रिया को अनुकरण करता है।
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestCustomLoginException {

    public static void main(String[] args) {
        try {
            // प्रदान की गई प्रमाणपत्रों के साथ प्रमाणीकरण का प्रयास करें
            authenticate("SUNRAYS", "SUNRAYS");
        } catch (LoginException e) {
            // LoginException को पकड़ें और इसका संदेश प्रिंट करें
            System.out.println(e.getMessage());
        }
    }

    /**
     * लॉगिन और पासवर्ड के आधार पर एक उपयोगकर्ता को प्रमाणीकरण करता है।
     * प्रमाणीकरण विफल होने पर LoginException उठाता है।
     *
     * @param login उपयोगकर्ता लॉगिन आईडी
     * @param pwd उपयोगकर्ता पासवर्ड
     * @throws LoginException यदि लॉगिन विफल होता है
     */
    public static void authenticate(String login, String pwd) throws LoginException {
        boolean flag = true; // विफल प्रमाणीकरण का अनुकरण करता है
        if (flag) {
            // यदि प्रमाणीकरण विफल होता है, तो एक नया LoginException उठाएँ
            throw new LoginException();
        }
    }

}
```

### व्याख्या:

- **उद्देश्य:** `TestCustomLoginException` क्लास एक कस्टम अपवाद, `LoginException`, का उपयोग करने का प्रदर्शन करने के लिए डिज़ाइन की गई है, जो एक अनुकरणित लॉगिन प्रमाणीकरण प्रक्रिया के दौरान उत्पन्न होता है।

- **मुख्य विधि:**
  - `main` विधि उपयोगकर्ता को प्रमाणीकरण करने के लिए `authenticate` विधि को उदाहरण प्रमाणपत्रों के साथ कॉल करने का प्रयास करती है।
  - यदि प्रमाणीकरण विफल होता है और एक `LoginException` उठाया जाता है, तो अपवाद को `catch` ब्लॉक में पकड़ा जाता है, और उसका संदेश प्रिंट किया जाता है।

- **प्रमाणीकरण विधि:**
  - यह विधि `login` और `pwd` को पैरामीटर के रूप में लेती है।
  - इसमें एक बूलियन फ्लैग (`flag`) है, जो यह अनुकरण करता है कि प्रमाणीकरण सफल है या नहीं। इस मामले में, इसे `true` पर सेट किया गया है, जो विफलता को दर्शाता है।
  - यदि फ्लैग `true` है, तो एक नया `LoginException` उठाया जाता है, जो एक अवैध लॉगिन प्रयास का अनुकरण करता है।

- **अपवाद हैंडलिंग:**
  - `LoginException` को प्रमाणीकरण विफलताओं के लिए एक विशिष्ट संदेश प्रदान करने के लिए परिभाषित किया गया है, जो मुख्य विधि में अपवाद पकड़े जाने पर आउटपुट होता है।

- **आउटपुट:**
  - जब निष्पादित किया जाता है, तो प्रोग्राम `LoginException` में परिभाषित संदेश को आउटपुट करेगा, यह संकेत देते हुए कि लॉगिन प्रयास अवैध था।
