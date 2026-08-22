# CLGOPJP101

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Incorrect Conditionals

Incorrect conditionals are one of the most common types of `logical errors`, which can be seen while using conditional statements like `if-else` and `loops`.

### Example

The code below is supposed to do the following:

- If an integer is even, then output True.
- If an integer is odd, then output False.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        if (n % 2 == 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
        
        scanner.close();
    }
}        

```

However, the code above is incorrect:

- Based on the requirement, if n % 2 == 1, i.e. for odd numbers - we should output false.
### Task

Given a program to check a number is greater than 5 or not:

- Run the code it will give wrong answer.
- find the wrong condition and correct it.
### Sample 1:
Input
Output

```
5
```

```
the number is smaller than or equal to 5
```

### Sample 2:
Input
Output

```
6
```

```
the number is greater than 5
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T13:52:07.314Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        if (n < 5) {             // correct the incorrect if codition 
            System.out.println("the number is greater than 5");
        } else {
            System.out.println("the number is smaller than or equal to 5");
        }
        
        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP101)