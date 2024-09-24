
```java
package com.sunilos.p12swing;

import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * SwingCheckBox एक चेकबॉक्स बनाने का प्रदर्शन करता है जो Swing का उपयोग करता है।
 * 
 * @संस्करण 1.0
 * @तारीख 16 नवम्बर 2014
 * @लेखक सुनिल साहू
 * @कॉपीराइट (c) सुनिल साहू
 * @वेबसाइट www.sunilbooks.com
 */
public class SwingCheckBox {
    public static void main(String[] args) {

        // "Swing CheckBox" शीर्षक वाला एक JFrame बनाएं
        JFrame frame = new JFrame("Swing CheckBox");
        JPanel panel = (JPanel) frame.getContentPane();
        
        // पैनल के लेआउट को FlowLayout पर सेट करें
        FlowLayout layout = new FlowLayout();
        panel.setLayout(layout);

        // "Has Account?" लेबल वाला JCheckBox बनाएं
        JCheckBox checkBox = new JCheckBox("Has Account?");
        panel.add(checkBox); // चेकबॉक्स को पैनल में जोड़ें

        // डिफ़ॉल्ट क्लोज़ ऑपरेशन सेट करें और फ्रेम को दृश्यमान बनाएं
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); // फ्रेम को दिखाएँ
        frame.pack(); // घटकों के अनुसार फ्रेम का आकार समायोजित करें
    }
}
```

### व्याख्या:
1. **SwingCheckBox कक्षा**:
   - यह कक्षा दिखाती है कि एक Swing अनुप्रयोग में चेकबॉक्स कैसे बनाया जाता है।

2. **JFrame निर्माण**:
   - "Swing CheckBox" शीर्षक वाला एक `JFrame` बनाया गया है, जो अनुप्रयोग के लिए मुख्य विंडो का काम करता है।

3. **पैनल और लेआउट**:
   - एक `JPanel` को फ्रेम के सामग्री पैन के रूप में बनाया गया है, और इसके लेआउट को `FlowLayout` पर सेट किया गया है, जो घटकों को बाएँ से दाएँ प्रवाह में व्यवस्थित करता है।

4. **JCheckBox निर्माण**:
   - "Has Account?" लेबल वाला एक `JCheckBox` बनाया गया है और इसे पैनल में जोड़ा गया है।

5. **फ्रेम कॉन्फ़िगरेशन**:
   - डिफ़ॉल्ट क्लोज़ ऑपरेशन सेट किया गया है ताकि फ्रेम बंद होने पर अनुप्रयोग बाहर निकल जाए।
   - फ्रेम को दृश्यमान बनाया गया है और इसे ठीक से घटकों के अनुसार पैक किया गया है।

### कार्यक्षमता:
- जब आप प्रोग्राम को चलाते हैं, तो "Has Account?" लेबल वाला एक चेकबॉक्स वाला एक विंडो दिखाई देगी, जो उपयोगकर्ताओं को बॉक्स को चेक या अनचेक करने की अनुमति देती है।
