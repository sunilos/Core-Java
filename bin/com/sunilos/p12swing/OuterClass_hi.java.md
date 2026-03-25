
```java
package com.sunilos.p12swing;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * OuterClass एक Swing अनुप्रयोग में माउस और फ़ोकस इवेंट्स को संभालने के लिए आंतरिक और स्थैतिक आंतरिक कक्षाओं के उपयोग का प्रदर्शन करता है।
 * 
 * @संस्करण 1.0
 * @तारीख 16 नवम्बर 2014
 * @लेखक सुनिल साहू
 * @कॉपीराइट (c) सुनिल साहू
 * @वेबसाइट www.sunilbooks.com
 */
public class OuterClass {

    private int instanceVar = 0; // उदाहरण चर
    private static int staticVar = 0; // स्थैतिक चर

    /**
     * उदाहरण स्तर पर पहुंच का प्रदर्शन करने के लिए उदाहरण विधि।
     */
    private void instanceMethod() {
        System.out.println("उदाहरण विधि");
    }

    /**
     * स्थैतिक स्तर पर पहुंच का प्रदर्शन करने के लिए स्थैतिक विधि।
     */
    private static void staticMethod() {
        System.out.println("स्थैतिक विधि");
    }

    // माउस इवेंट्स को संभालने के लिए आंतरिक कक्षा
    private class InnMouseHandler extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("माउस क्लिक किया गया");
            // उदाहरण और स्थैतिक चर/विधियों तक पहुंच
            instanceVar = 0;
            staticVar = 0;
            instanceMethod();
            staticMethod();
        }
    }

    // फ़ोकस इवेंट्स को संभालने के लिए स्थैतिक आंतरिक कक्षा
    private static class FocusHandler extends FocusAdapter {
        @Override
        public void focusGained(FocusEvent e) {
            System.out.println("फ़ोकस प्राप्त किया");
            // स्थैतिक चर/विधियों तक पहुंच
            staticVar = 0;
            staticMethod();
        }
    }

    /**
     * JFrame बनाने और आंतरिक कक्षा के उपयोग का प्रदर्शन करने के लिए मुख्य विधि।
     * 
     * @args कमांड-लाइन तर्क (इस उदाहरण में उपयोग नहीं किया गया)।
     */
    public static void main(String[] args) {

        // एक JFrame बनाएं
        JFrame f = new JFrame();

        // OuterClass का एक उदाहरण बनाएं
        OuterClass o = new OuterClass();
        InnMouseHandler h = o.new InnMouseHandler(); // आंतरिक कक्षा का उदाहरण बनाएं

        // एक JButton बनाएं और माउस श्रोता जोड़ें
        JButton b = new JButton("भेजें");
        b.addMouseListener(h);
        f.add(b);

        // बटन के लिए फ़ोकस श्रोता बनाएं और जोड़ें
        FocusHandler fh = new OuterClass.FocusHandler();
        b.addFocusListener(fh);

        // फ्रेम सेट करें
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true); // फ्रेम को दृश्यमान बनाएं
    }
}
```

### व्याख्या:
1. **OuterClass**:
   - उदाहरण और स्थैतिक चर और विधियों को रखता है। यह दर्शाता है कि आंतरिक और स्थैतिक आंतरिक कक्षाएं इन सदस्यों तक कैसे पहुंच सकती हैं।

2. **आंतरिक कक्षा (InnMouseHandler)**:
   - एक गैर-स्थैतिक आंतरिक कक्षा है जो `MouseAdapter` का विस्तार करती है। यह बटन पर क्लिक होने पर कार्रवाई करने के लिए `mouseClicked` विधि को ओवरराइड करती है। यह `OuterClass` के उदाहरण और स्थैतिक सदस्यों दोनों तक पहुँच सकती है।

3. **स्थैतिक आंतरिक कक्षा (FocusHandler)**:
   - एक स्थैतिक आंतरिक कक्षा है जो `FocusAdapter` का विस्तार करती है। यह बटन पर फ़ोकस प्राप्त होने पर प्रतिक्रिया देने के लिए `focusGained` विधि को ओवरराइड करती है। यह केवल `OuterClass` के स्थैतिक सदस्यों तक पहुँच सकती है।

4. **मुख्य विधि**:
   - `JFrame` के साथ एक साधारण Swing इंटरफेस सेट करती है जिसमें एक `JButton` होता है। यह माउस क्लिक और फ़ोकस इवेंट्स को संभालने के लिए दोनों आंतरिक कक्षाओं के उदाहरण बनाती है।

5. **इवेंट हैंडलिंग**:
   - जब बटन पर क्लिक किया जाता है, तो `InnMouseHandler` सक्रिय होता है, "माउस क्लिक किया गया" प्रिंट करता है और प्रासंगिक विधियों को कॉल करता है। जब बटन फ़ोकस प्राप्त करता है, तो `FocusHandler` "फ़ोकस प्राप्त किया" प्रिंट करता है।
