
```java
package com.sunilos.p12swing;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * स्थानीय कक्षा का परीक्षण
 * 
 * @संस्करण 1.0
 * @तारीख 16 नवम्बर 2014
 * @लेखक सुनिल साहू
 * @कॉपीराइट (c) सुनिल साहू
 * @वेबसाइट www.sunilbooks.com
 */
public class TestLocalClass {

    public static void main(String[] args) {
        
        // माउस इवेंट्स को संभालने के लिए MouseAdapter को विस्तारित करने वाली एक स्थानीय कक्षा परिभाषित करें
        class LocalClass extends MouseAdapter {
            public void mouseClicked(MouseEvent e) {
                System.out.println("माउस क्लिक किया गया"); // माउस क्लिक पर प्रदर्शन करने के लिए क्रिया
            }
        }

        JFrame f = new JFrame(); // एक नया JFrame बनाएं

        LocalClass h = new LocalClass(); // स्थानीय कक्षा का एक उदाहरण बनाएं

        JButton b = new JButton("भेजें"); // "भेजें" लेबल वाला JButton बनाएं
        b.addMouseListener(h); // बटन पर माउस श्रवक संलग्न करें
        f.add(b); // बटन को फ्रेम में जोड़ें

        f.pack(); // फ्रेम को इसके घटकों के अनुसार आकार दें
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // बंद करने पर बाहर निकलें
        f.setVisible(true); // फ्रेम को उपयोगकर्ता के लिए दृश्य बनाएं
    }
}
```

### व्याख्या:
- **स्थानीय कक्षा**: `main` मेथड के अंदर एक स्थानीय कक्षा `LocalClass` परिभाषित की गई है, जो माउस क्लिक इवेंट्स को संभालने के लिए `MouseAdapter` को विस्तारित करती है। इस कक्षा में एक `mouseClicked` मेथड है जो बटन पर क्लिक होने पर एक संदेश प्रिंट करता है।
- **JFrame और JButton**: घटकों को रखने के लिए एक `JFrame` बनाया गया है, और "भेजें" लेबल वाला एक `JButton` बनाया गया है।
- **इवेंट हैंडलिंग**: स्थानीय कक्षा का उदाहरण `h` बटन पर माउस श्रवक के रूप में जोड़ा गया है, जिससे क्लिक इवेंट हैंडलिंग सक्षम हो जाती है।
- **फ्रेम कॉन्फ़िगरेशन**: फ्रेम को इसके घटकों के अनुसार पैक किया गया है, बंद करने पर बाहर निकलने के लिए सेट किया गया है, और इसे उपयोगकर्ता के लिए दृश्य बनाया गया है।
