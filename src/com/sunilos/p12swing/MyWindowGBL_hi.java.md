
```java
package com.sunilos.p12swing;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * MyWindowGBL Swing अनुप्रयोग में GridBagLayout के उपयोग का प्रदर्शन करता है।
 * 
 * @संस्करण 1.0
 * @तारीख 16 नवम्बर 2014
 * @लेखक सुनिल साहू
 * @कॉपीराइट (c) सुनिल साहू
 * @वेबसाइट www.sunilbooks.com
 */
public class MyWindowGBL {

    public static void main(String[] args) {

        // GridBagLayout डेमो के लिए एक JFrame बनाएं
        JFrame frame = new JFrame("GridBagLayout Demo");

        // सामग्री पैन प्राप्त करें और लेआउट को GridBagLayout पर सेट करें
        JPanel pane = (JPanel) frame.getContentPane();
        pane.setLayout(new GridBagLayout());

        // GridBagConstraints का एक उदाहरण बनाएं
        GridBagConstraints c = new GridBagConstraints();

        // Button1 के लिए सीमाएँ कॉन्फ़िगर करें
        c.fill = GridBagConstraints.HORIZONTAL; // क्षैतिज रूप से स्थान भरें
        c.gridx = 0; // कॉलम 0
        c.gridy = 0; // पंक्ति 0
        JButton b1 = new JButton("Button1");
        pane.add(b1, c); // Button1 को पैनल में जोड़ें

        // Button2 के लिए सीमाएँ कॉन्फ़िगर करें
        c.gridx = 1; // कॉलम 1
        JButton b2 = new JButton("Button2");
        pane.add(b2, c); // Button2 को पैनल में जोड़ें

        // Button3 के लिए सीमाएँ कॉन्फ़िगर करें
        c.gridx = 2; // कॉलम 2
        JButton b3 = new JButton("Button3");
        pane.add(b3, c); // Button3 को पैनल में जोड़ें

        // Button4 के लिए सीमाएँ (3 कॉलम में फैला हुआ)
        c.gridwidth = 3; // 3 कॉलम में फैला
        c.gridx = 0; // कॉलम 0
        c.gridy = 1; // पंक्ति 1
        JButton b4 = new JButton("Button4");
        pane.add(b4, c); // Button4 को पैनल में जोड़ें

        // Button5 के लिए सीमाएँ (पंक्ति 3, कॉलम 2 में स्थित)
        c.gridwidth = 1; // 1 कॉलम में वापस सेट करें
        c.gridheight = 1; // 1 पंक्ति में वापस सेट करें
        c.gridx = 2; // कॉलम 2
        c.gridy = 3; // पंक्ति 3
        JButton b5 = new JButton("Button5");
        pane.add(b5, c); // Button5 को पैनल में जोड़ें

        // डिफ़ॉल्ट क्लोज ऑपरेशन और फ्रेम का आकार सेट करें
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setVisible(true); // फ्रेम को दृश्यमान बनाएं
    }
}
```

### व्याख्या:
1. **MyWindowGBL क्लास**:
   - `GridBagLayout` के उपयोग का प्रदर्शन करता है, जो घटकों को ग्रिड में लचीले ढंग से स्थिति देने की अनुमति देता है।

2. **JFrame निर्माण**:
   - "GridBagLayout Demo" शीर्षक वाला एक `JFrame` बनाया गया है।

3. **JPanel और लेआउट**:
   - फ्रेम के सामग्री पैन को `GridBagLayout` का उपयोग करने के लिए सेट किया गया है, जो जटिल घटक व्यवस्थाओं की अनुमति देता है।

4. **GridBagConstraints**:
   - घटकों के लिए सीमाएँ निर्दिष्ट करने के लिए `GridBagConstraints` का उपयोग किया गया है:
     - `fill` यह निर्दिष्ट करता है कि घटक को कैसे आकार दिया जाना चाहिए।
     - `gridx` और `gridy` यह निर्दिष्ट करते हैं कि घटक ग्रिड में किस स्थान पर है।
     - `gridwidth` और `gridheight` यह बताते हैं कि घटक कितने कॉलम और पंक्तियों में फैला है।

5. **Button जोड़ना**:
   - विभिन्न बटन (`Button1`, `Button2`, `Button3`, `Button4`, और `Button5`) को पैनल में विशेष सीमाओं के साथ जोड़ा गया है।

6. **फ्रेम कॉन्फ़िगरेशन**:
   - फ्रेम के लिए डिफ़ॉल्ट क्लोज ऑपरेशन, आकार, और दृश्यता सेट की गई है।

यह लेआउट घटकों को आसानी से व्यवस्थित और आकार देने की अनुमति देता है, जिससे यह जटिल इंटरफेस के लिए आदर्श है।
