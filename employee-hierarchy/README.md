# Employee Hierarchy

Full inheritance chain demonstrating abstract classes, polymorphism, and custom exceptions.

```
StaffMember (abstract)
  └── Employee
        ├── Hourly
        └── Executive
```

**StaffMember** — abstract base with name/address/phone. Declares abstract `pay()` and `getVacationDays()`.

**Employee** — adds SSN and pay rate. Implements the abstract methods.

**Hourly** — tracks hours worked, calculates pay as `rate * hours`. Gets 2 extra vacation days.

**Executive** — can receive bonuses on top of base pay.

**BonusTooLowException** — custom exception for when a bonus is below $2,000.

**Problem1** vs **Problem2** — Problem1 just throws the exception (crashes). Problem2 wraps it in try-catch so the program keeps running, counts valid bonuses, and calculates average pay.

### How to run
```bash
javac *.java
java Problem2
```

### Concepts
Abstract classes, multi-level inheritance, polymorphism, custom exceptions, try-catch, arrays of objects
