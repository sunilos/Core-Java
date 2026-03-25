```java
package com.sunilos.p07exception;

/**
 * अभिभावक अपवाद वर्ग का उपयोग करके अपवादों को संभालने का प्रदर्शन करता है।
 * यह उदाहरण दिखाता है कि कैसे एक अभिभावक अपवाद वर्ग अपने बच्चा वर्गों द्वारा 
 * फेंके गए अपवादों को संभाल सकता है।
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class ParentHandleChildExceptions {

    public static void main(String[] args) {

        String name = null; // नमूना स्ट्रिंग जो null पर प्रारंभ की गई है
        // String name = "Vijay"; // मान्य स्ट्रिंग के साथ परीक्षण के लिए अनकमेंट करें

        try {
            // स्ट्रिंग की लंबाई प्राप्त करने का प्रयास करें
            System.out.println(name.length());
            // स्ट्रिंग का 7वां अक्षर प्राप्त करने का प्रयास करें
            System.out.println(name.charAt(6));
        } catch (RuntimeException e) {
            // यह ब्लॉक किसी भी RuntimeException को संभालता है, जिसमें NullPointerException शामिल है
            System.out.println("Parent Handles Exception : " + e.getMessage());
        }

    }
}
```

### व्याख्या:

- **उद्देश्य:** `ParentHandleChildExceptions` क्लास यह प्रदर्शित करती है कि कैसे एक अभिभावक अपवाद वर्ग (इस मामले में, `RuntimeException`) अपने बच्चा वर्गों द्वारा फेंके गए अपवादों को पकड़ और संभाल सकता है, जैसे `NullPointerException` और `StringIndexOutOfBoundsException`।

- **Try ब्लॉक:** 
  - `try` ब्लॉक के भीतर का कोड `name` स्ट्रिंग पर संचालन करने का प्रयास करता है। यदि `name` null है, तो इसकी विशेषताओं को एक्सेस करने पर `NullPointerException` आएगा।

- **Catch ब्लॉक:** 
  - `catch` ब्लॉक किसी भी `RuntimeException` को पकड़ने के लिए डिज़ाइन किया गया है। चूंकि `NullPointerException` `RuntimeException` का उपवर्ग है, इसलिए इसे यहाँ पकड़ा जाएगा।
  - जब कोई अपवाद होता है, तो कैच ब्लॉक निष्पादित होता है, और अपवाद से संबंधित संदेश प्रिंट किया जाता है, जो यह बताता है कि क्या गलत हुआ।

- **त्रुटि हैंडलिंग:** यह उदाहरण अपवाद हैंडलिंग में पॉलीमॉर्फिज़्म का लाभ उठाकर अपवादों को संभालने का एक सरल तरीका प्रदर्शित करता है। अभिभावक अपवाद प्रकार को पकड़कर, कोड प्रभावी रूप से किसी भी व्युत्पन्न अपवाद को संभाल सकता है, जिससे त्रुटि प्रबंधन सरल हो जाता है और कोड की रखरखाव क्षमता बढ़ जाती है।
