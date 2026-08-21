# CLGOPJP46

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Conditional Operator

The conditional operator, often referred to as the  **"ternary operator"**, is a special operator in Java that allows you to perform a conditional operation in a concise way. It's the only ternary operator in Java and takes three operands: a condition, a value to return if the condition is true, and a value to return if the condition is false.

### Syntax:

```
condition ? value_if_true : value_if_false;

```

### Explanation:
- condition: This is the expression to be evaluated. If it is true, the operator returns value_if_true; otherwise, it returns value_if_false.
- value_if_true: This is the value returned if the condition evaluates to true.
- value_if_false: This is the value returned if the condition evaluates to false.
### Example:

```
int a = 10, b = 5;
int max = (a > b) ? a : b;

```

In this example:

- (a > b) is the condition.
- a is value_if_true.
- b is value_if_false.

If `a` is greater than `b`, `max` will be assigned the value of `a`; otherwise, it will be assigned the value of `b`.

### Task
- Given an integer, print 0 if its odd, else print 1.
### Sample 1:
Input
Output

```
15
```

```
0
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T13:28:55.193Z  

```java
public class Main {
    public static void main(String[] args) {
        int num = 15;
        // Update the blank in code below

        System.out.println((num % 2 == 0) ? 1 : 0 );
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP46)