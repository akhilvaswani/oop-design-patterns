# OOP Design Patterns

A handful of Java projects from when I was learning OOP concepts -- inheritance, polymorphism, abstract classes, that kind of thing.

## What's in Here

**Employee Management System** -- Class hierarchy with an abstract `StaffMember` base class, then `Employee`, `Hourly`, and `Executive` subclasses. Each one overrides the pay calculation differently. Also has a custom `BonusTooLowException` for input validation.

**Geometry Classes** -- `Circle`, `Square`, `Triangle`, `Cylinder` all extending a base shape class. Each one computes its own area and perimeter. Pretty standard stuff but good for getting comfortable with method overriding.

**Dog Kennel** -- A kennel tracker that manages dogs and their info. Mostly an exercise in encapsulation and object composition.

**Book Comparator** -- Implements `Comparable` to sort books by title, author, or page count. Quick demo of interface implementation.

**Sorted Integer List** -- Custom data structure extending `IntList` that keeps elements sorted on insert. Basically insertion sort baked into the add method.

## Running

```bash
javac *.java
java MainClass
```

Replace `MainClass` with whatever driver class you want to run.

## Built With

- Java
- IntelliJ IDEA
