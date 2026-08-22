# CLGOPJP107

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Debug the code - 11

Write a program which does the following:

- Find the area of a square of side 14cm.
- Also, find the cost of painting the square if the paint costs is $7/cm2.
- Initialize the following variables in your program and use them in the computation: s to store the length of side the square. area to store the area of the square. cost to store the cost of painting.
- Output area and cost to the console on separate lines.
- Note: Include the character "$" with the cost without any space.
### Sample 1:
Input
Output

```

```

```
196
1372$
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T14:06:42.467Z  

```java
// Debug the given code
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        int s = 14;
        int area = s * s;
        int cost = area * 7;
        System.out.println(area);
        System.out.println(cost + "$");
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP107)