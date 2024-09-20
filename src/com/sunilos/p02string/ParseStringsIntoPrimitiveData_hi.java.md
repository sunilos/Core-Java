```java
package com.sunilos.p02string;

/**
 * स्ट्रिंग्स को Wrapper क्लासेस का उपयोग करके प्रिमिटिव डेटा टाइप्स में बदलने का प्रोग्राम।
 * प्रत्येक Wrapper क्लास में एक स्टैटिक मेथड `parse<Type>()` होता है जो स्ट्रिंग को संबंधित प्रिमिटिव टाइप में बदलता है।
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class ParseStringsIntoPrimitiveData {

    public static void main(String[] args) {

        // स्ट्रिंग को byte वैल्यू में बदलें
        byte bt = Byte.parseByte("1");
        System.out.println("byte value " + bt);
        
        // स्ट्रिंग को short वैल्यू में बदलें
        short s = Short.parseShort("2");
        System.out.println("short value " + s);
        
        // स्ट्रिंग को int वैल्यू में बदलें
        int i = Integer.parseInt("3");
        System.out.println("int value " + i);
        
        // स्ट्रिंग को long वैल्यू में बदलें
        long l = Long.parseLong("4444");
        System.out.println("long value " + l);
        
        // स्ट्रिंग को float वैल्यू में बदलें
        float f = Float.parseFloat("5.2");
        System.out.println("float value " + f);
        
        // स्ट्रिंग को double वैल्यू में बदलें
        double d = Double.parseDouble("5.5");
        System.out.println("double value " + d);
        
        // स्ट्रिंग को boolean वैल्यू में बदलें
        boolean b = Boolean.parseBoolean("true");
        System.out.println("boolean value " + b);

    }
}
```

### सरल हिंदी में व्याख्या:
- **Wrapper क्लासेस**: जावा में प्रत्येक प्रिमिटिव टाइप का एक संबंधित Wrapper क्लास होता है (जैसे `Byte`, `Short`, `Integer`, `Long`, `Float`, `Double`, `Boolean`)।
- **parse<Type>() मेथड्स**: ये स्टैटिक मेथड्स स्ट्रिंग को संबंधित प्रिमिटिव टाइप में बदलने के लिए उपयोग किए जाते हैं।
  - `Byte.parseByte()`, `Short.parseShort()`, `Integer.parseInt()`, और `Long.parseLong()` स्ट्रिंग को एक न्यूमेरिक वैल्यू में बदलते हैं।
  - `Float.parseFloat()` और `Double.parseDouble()` स्ट्रिंग को फ्लोटिंग-पॉइंट वैल्यू में बदलते हैं।
  - `Boolean.parseBoolean()` स्ट्रिंग को बूलियन वैल्यू में बदलता है, जहाँ `"true"` (केस-इन्सेंसिटिव) के लिए `true` और अन्य के लिए `false` लौटाता है।
