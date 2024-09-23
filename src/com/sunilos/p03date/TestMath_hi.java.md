```java
package com.sunilos.p03date;

/**
 * Test the key methods of java.lang.Math class
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestMath {

	public static void main(String[] args) {

		// दो नंबरों में से सबसे बड़ा नंबर प्राप्त करें
		int maxVal = Math.max(2, 5);

		// दो नंबरों में से सबसे छोटा नंबर प्राप्त करें
		int minVal = Math.min(2, 5);

		// किसी नकारात्मक संख्या का परिमाण (absolute) मान प्राप्त करें
		double absoluteVal = Math.abs(-3.7);

		// किसी संख्या का घातांक (exponential) प्राप्त करें (e^10)
		double expVal = Math.exp(10);

		// 0.0 और 1.0 के बीच एक रैंडम नंबर उत्पन्न करें
		double randomNo = Math.random();

		// किसी संख्या का वर्गमूल (square root) प्राप्त करें
		double sqrtVal = Math.sqrt(4);

		// किसी संख्या को ऊपर के सबसे नजदीकी पूर्णांक में राउंड करें
		double ceilVal = Math.ceil(5.4);

		// Math functions के परिणामों को प्रदर्शित करें
		System.out.println("Math functions");
		System.out.println("Max 2,5: " + maxVal);
		System.out.println("Min 2,5: " + minVal);
		System.out.println("Absolute -3.7: " + absoluteVal);
		System.out.println("Exp 10: " + expVal);
		System.out.println("Random Number: " + randomNo);
		System.out.println("Square Root: " + sqrtVal);
		System.out.println("Smallest Integer greater than 5.4: " + ceilVal);
	}
}
```

### Explanation (साधारण हिंदी में):
- **`Math.max()`**: दो संख्याओं में से बड़ी संख्या देता है।
- **`Math.min()`**: दो संख्याओं में से छोटी संख्या देता है।
- **`Math.abs()`**: संख्या का परिमाण (absolute) देता है, जिससे नकारात्मक चिन्ह हट जाता है।
- **`Math.exp()`**: किसी संख्या का घातांक (exponential) निकालता है।
- **`Math.random()`**: 0.0 से 1.0 के बीच एक यादृच्छिक (random) संख्या उत्पन्न करता है।
- **`Math.sqrt()`**: संख्या का वर्गमूल (square root) निकालता है।
- **`Math.ceil()`**: दी गई संख्या से बड़ा सबसे छोटा पूर्णांक (integer) देता है।
