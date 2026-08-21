# CLGOPJP44

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Logical Operators

Logical operators help you combine multiple conditions to check if they are true or false. They are often used to make decisions based on multiple criteria.

#### Basic Logical Operations

Here are the basic logical operators and their usage:

- &&   (Logical AND: returns true only if both conditions are true) a > 5 && a < 10 // returns true only if a is greater than 5 but less than 10
- ||  (Logical OR: returns true if at least one condition is true) a > 10 || a < 5 // returns true if a is greater than 10 or less than 5
- !   (Logical NOT: reverses the result of the condition) !(a > 5 && a < 10) // returns true in the opposite cases of the first condition above
### Task

You are given a variable  **`height`**.
You are allowed to enter the waterpark only if your height is between 5 and 10 (Inclusive).
Apply the condition and output $1$ if condition is `true` or $0$ if condition is `false` as applicable.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T13:19:59.743Z  

```java
public class Main {
    public static void main(String[] args) {
        int height = 15;
        // Update the blanks in the code below
        if(height >=5 || height <=10){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP44)