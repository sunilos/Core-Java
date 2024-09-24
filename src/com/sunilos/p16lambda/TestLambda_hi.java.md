
```java
package com.sunilos.p16lambda;

/**
 * Lambda functions के लिए टेस्ट क्लास
 * 
 * @लेखक Sunil Sahu
 */
public class TestLambda {

    public static void main(String[] args) {
        // पारंपरिक तरीके से गुमनाम ऑब्जेक्ट
        HelloInt aFun = new HelloInt() {
            public void say() {
                System.out.println("Hello anonymous conventional function");
            }
        };

        aFun.say(); // पारंपरिक गुमनाम फ़ंक्शन के मेथड को कॉल करें

        // Lambda फ़ंक्शन का उपयोग करके गुमनाम ऑब्जेक्ट
        HelloInt lambFun = () -> System.out.println("Hello anonymous lambda function");
        lambFun.say(); // Lambda फ़ंक्शन के मेथड को कॉल करें

        // Math फ़ंक्शनल इंटरफेस के लिए जोड़ने की lambda इम्प्लिमेंटेशन
        MathInt add = (a, b) -> a + b; // सरलीकृत lambda अभिव्यक्ति

        // Math फ़ंक्शनल इंटरफेस के लिए गुणा की lambda इम्प्लिमेंटेशन
        MathInt multiply = (a, b) -> a * b; // सरलीकृत lambda अभिव्यक्ति

        // Math फ़ंक्शनल इंटरफेस के लिए घटाव की lambda इम्प्लिमेंटेशन
        MathInt subtract = (a, b) -> a - b; // सरलीकृत lambda अभिव्यक्ति

        int a = 10;
        int b = 5;

        // गणना करें और परिणाम प्रिंट करें
        System.out.println("जोड़ें: " + add.calculate(a, b));
        System.out.println("गुणा करें: " + multiply.calculate(a, b));
        System.out.println("घटाएँ: " + subtract.calculate(a, b));

        // Lambda फ़ंक्शन में मेथड रेफरेंस
        GreetingInt g = System.out::println; // `println` के लिए मेथड रेफरेंस
        g.hello("Ram"); // "Ram" के साथ `hello` मेथड को कॉल करें
        g.hello("Shyam"); // "Shyam" के साथ `hello` मेथड को कॉल करें
    }
}

// फ़ंक्शनल इंटरफेस जिसमें एक एकल अमूर्त मेथड होता है
@FunctionalInterface
interface HelloInt {
    public void say();
}

// नाम के साथ स्वागत के लिए फ़ंक्शनल इंटरफेस
@FunctionalInterface
interface GreetingInt {
    public void hello(String name);
}

// गणितीय ऑपरेशन्स के लिए फ़ंक्शनल इंटरफेस
@FunctionalInterface
interface MathInt {
    public int calculate(int a, int b);
}
```

### व्याख्या:

- **मुख्य क्लास (`TestLambda`)**:
  - **मुख्य विधि**: Lambda functions और मेथड रेफरेंस का उपयोग दर्शाती है।

- **गुमनाम ऑब्जेक्ट्स**:
  - **पारंपरिक तरीका**: `HelloInt` इंटरफेस को गुमनाम रूप से लागू करने वाली एक क्लास बनाता है, जो एक ग्रीटिंग प्रिंट करती है।
  - **Lambda फ़ंक्शन**: Lambda अभिव्यक्ति का उपयोग करके उसी इंटरफेस को अधिक संक्षेप में लागू करता है।

- **गणितीय ऑपरेशन्स**:
  - तीन Lambda अभिव्यक्तियाँ `MathInt` इंटरफेस को लागू करती हैं: जोड़ने, गुणा करने, और घटाने के लिए। प्रत्येक ऑपरेशन दो integer पैरामीटर लेता है और एक integer परिणाम लौटाता है।

- **मेथड रेफरेंस**:
  - `GreetingInt` इंटरफेस के लिए `System.out.println` का मेथड रेफरेंस उपयोग करता है। यह नाम के साथ `hello` मेथड को कॉल करने की अनुमति देता है, जो इसे प्रिंट करता है।

### फ़ंक्शनल इंटरफेस:
- प्रत्येक इंटरफेस (`HelloInt`, `GreetingInt`, `MathInt`) को `@FunctionalInterface` एनोटेशन के साथ चिह्नित किया गया है, जो सुनिश्चित करता है कि इंटरफेस में केवल एक अमूर्त मेथड हो, जिससे Lambda अभिव्यक्ति के साथ इसका उपयोग हो सके।

### सारांश:
यह क्लास Lambda अभिव्यक्तियों और मेथड रेफरेंस का उपयोग दिखाती है, पारंपरिक गुमनाम क्लासों की तुलना में इनका उपयोग कैसे अधिक संक्षिप्त और सरल हो सकता है। यह फ़ंक्शनल इंटरफेस की अवधारणा को भी उजागर करती है, जो Lambda अभिव्यक्तियों के लिए आवश्यक है।
