```java
package com.sunilos.p04controlstmt;

/**
 * Example program of SWITCH control statement that prints the name of the day.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class SwitchPrintDayName {

    public static void main(String[] args) {
        // सप्ताह के दिन को दर्शाने के लिए एक पूर्णांक चर परिभाषित करें
        int day = 1;
        String dayString = null; // दिन का नाम रखने के लिए चर

        // स्विच स्टेटमेंट जो दिन संख्या के आधार पर दिन का नाम निर्धारित करता है
        switch (day) {
            case 0:
                dayString = "Sunday"; // रविवार का नाम असाइन करें
                break;
            case 1:
                dayString = "Monday"; // सोमवार का नाम असाइन करें
                break;
            case 2:
                dayString = "Tuesday"; // मंगलवार का नाम असाइन करें
                break;
            case 3:
                dayString = "Wednesday"; // बुधवार का नाम असाइन करें
                break;
            case 4:
                dayString = "Thursday"; // गुरुवार का नाम असाइन करें
                break;
            case 5:
                dayString = "Friday"; // शुक्रवार का नाम असाइन करें
                break;
            case 6:
                dayString = "Saturday"; // शनिवार का नाम असाइन करें
                break;
            default:
                dayString = "This day yet to come, pl wait!!"; // अमान्य दिन संख्याओं के लिए संदेश
        }

        // दिन का नाम प्रिंट करें
        System.out.println(dayString);
    }
}
```

### व्याख्या:
- **`int day = 1;`**: एक चर `day` को 1 से प्रारंभ करता है, जो सोमवार को दर्शाता है।
- **`String dayString = null;`**: एक स्ट्रिंग चर `dayString` घोषित करता है जो दिन का नाम रखेगा।
- **`switch (day)`**: एक स्विच स्टेटमेंट शुरू करता है जो `day` के मान का मूल्यांकन करता है।
- **`case 1:`**: चेक करता है कि `day` 1 है। यदि सही है, तो "Monday" को `dayString` में असाइन करता है।
- **`break;`**: स्विच स्टेटमेंट से बाहर निकलता है ताकि अगले मामलों का निष्पादन न हो।
- **`default:`**: उन मानों को संभालता है जो मामलों में मेल नहीं खाते, अमान्य दिन संख्याओं के लिए एक संदेश असाइन करता है।
- **`System.out.println(dayString);`**: `day` के मान के आधार पर दिन का नाम प्रिंट करता है।
