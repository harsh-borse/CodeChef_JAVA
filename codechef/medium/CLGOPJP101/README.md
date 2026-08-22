# CLGOPJP101

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Logical Error or Wrong Answer (WA)

A `logical error` is an error in a program that occurs when the code compiles and runs without producing any error messages, but it does not produce the expected or desired output.
Instead, it performs a different computation or provides incorrect results due to a flaw in the algorithm or logic of the program.
Typically, debugging `logical errors` requires more effort compared to other types of errors.

They can be categorized into different types:

- Incorrect Conditions
- Incorrect Index
- Incorrect variable usage

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T13:50:47.926Z  

```cpp
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        
        if (b == 0) {
            System.out.println("infinity");   // uncomment the if condition
            return;
        }
        

        System.out.println(a / b);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP101)