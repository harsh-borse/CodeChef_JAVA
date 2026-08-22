# CLGOPJP74

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### If Statement

The  **else**  statement is optional.

Here is an example

```
grade = 95;
if (grade >= 90) {
    System.out.println("You got an A");
}

// Output
// You got an A

```

In the above program, if the condition is True, then the  **`System.out.println()`**  statement is executed.

### Task

Write a program which does the following:

- Take input for two integer variables a and b.
- Output Coding is Fun! to the console if a is greater than b.
### Sample 1:
Input
Output

```
25
20
```

```
Coding is Fun!
```

### Sample 2:
Input
Output

```
20
20
```

```
 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T12:56:36.612Z  

```java
import java.util.Scanner;

class Codechef
{
    public static void main(String[] args)
    {
        // 	Your code goes here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Coding is Fun!");
        }
        else {
            System.out.println("");
        }



    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP74)