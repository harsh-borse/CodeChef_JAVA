# CLGOPJP59

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Coding problem - 4

Write a program to calculate the area of a circle using the formula:
`Area` = `pi` x $r^{\text{2}}$
`pi` = 22 / 7
Output the area as a float.

 **Note**  - Please consider whole number radius.

### Sample 1:
Input
Output

```
3
```

```
28.285713
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T14:25:22.342Z  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r = 3;
        int rSquared = r * r; // Calculate the square of the radius
        // Complete the code
        double pi = 22.0/7;
        float area =(float) pi * rSquared ; 
        System.out.println(area); 
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP59)