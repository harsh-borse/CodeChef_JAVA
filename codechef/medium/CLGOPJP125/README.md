# CLGOPJP125

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Sum of N Integers

Chef was given an integer input N.

He wants to write a code using `while` loops to output the sum of all integers from 1 to $N$.
Help him complete the code by filling in the blanks.

### Sample 1:
Input
Output

```
5
```

```
15
```

### Sample 2:
Input
Output

```
10
```

```
55
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T14:27:33.967Z  

```java
// Debug the code below to solve the problem.
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

        int N, sum = 0;
        int i = 1 ;
    
        N = scanner.nextInt();

        while ( i <= N) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP125)