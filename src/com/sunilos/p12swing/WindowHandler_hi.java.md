
```java
package com.sunilos.p12swing;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 * विंडो इवेंट्स को संभालने के लिए विंडो श्रवक का उपयोग करता है।
 * 
 * @संस्करण 1.0
 * @तारीख 16 नवम्बर 2014
 * @लेखक सुनिल साहू
 * @कॉपीराइट (c) सुनिल साहू
 * @वेबसाइट www.sunilbooks.com
 */
public class WindowHandler implements WindowListener {

    // जब विंडो खोली जाती है तब ट्रिगर होता है
    public void windowOpened(WindowEvent e) {
        System.out.println("खोला गया");
    }

    // जब विंडो सक्रिय (फोकस) होती है तब ट्रिगर होता है
    public void windowActivated(WindowEvent e) {
        System.out.println("सक्रिय किया गया");
    }

    // जब विंडो निष्क्रिय (अनफोकस) होती है तब ट्रिगर होता है
    public void windowDeactivated(WindowEvent e) {
        System.out.println("न्यूनतम किया गया");
    }

    // जब विंडो न्यूनतम स्थिति से पुनर्स्थापित होती है तब ट्रिगर होता है
    public void windowDeiconified(WindowEvent e) {
        System.out.println("अधिकतम किया गया");
    }

    // जब विंडो न्यूनतम की जाती है तब ट्रिगर होता है
    public void windowIconified(WindowEvent e) {
        System.out.println("आइकन किया गया");
    }

    // जब विंडो बंद होने वाली होती है तब ट्रिगर होता है
    public void windowClosing(WindowEvent e) {
        System.out.println("बंद करना");
    }

    // जब विंडो पूरी तरह से बंद होती है तब ट्रिगर होता है
    public void windowClosed(WindowEvent e) {
        System.out.println("बंद किया गया");
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("डेमो विंडो श्रवक"); // एक शीर्षक के साथ JFrame बनाएं
        frame.addWindowListener(new WindowHandler()); // विंडो श्रवक को फ्रेम में संलग्न करें

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // बंद करने पर बाहर निकलें
        frame.setSize(200, 100); // फ्रेम का आकार सेट करें
        frame.setVisible(true); // फ्रेम को दृश्य बनाएं
    }
}
```

### व्याख्या:
- **WindowListener इंटरफ़ेस**: `WindowHandler` कक्षा `WindowListener` इंटरफ़ेस को लागू करती है, जो विभिन्न विंडो इवेंट्स को संभालने के लिए विधियों प्रदान करती है।
- **इवेंट विधियाँ**: प्रत्येक विधि एक अलग विंडो इवेंट के लिए है:
  - `windowOpened`: जब विंडो खोली जाती है, तब कॉल होती है।
  - `windowActivated`: जब विंडो को फोकस मिलता है, तब कॉल होती है।
  - `windowDeactivated`: जब विंडो फोकस खोती है (अक्सर न्यूनतम), तब कॉल होती है।
  - `windowDeiconified`: जब विंडो न्यूनतम स्थिति से पुनर्स्थापित होती है, तब कॉल होती है।
  - `windowIconified`: जब विंडो न्यूनतम की जाती है, तब कॉल होती है।
  - `windowClosing`: जब विंडो बंद होने वाली होती है, तब कॉल होती है।
  - `windowClosed`: जब विंडो पूरी तरह से बंद होती है, तब कॉल होती है।
- **मुख्य विधि**: `main` विधि में, एक `JFrame` बनाया जाता है, और `WindowHandler` का उदाहरण एक श्रवक के रूप में जोड़ा जाता है। फ्रेम को बंद करने पर बाहर निकलने के लिए सेट किया गया है, इसका आकार उचित रूप से सेट किया गया है, और इसे दृश्य बनाया गया है।
