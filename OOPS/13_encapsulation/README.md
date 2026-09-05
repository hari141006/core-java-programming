
# 13 - Encapsulation

Encapsulation is one of the four fundamental principles of
Object-Oriented Programming (OOP).

It is the process of wrapping data (variables) and methods together
inside a single class and controlling access to the data.

Encapsulation helps protect the data from unwanted or invalid access.

## Topics Covered

- [ ] Encapsulation Introduction
- [ ] Data Hiding
- [ ] Private Variables
- [ ] Getters
- [ ] Setters
- [ ] `this` Keyword
- [ ] `super` Keyword
- [ ] `final` Keyword
- [ ] Accessing Private Data
- [ ] Advantages of Encapsulation

## What is Encapsulation?

Encapsulation means:

1. Declaring data members as `private`.
2. Providing controlled access using `public` methods.
3. Using getters to read data.
4. Using setters to modify data.

## Simple Definition

> Encapsulation = Binding data and methods together and restricting direct access to the data.

## Example

```java
class Student {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```
## Reminder
Encapsulation → Data + Methods + Data Hiding
Getter        → Read data
Setter        → Modify data
this          → Current object
super         → Parent class
final         → Cannot be changed/overridden/inherited
