```java
package com.sunilos.p07exception;

/**
 * एक ही catch ब्लॉक में कई एक्सेप्शन प्रकारों को संभालने का प्रदर्शन करता है, 
 * यह सुविधा Java 7 और इसके बाद के संस्करणों में समर्थित है।
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class MultiExceptionHandling {

    public static void main(String[] args) {

        String name = "Vijay"; // प्रदर्शन के लिए नमूना स्ट्रिंग

        try {
            // स्ट्रिंग की लंबाई प्राप्त करें
            System.out.println(name.length());
            // स्ट्रिंग का 7वां अक्षर प्राप्त करने का प्रयास करें
            System.out.println(name.charAt(6));
        } catch (NullPointerException | StringIndexOutOfBoundsException ex) {
            // यह ब्लॉक NullPointerException और StringIndexOutOfBoundsException दोनों को संभालता है
            System.out.println(ex.getMessage());
        }

    }
}
```

### व्याख्या:

- **उद्देश्य:** `MultiExceptionHandling` क्लास एक ही `catch` ब्लॉक के भीतर कई एक्सेप्शन प्रकारों को पकड़ने का तरीका प्रदर्शित करती है, जो त्रुटि हैंडलिंग को सरल बनाने के लिए Java 7 में पेश की गई थी।

- **Try ब्लॉक:** `try` ब्लॉक के भीतर का कोड `name` स्ट्रिंग पर दो ऑपरेशन करता है: इसकी लंबाई प्राप्त करना और इसके सातवें अक्षर को एक्सेस करना। यदि ये ऑपरेशन विफल होते हैं, तो एक एक्सेप्शन फेंका जा सकता है।

- **Catch ब्लॉक:** 
  - `catch` ब्लॉक `NullPointerException` और `StringIndexOutOfBoundsException` दोनों को संभालने में सक्षम है। यदि इनमें से कोई भी एक्सेप्शन फेंका जाता है, तो नियंत्रण इस ब्लॉक में चला जाता है।
  - एक्सेप्शन ऑब्जेक्ट `ex` का उपयोग `getMessage()` कॉल करने के लिए किया जाता है, जो पकड़ी गई एक्सेप्शन से संबंधित एक विवरणात्मक संदेश को पुनः प्राप्त करता है। यह संदेश बताता है कि क्या गलत हुआ।

- **त्रुटि हैंडलिंग:** यह दृष्टिकोण एकीकृत तरीके से कई एक्सेप्शंस को प्रोसेस करने की अनुमति देकर त्रुटि हैंडलिंग को सरल बनाता है, कोड में पुनरावृत्ति को कम करता है और पठनीयता को बढ़ाता है। उपयोगकर्ता को विशेष एक्सेप्शन के आधार पर फीडबैक प्राप्त होता है, जिससे प्रोग्राम अधिक उपयोगकर्ता-अनुकूल और मजबूत बनता है।
