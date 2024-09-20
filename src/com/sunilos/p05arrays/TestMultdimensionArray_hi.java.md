```java
package com.sunilos.p05arrays;

/**
 * Test multi-dimension array basic operations
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestMultdimensionArray {

    public static void main(String[] args) {
        // 10 पंक्तियों और 2 स्तंभों के साथ एक 2D पूर्णांक एरे घोषित करें
        int[][] tables = new int[10][2];

        // एरे के पहले स्तंभ (स्तंभ #1) को प्रारंभ करें
        tables[0][0] = 2;
        tables[1][0] = 4;
        tables[2][0] = 6;
        tables[3][0] = 8;
        tables[4][0] = 10;
        tables[5][0] = 12;
        tables[6][0] = 14;
        tables[7][0] = 16;
        tables[8][0] = 18;
        tables[9][0] = 20;

        // एरे के दूसरे स्तंभ (स्तंभ #2) को प्रारंभ करें
        tables[0][1] = 3;
        tables[1][1] = 6;
        tables[2][1] = 9;
        tables[3][1] = 12;
        tables[4][1] = 15;
        tables[5][1] = 18;
        tables[6][1] = 21;
        tables[7][1] = 24;
        tables[8][1] = 27;
        tables[9][1] = 30;

        // टेबल का शीर्षक प्रिंट करें
        System.out.println("Tables ");
        System.out.println("#2\t#3");

        // 2D एरे की पंक्तियों के माध्यम से इटरेट करें
        for (int row = 0; row < tables.length; row++) {
            // वर्तमान पंक्ति के स्तंभों के माध्यम से इटरेट करें
            for (int col = 0; col < tables[0].length; col++) {
                System.out.print(tables[row][col] + "\t"); // वर्तमान तत्व प्रिंट करें
            }
            System.out.println(); // एक पंक्ति प्रिंट करने के बाद अगली लाइन पर जाएं
        }

        // पूर्णांकों के लिए एक 3D एरे घोषित करें
        int[][][] threeD = new int[10][3][2];
        threeD[0][1][1] = 100; // 3D एरे में एक विशेष तत्व को मान सौंपें

        // पूर्णांकों के लिए एक 4D एरे घोषित करें
        int[][][][] fourD = new int[10][3][2][3];
        fourD[0][1][1][0] = 100; // 4D एरे में एक विशेष तत्व को मान सौंपें
    }
}
```

### व्याख्या:
- यह प्रोग्राम जावा में मल्टी-डायमेंशनल एरे पर बुनियादी संचालन को प्रदर्शित करता है, जिसमें घोषणा, प्रारंभिककरण, और तत्वों का एक्सेस शामिल है।
- यह विशेष मानों के साथ एक 2D एरे को प्रारंभ करता है, इसकी सामग्री को एक टेबल फॉर्मेट में प्रिंट करता है, और 3D और 4D एरे में तत्वों को घोषित और एक्सेस करने का तरीका दिखाता है।
