# CLGOPJP98

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Runtime error

We saw two different syntax errors in the last lesson. There are many different types of syntax errors, but they are generally easiest to debug as the error description clearly explains what needs to be fixed.

Let us now learn about  **Runtime errors**.

### Runtime error

Runtime error occurs when your syntax is correct but the compiler is still not able to run the code due to an error.

Example :-

```
 int a = 5; 
 int b = 0; 
 int c = a/b;

```

If you run the above code, you will get this error:

```
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Codechef.main(Main.java:3)

```

See that 3 in the line two, the compiler is saying that there is an error on line 3, which is division by zero.

### Task

Run the code given in the `IDE` - it will cause a `run-time error`.
Uncomment the `if` condition to make the code work - i.e. print `infinity` whenever b = 0.

### Sample 1:
Input
Output

```
5 3
```

```
1
```

### Sample 2:
Input
Output

```
3 0
```

```
infinity
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T13:48:41.999Z  

```java
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

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP98)