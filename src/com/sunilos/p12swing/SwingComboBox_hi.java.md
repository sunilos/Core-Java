
```java
package com.sunilos.p12swing;

import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * SwingComboBox Swing का उपयोग करके एक कॉम्बो बॉक्स बनाने का प्रदर्शन करता है।
 * 
 * @संस्करण 1.0
 * @तारीख 16 नवम्बर 2014
 * @लेखक सुनिल साहू
 * @कॉपीराइट (c) सुनिल साहू
 * @वेबसाइट www.sunilbooks.com
 */
public class SwingComboBox {
    public static void main(String[] args) {

        // एक JFrame बनाएं
        JFrame frame = new JFrame("Swing ComboBox");
        JPanel panel = (JPanel) frame.getContentPane();

        // पैनल के लेआउट को FlowLayout पर सेट करें
        FlowLayout layout = new FlowLayout();
        panel.setLayout(layout);

        // कॉम्बो बॉक्स के लिए एक JLabel बनाएं
        JLabel label = new JLabel("Gender: ");
        panel.add(label); // लेबल को पैनल में जोड़ें

        // लिंग विकल्पों का एक ऐरे बनाएं
        String gender[] = { "Male", "Female" };
        // लिंग विकल्पों के साथ JComboBox बनाएं
        JComboBox<String> comboBox = new JComboBox<>(gender);
        panel.add(comboBox); // कॉम्बो बॉक्स को पैनल में जोड़ें

        // डिफ़ॉल्ट क्लोज़ ऑपरेशन सेट करें और फ्रेम को दृश्यमान बनाएं
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); // फ्रेम को दिखाएँ
        frame.pack(); // घटकों के अनुसार फ्रेम का आकार समायोजित करें
    }
}
```

### व्याख्या:
1. **SwingComboBox कक्षा**:
   - यह कक्षा दिखाती है कि एक Swing अनुप्रयोग में कॉम्बो बॉक्स (ड्रॉपडाउन मेनू) कैसे बनाया जाता है।

2. **JFrame निर्माण**:
   - "Swing ComboBox" शीर्षक वाला एक `JFrame` बनाया गया है, जो अनुप्रयोग के लिए मुख्य विंडो का काम करता है।

3. **पैनल और लेआउट**:
   - एक `JPanel` बनाया गया है और इसके लेआउट को `FlowLayout` पर सेट किया गया है, जो घटकों को एक प्रवाह में व्यवस्थित करता है।

4. **JLabel निर्माण**:
   - "Gender: " पाठ के साथ एक `JLabel` बनाया गया है और इसे पैनल में जोड़ा गया है।

5. **JComboBox निर्माण**:
   - लिंग विकल्पों ("Male" और "Female") का एक ऐरे बनाया गया है।
   - लिंग ऐरे के साथ एक `JComboBox` का आरंभ किया गया है और इसे पैनल में जोड़ा गया है।

6. **फ्रेम कॉन्फ़िगरेशन**:
   - डिफ़ॉल्ट क्लोज़ ऑपरेशन सेट किया गया है ताकि फ्रेम बंद होने पर अनुप्रयोग बाहर निकल जाए।
   - फ्रेम को दृश्यमान बनाया गया है और इसे ठीक से घटकों के अनुसार पैक किया गया है।

### कार्यक्षमता:
- जब आप प्रोग्राम को चलाते हैं, तो "Gender: " लेबल और "Male" और "Female" विकल्पों वाला एक कॉम्बो बॉक्स वाली एक विंडो दिखाई देगी। उपयोगकर्ता ड्रॉपडाउन मेनू से अपना लिंग चुन सकते हैं।
