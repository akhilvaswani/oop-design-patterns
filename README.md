# Object-Oriented Design Patterns

A collection of Java projects I built exploring core OOP concepts like inheritance hierarchies, polymorphism, abstract classes, and custom data structures.

## Projects

### Employee Management System
A staff management hierarchy using abstract classes and multi-level inheritance. Includes `StaffMember` (abstract base), `Employee`, `Hourly`, and `Executive` subclasses. Shows method overriding, polymorphic pay calculations, and custom exception handling (`BonusTooLowException`).

### Geometry Classes
Shape hierarchy with `Circle`, `Square`, `Triangle`, and `Cylinder` classes. Each shape calculates its own area and perimeter through method overriding. Shows how abstract base classes enforce consistent interfaces across different implementations.

### Dog Kennel
Kennel management system that tracks dogs and their attributes. Built around OOP principles with encapsulation and object composition.

### Book Comparator
Implements the `Comparable` interface to compare books by different attributes (title, author, page count). Shows interface implementation and natural ordering.

### Sorted Integer List
Custom sorted data structure that extends a base `IntList` class. Overrides `add()` to maintain sorted order on insertion using element shifting - basically insertion sort built into the data structure itself.

## Built With
- Java (compiled with javac)
- IntelliJ IDEA
