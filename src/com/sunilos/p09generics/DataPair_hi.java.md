```java
package com.sunilos.p09generics;

/**
 * Generic class जो दो प्रकार के पैरामीटर K और V को निर्दिष्ट करता है, जो एक कॉमा द्वारा अलग होते हैं।
 * क्योंकि इसमें दो प्रकार के पैरामीटर हैं, इसलिए जब एक ऑब्जेक्ट बनाया जाता है
 * DataPair के लिए दो प्रकार के तर्क पारित किए जाने चाहिए।
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class DataPair<K, V> {

    K key; // कुंजी को रखने के लिए K के प्रकार का एक ऑब्जेक्ट घोषित करें।
    V value; // मान को रखने के लिए V के प्रकार का एक ऑब्जेक्ट घोषित करें।

    /**
     * कुंजी और मान को प्रारंभिक करने के लिए कंस्ट्रक्टर।
     * 
     * @param key : K के प्रकार का कुंजी ऑब्जेक्ट
     * @param val : V के प्रकार का मान ऑब्जेक्ट
     */
    public DataPair(K key, V val) {
        this.key = key; // पारित पैरामीटर के साथ कुंजी को प्रारंभ करें।
        value = val; // पारित पैरामीटर के साथ मान को प्रारंभ करें।
    }

    /**
     * @return जोड़ी की कुंजी
     */
    K getKey() {
        return key; // संग्रहीत कुंजी लौटाएँ।
    }

    /**
     * @return जोड़ी का मान
     */
    V getValue() {
        return value; // संग्रहीत मान लौटाएँ।
    }

    /**
     * कुंजी और मान वस्तुओं के डेटा प्रकार को दिखाएँ।
     */
    void showType() {
        // परावर्तन का उपयोग करके कुंजी का वर्ग नाम प्रिंट करें।
        System.out.println("K का प्रकार है " + key.getClass().getName());
        // परावर्तन का उपयोग करके मान का वर्ग नाम प्रिंट करें।
        System.out.println("V का प्रकार है " + value.getClass().getName());
    }

    public static void main(String[] args) {

        // खाता जानकारी रखें
        System.out.println("\nखाता जानकारी");

        // खाता संख्या (String) और बैलेंस (Double) रखने के लिए एक DataPair घोषित करें
        DataPair<String, Double> account = null;
        // खाता संख्या और बैलेंस के साथ DataPair का निर्माण करें।
        account = new DataPair<String, Double>("SBI-100", 20.5);

        account.showType(); // खाता ऑब्जेक्ट में उपयोग किए गए डेटा के प्रकार को दिखाएं।
        String accNum = account.getKey(); // बिना कैस्टिंग के खाता संख्या प्राप्त करें।
        double accBal = account.getValue(); // खाता बैलेंस प्राप्त करें।
        System.out.println(accNum + " : " + accBal); // खाता जानकारी प्रिंट करें।

        // मार्कशीट जानकारी रखें
        System.out.println("\nमार्कशीट जानकारी");

        // रोल नंबर (String) और अंक (Integer) रखने के लिए एक DataPair घोषित करें
        DataPair<String, Integer> marksheet = null;
        // रोल नंबर और अंक के साथ DataPair का निर्माण करें।
        marksheet = new DataPair<String, Integer>("RN_786", 98);

        marksheet.showType(); // मार्कशीट ऑब्जेक्ट में उपयोग किए गए डेटा के प्रकार को दिखाएं।
        String rollNo = marksheet.getKey(); // बिना कैस्टिंग के रोल नंबर प्राप्त करें।
        int marks = marksheet.getValue(); // बिना कैस्टिंग के अंक प्राप्त करें।
        System.out.println(rollNo + " : " + marks); // मार्कशीट जानकारी प्रिंट करें।
    }
}
```

### व्याख्या:

1. **Imports:** कोई अतिरिक्त आयात आवश्यक नहीं हैं क्योंकि कक्षा बुनियादी Java कार्यक्षमता पर निर्भर करती है।

2. **Class Declaration:** `DataPair` कक्षा एक generic कक्षा है जिसमें दो प्रकार के पैरामीटर `K` और `V` हैं, जो इसे किसी भी प्रकार के कुंजी-मूल्य युग्म को संग्रहीत करने की अनुमति देता है।

3. **Field Declaration:**
   - **Key Field:** `K key;` जोड़ी की कुंजी को संग्रहीत करता है।
   - **Value Field:** `V value;` जोड़ी का मान संग्रहीत करता है।

4. **Constructor:**
   - **Parameter Initialization:** कंस्ट्रक्टर दो पैरामीटर (कुंजी और मान) को लेता है और संबंधित क्षेत्रों को प्रारंभ करता है।

5. **Methods:**
   - **`getKey()`:** संग्रहीत कुंजी को `K` के प्रकार के रूप में लौटाता है।
   - **`getValue()`:** संग्रहीत मान को `V` के प्रकार के रूप में लौटाता है।
   - **`showType()`:** परावर्तन का उपयोग करके कुंजी और मान दोनों के वर्ग नाम प्रिंट करता है, जो जोड़ी में संग्रहीत प्रकारों की जानकारी देता है।

6. **Main Method:**
   - **Account Information Example:**
     - `DataPair<String, Double>` का एक उदाहरण एक खाता संख्या और बैलेंस को संग्रहीत करने के लिए बनाया गया है।
     - प्रकार प्रदर्शित किया जाता है, और कुंजी और मान को प्राप्त करके प्रिंट किया जाता है।
   - **Marksheet Information Example:**
     - `DataPair<String, Integer>` का एक उदाहरण एक रोल नंबर और अंक को संग्रहीत करने के लिए बनाया गया है।
     - खाता उदाहरण के समान, प्रकार प्रदर्शित किया जाता है, और कुंजी और मान को प्राप्त करके प्रिंट किया जाता है।

### मुख्य बिंदु:
- **Generics:** दो प्रकार के पैरामीटर (`K` और `V`) का उपयोग कक्षा को लचीला और डेटा के युग्म को संग्रहीत करते समय प्रकार की सुरक्षा प्रदान करता है।
- **Type Safety:** उदाहरण बनाते समय प्रकार निर्दिष्ट करने से टाइप कैस्टिंग की आवश्यकता समाप्त होती है, जिससे संभावित रनटाइम त्रुटियों में कमी आती है।
- **Reflection:** `showType()` विधि दिखाती है कि Java रनटाइम पर ऑब्जेक्ट के प्रकारों की जानकारी कैसे प्रदान कर सकता है।

यह कक्षा Java में generics की शक्ति और उपयोगिता को प्रभावी ढंग से दर्शाती है, विशेष रूप से कुंजी-मूल्य युग्म बनाने के लिए।