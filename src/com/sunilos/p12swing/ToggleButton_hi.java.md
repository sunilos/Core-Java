
```java
package com.sunilos.p12swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * एक बटन बनाता है और एक ActionListener लागू करता है जो बटन क्लिक इवेंट्स को सुनता है।
 * 
 * @संस्करण 1.0
 * @तारीख 16 नवम्बर 2014
 * @लेखक सुनिल साहू
 * @कॉपीराइट (c) सुनिल साहू
 * @वेबसाइट www.sunilbooks.com
 */
public class ToggleButton {

    public static void main(String[] args) {

        JFrame frame = new JFrame("डेमो बटन क्लिक"); // एक शीर्षक के साथ JFrame बनाएं
        JPanel pane = (JPanel) frame.getContentPane(); // फ्रेम के कंटेंट पेन को प्राप्त करें

        JButton b = new JButton("ON"); // "ON" लेबल वाला एक बटन बनाएं

        // बटन श्रवक बनाएं और इसे बटन में जोड़ें
        ButtonListener listener = new ButtonListener();
        b.addActionListener(listener); // श्रवक को बटन में संलग्न करें

        pane.add(b); // बटन को पैनल में जोड़ें

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // बंद करने पर बाहर निकलें
        frame.setSize(200, 100); // फ्रेम का आकार सेट करें
        frame.setVisible(true); // फ्रेम को दृश्य बनाएं
    }
}

/**
 * बटन क्लिक इवेंट्स के लिए सुनता है
 */
class ButtonListener implements ActionListener {

    /**
     * क्लिक पर बटन लेबल बदलें
     */
    public void actionPerformed(ActionEvent event) {
        JButton b = (JButton) event.getSource(); // उस बटन को प्राप्त करें जिसने इवेंट को ट्रिगर किया
        String label = b.getText(); // बटन का वर्तमान लेबल प्राप्त करें

        // बटन लेबल को "ON" और "OFF" के बीच टॉगल करें
        if (label.equals("ON")) {
            b.setText("OFF"); // लेबल को "OFF" में बदलें
        } else if (label.equals("OFF")) {
            b.setText("ON"); // लेबल को "ON" में वापस बदलें
        }
    }
}
```

### व्याख्या:
- **मुख्य कक्षा**: `ToggleButton` कक्षा में मुख्य विधि है, जहाँ एक `JFrame` और एक `JButton` बनाया गया है। बटन "ON" लेबल के साथ शुरू होता है।
- **ActionListener**: `ButtonListener` का एक उदाहरण बनाया जाता है, जो `ActionListener` को लागू करता है, और इसे बटन में संलग्न किया जाता है। यह श्रवक बटन क्लिक इवेंट्स को संभालता है।
- **लेबल टॉगलिंग**: `actionPerformed` विधि के अंदर, बटन का वर्तमान लेबल प्राप्त किया जाता है। बटन क्लिक होने पर लेबल "ON" और "OFF" के बीच टॉगल होता है।
- **फ्रेम कॉन्फ़िगरेशन**: फ्रेम को बंद करने पर बाहर निकलने के लिए सेट किया गया है, इसका आकार उचित रूप से सेट किया गया है, और इसे दृश्य बनाया गया है।
