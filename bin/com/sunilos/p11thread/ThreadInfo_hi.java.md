
```java
package com.sunilos.p11thread;

/**
 * ThreadInfo क्लास JVM में चल रहे सभी थ्रेड्स और थ्रेड समूहों की विस्तृत जानकारी प्रिंट करती है।
 * 
 * यह रूट थ्रेड समूह के माध्यम से नेविगेट करती है और प्रत्येक थ्रेड 
 * और थ्रेड समूह की जानकारी लॉग करती है, जिसमें उनके नाम, ID, प्राथमिकता, स्थिति,
 * और क्या वे डेमन थ्रेड हैं, शामिल हैं।
 * 
 * @संस्करण 1.0
 * @तारीख 16 नवम्बर 2014
 * @लेखक सुनिल साहू
 * @कॉपीराइट (c) सुनिल साहू
 * @वेबसाइट www.sunilbooks.com
 */
public class ThreadInfo {

    /**
     * मुख्य() मेथड रूट ThreadGroup को प्राप्त करता है और सभी थ्रेड्स और समूहों की जानकारी प्रिंट करता है।
     * 
     * @param args कमांड-लाइन तर्क।
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        // वर्तमान थ्रेड (जो इस प्रोग्राम को चला रहा है) प्राप्त करें
        Thread t = Thread.currentThread();

        // वर्तमान थ्रेड के थ्रेड समूह को प्राप्त करें
        ThreadGroup tg = t.getThreadGroup();

        // रूट ThreadGroup (हायरार्की में सबसे उच्च पेरेंट) पर नेविगेट करें
        while (tg.getParent() != null) {
            tg = tg.getParent();
        }

        // रूट ThreadGroup और इसके सभी थ्रेड्स और उपसमूहों की जानकारी प्रिंट करें
        info("", tg);
    }

    /**
     * एक थ्रेड समूह और उसके थ्रेड्स की जानकारी को पुनरावृत्तिपूर्ण रूप से प्रिंट करता है।
     * 
     * @param indent आउटपुट को फॉर्मेट करने के लिए इंडेंटेशन के लिए उपयोग की जाने वाली स्ट्रिंग।
     * @param tg     वह थ्रेड समूह जिसकी जानकारी प्रिंट की जानी है।
     */
    public static void info(String indent, ThreadGroup tg) {

        // थ्रेड समूह में सक्रिय थ्रेड्स की गणना प्राप्त करें
        int threadCount = tg.activeCount();

        // थ्रेड समूह में सभी सक्रिय थ्रेड्स को रखने के लिए एक एरे बनाएं
        Thread[] threads = new Thread[threadCount];
        tg.enumerate(threads); // सक्रिय थ्रेड्स के साथ थ्रेड्स एरे को भरें

        // थ्रेड समूह की जानकारी प्रिंट करें
        System.out.println(indent + "थ्रेड समूह का नाम: " + tg.getName());
        System.out.println(indent + "क्या यह डेमन है: " + tg.isDaemon());

        // समूह में प्रत्येक थ्रेड के लिए विवरण लॉग करें
        for (int i = 0; i < threads.length; i++) {
            log(indent + "\t", threads[i]);
        }

        // थ्रेड समूह में सक्रिय उपसमूहों की गणना प्राप्त करें
        int groupCount = tg.activeGroupCount();

        // सक्रिय थ्रेड उपसमूहों को रखने के लिए एक एरे बनाएं
        ThreadGroup[] groups = new ThreadGroup[groupCount];
        tg.enumerate(groups); // सक्रिय उपसमूहों के साथ समूह एरे को भरें

        // प्रत्येक उपसमूह के लिए जानकारी पुनरावृत्तिपूर्ण रूप से प्रिंट करें
        for (int i = 0; i < groups.length; i++) {
            info(indent + "\t", groups[i]);
        }
    }

    /**
     * एक विशिष्ट थ्रेड की जानकारी प्रिंट करता है।
     * 
     * @param indent आउटपुट को फॉर्मेट करने के लिए इंडेंटेशन के लिए उपयोग की जाने वाली स्ट्रिंग।
     * @param t      वह थ्रेड जिसकी जानकारी प्रिंट की जानी है।
     */
    public static void log(String indent, Thread t) {
        System.out.println(indent + "थ्रेड का नाम: " + t.getName());
        System.out.println(indent + "ID: " + t.getId());
        System.out.println(indent + "प्राथमिकता: " + t.getPriority());
        System.out.println(indent + "स्थिति: " + t.getState());
        System.out.println(indent + "थ्रेड समूह: " + t.getThreadGroup().getName());
        System.out.println(indent + "क्या यह जीवित है: " + t.isAlive());
        System.out.println(indent + "क्या यह डेमन है: " + t.isDaemon() + "\n");
    }

}
```

### व्याख्या:
1. **`Thread.currentThread()`**: वर्तमान थ्रेड को प्राप्त करता है जो इस प्रोग्राम को चला रहा है।
2. **`ThreadGroup`**: प्रत्येक थ्रेड एक थ्रेड समूह का हिस्सा होता है। `tg.getParent()` लूप रूट थ्रेड समूह तक नेविगेट करता है।
3. **`info()`**: एक थ्रेड समूह और उसके थ्रेड्स की जानकारी पुनरावृत्तिपूर्ण रूप से प्रिंट करता है।
4. **`log()`**: प्रत्येक थ्रेड की विस्तृत जानकारी लॉग करता है, जैसे उसका नाम, ID, प्राथमिकता, स्थिति, क्या वह जीवित है, और क्या वह डेमन थ्रेड है।
5. **डेमन थ्रेड्स**: ऐसे थ्रेड्स जो पृष्ठभूमि में चलते हैं और सभी गैर-डेमन थ्रेड्स समाप्त होने पर JVM को समाप्त होने से नहीं रोकते हैं।
