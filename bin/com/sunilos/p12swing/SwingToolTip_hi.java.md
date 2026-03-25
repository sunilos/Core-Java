
```java
package com.sunilos.p12swing;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * बटन पर टूलटिप संलग्न करना
 * 
 * @संस्करण 1.0
 * @तारीख 16 नवम्बर 2014
 * @लेखक सुनिल साहू
 * @कॉपीराइट (c) सुनिल साहू
 * @वेबसाइट www.sunilbooks.com
 */
public class SwingToolTip {

    public static void main(String[] args) {

        JFrame frame = new JFrame(); // एप्लिकेशन के लिए एक JFrame बनाएँ
        JPanel pane = (JPanel) frame.getContentPane(); // फ्रेम का सामग्री पैनल प्राप्त करें

        // JButton बनाएँ
        JButton button = new JButton("Save");

        // बटन पर टूलटिप संलग्न करें
        button.setToolTipText("File सहेजने के लिए यहाँ क्लिक करें"); // होवर करते समय दिखने वाला टूलटिप पाठ
        pane.add(button); // बटन को पैनल में जोड़ें

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // विंडो बंद होने पर एप्लिकेशन को समाप्त करें
        frame.setVisible(true); // फ्रेम को दृश्य बनाएं
        frame.pack(); // सामग्री के अनुसार फ्रेम का आकार समायोजित करें
    }
}
```

### व्याख्या:
- **JFrame**: एक विंडो `JFrame` का उपयोग करके बनाई जाती है।
- **JPanel**: घटकों को जोड़ने के लिए फ्रेम का सामग्री पैनल प्राप्त किया जाता है।
- **JButton**: "Save" लेबल वाला एक बटन बनाया जाता है।
- **ToolTip**: बटन पर टूलटिप को `setToolTipText()` का उपयोग करके संलग्न किया जाता है, जो उपयोगकर्ता के बटन पर होवर करने पर एक सहायक संदेश प्रदर्शित करता है।
- **विंडो गुण**: बंद करने की क्रिया को एप्लिकेशन को समाप्त करने के लिए सेट किया जाता है, फ्रेम को दृश्य बनाया जाता है, और इसके आकार को घटकों के अनुसार समायोजित किया जाता है।
