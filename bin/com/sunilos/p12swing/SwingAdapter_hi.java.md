
```java
package com.sunilos.p12swing;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * SwingAdapter एक माउस श्रोता के उपयोग का प्रदर्शन करता है जो एक एडेप्टर का उपयोग करता है।
 * 
 * @संस्करण 1.0
 * @तारीख 16 नवम्बर 2014
 * @लेखक सुनिल साहू
 * @कॉपीराइट (c) सुनिल साहू
 * @वेबसाइट www.sunilbooks.com
 */
public class SwingAdapter {

    public static void main(String[] args) {

        // बटन क्लिक डेमो के लिए एक JFrame बनाएं
        JFrame frame = new JFrame("डेमो बटन क्लिक");
        JPanel pane = (JPanel) frame.getContentPane();
        JButton b = new JButton("माउस परीक्षण");

        // बटन के लिए श्रोता बनाएं और उसे बटन में जोड़ें
        MouseHandler listener = new MouseHandler();
        b.addMouseListener(listener);

        // बटन को पैनल में जोड़ें
        pane.add(b);

        // डिफ़ॉल्ट क्लोज़ ऑपरेशन और फ्रेम का आकार सेट करें
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 100);
        frame.setVisible(true); // फ्रेम को दृश्यमान बनाएं

    }
}

/**
 * MouseHandler कक्षा जो MouseAdapter का उपयोग करके माउस इवेंट्स को संभालती है।
 */
class MouseHandler extends MouseAdapter {
    @Override
    public void mouseEntered(MouseEvent event) {
        System.out.println("माउस आया");
    }

    @Override
    public void mouseExited(MouseEvent event) {
        System.out.println("माउस निकला");
    }
}
```

### व्याख्या:
1. **SwingAdapter कक्षा**:
   - यह एक बटन के लिए माउस इवेंट्स को संभालने के लिए एक एडेप्टर कक्षा के साथ माउस श्रोता के उपयोग का प्रदर्शन करता है।

2. **JFrame निर्माण**:
   - "डेमो बटन क्लिक" शीर्षक वाला एक `JFrame` बनाया गया है, साथ में एक `JPanel` और "माउस परीक्षण" लेबल वाला एक `JButton` भी है।

3. **MouseHandler कक्षा**:
   - यह आंतरिक कक्षा `MouseAdapter` का विस्तार करती है और `mouseEntered` और `mouseExited` विधियों को ओवरराइड करती है, जो बटन पर माउस के आने या जाने पर कस्टम व्यवहार प्रदान करती है।

4. **माउस श्रोता जोड़ना**:
   - `MouseHandler` का एक उदाहरण बनाया गया है और इसे बटन में जोड़ा गया है ताकि माउस इवेंट्स को सुन सके।

5. **फ्रेम कॉन्फ़िगरेशन**:
   - फ्रेम का डिफ़ॉल्ट क्लोज़ ऑपरेशन, आकार, और दृश्यता सेट की गई है।

### कार्यक्षमता:
- जब माउस पॉइंटर बटन क्षेत्र में आता है या बाहर जाता है, तो संबंधित संदेश ("माउस आया" या "माउस निकला") कंसोल पर प्रिंट होते हैं, जो यह प्रदर्शित करता है कि एक Swing अनुप्रयोग में माउस इवेंट्स को एडेप्टर का उपयोग करके कैसे संभालें।
