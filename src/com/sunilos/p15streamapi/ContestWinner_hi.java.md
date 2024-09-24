
```java
package com.sunilos.p15streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * इसमें एक लकी ड्रॉ प्रतियोगिता होती है जिसमें प्रतियोगियों को SMS भेजना होता है।
 * यह स्ट्रीम्स का उपयोग करके प्राप्त SMS में से 3 विजेताओं का चयन करेगा।
 * 
 * @लेखक SunilOS
 */
public class ContestWinner {

    public static void main(String[] args) {

        ArrayList<Contestant> list = new ArrayList<Contestant>();
        list.add(new Contestant("Ram", "9912345678"));
        list.add(new Contestant("Shyam", "9912342222"));
        list.add(new Contestant("Ajay", "9912345770"));
        list.add(new Contestant("Vijay", "9912345678"));
        list.add(new Contestant("Jay", "9912345888"));
        list.add(new Contestant("Pappu", "9912345111"));
        list.add(new Contestant("InvalidNO", "11"));

        System.out.println("विजेता !!");

        // 1. फोन नंबर लेते हैं,
        // 2. वैध फोन नंबरों को फ़िल्टर करते हैं,
        // 3. डुप्लिकेट हटाते हैं,
        // 4. फोन नंबरों को शफल करते हैं,
        // 5. तीन विजेता प्राप्त करते हैं,
        // 6. विजेताओं को प्रदर्शित करते हैं
        list.stream()
            .map(e -> e.phone) // फोन नंबरों को निकालते हैं
            .filter(e -> e.length() == 10) // 10 अंकों वाले वैध फोन नंबरों को फ़िल्टर करते हैं
            .distinct() // डुप्लिकेट नंबरों को हटाते हैं
            .collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
                Collections.shuffle(e); // सूची को शफल करते हैं
                return e.stream(); // स्ट्रीम में पुनः परिवर्तित करते हैं
            }))
            .limit(3) // केवल तीन विजेताओं को चुनते हैं
            .forEach(e -> System.out.println(e)); // विजेताओं को प्रदर्शित करते हैं
    }
}

/**
 * प्रतियोगियों की जानकारी को संग्रहित करता है
 */
class Contestant {
    public String name = null;
    public String phone = null;

    public Contestant(String n, String p) {
        name = n;
        phone = p;
    }
}
```

### व्याख्या:
- **प्रतियोगी वर्ग (Contestant Class)**: यह वर्ग एक प्रतियोगी की जानकारी संग्रहीत करता है, जिसमें नाम और फोन नंबर शामिल हैं। इसमें इन फ़ील्ड्स को प्रारंभ करने के लिए एक कंस्ट्रक्टर है।

- **मुख्य वर्ग (`ContestWinner`)**:
  - **सूची प्रारंभिककरण**: `ArrayList` का उपयोग करके `Contestant` ऑब्जेक्ट्स की सूची बनाई जाती है, जो प्रतियोगिता में भाग लेने वाले प्रतियोगियों का प्रतिनिधित्व करती है।
  
  - **स्ट्रीम प्रोसेसिंग**:
    - `map(e -> e.phone)`: यह स्ट्रीम में मौजूद प्रत्येक प्रतियोगी से फोन नंबर को निकालता है।
    - `filter(e -> e.length() == 10)`: यह केवल उन फोन नंबरों को चुनता है जो 10 अंकों के हैं, यानी वैध हैं।
    - `distinct()`: डुप्लिकेट फोन नंबरों को हटाता है ताकि प्रत्येक प्रतियोगी को केवल एक बार गिना जाए।
    - `collect(Collectors.collectingAndThen(...))`: यह दो-चरणीय संग्रह प्रक्रिया है:
      - पहले, फ़िल्टर किए गए और अलग किए गए फोन नंबरों को एक सूची में एकत्र करता है।
      - फिर, उस सूची को `Collections.shuffle(e)` का उपयोग करके शफल करता है।
      - अंत में, शफल की गई सूची को फिर से स्ट्रीम में बदलता है।
    - `limit(3)`: केवल तीन विजेताओं को चुनता है।
    - `forEach(e -> System.out.println(e))`: चुने गए विजेताओं को प्रिंट करता है।

