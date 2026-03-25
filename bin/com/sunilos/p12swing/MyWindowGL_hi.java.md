
```java
package com.sunilos.p12swing;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * MyWindowGL Swing अनुप्रयोग में GridLayout के उपयोग का प्रदर्शन करता है।
 * 
 * @संस्करण 1.0
 * @तारीख 16 नवम्बर 2014
 * @लेखक सुनिल साहू
 * @कॉपीराइट (c) सुनिल साहू
 * @वेबसाइट www.sunilbooks.com
 */
public class MyWindowGL {

    public static void main(String[] args) {

        // GridLayout डेमो के लिए एक JFrame बनाएं
        JFrame frame = new JFrame("GridLayout Demo");

        // सामग्री पैन प्राप्त करें और लेआउट को GridLayout पर सेट करें
        JPanel pane = (JPanel) frame.getContentPane();
        pane.setLayout(new GridLayout(3, 2)); // 3 पंक्तियाँ और 2 कॉलम

        // बटन बनाएं और उन्हें पैनल में जोड़ें
        JButton b1 = new JButton("Button1");
        pane.add(b1);

        JButton b2 = new JButton("Button2");
        pane.add(b2);

        JButton b3 = new JButton("Button3");
        pane.add(b3);

        JButton b4 = new JButton("Button4");
        pane.add(b4);

        JButton b5 = new JButton("Button5");
        pane.add(b5);

        // डिफ़ॉल्ट क्लोज ऑपरेशन और फ्रेम का आकार सेट करें
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setVisible(true); // फ्रेम को दृश्यमान बनाएं
    }
}
```

### व्याख्या:
1. **MyWindowGL क्लास**:
   - `GridLayout` के उपयोग का प्रदर्शन करता है, जो घटकों को निर्दिष्ट पंक्तियों और कॉलमों के ग्रिड में व्यवस्थित करता है।

2. **JFrame निर्माण**:
   - "GridLayout Demo" शीर्षक वाला एक `JFrame` बनाया गया है।

3. **JPanel और लेआउट**:
   - फ्रेम के सामग्री पैन को `GridLayout` का उपयोग करने के लिए सेट किया गया है, जिसमें 3 पंक्तियाँ और 2 कॉलम कॉन्फ़िगर किए गए हैं।

4. **बटन जोड़ना**:
   - पाँच बटन (`Button1`, `Button2`, `Button3`, `Button4`, और `Button5`) बनाए गए हैं और पैनल में जोड़े गए हैं। ये निर्दिष्ट ग्रिड लेआउट में व्यवस्थित होंगे।

5. **फ्रेम कॉन्फ़िगरेशन**:
   - फ्रेम के लिए डिफ़ॉल्ट क्लोज ऑपरेशन, आकार, और दृश्यता सेट की गई है।

`GridLayout` स्वचालित रूप से बटनों को ग्रिड सेल में उपलब्ध स्थान को भरने के लिए आकार देता है, जिससे एक साफ और व्यवस्थित लेआउट प्रदान होता है।
