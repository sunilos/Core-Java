
```java
package com.sunilos.p12swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 * FrameWithMenuBar एक JFrame बनाता है जिसमें एक मेनू बार होता है 
 * जिसमें फ़ाइल और संपादन मेनू होते हैं। यह प्रोग्राम 
 * Swing घटकों का उपयोग करके मेनू के साथ GUI बनाने का एक उदाहरण है।
 * 
 * @संस्करण 1.0
 * @तारीख 16 नवम्बर 2014
 * @लेखक सुनिल साहू
 * @कॉपीराइट (c) सुनिल साहू
 * @वेबसाइट www.sunilbooks.com
 */
public class FrameWithMenuBar {

    /**
     * मुख्य मेथड GUI घटकों को प्रारंभ करता है और विंडो को दृश्य बनाता है।
     * 
     * @param args कमांड-लाइन तर्क (इस उदाहरण में उपयोग नहीं किया गया)।
     */
    public static void main(String[] args) {

        // एक JFrame (विंडो) बनाएं
        JFrame frame = new JFrame();

        // विंडो का शीर्षक सेट करें
        frame.setTitle("मेरी पहली विंडो");

        // JFrame का डिफ़ॉल्ट सामग्री पैन प्राप्त करें
        JPanel pane = (JPanel) frame.getContentPane();

        // एक JButton बनाएं और इसे JPanel में जोड़ें
        JButton b = new JButton("मुझे क्लिक करें");
        pane.add(b); // बटन को पैनल में जोड़ें

        // एक JMenuBar (मेनू बार) बनाएं
        JMenuBar bar = new JMenuBar();

        // फ़ाइल मेनू और इसके मेनू आइटम बनाएं
        JMenu fileMenu = new JMenu("फ़ाइल");
        JMenuItem newFile = new JMenuItem("नया"); // नया फ़ाइल बनाने के लिए मेनू आइटम
        JMenuItem open = new JMenuItem("खोलें"); // फ़ाइल खोलने के लिए मेनू आइटम

        // फ़ाइल मेनू में मेनू आइटम जोड़ें
        fileMenu.add(newFile);
        fileMenu.add(open);

        // संपादन मेनू और इसके मेनू आइटम बनाएं
        JMenu editMenu = new JMenu("संपादित करें");
        JMenuItem cut = new JMenuItem("कट करें"); // कट कार्रवाई के लिए मेनू आइटम
        JMenuItem copy = new JMenuItem("कॉपी करें"); // कॉपी कार्रवाई के लिए मेनू आइटम
        JMenuItem paste = new JMenuItem("पेस्ट करें"); // पेस्ट कार्रवाई के लिए मेनू आइटम

        // संपादन मेनू में मेनू आइटम जोड़ें
        editMenu.add(cut);
        editMenu.add(copy);
        editMenu.add(paste);

        // मेनू बार में मेनू जोड़ें
        bar.add(fileMenu);
        bar.add(editMenu);

        // मेनू बार को JFrame में सेट करें
        frame.setJMenuBar(bar);

        // जब विंडो बंद की जाती है तो एप्लिकेशन को समाप्त करने के लिए डिफ़ॉल्ट बंद संचालन सेट करें
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        // विंडो का आकार सेट करें
        frame.setSize(200, 100); // चौड़ाई: 200, ऊँचाई: 100

        // विंडो को उपयोगकर्ता के लिए दृश्य बनाएं
        frame.setVisible(true); 
    }
}
```

### व्याख्या:
1. **JFrame**:
   - एक `JFrame` बनाया गया है, जो मुख्य विंडो के रूप में कार्य करता है, और इसका शीर्षक "मेरी पहली विंडो" सेट किया गया है।

2. **JPanel**:
   - डिफ़ॉल्ट सामग्री पैन को एक `JPanel` के रूप में प्राप्त किया गया है, जिसमें GUI घटक रखे जाएंगे।

3. **JButton**:
   - "मुझे क्लिक करें" लेबल वाला एक `JButton` बनाया गया है और इसे पैनल में जोड़ा गया है।

4. **JMenuBar**:
   - मेनू रखने के लिए एक `JMenuBar` बनाया गया है।

5. **मेनू और मेनू आइटम**:
   - "फ़ाइल" मेनू बनाया गया है, जिसमें "नया" और "खोलें" आइटम हैं।
   - "संपादित करें" मेनू बनाया गया है, जिसमें "कट करें," "कॉपी करें," और "पेस्ट करें" आइटम हैं।

6. **मेनू बार में मेनू जोड़ना**:
   - "फ़ाइल" और "संपादित करें" मेनू को मेनू बार में जोड़ा गया है, जिसे फिर `JFrame` में सेट किया गया है।

7. **बंद संचालन**:
   - जब विंडो बंद की जाती है, तो एप्लिकेशन समाप्त हो जाएगा, जैसा कि `setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)` में निर्दिष्ट है।

8. **विंडो का आकार और दृश्यता**:
   - विंडो का आकार 200 पिक्सल चौड़ा और 100 पिक्सल ऊँचा सेट किया गया है, और विंडो को उपयोगकर्ता के लिए दृश्य बना दिया गया है।
