
```java
package com.sunilos.p12swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

/**
 * Swing में स्लाइडर
 * 
 * @संस्करण 1.0
 * @तारीख 16 नवम्बर 2014
 * @लेखक सुनिल साहू
 * @कॉपीराइट (c) सुनिल साहू
 * @वेबसाइट www.sunilbooks.com
 */
public class SwingSlider {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Slider");
        JPanel panel = (JPanel) frame.getContentPane();

        // एक स्लाइडर बनाएँ
        JSlider slider = new JSlider();

        // छोटे टिक के बीच की दूरी सेट करें
        slider.setMinorTickSpacing(5);

        // बड़े टिक के बीच की दूरी सेट करें
        slider.setMajorTickSpacing(10);

        // टिक को दृश्य बनाएं
        slider.setPaintTicks(true);

        // नॉब को निकटतम टिक मार्क पर स्नैप करें
        slider.setSnapToTicks(true);

        // स्लाइडर ट्रैक के ट्रैक को पेंट न करें
        slider.setPaintTrack(false);

        // लेबल के ट्रैक को पेंट करें
        slider.setPaintLabels(true);

        // स्लाइडर को पैनल में जोड़ें
        panel.add(slider);
        
        // डिफ़ॉल्ट बंद करने की क्रिया सेट करें और फ्रेम को दृश्य बनाएं
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
    }
}
```

### व्याख्या:
1. **कक्षा घोषणा**:
   - कक्षा `SwingSlider` Swing एप्लिकेशन में स्लाइडर के उपयोग को प्रदर्शित करती है।

2. **मुख्य विधि**:
   - "Swing Slider" शीर्षक वाला `JFrame` और एक `JPanel` बनाया जाता है।
   - एक `JSlider` बनाया जाता है जिसमें विभिन्न गुण सेट किए जाते हैं:
     - सूक्ष्म और प्रमुख टिक के बीच की दूरी।
     - टिक और लेबल की दृश्यता।
     - नॉब को निकटतम टिक मार्क पर स्नैप करने का विकल्प।
     - स्लाइडर के ट्रैक की उपस्थिति को अनुकूलित करता है।

3. **विंडो गुण**:
   - जब विंडो बंद की जाती है, तो एप्लिकेशन को समाप्त करने के लिए डिफ़ॉल्ट बंद करने की क्रिया सेट की जाती है।
   - फ्रेम को दृश्य बनाया जाता है और `pack()` को कॉल किया जाता है ताकि फ्रेम को घटकों के लिए आकार दिया जा सके।

### कार्यक्षमता:
- जब प्रोग्राम चलाया जाता है, तो एक विंडो खुलती है जिसमें एक स्लाइडर होता है, जो उपयोगकर्ताओं को दृश्य रूप से एक मान को समायोजित करने की अनुमति देता है। टिक और लेबल उपयोगिता को बढ़ाते हैं।
