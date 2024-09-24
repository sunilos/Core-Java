
```java
package com.sunilos.p12swing;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * Swing में टेक्स्ट फील्ड
 * 
 * @संस्करण 1.0
 * @तारीख 16 नवम्बर 2014
 * @लेखक सुनिल साहू
 * @कॉपीराइट (c) सुनिल साहू
 * @वेबसाइट www.sunilbooks.com
 */
public class SwingTextField {

    public static void main(String[] args) {

        JFrame frame = new JFrame(); // एप्लिकेशन के लिए एक JFrame बनाएँ

        JPanel pane = (JPanel) frame.getContentPane(); // फ्रेम का सामग्री पैनल प्राप्त करें
        pane.setLayout(new GridLayout(2, 2)); // घटकों को 2 पंक्तियों और 2 कॉलम में व्यवस्थित करने के लिए ग्रिड लेआउट सेट करें

        JLabel login = new JLabel("Login : "); // लॉगिन फील्ड के लिए एक लेबल बनाएँ
        pane.add(login); // पैनल में लॉगिन लेबल जोड़ें

        JTextField text = new JTextField(); // उपयोगकर्ता इनपुट के लिए एक टेक्स्ट फील्ड बनाएँ
        pane.add(text); // पैनल में टेक्स्ट फील्ड जोड़ें

        JLabel pwd = new JLabel("Password : "); // पासवर्ड फील्ड के लिए एक लेबल बनाएँ
        pane.add(pwd); // पैनल में पासवर्ड लेबल जोड़ें

        JPasswordField pwdT = new JPasswordField(); // उपयोगकर्ता इनपुट को छिपाने के लिए एक पासवर्ड फील्ड बनाएँ
        pane.add(pwdT); // पैनल में पासवर्ड फील्ड जोड़ें

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // विंडो बंद होने पर एप्लिकेशन को समाप्त करें

        frame.setSize(200, 80); // फ्रेम का आकार सेट करें

        frame.setVisible(true); // फ्रेम को दृश्य बनाएं

    }
}
```

### व्याख्या:
- **JFrame**: एक विंडो `JFrame` का उपयोग करके बनाई जाती है।
- **JPanel**: फ्रेम का सामग्री पैनल प्राप्त किया जाता है और 2 पंक्तियों और 2 कॉलम में घटकों को व्यवस्थित करने के लिए ग्रिड लेआउट सेट किया जाता है।
- **JLabel**: लॉगिन और पासवर्ड फ़ील्ड के लिए लेबल बनाए जाते हैं ताकि उपयोगकर्ता को यह जानकारी दी जा सके कि क्या इनपुट अपेक्षित है।
- **JTextField**: उपयोगकर्ता के लॉगिन के लिए एक सामान्य टेक्स्ट फील्ड बनाया जाता है।
- **JPasswordField**: एक पासवर्ड फ़ील्ड बनाई जाती है, जो सुरक्षा उद्देश्यों के लिए टेक्स्ट इनपुट को छुपाती है।
- **विंडो गुण**: बंद करने की क्रिया को एप्लिकेशन को समाप्त करने के लिए सेट किया जाता है, फ्रेम का आकार परिभाषित किया जाता है, और फ्रेम को दृश्य बनाया जाता है।
