# CLGOPJP106

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Debug the code - 10

Write a program which does the following:

- Declare two integer variables length and width.
- Accept two user inputs from the console and store these values in length and width respectively.
- Create another integer variable area - compute the area of the rectangle and store it in area.
- Output area to the console.
### Sample 1:
Input
Output

```
10
23
```

```
Area of the rectangle is: 230
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T14:03:04.140Z  

```java
// Debug the given code
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int length, width;
        int area;
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();
        width = scanner.nextInt();
        
        area = length * width;
        System.out.println("Area of the rectangle is: " + area); 
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP106)