# Clean-Code

**Clean Code Principles**

**Low Coupling Principle (LCP)**:
The Low Coupling Principle, promotes the development of modular and maintainable software systems. Low coupling refers to the degree of interdependence or connection between software modules or components within a system. A low coupling principle aims to minimize the dependencies between these modules, making each module more independent and less reliant on the internal details of other modules.

**Reusability Principle (RP)**:
The Reusability Principle, aims to maximize the use of existing software components, modules, or code artifacts in the development of new software systems. This principle promotes efficiency, maintainability, and consistency in software development by encouraging the creation of software components that can be reused across different projects or within the same project. 

**Single Responsibility Principle (SRP)**:
The Single Responsibility Principle advocates a simple but powerful concept: a class, method, or module should have one and only one reason to change. In other words, it should have a single responsibility. This principle promotes code organization that is clean, concise, and focused.

**Open Closed Principle (OCP)**:
The Open Closed Principle emphasizes the importance of designing software modules that are open for extension but closed for modification. In simpler terms, it encourages developers to build systems in a way that allows new functionalities to be added without altering existing code.

**Liskov Substitution Principle (LSP)**:
The Liskov Substitution Principle states that objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program. In simpler terms, if a program is using a base class, it should be able to use any of its derived classes without knowing it, and the program should still work correctly. This principle builds on the concept of polymorphism, allowing objects of different classes to be treated as objects of a common superclass.

**Interface Segregation Principle (ISP)**:
The Interface Segregation Principle (ISP) states that a class should not be forced to implement interfaces it doesn't use. In other words, a client should not be forced to depend on interfaces it doesn't use. This principle emphasises that it is better to have several small, specific interfaces, tailored for the needs of the client, rather than a large, general interface that contains methods for all possible use cases.

**Dependency Inversion Principle(DIP)**:
The Dependency Inversion Principle(DIP) states that high-level modules should not depend on low-level modules. Both high-level and low-level modules should depend on abstractions (e.g., interfaces or abstract classes).