# Design Patterns: Creational, Behavioral, and Structural

## Introduction
Design patterns are reusable solutions to common software design problems. They provide best practices to improve code reusability, maintainability, and scalability. This repository covers three main categories of design patterns:

- **Creational Patterns**: Deal with object creation mechanisms.
- **Behavioral Patterns**: Focus on object interaction and responsibility.
- **Structural Patterns**: Define the composition of classes and objects.

## Design Pattern Categories

### 1. Creational Design Patterns
Creational patterns abstract the instantiation process to enhance flexibility and reuse. Examples include:

- **Singleton**: Ensures a class has only one instance.
- **Factory Method**: Provides an interface for creating objects.
- **Abstract Factory**: Creates families of related objects without specifying concrete classes.
- **Builder**: Constructs complex objects step by step.
- **Prototype**: Creates new objects by cloning existing ones.

### 2. Behavioral Design Patterns
Behavioral patterns focus on how objects interact and delegate responsibilities. Examples include:

- **Observer**: Defines a dependency between objects, notifying changes.
- **Strategy**: Enables selecting algorithms at runtime.
- **Command**: Encapsulates a request as an object.
- **State**: Allows an object to alter its behavior based on internal state changes.
- **Mediator**: Reduces coupling between communicating objects.

### 3. Structural Design Patterns
Structural patterns deal with class and object composition. Examples include:

- **Adapter**: Bridges the interface of an existing class to another interface.
- **Decorator**: Adds responsibilities dynamically to an object.
- **Facade**: Provides a simplified interface to a complex system.
- **Proxy**: Acts as a substitute or placeholder for another object.
- **Composite**: Composes objects into tree structures to represent part-whole hierarchies.

## Installation & Usage
1. Clone the repository:
   ```sh
   https://github.com/ApsaraWitharana/AD2-Design-Patterns.git
   ```
2. Navigate to the project directory:
   ```sh
   cd design-patterns
   ```
3. Run the examples in your preferred programming language (Java, Python, C++, etc.).

## Example Code
### Singleton Pattern in Java:
```java
public class Singleton {
    private static Singleton instance;
    
    private Singleton() {}
    
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments
- **Gang of Four (GoF)** for foundational design patterns.
- Open-source communities for valuable resources and insights.

---
_Designed to help developers learn and apply design patterns effectively!_
