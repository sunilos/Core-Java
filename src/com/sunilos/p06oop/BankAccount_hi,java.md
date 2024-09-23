
```java
package com.sunilos.p06oop;

/**
 * बैंक खाता Cloneable इंटरफ़ेस को लागू करता है ताकि यह डीप क्लोनिंग का हिस्सा बन सके।
 * 
 * @version 1.0
 * @since 16 नवम्बर 2014
 * @author सुनील साहू
 * @Copyright (c) सुनील साहू
 * @url www.sunilbooks.com
 */

public class BankAccount implements Cloneable {

	// बैंक खाते का बैलेंस
	public double balance = 0;

	// डिफॉल्ट कंस्ट्रक्टर
	public BankAccount() {
	}

	// बैलेंस को इनिशियलाइज़ करने के लिए पैरामीटराइज़्ड कंस्ट्रक्टर
	public BankAccount(double b) {
		balance = b;
	}

	/**
	 * बैंक खाता ऑब्जेक्ट्स के क्लोनिंग का समर्थन करने के लिए clone मेथड को ओवरराइड करता है।
	 * 
	 * @return वर्तमान इंस्टेंस की एक कॉपी का नया ऑब्जेक्ट।
	 * @throws CloneNotSupportedException अगर क्लोनिंग समर्थित नहीं है।
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone(); // ऑब्जेक्ट क्लास की क्लोन मेथड को कॉल करता है
	}

	public static void main(String[] args) throws Exception {
		// 10 के प्रारंभिक बैलेंस के साथ एक नया बैंक खाता ऑब्जेक्ट बनाएं
		BankAccount a1 = new BankAccount(10);

		// a1 ऑब्जेक्ट को क्लोन करके a2 बनाएं
		BankAccount a2 = (BankAccount) a1.clone();

		// क्लोन किए गए खाते के बैलेंस को संशोधित करें
		a2.balance = 20;

		// दोनों खातों के बैलेंस को प्रिंट करें
		System.out.println(a1.balance); // आउटपुट: 10
		System.out.println(a2.balance); // आउटपुट: 20
	}
}
```

### समझाया गया:
- यह `BankAccount` क्लास `Cloneable` इंटरफ़ेस को लागू करती है ताकि इसके ऑब्जेक्ट्स की डीप क्लोनिंग की जा सके।
- इसमें एक बैलेंस एट्रिब्यूट है जिसे कंस्ट्रक्टर के माध्यम से इनिशियलाइज़ किया जा सकता है।
- `clone` मेथड को ओवरराइड किया गया है ताकि `BankAccount` इंस्टेंस की क्लोनिंग की जा सके।
- `main` मेथड में, `BankAccount` का एक इंस्टेंस बनाया गया और क्लोन किया गया। क्लोन की गई इंस्टेंस का बैलेंस संशोधित किया गया, जिससे पता चलता है कि मूल इंस्टेंस अपरिवर्तित रहता है। यह डीप क्लोनिंग के सिद्धांत को दर्शाता है।
