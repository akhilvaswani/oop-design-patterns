# Geometry Classes

Point and Circle classes demonstrating composition and inheritance.

**Point.java** — 2D point with (x, y). Calculates Euclidean distance between two points using `Math.sqrt(Math.pow(...))`. Overrides `equals()` and `toString()`.

**Circle.java** — uses a Point as its center (composition). Calculates area and perimeter. Has multiple constructors (constructor chaining with `this()`). Also overrides `equals()`.

### How to run
```bash
javac Point.java Circle.java
```

### Concepts
Composition (has-a relationship), constructor chaining, Math class methods, equals() override
