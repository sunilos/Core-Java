
```java
package com.sunilos.p12swing;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * MyWindowBL BorderLayout का उपयोग करने का प्रदर्शन करता है 
 * एक JFrame में। यह प्रोग्राम विभिन्न क्षेत्रों (उत्तर, दक्षिण, पूर्व, पश्चिम 
 * और केंद्र) में बटनों के साथ एक विंडो बनाता है।
 * 
 * @संस्करण 1.0
 * @तारीख 16 नवम्बर 2014
 * @लेखक सुनिल साहू
 * @कॉपीराइट (c) सुनिल साहू
 * @वेबसाइट www.sunilbooks.com
 */
public class MyWindowBL {

    /**
     * मुख्य मेथड GUI घटकों को प्रारंभ करता है और विंडो को दृश्यमान बनाता है।
     * 
     * @param args कमांड-लाइन तर्क (इस उदाहरण में उपयोग नहीं किया गया)।
     */
    public static void main(String[] args) {

        // एक JFrame (विंडो) बनाएं और इसका शीर्षक सेट करें
        JFrame frame = new JFrame("BorderLayout Demo");

        // लेआउट मैनेजर को BorderLayout पर सेट करें
        BorderLayout layout = new BorderLayout();
        frame.setLayout(layout);

        // JFrame का डिफ़ॉल्ट कंटेंट पेन प्राप्त करें
        JPanel pan = (JPanel) frame.getContentPane();

        // BorderLayout के विभिन्न क्षेत्रों के लिए बटन बनाएं
        JButton b1 = new JButton("North");
        pan.add(b1, BorderLayout.NORTH); // बटन को उत्तर क्षेत्र में जोड़ें

        JButton b2 = new JButton("South");
        pan.add(b2, BorderLayout.SOUTH); // बटन को दक्षिण क्षेत्र में जोड़ें

        JButton b3 = new JButton("Right");
        pan.add(b3, BorderLayout.EAST); // बटन को पूर्व क्षेत्र में जोड़ें

        JButton b4 = new JButton("West");
        pan.add(b4, BorderLayout.WEST); // बटन को पश्चिम क्षेत्र में जोड़ें

        JButton b5 = new JButton("Center");
        pan.add(b5); // बटन को केंद्र क्षेत्र में जोड़ें (डिफ़ॉल्ट)

        // जब विंडो बंद की जाए तो एप्लिकेशन को बाहर निकलने के लिए डिफ़ॉल्ट क्लोज ऑपरेशन सेट करें
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // विंडो के भीतर घटकों को पैक करें
        frame.pack();

        // विंडो को उपयोगकर्ता के लिए दृश्यमान बनाएं
        frame.setVisible(true);
    }
}
```

### व्याख्या:
1. **JFrame**:
   - "BorderLayout Demo" शीर्षक के साथ एक `JFrame` बनाया गया है।

2. **BorderLayout**:
   - लेआउट मैनेजर को `BorderLayout` पर सेट किया गया है, जो घटकों को पांच क्षेत्रों में जोड़ने की अनुमति देता है: उत्तर, दक्षिण, पूर्व, पश्चिम और केंद्र।

3. **JPanel**:
   - बटनों को रखने के लिए डिफ़ॉल्ट कंटेंट पेन को `JPanel` के रूप में प्राप्त किया गया है।

4. **JButtons**:
   - पांच बटन बनाए गए हैं और उन्हें `BorderLayout` के विभिन्न क्षेत्रों में जोड़ा गया है:
     - `b1` उत्तर क्षेत्र में जोड़ा गया है।
     - `b2` दक्षिण क्षेत्र में जोड़ा गया है।
     - `b3` पूर्व क्षेत्र में जोड़ा गया है।
     - `b4` पश्चिम क्षेत्र में जोड़ा गया है।
     - `b5` केंद्र क्षेत्र में (डिफ़ॉल्ट रूप से) जोड़ा गया है।

5. **Close Operation**:
   - जब विंडो बंद की जाएगी, तो एप्लिकेशन बाहर निकल जाएगा, जैसा कि `setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)` द्वारा निर्दिष्ट किया गया है।

6. **Packing और Visibility**:
   - `frame.pack()` विंडो के आकार को उसके घटकों के वरीय आकार के अनुसार समायोजित करता है।
   - अंत में, `setVisible(true)` विंडो को उपयोगकर्ता के लिए दृश्यमान बनाता है।
