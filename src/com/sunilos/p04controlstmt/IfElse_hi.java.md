```java
package com.sunilos.p04controlstmt;

/**
 * एक सरल उदाहरण JAVA में जो कीमत के आधार पर एक संदेश प्रिंट करेगा।
 * यह प्रोग्राम if-else बयान के उपयोग को दर्शाता है।
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class IfElse {

    public static void main(String[] args) {
        // कीमत का मान प्रारंभ करें
        int price = 100;

        // चेक करें कि कीमत 100 से अधिक है या नहीं
        if (price > 100) {
            // अगर सही है, तो यह संदेश प्रिंट करें
            System.out.println("Wow !! मैं Pizza खरीद सकता हूँ");
        } else {
            // अगर गलत है, तो यह संदेश प्रिंट करें
            System.out.println("Oh !! मैं Pizza नहीं खरीद सकता");
        }
    }
}
```

### व्याख्या:
- **`int price = 100;`**: एक चर `price` को 100 के मान से प्रारंभ करता है।
- **`if (price > 100)`**: एक if बयान है जो चेक करता है कि `price` का मान 100 से अधिक है या नहीं।
- **`System.out.println("Wow !! मैं Pizza खरीद सकता हूँ");`**: अगर if बयान की शर्त सही है, तो यह संदेश प्रिंट होता है, यह बताता है कि Pizza खरीदने की क्षमता है।
- **`else`**: अगर if बयान की शर्त गलत है, तो एक वैकल्पिक क्रिया परिभाषित करता है।
- **`System.out.println("Oh !! मैं Pizza नहीं खरीद सकता");`**: अगर if बयान की शर्त गलत है, तो यह संदेश प्रिंट होता है, यह बताता है कि Pizza खरीदने की क्षमता नहीं है।
