# Java Regular Shape Area Calculator

A Java console application developed as part of my early university Software Development coursework.

The program calculates the area of a regular polygon based on the number of sides and side length entered by the user.

## Project Overview

The application prompts the user to select a regular shape containing between three and six sides and enter its side length.

Based on the number of sides provided, the program calculates the area of the corresponding:

- Equilateral triangle
- Square
- Regular pentagon
- Regular hexagon

The calculated result is then displayed through the console.

## Technologies

- Java
- Java Standard Library
- `Scanner`
- `Math`

## Concepts Demonstrated

This project introduced several fundamental programming concepts, including:

- Console input and output
- Variables and primitive data types
- Conditional statements
- User input handling
- Mathematical calculations
- Java's `Math` library
- Basic program control flow

## Program Flow

```text
Start
  |
  v
Enter number of sides
  |
  v
Validate range (3–6)
  |
  v
Enter side length
  |
  v
Select appropriate formula
  |
  v
Calculate area
  |
  v
Display result
```

## Supported Shapes

| Sides | Shape |
|---:|---|
| 3 | Equilateral Triangle |
| 4 | Square |
| 5 | Regular Pentagon |
| 6 | Regular Hexagon |

## Original Source Code

The original university implementation is preserved in:

`original/RegularShapeArea.java`

The source code has intentionally been retained as an example of my early Java programming rather than rewritten to reflect my current software-development practices.

## Retrospective

This was one of my first Java programming exercises and provided practical experience with user input, conditional program flow, mathematical expressions, and basic input validation.

Reviewing the implementation with significantly more programming experience highlights several areas I would approach differently today.

The calculation logic and user-interface logic could be separated into individual methods, improving readability, maintainability and testability. Only the calculation required for the selected polygon would need to be performed rather than calculating every possible result in advance.

The original input-validation logic also reports an invalid number of sides but does not terminate or repeat the input process, meaning execution can continue and attempt to read a side length. A modern implementation would validate and sanitise all user input before performing the calculation.

Further improvements could include:

- Dedicated calculation methods
- Repeated input validation
- Handling non-numeric input
- Clearer variable naming
- Unit tests for each polygon calculation
- Separation of user interaction and calculation logic
- Support for additional regular polygons

This project is retained in my portfolio as an example of my early software-development experience and as a reference point for my subsequent progression into larger object-oriented, embedded and robotics software systems.
