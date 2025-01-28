# **Design Patterns: Builder and Factory**

This README covers the **key benefits** and **use cases** of two fundamental software design patterns: **Builder** and **Factory**.

---

## **1. Builder Pattern**

The Builder pattern is used to create complex objects incrementally. It allows you to separate the process of creating an object from its final representation, making it more convenient and flexible to change.

The main idea is to sequentially add parts of the object without cluttering the constructor with a large number of parameters.

---

### **The "Builder" pattern is useful when:**

1. **A complex object with many parameters is being created:**
The object has many mandatory and optional arguments, which can lead to "telescopic constructors".

2. **The object must be created step by step:**
Construction of the object in stages, where properties or configurations are added at each stage.

3. **The object has several views or varieties:**
For example, different car models (sedan, SUV, sports car).

4. **The process of constructing the object depends on the instructions, which can be flexibly adapted.**
For example, constructing a complex graphical report or UI element.

-

### **Examples of using "Builder"**

- **PC assembly:** Configuring components of a gaming or office computer.
- **Report Building:** Generate PDF, HTML or Excel reports from different parts (header, tables, charts).
- **Car Builders:** Different versions of a car using common construction steps.

---

### **Builder Advantages**

- **Readability:** Easy to understand what parameters were used for an instance.
- **Flexibility:** Parameters can be added/hidden without changing the core code.
- **Reusability:** Using the same builder for different object variations.

---

## **2. Factory Pattern**

The Factory pattern is used to create objects without specifying their exact class. The main idea here is that **object creation is delegated to the factory method**, making the client code independent of specific classes.

---

### **The Factory pattern is useful when:**

- **Client code does not need to know the specific implementations of objects:**
For example, the client just needs to create an interface element ("button" or "input field"), and the factory decides what object will be returned.

- **Centralization of object creation logic:**
All objects are created through centralized factories to simplify modification.

- **Objects depend on incoming data:**
The object will be different depending on the input, for example, the user type: administrator, guest, registered user.

- **Ease of adding new object types:**
To add a new object type, you need to change the factory without changing the client code.

---

### **Examples of using "Factory"**

- **Creating characters in the game:** For example, "Mage", "Warrior", "Shooter" are selected depending on the player's input.
- **Creating interface elements:** The factory creates buttons for different platforms (Windows, macOS, Linux).
- **File handling:** Creating handlers for working with PDF, Excel or JSON files.

---

### **Advantages of "Factory"**

- **Encapsulation:** Hiding the logic of creating and choosing the right classes.
- **Less code duplication:** Client code only cares about business logic, not object creation.
- **Flexibility:** It is easy to add new objects to the factory.

---

## **3. Comparison of patterns: Builder vs. Factory**

| **Criteria** | **Builder** | **Factory** |
|-------------------------------|--------------------------------------------------------------------------------|-----------------------------------------------------------------------|
| **Purpose** | Step-by-step creation of a complex object. | Create an object without defining its specific class. |
| **When to use** | When the object has many properties and requires configuration. | When the client code does not need to know what object it needs. |
| **Parameter flexibility** | Allows you to build an object with any number of parameters. | Allows you to create an object based on input data. |
| **Use examples** | Create complex objects such as reports, computers, cars. | Select a character in the game, create UI components, process data.|
| **Adding new types** | Requires Builder to change to add new parameters. | Requires Factory to change to add new object type. |
| **Reusability** | The same steps can be used for different object variations. | Easily extended by adding new subclasses. |

---

## **4. When to use each pattern?**

### Use **Builder**:
- The object is complex, has many parameters (mandatory and optional).
- Object parameters must be specified in steps.
- The same construction process is required to create different types of objects.

### Use **Factory**:
- Object creation needs to be isolated from external logic.
- The new object depends on input data (e.g. user input).
- New object types need to be added without modifying existing client code.

---

## **5. Conclusion**

The **Builder** and **Factory** patterns solve different problems.
- If you are creating **complex objects with configurable parameters**, use **Builder**.
- If you need to **encapsulate the process of creating objects** and make it independent of client code, use **Factory**.

These patterns can often be used together. For example, **Factory** can return different instances of **Builder**, and **Builder** will perform step-by-step creation of a complex object.
