
```java
package com.sunilos.p06oop;

import java.util.Date;

/**
 * The Person class represents a person with attributes such as name, address, 
 * and date of birth. It also provides constructors and getter/setter methods 
 * for these attributes.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Person {

    // Attributes to store the person's name, address, and date of birth.
    private String name = null;
    private String address = null;
    private Date dateOfBirth = null;

    // A constant representing the average human age.
    public static final int AVERAGE_AGE = 60;

    /**
     * Default constructor. Initializes a Person object without any attributes.
     */
    public Person() {
    }

    /**
     * Parameterized constructor that initializes a Person object with the given
     * name and address.
     * 
     * @param name the name of the person
     * @param address the address of the person
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Parameterized constructor that initializes a Person object with the given
     * name, address, and date of birth.
     * 
     * @param name the name of the person
     * @param address the address of the person
     * @param dateOfBirth the date of birth of the person
     */
    public Person(String name, String address, Date dateOfBirth) {
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    // Getter method for the name attribute.
    public String getName() {
        return name;
    }

    // Setter method for the name attribute.
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for the address attribute.
    public String getAddress() {
        return address;
    }

    // Setter method for the address attribute.
    public void setAddress(String address) {
        this.address = address;
    }

    // Getter method for the dateOfBirth attribute.
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    // Setter method for the dateOfBirth attribute.
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
```

### Explanation:

- **Attributes:** The `name`, `address`, and `dateOfBirth` are private attributes that represent a person's key details. They are encapsulated using getter and setter methods.
- **Constructors:** There are three constructors: a default constructor and two parameterized constructors that allow initializing a `Person` object with different sets of data.
- **Constant:** `AVERAGE_AGE` is a `public static final` constant representing an average human age.
- **Encapsulation:** Getter and setter methods are used to provide controlled access to the private attributes.
