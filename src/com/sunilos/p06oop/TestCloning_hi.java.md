
```java
package com.sunilos.p06oop;

/**
 * TestCloning क्लास जावा में डीप क्लोनिंग को दर्शाता है।
 * यह एक customer ऑब्जेक्ट बनाता है, उसे क्लोन करता है, और यह दिखाने के लिए क्लोन को बदलता है कि
 * क्लोन में बदलाव का मूल ऑब्जेक्ट पर कोई असर नहीं होता।
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestCloning {

    public static void main(String[] args) throws Exception {

        // एक मूल Customer ऑब्जेक्ट बनाएं, जिसमें नाम "Ram" है और पता "Mumbai" है।
        Customer c1 = new Customer("Ram");
        c1.address.city = "Mumbai";  // पते का शहर सेट करें।

        // मूल कस्टमर को क्लोन करके एक नया Customer ऑब्जेक्ट बनाएं।
        Customer c2 = (Customer) c1.clone();
        
        // क्लोन किए गए कस्टमर के नाम, अकाउंट बैलेंस और शहर को बदलें।
        c2.name = "Balram";            // क्लोन किए गए कस्टमर का नाम बदलें।
        c2.account.balance = 20;       // क्लोन किए गए कस्टमर का अकाउंट बैलेंस बदलें।
        c2.address.city = "Delhi";     // क्लोन किए गए कस्टमर के पते का शहर बदलें।

        // मूल कस्टमर के विवरण प्रिंट करें।
        System.out.println("Original Object ");
        System.out.println("Name : " + c1.name);
        System.out.println("Balance of Account : " + c1.account.balance);
        System.out.println("City : " + c1.address.city);

        // आउटपुट में स्पष्टता के लिए विभाजक।
        System.out.println("\n--------------------------");
        
        // क्लोन किए गए कस्टमर के विवरण प्रिंट करें।
        System.out.println("Cloned Object");
        System.out.println("Name : " + c2.name);
        System.out.println("Balance of Account : " + c2.account.balance);
        System.out.println("City : " + c2.address.city);
    }

    /**
     * OUTPUT 
     * 
     * Original Object Name : Ram 
     * Balance of Account : 10.0 
     * City : Delhi
     * 
     * -------------------------- 
     * Cloned Object 
     * Name : Balram 
     * Balance of Account: 20.0 
     * City : Delhi
     */
}
```

### व्याख्या:

- **उद्देश्य:** `TestCloning` क्लास यह दिखाने के लिए बनाई गई है कि जावा में डीप क्लोनिंग का उपयोग करके एक क्लोन ऑब्जेक्ट में बदलाव किए जा सकते हैं बिना मूल ऑब्जेक्ट को प्रभावित किए।

- **मूल ऑब्जेक्ट बनाना:** एक `Customer` ऑब्जेक्ट `c1` बनाया गया है, जिसमें नाम "Ram" और शहर "Mumbai" सेट किया गया है।

- **क्लोनिंग:** `clone()` मेथड को `c1` पर कॉल किया गया है ताकि एक नया `Customer` ऑब्जेक्ट `c2` बनाया जा सके। यह क्लोनिंग `Customer` क्लास में सही ढंग से लागू की जानी चाहिए ताकि डीप क्लोनिंग सुनिश्चित हो सके।

- **क्लोन किए गए ऑब्जेक्ट में बदलाव करना:** `c2` ऑब्जेक्ट में बदलाव किए गए हैं, जैसे नाम "Balram" में बदलना, अकाउंट बैलेंस को अपडेट करना, और शहर को "Delhi" में बदलना। डीप क्लोनिंग के कारण ये बदलाव मूल ऑब्जेक्ट `c1` को प्रभावित नहीं करते।

- **आउटपुट:** प्रोग्राम दोनों, मूल और क्लोन किए गए ऑब्जेक्ट के विवरण को प्रिंट करता है, जिससे यह स्पष्ट होता है कि वे स्वतंत्र हैं। मूल ऑब्जेक्ट अपने मूल्यों को बनाए रखता है, जबकि क्लोन किए गए ऑब्जेक्ट में अपडेट किए गए मूल्य दिखते हैं।
