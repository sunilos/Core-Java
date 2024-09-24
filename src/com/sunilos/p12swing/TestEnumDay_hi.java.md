
```java
package com.sunilos.p12swing;

/**
 * दिन के लिए enum कक्षा का परीक्षण
 * 
 * @संस्करण 1.0
 * @तारीख 16 नवम्बर 2014
 * @लेखक सुनिल साहू
 * @कॉपीराइट (c) सुनिल साहू
 * @वेबसाइट www.sunilbooks.com
 * 
 */

public class TestEnumDay {

    public static void main(String[] args) {

        // FRIDAY के लिए Day enum का एक उदाहरण बनाएं
        Day fd = Day.FRIDAY;
        System.out.println(fd.getWeekDay()); // दिन का संख्यात्मक मान प्रिंट करें

        // चुने गए दिन के आधार पर संदेश प्रिंट करने के लिए स्विच स्टेटमेंट
        switch (fd) {
            case MONDAY:
                System.out.println("सोमवार बुरे होते हैं।");
                break;
            case FRIDAY:
                System.out.println("शुक्रवार बेहतर होते हैं।");
                break;
            case SATURDAY:
                System.out.println("शनिवार कूल हैं !!!!");
                break;
            case SUNDAY:
                System.out.println("चलो आराम करें, यह रविवार है!!!!");
                break;
        }

        // Day enum में परिभाषित सभी दिनों को प्रिंट करें
        Day[] days = Day.values();
        for (Day d : days) {
            System.out.println(d);
        }
    }

    /**
     * आउटपुट 
     * 5 
     * शुक्रवार बेहतर होते हैं। 
     * रविवार 
     * सोमवार 
     * मंगलवार 
     * बुधवार 
     * गुरुवार 
     * शुक्रवार 
     * शनिवार
     */
}
```

### व्याख्या:
- **Enum उपयोग**: `Day` enum का उपयोग सप्ताह के दिनों का प्रतिनिधित्व करने के लिए किया जाता है। वेरिएबल `fd` को `Day.FRIDAY` पर सेट किया गया है।
- **मेथड कॉल**: `getWeekDay()` मेथड (जो कि `Day` enum में होना चाहिए) दिन का संख्यात्मक प्रतिनिधित्व प्रिंट करता है।
- **स्विच स्टेटमेंट**: एक स्विच-केस संरचना का उपयोग करके `fd` के मान के आधार पर विभिन्न संदेश प्रदर्शित किए जाते हैं।
- **Enum मानों का पुनरावृत्ति**: `values()` मेथड का उपयोग करके सभी `Day` के उदाहरणों को प्राप्त किया जाता है, जिन्हें एक लूप में प्रिंट किया जाता है।

