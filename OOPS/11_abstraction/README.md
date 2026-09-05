
# 11 - Abstraction

## Topics Covered

- [ ] What is Abstraction
- [ ] Advantages of Abstraction
- [ ] Abstract class
- [ ] Abstract methods
- [ ] Concrete methods in abstract classes
- [ ] Implementing abstract methods in child classes
- [ ] Why abstract classes cannot be instantiated
- [ ] Interface
- [ ] Interface methods
- [ ] Implementing an interface using `implements`
- [ ] Multiple interfaces
- [ ] Interface-based multiple inheritance
- [ ] Difference between abstract class and interface
- [ ] Real-world applications of abstraction

## What is Abstraction?

Abstraction means hiding implementation details and showing only the required functionality.

Example:

When we use an ATM, we know how to:
- Withdraw money
- Deposit money
- Check balance

But we do not need to know the internal implementation of the ATM.

```text
User
  ↓
Required Functionality
  ↓
ATM
  ↓
Internal Implementation Hidden

``` 
## Important Keywords

```text

| Keyword      | Purpose                              |
| ------------ | ------------------------------------ |
| `abstract`   | Declares an abstract class or method |
| `extends`    | Inherits an abstract class           |
| `interface`  | Declares an interface                |
| `implements` | Implements an interface              |
| `@Override`  | Indicates method overriding          |
``` 

## One-Line Definitions

- Abstraction → Hiding implementation details and showing essential functionality.
- Abstract Class → A class that cannot be instantiated directly and may contain abstract and concrete methods.
- Abstract Method → A method declared without a body.
- Interface → A contract that specifies behavior a class must implement.
- extends → Used to inherit a class.
- implements → Used to implement an interface.
- Multiple Interfaces → A class can implement multiple interfaces.
- @Override → Indicates that a method is being overridden.