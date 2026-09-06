
# 14 - Constructors

A constructor in Java is a special member of a class that is used to
initialize an object.

A constructor is automatically called when an object is created using
the `new` keyword.

## Topics Covered

- [ ] Constructor Introduction
- [ ] Default Constructor
- [ ] Parameterized Constructor
- [ ] Constructor Overloading
- [ ] Copy Constructor
- [ ] Constructor Chaining
- [ ] `this()` Constructor Call
- [ ] `super()` Constructor Call
- [ ] Constructor vs Method

## What is a Constructor?

A constructor is a special block of code that is used to initialize
objects when they are created.

Example:
```java
class Student {

    Student() {
        System.out.println("Constructor called");
    }
}
