
```java
package com.sunilos.p11thread;

/**
 * WaitNotifyTest `wait()` और `notify()` मेथड्स के उपयोग को प्रदर्शित करता है।
 * 
 * यह परीक्षण एक ऐसा परिदृश्य सिमुलेट करता है जहाँ दो WaiterThread उदाहरण एक संदेश
 * वस्तु का इंतजार करते हैं, और एक NotifierThread उन्हें `notify()` कॉल करके जगाता है। 
 * WaiterThread `wait()` का उपयोग करके संदेश वस्तु पर लॉक को रिलीज़ करता है, और 
 * NotifierThread `notify()` या `notifyAll()` को कॉल करके प्रतीक्षा कर रहे थ्रेड्स को 
 * संकेत करता है।
 * 
 * @संस्करण 1.0
 * @तारीख 16 नवम्बर 2014
 * @लेखक सुनिल साहू
 * @कॉपीराइट (c) सुनिल साहू
 * @वेबसाइट www.sunilbooks.com
 */
public class WaitNotifyTest {

    /**
     * मुख्य मेथड संदेश वस्तु को प्रारंभ करता है और दो WaiterThread उदाहरणों 
     * और एक NotifierThread को शुरू करता है।
     * 
     * @param args कमांड-लाइन तर्क (इस उदाहरण में उपयोग नहीं किया गया)।
     */
    public static void main(String[] args) {

        // एक साझा संदेश वस्तु बनाएं जिसका उपयोग WaiterThread और NotifierThread करेंगे
        Message msg = new Message("Process It");
        
        // दो WaiterThread उदाहरण बनाएं और प्रारंभ करें जो संदेश वस्तु पर सूचना का इंतजार करेंगे
        WaiterThread w1 = new WaiterThread("Ram", msg); // पहला WaiterThread
        WaiterThread w2 = new WaiterThread("Shyam", msg); // दूसरा WaiterThread
        w1.start();
        w2.start();

        // एक NotifierThread बनाएं और प्रारंभ करें जो प्रतीक्षा कर रहे थ्रेड में से एक को सूचित करेगा
        NotifierThread notifier = new NotifierThread(msg);
        notifier.start();
        
        // सभी थ्रेड्स के शुरू होने का संदेश प्रिंट करें
        System.out.println("सभी थ्रेड्स शुरू हो गए हैं");
    }

}
```

### व्याख्या:
1. **`WaiterThread` और `NotifierThread`**:
   - `WaiterThread` उदाहरण (`w1` और `w2`) `Message` वस्तु पर `wait()` का उपयोग करके प्रतीक्षा करते हैं, जिससे वे उस वस्तु पर से अपना लॉक रिलीज़ करते हैं।
   - `NotifierThread` प्रतीक्षा कर रहे थ्रेड्स में से एक को सूचित करता है (या सभी को, यह निर्भर करता है कि `notify()` या `notifyAll()` का उपयोग किया गया है) साझा `Message` वस्तु का उपयोग करके।

2. **`Message`**:
   - `Message` क्लास एक साझा संसाधन है जिसका उपयोग थ्रेड्स `wait()` और `notify()` कॉल के बीच संचार को समन्वयित करने के लिए करते हैं।

3. **कार्यान्वयन**:
   - मुख्य थ्रेड पहले `WaiterThread` उदाहरणों (`Ram` और `Shyam`) को बनाता और प्रारंभ करता है, जिससे वे प्रतीक्षा स्थिति में चले जाते हैं।
   - उसके बाद `NotifierThread` उन्हें पुनः क्रियान्वित करने के लिए सूचित करता है।

4. **आउटपुट**:
   - प्रोग्राम "सभी थ्रेड्स शुरू हो गए हैं" प्रिंट करता है, जबकि `WaiterThread` उदाहरण सूचनाओं की प्रतीक्षा करते हैं। जब सूचनादाता `wait()` थ्रेड्स को सक्रिय करता है, तो वे आगे की प्रक्रिया जारी रखते हैं।
