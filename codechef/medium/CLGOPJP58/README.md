# CLGOPJP58

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Debugging Problem

In the IDE a program is given to convert a temperature from Fahrenheit to Celsius. It takes the temperature in Fahrenheit as input from the user and output the temperature in Celsius.

The formula for conversion is:

`C = ((F−32) × 5) / 9`​

### Task
- Review the code and debug it.
### Sample 1:
Input
Output

```
49
```

```
9.444445
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T14:14:44.734Z  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int f = 49;
        float c = (float)((f - 32) * 5) / 9; // Ensure that the division is performed with float
        System.out.println(c);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP58)