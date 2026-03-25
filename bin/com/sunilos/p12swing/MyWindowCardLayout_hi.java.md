
```java
package com.sunilos.p12swing;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * MyWindowCardLayout JFrame में CardLayout के उपयोग का प्रदर्शन करता है।
 * यह प्रोग्राम एक विंडो बनाता है जो बटन का उपयोग करके विभिन्न पैनल के बीच स्विच करने की अनुमति देता है।
 * 
 * @संस्करण 1.0
 * @तारीख 16 नवम्बर 2014
 * @लेखक सुनिल साहू
 * @कॉपीराइट (c) सुनिल साहू
 * @वेबसाइट www.sunilbooks.com
 */
public class MyWindowCardLayout {

    /**
     * मुख्य मेथड GUI घटकों को प्रारंभ करता है और विंडो को दृश्यमान बनाता है।
     * 
     * @param args कमांड-लाइन तर्क (इस उदाहरण में उपयोग नहीं किया गया)।
     */
    public static void main(String[] args) {

        // एक JFrame (विंडो) बनाएं
        JFrame frame = new JFrame();
        JPanel pane = (JPanel) frame.getContentPane();

        // पैनल के लिए CardLayout सेट करें
        CardLayout card = new CardLayout();
        pane.setLayout(card);

        // बटन क्रियाओं को प्रबंधित करने के लिए बटन हैंडलर सेट करें
        ButtonHandler handler = new ButtonHandler(pane);

        // "Next Panel" बटन बनाएं और क्रिया श्रोता जोड़ें
        JButton b1 = new JButton("Next Panel");
        b1.addActionListener(handler);
        pane.add(b1); // पैनल में बटन जोड़ें

        // "Previous Panel" बटन बनाएं और क्रिया श्रोता जोड़ें
        JButton b2 = new JButton("Previous Panel");
        b2.addActionListener(handler);
        pane.add(b2); // पैनल में बटन जोड़ें

        // JFrame के लिए डिफ़ॉल्ट क्लोज ऑपरेशन सेट करें
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200); // विंडो का आकार सेट करें
        frame.setVisible(true); // विंडो को दृश्यमान बनाएं
    }
}

/**
 * बटन इवेंट लिसनर जो पैनल स्विच करने के लिए बटन क्रियाओं को संभालता है।
 */
class ButtonHandler implements ActionListener {
    JPanel pane = null;

    /**
     * पैनल संदर्भ के साथ बटन हैंडलर को प्रारंभ करने के लिए कंस्ट्रक्टर।
     * 
     * @param pane CardLayout वाला JPanel।
     */
    ButtonHandler(JPanel pane) {
        this.pane = pane;
    }

    /**
     * बटन क्लिक इवेंट को हैंडल करता है ताकि CardLayout में पैनल स्विच किया जा सके।
     * 
     * @param e बटन क्लिक द्वारा उत्पन्न ActionEvent।
     */
    public void actionPerformed(ActionEvent e) {
        CardLayout card = (CardLayout) pane.getLayout();
        card.next(pane); // CardLayout में अगले पैनल पर स्विच करें
    }
}
```

### व्याख्या:
1. **JFrame**:
   - एक `JFrame` बनाया गया है जो घटकों को रखने के लिए है।

2. **CardLayout**:
   - `CardLayout` को पैनल के लिए लेआउट मैनेजर के रूप में सेट किया गया है, जो कई घटकों (कार्ड) को स्टैक करने और स्विच करने की अनुमति देता है।

3. **ButtonHandler**:
   - यह वर्ग `ActionListener` को लागू करता है ताकि बटन क्लिक इवेंट को संभाला जा सके। यह विभिन्न पैनलों के बीच स्विच करने के लिए `CardLayout` का उपयोग करता है।

4. **Buttons**:
   - "Next Panel" और "Previous Panel" नामक दो बटन बनाए गए हैं और उन्हें `ButtonHandler` से जोड़ा गया है। जब उन पर क्लिक किया जाता है, तो वे प्रदर्शित पैनल को स्विच करने के लिए क्रियाएँ ट्रिगर करेंगे।

5. **Main Method**:
   - GUI घटकों को प्रारंभ करता है और JFrame के लिए डिफ़ॉल्ट क्लोज ऑपरेशन और आकार सेट करता है। फिर विंडो को दृश्यमान बनाया जाता है।

6. **Action Handling**:
   - `ButtonHandler` में `actionPerformed` मेथड बटन क्लिक होने पर अगले पैनल को प्रदर्शित करने के लिए `CardLayout` का उपयोग करता है।
