# Java OOP Practice — Full Solutions

This project contains solved code for **all exercises** in your assignment document.
It’s organized by packages that mirror the sections in the file.

## How to compile & run (no Maven needed)

```bash
cd java-oop-exercises/src

# Compile everything
javac $(find . -name "*.java")

# Run a per-section demo (examples just show usage — you can open files to see each solution)
# Basics:
java exercises.basics.BasicsDemo

# Conditions:
java exercises.conditions.ConditionsDemo

# Switch-case:
java exercises.switchcase.SwitchCaseDemo

# Loops:
java exercises.loops.LoopsDemo

# Arrays:
java exercises.arrays.ArraysDemo

# Strings:
java exercises.strings.StringsDemo

# Methods (lập trình phương thức — 21 methods):
java exercises.methods.MethodsDemo

# OOP — constructors/getters/setters/toString:
java exercises.oop.constructors.OOPConstructorsDemo

# OOP — extra methods:
java exercises.oop.methods.OOPMethodsDemo

# OOP — encapsulation (packages pA, pB):
java exercises.oop.encapsulation.EncapsulationDemo

# OOP — inheritance:
java exercises.oop.inheritance.InheritanceDemo

# OOP — polymorphism:
java exercises.oop.polymorphism.PolymorphismDemo

# User/Admin menu sample (inheritance example 5):
java exercises.oop.inheritance.userapp.UserApp
```

> Each source file has **clear comments** like `// Ví dụ X:` mapping directly to the assignment’s problem numbers.
> For tasks that say “Nhập vào…”, the core logic is implemented as methods. Demos provide sample usage.
> You can easily swap the sample inputs for Scanner-based input in your environment/classroom runner.
