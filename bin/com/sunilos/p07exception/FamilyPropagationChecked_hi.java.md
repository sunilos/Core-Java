```java
package com.sunilos.p07exception;

/**
 * FamilyPropagationChecked क्लास एक चेक्ड एक्सेप्शन (MistakeException) के प्रसार को
 * मेथड कॉल्स के माध्यम से दर्शाता है। यह दिखाता है कि चेक्ड एक्सेप्शन्स को
 * सही ढंग से डिक्लेयर और हैंडल किया जाना चाहिए।
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class FamilyPropagationChecked {

    public static void main(String[] args) {
        // एक्सेप्शन के प्रसार की प्रक्रिया को dad() कॉल करके शुरू करें।
        dad();
    }

    /**
     * dad() मेथड mom() को कॉल करने की कोशिश करता है और अगर 
     * MistakeException उठती है तो उसे हैंडल करता है।
     */
    public static void dad() {
        try {
            // mom() को कॉल करें जो कि MistakeException फेंक सकता है।
            mom();
        } catch (MistakeException e) {
            // MistakeException को पकड़ें और हैंडल करें जो son() द्वारा फेंका गया हो।
            System.out.println(e.getMessage());
        }
    }

    /**
     * mom() मेथड son() को कॉल करता है, जो कि MistakeException फेंक सकता है।
     * यह मेथड डिक्लेयर करता है कि यह MistakeException फेंक सकता है।
     * 
     * @throws MistakeException
     */
    public static void mom() throws MistakeException {
        // son() को कॉल करें जो MistakeException को फैलाता है।
        son();
    }

    /**
     * son() मेथड एक MistakeException को बनाता है और फेंकता है।
     * यह मेथड डिक्लेयर करता है कि यह MistakeException फेंक सकता है।
     * 
     * @throws MistakeException
     */
    public static void son() throws MistakeException {
        // एक नया MistakeException बनाएं।
        MistakeException e = new MistakeException();
        // MistakeException फेंकें जिससे यह कॉल स्टैक में ऊपर की ओर फैले।
        throw e;
    }
}
```

### व्याख्या:

- **उद्देश्य:** `FamilyPropagationChecked` क्लास यह दिखाती है कि चेक्ड एक्सेप्शन्स (जैसे कि `MistakeException`) मेथड कॉल्स के माध्यम से कैसे फैलती हैं। यह आवश्यक बनाता है कि चेक्ड एक्सेप्शन्स को डिक्लेयर और सही तरीके से हैंडल किया जाए।

- **मेथड ओवरव्यू:**
  - **`main` मेथड:** यह प्रोग्राम का एंट्री पॉइंट है। यह `dad()` मेथड को कॉल करके एक्सेप्शन प्रसार की प्रक्रिया शुरू करता है।
  
  - **`dad` मेथड:** यह मेथड `mom()` को `try` ब्लॉक के अंदर कॉल करता है। यदि कोई `MistakeException` होती है, तो यह उसे पकड़ता है और उसका मैसेज प्रिंट करता है।
  
  - **`mom` मेथड:** यह मेथड डिक्लेयर करता है कि यह `MistakeException` फेंक सकता है और `son()` को कॉल करता है, जो कि एक्सेप्शन फेंकने के लिए जिम्मेदार है।

  - **`son` मेथड:** यह मेथड एक नया `MistakeException` बनाता है और उसे फेंकता है। यह डिक्लेयर करता है कि यह एक्सेप्शन को फेंक सकता है, ताकि कॉलर इसे सही ढंग से हैंडल कर सके।

- **एक्सेप्शन हैंडलिंग:** यह प्रोग्राम यह दिखाता है कि चेक्ड एक्सेप्शन्स को स्पष्ट रूप से हैंडल करना पड़ता है। `dad()` मेथड `son()` द्वारा फेंकी गई `MistakeException` को हैंडल करता है, जिससे प्रोग्राम के प्रवाह में एक्सेप्शन को ठीक से प्रबंधित किया जाता है।
