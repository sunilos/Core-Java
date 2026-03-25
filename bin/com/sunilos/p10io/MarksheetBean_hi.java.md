```java
package com.sunilos.p10io;

import java.io.Serializable; // ऑब्जेक्ट सीरियलाइज़ेशन के लिए Serializable इंटरफेस को आयात करें

/**
 * एक सीरियलाइज़्ड क्लास जो एक छात्र के मार्कशीट डेटा को शामिल करती है।
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class MarksheetBean implements Serializable {

    // छात्र के नाम और मार्क्स को संग्रहीत करने के लिए इंस्टेंस वेरिएबल्स
    String name = null; // छात्र का नाम
    int maths = 0; // गणित में मार्क्स
    int physics = 0; // भौतिकी में मार्क्स
    int chemistry = 0; // रसायन विज्ञान में मार्क्स

    // transient वेरिएबल्स सीरियलाइज़ नहीं होंगे

    /**
     * total एक गणना की गई ट्रांज़ियेंट फील्ड है,
     */
    transient int total = 0; // कुल मार्क्स (सीरियलाइज़ नहीं किया गया)

    /**
     * Percentage एक गणना की गई ट्रांज़ियेंट फील्ड है
     */
    transient double percentage = 0; // प्रतिशत (सीरियलाइज़ नहीं किया गया)

    /**
     * ट्रांज़ियेंट अस्थायी वेरिएबल
     */
    transient int temp = 0; // अस्थायी वेरिएबल (सीरियलाइज़ नहीं किया गया)

    // प्रत्येक इंस्टेंस वेरिएबल के लिए गेटर और सेटर विधियाँ

    public String getName() {
        return name; // छात्र का नाम लौटाएँ
    }

    public void setName(String name) {
        this.name = name; // छात्र का नाम सेट करें
    }

    public int getMaths() {
        return maths; // गणित में मार्क्स लौटाएँ
    }

    public void setMaths(int maths) {
        this.maths = maths; // गणित में मार्क्स सेट करें
    }

    public int getPhysics() {
        return physics; // भौतिकी में मार्क्स लौटाएँ
    }

    public void setPhysics(int physics) {
        this.physics = physics; // भौतिकी में मार्क्स सेट करें
    }

    public int getChemistry() {
        return chemistry; // रसायन विज्ञान में मार्क्स लौटाएँ
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry; // रसायन विज्ञान में मार्क्स सेट करें
    }

    public int getTemp() {
        return temp; // अस्थायी वेरिएबल लौटाएँ
    }

    public void setTemp(int temp) {
        this.temp = temp; // अस्थायी वेरिएबल सेट करें
    }

    /**
     * कुल मार्क्स की गणना करता है।
     * 
     * @return कुल मार्क्स
     */
    public int getTotal() {
        total = maths + physics + chemistry; // कुल मार्क्स की गणना करें
        return total; // कुल मार्क्स लौटाएँ
    }

    /**
     * मार्क्स का प्रतिशत गणना करता है।
     * 
     * @return प्रतिशत
     */
    public double getPercentage() {
        percentage = total / 3.0; // प्रतिशत की गणना करें (3.0 का उपयोग करें ताकि डबल विभाजन सुनिश्चित हो)
        return percentage; // प्रतिशत लौटाएँ
    }
}
```

### मुख्य भागों की व्याख्या:

- **Serializable इंटरफेस**: `Serializable` इंटरफेस सीरियलाइज़ेशन को सक्षम करता है, जिससे इस क्लास के ऑब्जेक्ट्स को स्टोरेज या ट्रांसमिशन के लिए बाइट स्ट्रीम में परिवर्तित किया जा सकता है।

- **इंस्टेंस वेरिएबल्स**: 
  - `name`: छात्र का नाम संग्रहीत करता है।
  - `maths`, `physics`, `chemistry`: संबंधित विषयों में प्राप्त मार्क्स को संग्रहीत करते हैं।

- **Transient वेरिएबल्स**: 
  - `transient` के रूप में चिह्नित वेरिएबल्स (जैसे `total`, `percentage`, और `temp`) सीरियलाइज़ नहीं होते, अर्थात् जब ऑब्जेक्ट सीरियलाइज़ किया जाता है, तो उनके मानों को संग्रहीत नहीं किया जाता है। यह उन गणना की गई फ़ील्ड्स के लिए उपयोगी है जिन्हें अन्य डेटा से निकाला जा सकता है।

- **गेटर्स और सेटर**: निजी इंस्टेंस वेरिएबल्स को एक्सेस और संशोधित करने के लिए विधियाँ। यह इनकैप्सुलेशन का एक प्रमुख सिद्धांत है जो ऑब्जेक्ट-उन्मुख प्रोग्रामिंग में महत्वपूर्ण है।

- **कुल और प्रतिशत की गणना**:
  - `getTotal()`: प्रत्येक विषय में मार्क्स के आधार पर कुल मार्क्स की गणना और उसे लौटाता है।
  - `getPercentage()`: कुल मार्क्स के आधार पर प्रतिशत की गणना करता है। यह परिणाम सुनिश्चित करने के लिए `3.0` से विभाजित करता है कि परिणाम डबल हो।
