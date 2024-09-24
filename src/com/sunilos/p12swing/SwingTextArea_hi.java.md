
```java
package com.sunilos.p12swing;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * Swing में टेक्स्ट एरिया
 * 
 * @संस्करण 1.0
 * @तारीख 16 नवम्बर 2014
 * @लेखक सुनिल साहू
 * @कॉपीराइट (c) सुनिल साहू
 * @वेबसाइट www.sunilbooks.com
 */
public class SwingTextArea {

    public static void main(String[] args) {

        JFrame frame = new JFrame(); // एप्लिकेशन के लिए एक JFrame बनाएँ

        JPanel pane = (JPanel) frame.getContentPane(); // फ्रेम का सामग्री पैनल प्राप्त करें

        JLabel label = new JLabel("Email : "); // टेक्स्ट एरिया के लिए एक लेबल बनाएँ
        pane.add(label, BorderLayout.NORTH); // लेबल को पैनल के उत्तरी भाग में जोड़ें

        JTextArea text = new JTextArea(5, 80); // 5 पंक्तियों और 80 कॉलम के साथ JTextArea बनाएँ
        pane.add(text); // टेक्स्ट एरिया को पैनल में जोड़ें

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // विंडो बंद होने पर एप्लिकेशन को समाप्त करें

        frame.setSize(200, 100); // फ्रेम का आकार सेट करें

        frame.setVisible(true); // फ्रेम को दृश्य बनाएं

    }
}
```

### व्याख्या:
- **JFrame**: एप्लिकेशन की मुख्य विंडो को `JFrame` का उपयोग करके बनाया जाता है।
- **JPanel**: पैनल को फ्रेम से प्राप्त किया जाता है ताकि घटकों को रखा जा सके।
- **JLabel**: एक लेबल बनाया जाता है जो संकेत देता है कि टेक्स्ट एरिया ईमेल दर्ज करने के लिए है।
- **JTextArea**: एक बहु-पंक्ति टेक्स्ट एरिया बनाया जाता है जो उपयोगकर्ताओं को पाठ इनपुट करने की अनुमति देता है, जिसे विशेष संख्या में पंक्तियों और कॉलम के साथ कॉन्फ़िगर किया गया है।
- **विंडो गुण**: बंद करने की क्रिया को एप्लिकेशन को समाप्त करने के लिए सेट किया जाता है, फ्रेम का आकार परिभाषित किया जाता है, और फ्रेम को दृश्य बनाया जाता है।
