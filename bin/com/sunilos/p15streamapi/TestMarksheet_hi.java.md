
```java
package com.sunilos.p15streamapi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * एक टेक्स्ट फ़ाइल से डेटा पढ़ें; टेक्स्ट फ़ाइल में कॉमा से अलग किए गए मान होते हैं।
 * पढ़ी गई पंक्तियों को Marksheet ऑब्जेक्ट्स में परिवर्तित किया जाता है, और फिर Marksheet डेटा प्रिंट किया जाता है।
 * 
 * टेक्स्ट फ़ाइल marksheets.txt में निम्नलिखित कॉमा से अलग किया गया डेटा होता है:
 * ---फ़ाइल डेटा ----
 * Ram,80,70,60
 * Shyam,80,80,79
 * Ajay,90,80,60
 * Vijay,70,80,60
 * Jay,85,75
 * Pappu,45,30,67
 * 
 * @लेखक SunilOS
 */
public class TestMarksheet {

    public static void main(String[] args) throws Exception {

        // 1. marksheets.txt फ़ाइल पढ़ें
        // 2. कॉमा-सेपरेटेड वैल्यूज को विभाजित करें
        // 3. अमान्य इनपुट को फ़िल्टर करें
        // 4. Marksheet ऑब्जेक्ट बनाएँ
        // 5. डेटा प्रिंट करें

        try (Stream<String> stream = Files.lines(Paths.get("marksheets.txt"))) {
            stream.map(e -> e.split(",")) // प्रत्येक लाइन को कॉमा द्वारा विभाजित करते हैं
                  .filter(e -> e.length == 4) // उन पंक्तियों को फ़िल्टर करते हैं जिनमें ठीक 4 मान नहीं हैं
                  .map(x -> new Marksheet(x[0], Integer.parseInt(x[1]), Integer.parseInt(x[2]), Integer.parseInt(x[3]))) // Marksheet ऑब्जेक्ट बनाते हैं
                  .forEach(e -> { // प्रत्येक Marksheet का विवरण प्रिंट करते हैं
                      System.out.print("नाम: " + e.name);
                      System.out.print(" भौतिकी: " + e.physics);
                      System.out.print(" रसायन: " + e.chemistry);
                      System.out.println(" गणित: " + e.maths);
                  });
        } catch (IOException e) {
            e.printStackTrace(); // किसी भी IO अपवाद के लिए स्टैक ट्रेस प्रिंट करते हैं
        }
    }

}

/**
 * Marksheet डेटा संग्रहित करता है
 */
class Marksheet {

    public String name = null;
    public int physics = 0;
    public int chemistry = 0;
    public int maths = 0;

    public Marksheet(String n, int p, int c, int m) {
        name = n;
        physics = p;
        chemistry = c;
        maths = m;
    }
}
```

### व्याख्या:
- **Marksheet वर्ग**: यह वर्ग एक छात्र की मार्कशीट की जानकारी को संलग्न करता है, जिसमें नाम और तीन विषयों (भौतिकी, रसायन, और गणित) में अंक शामिल हैं। इसमें इन फ़ील्ड्स को प्रारंभ करने के लिए एक कंस्ट्रक्टर है।

- **मुख्य वर्ग (`TestMarksheet`)**:
  - **फ़ाइल पढ़ना**: प्रोग्राम `Files.lines()` का उपयोग करता है ताकि `marksheets.txt` फ़ाइल की सभी पंक्तियों को एक स्ट्रीम के रूप में पढ़ सके।
  
  - **स्ट्रीम प्रोसेसिंग**:
    - `map(e -> e.split(","))`: प्रत्येक पंक्ति को कॉमा द्वारा विभाजित किया जाता है और इसे स्ट्रिंग्स की एक सूची में बदल दिया जाता है।
    - `filter(e -> e.length == 4)`: यह उन पंक्तियों को फ़िल्टर करता है जिनमें ठीक चार तत्व नहीं हैं (नाम + तीन अंक)।
    - `map(x -> new Marksheet(...))`: प्रत्येक मान्य स्ट्रिंग्स की सूची के लिए, एक नया `Marksheet` ऑब्जेक्ट बनाया जाता है, और अंक इंटेजर में परिवर्तित किए जाते हैं।
    - `forEach(...)`: अंत में, प्रत्येक `Marksheet` ऑब्जेक्ट का विवरण कंसोल पर प्रिंट किया जाता है।

- **अपवाद प्रबंधन**: प्रोग्राम में `try-with-resources` स्टेटमेंट शामिल है ताकि स्ट्रीम सही ढंग से बंद हो जाए, और किसी भी `IOException` को पकड़ा और प्रिंट किया जा सके।

यह कोड दिखाता है कि कैसे एक टेक्स्ट फ़ाइल से डेटा पढ़ा जाए, उसे जावा स्ट्रीम्स का उपयोग करके प्रोसेस किया जाए, और उस डेटा से ऑब्जेक्ट्स बनाए जाएं। यह फ़ाइल I/O और फंक्शनल प्रोग्रामिंग तकनीकों को एक साथ प्रभावी ढंग से जोड़ता है।
