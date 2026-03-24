
```java
package com.sunilos.p06oop;

/**
 * ICICIBank क्लास ICICI बैंक के विशेष गुणों का प्रतिनिधित्व करती है।
 * यह Bank क्लास की एक बाल क्लास है, जो मेथड ओवरराइडिंग 
 * और रनटाइम (डायनामिक) पॉलीमोर्फिज्म का प्रदर्शन करती है।
 * 
 * @version 1.0
 * @since 16 नवंबर 2014
 * @author सुनील साहू
 * @Copyright (c) सुनील साहू
 * @url www.sunilbooks.com
 */
public class ICICIBank extends Bank {

    /**
     * Bank क्लास से interestRate मेथड को ओवरराइड करता है।
     * ICICI बैंक की विशेष ब्याज दर प्रदान करता है।
     * 
     * @return ICICI बैंक के लिए ब्याज दर, जो कि 9.75 है।
     */
    @Override
    public double interestRate() {
        return 9.75;
    }

    /**
     * Bank क्लास से getName मेथड को ओवरराइड करता है।
     * बैंक का नाम "ICICI Bank" के रूप में लौटाता है।
     * 
     * @return बैंक का नाम, जो "ICICI Bank" है।
     */
    @Override
    public String getName() {
        return "ICICI Bank";
    }
}
```

### विवरण:

- **मेथड ओवरराइडिंग:** `ICICIBank` क्लास `interestRate()` और `getName()` मेथड्स को ओवरराइड करती है, जो `Bank` क्लास से विरासत में मिली हैं, और ICICI बैंक के लिए विशिष्ट कार्यान्वयन प्रदान करती है।
- **रनटाइम पॉलीमोर्फिज्म:** ये ओवरराइडेड मेथड्स रनटाइम पर तब कॉल किए जाएंगे जब `ICICIBank` के ऑब्जेक्ट्स को `Bank` रेफरेंस के माध्यम से उपयोग किया जाएगा, जो डायनामिक मेथड समाधान का प्रदर्शन करता है।
