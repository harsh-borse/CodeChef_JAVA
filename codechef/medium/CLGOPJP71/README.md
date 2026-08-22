# CLGOPJP71

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Table of Any Number

Write a program to print the multiplication table of any number given by a user upto 10.

### Sample 1:
Input
Output

```
4
```

```
4 x 1 = 4
4 x 2 = 8
4 x 3 = 12
4 x 4 = 16
4 x 5 = 20
4 x 6 = 24
4 x 7 = 28
4 x 8 = 32
4 x 9 = 36
4 x 10 = 40
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T12:45:11.488Z  

```java
import java.util.*;

class Codechef
{
	public static void main (String[] args)
	{
	   // Update the blank in the code given below
		Scanner read = new Scanner(System.in);
        int num= read.nextInt();

        System.out.println(num + " x 1 = " + (num * 1));
        System.out.println(num + " x 2 = " + (num * 2));
        System.out.println(num + " x 3 = " + (num * 3));
        System.out.println(num + " x 4 = " + (num * 4));
        System.out.println(num + " x 5 = " + (num * 5));
        System.out.println(num + " x 6 = " + (num * 6));
        System.out.println(num + " x 7 = " + (num * 7));
        System.out.println(num + " x 8 = " + (num * 8));
        System.out.println(num + " x 9 = " + (num * 9));
        System.out.println(num + " x 10 = " + (num * 10));

	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP71)