```java
package com.sunilos.p09generics;

/**
 * कई प्रकार के पैरामीटर प्राप्त करने वाला generic मेथड उदाहरण।
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class GenericMethodMultipleTypeParam {

    /**
     * एक generic मेथड जो यह निर्धारित करता है कि क्या एक ऑब्जेक्ट एक ऐरे में है।
     * V की ऊपरी सीमा T है, जिसका अर्थ है कि V को T के प्रकार का होना चाहिए या T का उपप्रकार होना चाहिए।
     * 
     * @param x वह तत्व जिसे खोजा जाना है
     * @param y वह ऐरे जिसमें खोजा जाना है
     * @return यदि x y में पाया गया तो true, अन्यथा false
     */
    static <T, V extends T> boolean contains(T x, V[] y) {
        // ऐरे y के माध्यम से दोहराएँ
        for (int i = 0; i < y.length; i++) {
            // जाँचें कि क्या वर्तमान तत्व x के बराबर है
            if (x.equals(y[i])) 
                return true; // यदि पाया गया तो true लौटाएँ
        }
        return false; // यदि नहीं पाया गया तो false लौटाएँ
    }

    public static void main(String[] args) {

        // Integer का एक ऐरे बनाएं
        Integer nums[] = { 1, 2, 3, 4, 5 };
        
        // जाँचें कि क्या 2 nums में है
        if (contains(2, nums)) 
            System.out.println("2 nums में है");
        
        // जाँचें कि क्या 7 nums में नहीं है
        if (!contains(7, nums)) 
            System.out.println("7 nums में नहीं है");
        
        System.out.println();

        // Strings पर contains() का उपयोग करें
        String strs[] = { "one", "two", "three", "four", "five" };

        // जाँचें कि क्या "two" strs में है
        if (contains("two", strs)) 
            System.out.println("two strs में है");

        // जाँचें कि क्या "seven" strs में नहीं है
        if (!contains("seven", strs)) 
            System.out.println("seven strs में नहीं है");

        // संकलन त्रुटि उदाहरण: प्रकार संगत होने चाहिए
        // if (contains("two", nums))
        //     System.out.println("two nums में है"); // यह संकलन समय की त्रुटि का कारण बनेगा
    }
}
```

### व्याख्या:

1. **Imports:** कोई अतिरिक्त आयात आवश्यक नहीं हैं क्योंकि कक्षा बुनियादी Java सुविधाओं का उपयोग करती है।

2. **Class Declaration:** कक्षा `GenericMethodMultipleTypeParam` कई प्रकार के पैरामीटर के साथ generic मेथड के उपयोग को प्रदर्शित करती है।

3. **Generic Method `contains`:**
   - **Type Parameters:** यह मेथड दो प्रकार के पैरामीटर के साथ परिभाषित किया गया है:
     - `T`: उस ऑब्जेक्ट का प्रकार जिसे खोजा जाना है।
     - `V`: `T` का एक उपप्रकार, यह सुनिश्चित करता है कि मेथड किसी भी प्रकार के ऐरे को स्वीकार कर सकता है जो `T` को विस्तारित करता है।
   - **Parameters:**
     - `T x`: ऐरे में खोजने के लिए तत्व।
     - `V[] y`: वह ऐरे जिसमें तत्व के लिए खोज की जाएगी।
   - **Return Value:** मेथड एक बूलियन लौटाता है जो बताता है कि क्या तत्व `x` ऐरे `y` में पाया गया है।
   - **Logic:** यह ऐरे `y` के माध्यम से दोहराता है और जांचता है कि क्या कोई तत्व `x` के बराबर है। यदि पाया जाता है, तो यह `true` लौटाता है; अन्यथा, यह `false` लौटाता है।

4. **Main Method:**
   - **Integer Array:** पूर्णांकों (`nums`) का एक ऐरे बनाया गया है, और `contains` मेथड का उपयोग करके पूर्णांकों `2` और `7` की उपस्थिति की जांच की जाती है।
   - **String Array:** स्ट्रिंग्स (`strs`) का एक ऐरे बनाया गया है, और `contains` मेथड का उपयोग करके स्ट्रिंग्स `"two"` और `"seven"` की उपस्थिति की जांच की जाती है।
   - **Commented Error Example:** असंगत प्रकार का एक उदाहरण टिप्पणी की गई है, जो दिखाता है कि यदि कोई स्ट्रिंग पूर्णांक ऐरे में जांचने की कोशिश करता है, तो इससे संकलन त्रुटि होगी। 

### मुख्य बिंदु:
- **Generics:** मेथड जनरालिज्म का उपयोग करता है ताकि प्रकार की सुरक्षा प्रदान की जा सके, जिससे यह किसी भी डेटा प्रकार के साथ काम कर सके जबकि प्रकार के असंगति के मुद्दों को रोक सके।
- **Upper Bound:** `V extends T` का उपयोग यह सुनिश्चित करता है कि केवल संगत प्रकार मेथड को पास किए जा सकें, जो प्रकार की सुरक्षा को बढ़ाता है।
- **Flexibility:** `contains` मेथड विभिन्न डेटा प्रकारों के लिए पुनः उपयोग किया जा सकता है, जिससे कोड अधिक बहुपरक बनता है और पुनरावृत्ति कम होती है।
