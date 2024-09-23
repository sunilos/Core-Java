```java
package com.sunilos.p04controlstmt;

/**
 * Example program of SWITCH control statement that applies to String.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class SwitchApplyToString {

    public static void main(String[] args) {

        // महीने का नाम रखने के लिए एक चर परिभाषित करें
        String month = "March";

        // महीने का निर्धारण करने के लिए स्विच स्टेटमेंट
        switch (month) {

            case "January":
                // अगर महीने का नाम जनवरी है, तो संबंधित संदेश प्रिंट करें
                System.out.println("1st Month of The Year");
                break;
            case "February":
                // अगर महीने का नाम फरवरी है, तो संबंधित संदेश प्रिंट करें
                System.out.println("2nd Month of The Year");
                break;
            case "March":
                // अगर महीने का नाम मार्च है, तो संबंधित संदेश प्रिंट करें
                System.out.println("3rd Month of The Year");
                break;
            case "April":
                // अगर महीने का नाम अप्रैल है, तो संबंधित संदेश प्रिंट करें
                System.out.println("4th Month of The Year");
                break;
            case "May":
                // अगर महीने का नाम मई है, तो संबंधित संदेश प्रिंट करें
                System.out.println("5th Month of The Year");
                break;
            case "June":
                // अगर महीने का नाम जून है, तो संबंधित संदेश प्रिंट करें
                System.out.println("6th Month of The Year");
                break;
            case "July":
                // अगर महीने का नाम जुलाई है, तो संबंधित संदेश प्रिंट करें
                System.out.println("7th Month of The Year");
                break;
            case "August":
                // अगर महीने का नाम अगस्त है, तो संबंधित संदेश प्रिंट करें
                System.out.println("8th Month of The Year");
                break;
            case "September":
                // अगर महीने का नाम सितंबर है, तो संबंधित संदेश प्रिंट करें
                System.out.println("9th Month of The Year");
                break;
            case "October":
                // अगर महीने का नाम अक्टूबर है, तो संबंधित संदेश प्रिंट करें
                System.out.println("10th Month of The Year");
                break;
            case "November":
                // अगर महीने का नाम नवंबर है, तो संबंधित संदेश प्रिंट करें
                System.out.println("11th Month of The Year");
                break;
            case "December":
                // अगर महीने का नाम दिसंबर है, तो संबंधित संदेश प्रिंट करें
                System.out.println("12th Month of The Year");
                break;
        }
    }
}
```

### व्याख्या:
- **`String month = "March";`**: एक चर `month` को "March" से प्रारंभ करता है।
- **`switch (month)`**: एक स्विच स्टेटमेंट शुरू करता है जो `month` के मान का मूल्यांकन करता है।
- **`case "March":`**: चेक करता है कि `month` "March" है। यदि सही है, तो निम्नलिखित स्टेटमेंट निष्पादित करता है।
- **`System.out.println("3rd Month of The Year");`**: मार्च के लिए संबंधित संदेश प्रिंट करता है।
- **`break;`**: स्विच स्टेटमेंट से बाहर निकलता है ताकि अगले मामलों का निष्पादन न हो।
- अन्य `case` स्टेटमेंट अन्य महीनों की जांच करते हैं, प्रत्येक अपने संबंधित क्रमांकित संदेश को प्रिंट करता है।
