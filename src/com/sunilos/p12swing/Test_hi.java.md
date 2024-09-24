
```java
package com.sunilos.p12swing;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * JOptionPane का उपयोग करके संदेश डायलॉग बॉक्स
 * 
 * @संस्करण 1.0
 * @तारीख 16 नवम्बर 2014
 * @लेखक सुनिल साहू
 * @कॉपीराइट (c) सुनिल साहू
 * @वेबसाइट www.sunilbooks.com
 */
public class Test {

    /**
     * संदेश डायलॉग दिखाने के लिए मुख्य विधि
     * @param args कमांड लाइन तर्क
     */
    public static void main(String[] args) {

        JFrame frame = new JFrame(); // एप्लिकेशन के लिए एक JFrame बनाएँ
        
        // एक संदेश के साथ संदेश डायलॉग बॉक्स दिखाएँ
        JOptionPane.showMessageDialog(frame, "डेटा सहेज लिया गया है!");

        // विंडो बंद होने पर एप्लिकेशन को समाप्त करने के लिए बंद करने की क्रिया सेट करें
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // बंद होने पर समाप्त करें
        frame.setSize(400, 200); // विंडो का आकार सेट करें
        frame.setVisible(true); // फ्रेम को दृश्य बनाएं
    }
}
```

### व्याख्या:
- **JFrame**: `JFrame` का उपयोग करके एक विंडो बनाई जाती है।
- **JOptionPane**: `showMessageDialog()` का उपयोग करके एक संदेश डायलॉग बॉक्स प्रदर्शित किया जाता है, जो उपयोगकर्ता को सूचित करता है कि डेटा सहेज लिया गया है।
- **विंडो गुण**: बंद करने की क्रिया को एप्लिकेशन को समाप्त करने के लिए सेट किया जाता है, विंडो का आकार निर्धारित किया जाता है, और फ्रेम को दृश्य बनाया जाता है।
