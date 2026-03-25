
```java
package com.sunilos.p12swing;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * SwingList Swing का उपयोग करके एक सूची बनाने का प्रदर्शन करता है।
 * 
 * @संस्करण 1.0
 * @तारीख 16 नवम्बर 2014
 * @लेखक सुनिल साहू
 * @कॉपीराइट (c) सुनिल साहू
 * @वेबसाइट www.sunilbooks.com
 */
public class SwingList {

    public static void main(String[] args) {

        // एक JFrame बनाएं
        JFrame frame = new JFrame("Swing List");
        JPanel panel = (JPanel) frame.getContentPane();
        BorderLayout layout = new BorderLayout();
        panel.setLayout(layout);

        // पैनल के शीर्ष पर एक JLabel बनाएं और जोड़ें
        JLabel label = new JLabel("Skill:");
        panel.add(label, BorderLayout.NORTH);

        // कौशलों का एक स्ट्रिंग ऐरे बनाएं
        String[] skills = { "JAVA", ".NET", "PHP", "VB" };
        // कौशलों के ऐरे का उपयोग करके JList बनाएं
        JList<String> skillList = new JList<>(skills);

        // सूची को स्क्रॉल करने योग्य बनाने के लिए JScrollPane जोड़ें
        JScrollPane scrollPane = new JScrollPane(skillList);
        panel.add(scrollPane, BorderLayout.CENTER); // JScrollPane को पैनल के केंद्र में जोड़ें

        // डिफ़ॉल्ट क्लोज़ ऑपरेशन सेट करें
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // फ्रेम को दिखाएँ और घटकों के अनुसार आकार समायोजित करें
        frame.setVisible(true);
        frame.pack();
    }
}
```

### व्याख्या:
1. **SwingList कक्षा**:
   - यह कक्षा एक Swing अनुप्रयोग में सूची बनाने का प्रदर्शन करती है।

2. **JFrame निर्माण**:
   - "Swing List" शीर्षक वाला एक `JFrame` बनाया गया है।

3. **पैनल और लेआउट**:
   - एक `JPanel` बनाया गया है और इसे `BorderLayout` का उपयोग करने के लिए सेट किया गया है।

4. **JLabel निर्माण**:
   - "Skill:" पाठ के साथ एक `JLabel` बनाया गया है और इसे पैनल के उत्तरी क्षेत्र में जोड़ा गया है।

5. **JList निर्माण**:
   - कौशलों ("JAVA", ".NET", "PHP", "VB") का एक स्ट्रिंग ऐरे बनाया गया है।
   - इस ऐरे का उपयोग करके एक `JList` बनाया गया है।

6. **JScrollPane**:
   - `JList` को `JScrollPane` में लपेटा गया है ताकि अगर दृश्य क्षेत्र में बहुत सारे आइटम हों, तो स्क्रॉल किया जा सके।

7. **फ्रेम कॉन्फ़िगरेशन**:
   - डिफ़ॉल्ट क्लोज़ ऑपरेशन सेट किया गया है ताकि विंडो बंद होने पर अनुप्रयोग बाहर निकल जाए।
   - फ्रेम को दृश्य बनाया गया है और इसे घटकों के अनुसार पैक किया गया है।

### कार्यक्षमता:
- जब आप प्रोग्राम को चलाते हैं, तो एक विंडो दिखाई देगी जिसमें "Skill:" लेबल और प्रोग्रामिंग कौशलों की एक सूची होगी। यदि आवश्यक हो, तो उपयोगकर्ता सूची के माध्यम से स्क्रॉल कर सकते हैं।
