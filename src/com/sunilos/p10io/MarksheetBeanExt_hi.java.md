```java
package com.sunilos.p10io;

import java.io.Externalizable; // कस्टम सीरियलाइज़ेशन के लिए Externalizable इंटरफेस को आयात करें
import java.io.IOException; // इनपुट/आउटपुट एक्सेप्शंस को हैंडल करने के लिए IOException को आयात करें
import java.io.ObjectInput; // सीरियलाइज़्ड ऑब्जेक्ट्स को पढ़ने के लिए ObjectInput को आयात करें
import java.io.ObjectOutput; // सीरियलाइज़्ड ऑब्जेक्ट्स को लिखने के लिए ObjectOutput को आयात करें

/**
 * एक उदाहरण Externalizable इंटरफेस का जो एक ट्रांज़ियेंट वेरिएबल को सीरियलाइज़ करता है।
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class MarksheetBeanExt implements Externalizable {

    // छात्र के मार्क्स और नाम को संग्रहीत करने के लिए इंस्टेंस वेरिएबल्स
    String name = null; // छात्र का नाम
    int maths = 0; // गणित में मार्क्स
    int physics = 0; // भौतिकी में मार्क्स
    int chemistry = 0; // रसायन विज्ञान में मार्क्स

    // ट्रांज़ियेंट वेरिएबल्स जिन्हें इस कार्यान्वयन में सीरियलाइज़ किया जाएगा
    /**
     * total एक गणना की गई ट्रांज़ियेंट फील्ड है,
     */
    transient int total = 0; // कुल मार्क्स (डिफ़ॉल्ट रूप से सीरियलाइज़ नहीं किया गया)

    /**
     * Percentage एक गणना की गई ट्रांज़ियेंट फील्ड है
     */
    transient double percentage = 0; // प्रतिशत (डिफ़ॉल्ट रूप से सीरियलाइज़ नहीं किया गया)

    /**
     * ट्रांज़ियेंट अस्थायी वेरिएबल
     */
    transient int temp = 0; // अस्थायी वेरिएबल (डिफ़ॉल्ट रूप से सीरियलाइज़ नहीं किया गया)

    // इंस्टेंस वेरिएबल्स के लिए गेटर और सेटर विधियाँ
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

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        // इनपुट स्ट्रीम से गैर-ट्रांज़ियेंट फ़ील्ड्स को डीसीरियलाइज़ करें
        name = (String) in.readObject(); // नाम पढ़ें
        physics = in.readInt(); // भौतिकी में मार्क्स पढ़ें
        chemistry = in.readInt(); // रसायन विज्ञान में मार्क्स पढ़ें
        maths = in.readInt(); // गणित में मार्क्स पढ़ें
        // ट्रांज़ियेंट वेरिएबल को डीसीरियलाइज़ करें
        temp = in.readInt(); // ट्रांज़ियेंट वेरिएबल पढ़ें
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        // आउटपुट स्ट्रीम में गैर-ट्रांज़ियेंट फ़ील्ड्स को सीरियलाइज़ करें
        out.writeObject(name); // नाम लिखें
        out.writeInt(physics); // भौतिकी में मार्क्स लिखें
        out.writeInt(chemistry); // रसायन विज्ञान में मार्क्स लिखें
        out.writeInt(maths); // गणित में मार्क्स लिखें
        // ट्रांज़ियेंट वेरिएबल को सीरियलाइज़ करें
        out.writeInt(temp); // ट्रांज़ियेंट वेरिएबल लिखें
    }
}
```

### मुख्य भागों की व्याख्या:

- **Externalizable इंटरफेस**: `Serializable` के विपरीत, `Externalizable` इंटरफेस आवश्यक बनाता है कि क्लास सीरियलाइज़ेशन और डीसीरियलाइज़ेशन के लिए विधियों को स्पष्ट रूप से कार्यान्वित करे, जिससे प्रक्रिया पर अधिक नियंत्रण मिलता है।

- **इंस्टेंस वेरिएबल्स**: क्लास में छात्र के नाम और मार्क्स के लिए फ़ील्ड्स हैं। ट्रांज़ियेंट फ़ील्ड्स को परिभाषित किया गया है लेकिन केवल तब सीरियलाइज़ किया जाएगा जब इसे स्पष्ट रूप से हैंडल किया जाए।

- **गेटर्स और सेटर**: निजी फ़ील्ड्स को एक्सेस और संशोधित करने के लिए विधियाँ, जो इनकैप्सुलेशन के सिद्धांतों का पालन करती हैं।

- **readExternal विधि**: यह विधि डीसीरियलाइज़ेशन के दौरान कॉल की जाती है। यह ऑब्जेक्ट के राज्य को `ObjectInput` स्ट्रीम से पढ़ती है, जिसमें गैर-ट्रांज़ियेंट फ़ील्ड्स और ट्रांज़ियेंट `temp` वेरिएबल शामिल हैं।

- **writeExternal विधि**: यह विधि सीरियलाइज़ेशन के दौरान कॉल की जाती है। यह ऑब्जेक्ट के राज्य को `ObjectOutput` स्ट्रीम में लिखती है, जिसमें ट्रांज़ियेंट `temp` वेरिएबल भी शामिल है, जिससे इसे सीरियलाइज़ किया जा सके।
