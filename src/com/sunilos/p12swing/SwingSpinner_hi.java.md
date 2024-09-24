
```java
package com.sunilos.p12swing;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;

/**
 * Swing में स्पिनर
 * 
 * @संस्करण 1.0
 * @तारीख 16 नवम्बर 2014
 * @लेखक सुनिल साहू
 * @कॉपीराइट (c) सुनिल साहू
 * @वेबसाइट www.sunilbooks.com
 */
public class SwingSpinner {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Spinner"); // "Swing Spinner" शीर्षक वाला JFrame बनाएँ
        JPanel panel = (JPanel) frame.getContentPane(); // फ्रेम का सामग्री पैनल प्राप्त करें
        panel.setLayout(new GridLayout(1, 2)); // लेआउट को 1 पंक्ति और 2 कॉलम के ग्रिड में सेट करें

        JLabel label = new JLabel("  Exp : "); // स्पिनर के लिए एक लेबल बनाएँ
        panel.add(label); // लेबल को पैनल में जोड़ें

        // संख्या चुनने के लिए एक स्पिनर बनाएँ
        JSpinner spinner = new JSpinner();
        spinner.setSize(20, 30); // स्पिनर का पसंदीदा आकार सेट करें (अधिकतर प्रभावी नहीं होता)
        panel.add(spinner); // स्पिनर को पैनल में जोड़ें

        // फ्रेम के लिए डिफ़ॉल्ट क्लोज़ ऑपरेशन सेट करें
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // विंडो बंद होने पर एप्लिकेशन को समाप्त करें
        frame.pack(); // घटकों के लिए फ्रेम का आकार सेट करें
        frame.setVisible(true); // फ्रेम को दृश्य बनाएं
    }
}
```

### व्याख्या:
- **JFrame और JPanel**: मुख्य विंडो को `JFrame` का उपयोग करके बनाया जाता है, और घटकों को व्यवस्थित करने के लिए `JPanel` का उपयोग किया जाता है।
- **GridLayout**: पैनल एक `GridLayout` का उपयोग करता है ताकि लेबल और स्पिनर को बगल में व्यवस्थित किया जा सके।
- **JLabel**: एक लेबल बनाया जाता है जो स्पिनर का प्रतिनिधित्व करता है (इस मामले में, "Exp")।
- **JSpinner**: एक स्पिनर को प्रारंभ किया जाता है, जो उपयोगकर्ताओं को क्रमिक रूप से संख्यात्मक मान चुनने की अनुमति देता है। जबकि आकार सेट किया जाता है, यह आमतौर पर प्रदर्शन को प्रभावित नहीं करता है।
- **विंडो गुण**: बंद करने की क्रिया को एप्लिकेशन को समाप्त करने के लिए परिभाषित किया जाता है, और फ्रेम का आकार बदला जाता है और इसे दृश्य बनाया जाता है।
