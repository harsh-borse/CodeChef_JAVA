# CLGOPJP96

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Compilation error continued

How do you identify the `'Compilation error'`?

When you click on `Run` or `Submit` - you will get the error description below it.
For example - in the example below - we are being told by the system that there is an error on `Line 4`.
The nature of the error is that a `;` was expected.

```
Status :Compilation error

Main.java:4: error: ';' expected
        System.out.println(Number)
                                  ^
1 error    

```

### Task

We have populated a code in the `IDE` which should output `15`.
Click on `Submit` to run the code and view the error message.
Can you debug the code to get the output 15.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T13:45:58.586Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef{
    public static void main(String[] args) {
        int a = 3; // change capital I to small i
        int b = 5;
        System.out.println(a * b) ;  // add semicolon
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP96)