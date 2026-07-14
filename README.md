# Design Patterns Demo Using Java

## 📌 Project Overview

This project demonstrates the implementation of two popular Object-Oriented Design Patterns in Java:

- Singleton Pattern
- Factory Pattern

The application showcases how these design patterns help create clean, maintainable, reusable, and scalable Java applications.

---

## 📖 Description

The project contains two independent implementations of design patterns:

### 1. Singleton Pattern
The Singleton Pattern ensures that only one instance of a class is created throughout the application's lifecycle. It provides a global point of access to that instance.

### 2. Factory Pattern
The Factory Pattern provides an interface for creating objects without exposing the object creation logic to the client. The client requests an object from the factory instead of creating it directly.

---

## 🛠 Technologies Used

- Java
- Eclipse / Spring Tool Suite (STS)
- Object-Oriented Programming (OOP)

---

## 📂 Project Structure

```
DesignPatternsDemo
│
├── src
│   └── com.example.designpatterns
│       ├── Main.java
│       ├── Singleton.java
│       ├── Shape.java
│       ├── Circle.java
│       ├── Rectangle.java
│       └── ShapeFactory.java
│
├── README.md
└── .gitignore
```

---

## 🎯 Design Patterns Implemented

### Singleton Pattern

- Private constructor
- Static instance variable
- Public static `getInstance()` method
- Ensures only one object is created

### Factory Pattern

- Uses an interface (`Shape`)
- Implements multiple classes (`Circle`, `Rectangle`)
- Uses `ShapeFactory` to create objects
- Promotes loose coupling and code reusability

---

## 🚀 How to Run

1. Open the project in Eclipse or STS.
2. Navigate to:
   ```
   src → com.example.designpatterns
   ```
3. Open `Main.java`.
4. Right-click → **Run As → Java Application**.
5. View the output in the Console.

---

## 📸 Sample Output

```
===== Singleton Pattern =====
Singleton object created.
Hello from Singleton Pattern!
Only one Singleton object exists.

===== Factory Pattern =====
Drawing Circle
Drawing Rectangle
```

---

## 📚 Concepts Covered

- Classes and Objects
- Interfaces
- Encapsulation
- Abstraction
- Polymorphism
- Singleton Design Pattern
- Factory Design Pattern
- Object Creation
- Code Reusability

---

## ✅ Advantages

- Demonstrates real-world Java design patterns.
- Improves code maintainability.
- Promotes loose coupling.
- Easy to understand and extend.
- Beginner-friendly implementation.

---

## 👩‍💻 Author

**Vedika Pawade**

Computer Science & Engineering Student

---

## 📄 License

This project is created for educational and learning purposes.
