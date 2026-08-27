# CLGOPJP141

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Nested loops

We learned about `For and While` loops.

Let's discuss `Nested` loops.

Nested loops are a powerful programming construct where one loop is placed inside another loop.

Let us understand this through an example - by printing a `Right Triangle`.
Suppose you want to print a right triangle of height `n`, where `n` is the number of rows.

Review the code in the IDE and click on 'Submit' to see the result.

In this example:

- The outer loop controls the number of rows.
- The inner loop controls the number of stars printed in each row, forming the right triangle pattern.
### Sample 1:
Input
Output

```
4
```

```
*
 ** 
 **  *
 **   ** 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-27T17:28:44.665Z  

```java
import java.util.Scanner;
class Codechef
{
	public static void main (String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.println("*");
            }
           
        }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP141)