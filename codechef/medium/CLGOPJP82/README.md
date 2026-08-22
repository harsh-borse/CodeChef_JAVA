# CLGOPJP82

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Conditions in if statements

`Java` supports the usual logical mathematical conditions:

- Equals: a == b.
- Not Equals: a != b.
- Less than: a < b.
- Less than or equal to: a <= b.
- Greater than: a > b.
- Greater than or equal to: a >= b.
### Task

Write a program which does the following:

- Take input from the console for integer variables a, b and c.
- Do the above for 2 separate input tuples. a = 25, b = 21, c = 52 a = 34, b = 23, c = 34
- Compute and output the following for each tuple a, b and c: "Bravo!" if a is greater than or equal to both b and c. Otherwise print "Try again" in every other case.
### Sample 1:
Input
Output

```
25 21 52
35 23 34
```

```
Try Again
Bravo!
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T13:08:59.179Z  

```java
import java.util.*;

class Codechef
{
	public static void main (String[] args)
	{
	   // Update the blank in the code given below
	    Scanner read= new Scanner(System.in);

        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();
        if (a >= b && a>=c ) {
            System.out.println("Bravo!");
        } else {
            System.out.println("Try Again");
        }

        a = read.nextInt();
        b = read.nextInt();
        c = read.nextInt();
        if (a >= b && a>=c ) {
            System.out.println("Bravo!");
        } else {
            System.out.println("Try Again");
        }
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP82)