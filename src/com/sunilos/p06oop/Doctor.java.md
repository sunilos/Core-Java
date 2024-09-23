
```java
package com.sunilos.p06oop;

/**
 * The Doctor class is a subclass (child class) of the Person class (parent class).
 * This demonstrates the concept of inheritance in object-oriented programming,
 * where the Doctor class inherits properties and behaviors (methods) from the Person class.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Doctor extends Person {

    // This is a unique attribute of the Doctor class. Each doctor has a registration number,
    // which is specific to them. It is initialized to null by default.
    String registrationNo = null;

    // Getter method for registrationNo.
    // This method returns the registration number of the doctor.
    // Getter methods are used to access private or protected properties of a class.
    public String getRegistrationNo() {
        return registrationNo;
    }

    // Setter method for registrationNo.
    // This method allows setting or updating the doctor's registration number.
    // Setter methods are used to modify private or protected properties of a class.
    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

}
```

### Explanation:

- **Inheritance:** The `Doctor` class extends the `Person` class, meaning it inherits all the properties and methods of the `Person` class, though they aren't visible in the provided code.
- **Attributes:** `registrationNo` is a property unique to the `Doctor` class, which isn't part of the `Person` class.
- **Getter and Setter Methods:** These methods provide controlled access to the `registrationNo` property, adhering to the principles of encapsulation by controlling how class attributes are accessed or modified.

