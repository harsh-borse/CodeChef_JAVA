# CLGOPJP102

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Incorrect Index

As our `string` uses zero-based indexing, many times we forget about it and write logic using one-based indexing, which gives us the wrong answer. This incorrect indexing gives you a `logical error`.

 **Program to print the last character of the string** :

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Input length of the string

        String s = scanner.next(); // Input string
        System.out.println(s.charAt(n-1)); // Correct way
        System.out.println(s.charAt(n));  // Incorrect way
        scanner.close();
    }
}

```

### Task
- Given a program to print 1st, 4th and 6th character of a string.
- Find out the logical error and fix it.
### Sample 1:
Input
Output

```
hellohowudoing
```

```
hlh
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T13:56:43.086Z  

```java
import java.util.*;

class Codechef{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next(); // Input string
        scanner.close();

        if (s.length() >= 6) {
            
            char c1 = s.charAt(0); 
            char c2 = s.charAt(3);
            char c3 = s.charAt(5);

            System.out.println("" + c1 + c2 + c3);
        } else {
            // Handle the case when indices are out of bounds
            System.out.println("Invalid indices"); 
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP102)