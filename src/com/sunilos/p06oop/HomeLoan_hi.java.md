यहां `HomeLoan` क्लास का सरल हिंदी में अनुवाद है:

```java
package com.sunilos.p06oop;

/**
 * HomeLoan क्लास होम लोन के ब्याज दरों की गणना करती है 
 * और Bank क्लास और इसकी बाल क्लासेस (AxisBank, HDFCBank, ICICIBank) का उपयोग करके 
 * रनटाइम (डायनामिक) पॉलीमोर्फिज्म का प्रदर्शन करती है।
 * 
 * @version 1.0
 * @since 16 नवंबर 2014
 * @author सुनील साहू
 * @Copyright (c) सुनील साहू
 * @url www.sunilbooks.com
 */
public class HomeLoan {

    public static void main(String[] args) {
        // विभिन्न Bank ऑब्जेक्ट्स को रखने के लिए Bank रेफरेंस का एक ऐरे बनाना।
        Bank[] banks = new Bank[3];
        banks[0] = new AxisBank();   // AxisBank ऑब्जेक्ट को Bank रेफरेंस पर असाइन किया गया
        banks[1] = new HDFCBank();   // HDFCBank ऑब्जेक्ट को Bank रेफरेंस पर असाइन किया गया
        banks[2] = new ICICIBank();  // ICICIBank ऑब्जेक्ट को Bank रेफरेंस पर असाइन किया गया
        
        // Bank ऑब्जेक्ट्स के ऐरे को पास करके loanEnquiry मेथड को कॉल करना
        loanEnquiry(banks);
    }

    public static void loanEnquiry(Bank[] banks) {
        // Bank रेफरेंस के ऐरे के माध्यम से लूप करना
        for (Bank b : banks) {
            // रनटाइम में, विशेष बैंक ऑब्जेक्ट (AxisBank, HDFCBank, ICICIBank) के 
            // लिए उपयुक्त getName और interestRate मेथड्स कॉल किए जाएंगे।
            String name = b.getName();    // विशेष बैंक का नाम प्राप्त करना
            double rate = b.interestRate(); // विशेष बैंक की ब्याज दर प्राप्त करना
            System.out.print(name + " = " + rate); // बैंक का नाम और ब्याज दर प्रदर्शित करना
        }
    }
}
```

### विवरण:

- **रनटाइम पॉलीमोर्फिज्म:** `banks` ऐरे में विभिन्न ऑब्जेक्ट्स (जैसे `AxisBank`, `HDFCBank`, `ICICIBank`) हैं, लेकिन प्रत्येक ऑब्जेक्ट को सामान्य पैरेंट प्रकार `Bank` के माध्यम से एक्सेस किया गया है। `getName()` और `interestRate()` मेथड्स के कॉल रनटाइम पर उस वास्तविक ऑब्जेक्ट प्रकार के आधार पर हल किए जाते हैं, जो डायनामिक पॉलीमोर्फिज्म का प्रदर्शन करते हैं।
- **Bank रेफरेंस का ऐरे:** यह विभिन्न `Bank` की बाल क्लासेस को एक ही ऐरे में स्टोर करने की अनुमति देता है, जिससे पॉलीमोर्फिक व्यवहार संभव होता है।
