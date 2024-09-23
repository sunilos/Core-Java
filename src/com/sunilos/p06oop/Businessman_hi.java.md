
```java
package com.sunilos.p06oop;

/**
 * क्लास BusinessMan क्लास Person का विस्तार करती है।
 * यह क्लास एक व्यवसायी का प्रतिनिधित्व करती है, जो एक प्रकार का व्यक्ति है।
 * 
 * @version 1.0
 * @since 16 नवंबर 2014
 * @author सुनील साहू
 * @Copyright (c) सुनील साहू
 * @url www.sunilbooks.com
 */

public class Businessman extends Person {

	// व्यवसायी की आय
	private double income = 0;

	/**
	 * व्यवसायी की आय प्राप्त करता है।
	 * 
	 * @return वर्तमान आय।
	 */
	public double getIncome() {
		return income;
	}

	/**
	 * व्यवसायी की आय सेट करता है।
	 * 
	 * @param income सेट करने के लिए आय।
	 */
	public void setIncome(double income) {
		this.income = income;
	}
}
```

### समझाया गया:
- `Businessman` क्लास `Person` क्लास का विस्तार करती है, जो यह दर्शाती है कि व्यवसायी एक विशेष प्रकार का व्यक्ति है।
- इसमें एक प्राइवेट एट्रिब्यूट `income` है जो व्यवसायी की आय को संग्रहित करता है।
- यह क्लास `income` एट्रिब्यूट के लिए गेटर और सेटर मेथड प्रदान करती है, जिससे आय के मान तक पहुँच और संशोधन किया जा सके।
