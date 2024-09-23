```java
package com.sunilos.p05arrays;

/**
 * Test array basic operations
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestArray {

    public static void main(String[] args) {
        // पूर्णांकों का एक एरे घोषित करें
        int[] table;

        // 10 पूर्णांकों के लिए मेमोरी आवंटित करें
        table = new int[10];

        // एरे के तत्वों को मान सौंपें
        table[0] = 2;
        table[1] = 4;
        table[2] = 6;
        table[3] = 8;
        table[4] = 10;
        table[5] = 12;
        table[6] = 14;
        table[7] = 16;
        table[8] = 18;
        table[9] = 20;

        // एरे का 5वां तत्व (इंडेक्स 4) एक्सेस करें
        int ele = table[4];
        System.out.println("5th Element of Table " + ele);

        // एरे का आकार प्राप्त करें
        int size = table.length;
        System.out.println("Size of array is " + size);

        // एरे का क्लास नाम प्राप्त करें और प्रिंट करें
        String name = table.getClass().getName();
        System.out.println("Class name of Array " + name);

        // एरे के सभी तत्वों को प्रिंट करें
        for (int i = 0; i < size; i++) {
            System.out.println(i + " = " + table[i]);
        }
    }
}
```

### व्याख्या:
- यह प्रोग्राम पूर्णांक एरे पर बुनियादी संचालन को प्रदर्शित करता है, जिसमें घोषणा, मेमोरी आवंटन, मान असाइनमेंट, तत्व एक्सेस, आकार प्राप्ति, क्लास नाम प्राप्ति, और एरे में सभी तत्वों को प्रिंट करना शामिल है। यह विशेष रूप से 5वें तत्व, एरे के आकार, और एरे प्रकार के क्लास नाम को एक्सेस और प्रिंट करने का तरीका दिखाता है।
