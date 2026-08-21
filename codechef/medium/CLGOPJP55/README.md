# CLGOPJP55

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Type conversion and type casting

What will the following code output?

```
public class Main {
    public static void main(String[] args) {
        int a = 10;
        float b = 3.5f; // note the 'f' suffix to denote a float literal in Java
        int result = (int) (a / b); // cast the result to int
        System.out.println(result);
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T14:01:02.412Z  

```cpp
public class Main {
    public static void main(String[] args) {
        int a = 14;
        int b = 5;
        // Update your code below this line
        float result = (float)a/b;
        System.out.println(result);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP55)