
```java
package com.sunilos.p12swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.UIManager;

/**
 * SwingProgressBar Swing में प्रगति बार के उपयोग का प्रदर्शन करता है।
 * 
 * @संस्करण 1.0
 * @तारीख 16 नवम्बर 2014
 * @लेखक सुनिल साहू
 * @कॉपीराइट (c) सुनिल साहू
 * @वेबसाइट www.sunilbooks.com
 */
public class SwingProgressBar extends JFrame {

    protected int min = 20;
    protected int max = 100;
    protected int counter = 25;
    protected JProgressBar jpb;

    public SwingProgressBar() {
        super("JProgressBar");
        setSize(300, 80);

        // प्रगति बार के लिए पृष्ठभूमि रंग सेट करें
        UIManager.put("ProgressBar.selectionBackground", Color.black);
        UIManager.put("ProgressBar.selectionForeground", Color.white);
        UIManager.put("ProgressBar.foreground", new Color(8, 32, 128));

        // प्रगति बार बनाएँ
        jpb = new JProgressBar();
        jpb.setMinimum(min);
        jpb.setMaximum(max);
        jpb.setStringPainted(true); // प्रगति को बार पर पाठ के रूप में दिखाएँ

        // प्रारंभ बटन बनाएँ
        JButton start = new JButton("Go ..");

        // बटन पर क्रिया श्रवक जोड़ें
        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Thread runner = new Thread() {
                    public void run() {
                        counter = min; // काउंटर को न्यूनतम पर रीसेट करें
                        while (counter <= max) {
                            jpb.setValue(counter); // प्रगति बार के मान को अपडेट करें
                            counter += 1; // काउंटर बढ़ाएँ
                            try {
                                Thread.sleep(100); // थोड़ी देर के लिए सोएँ
                            } catch (InterruptedException ex) {
                                // अपवाद को संभालें
                            }
                        }
                    }
                };
                runner.start(); // थ्रेड शुरू करें
            }
        });

        // घटकों को फ्रेम में जोड़ें
        getContentPane().add(jpb, BorderLayout.CENTER);
        getContentPane().add(start, BorderLayout.WEST);
    }

    public static void main(String[] args) {
        SwingProgressBar frame = new SwingProgressBar();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

### व्याख्या:
1. **SwingProgressBar कक्षा**:
   - यह कक्षा `JFrame` को बढ़ाती है और प्रगति बार के उपयोग का प्रदर्शन करती है।

2. **चर**:
   - `min` और `max` प्रगति बार की सीमा निर्धारित करते हैं।
   - `counter` वर्तमान प्रगति बार के मान को ट्रैक करने के लिए उपयोग किया जाता है।
   - `jpb` `JProgressBar` का उदाहरण है।

3. **निर्माणकर्ता**:
   - फ्रेम को प्रारंभ करता है और इसका आकार सेट करता है।
   - `UIManager` का उपयोग करके प्रगति बार की उपस्थिति को कॉन्फ़िगर करता है।
   - प्रगति बार बनाता है और इसके न्यूनतम, अधिकतम और स्ट्रिंग प्रदर्शन गुणों को सेट करता है।
   - "Go .." बटन बनाता है और एक क्रिया श्रवक जोड़ता है।

4. **ActionListener**:
   - जब बटन पर क्लिक किया जाता है, एक नया थ्रेड शुरू होता है।
   - थ्रेड काउंटर को बढ़ाता है और हर 100 मिलीसेकंड में प्रगति बार का मान अपडेट करता है जब तक यह अधिकतम तक नहीं पहुँचता।

5. **मुख्य विधि**:
   - `SwingProgressBar` का एक उदाहरण बनाता है, डिफ़ॉल्ट क्लोज़ ऑपरेशन सेट करता है, और फ्रेम को दृश्य बनाता है।

### कार्यक्षमता:
- जब प्रोग्राम चलाया जाता है, तो एक विंडो प्रगति बार और एक बटन के साथ दिखाई देती है। बटन पर क्लिक करने से प्रगति बार भरने लगता है।
